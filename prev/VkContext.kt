package kvb.app

import kvb.core.FileUtils
import kvb.core.memory.DirectList
import kvb.core.memory.MemStacks
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vkwrapper.pipeline.ShaderDirectory
import kvb.vulkan.*

/**
 * Wraps all important Vulkan objects and provides many utility functions. Imposes many restrictions on the structure of
 * a Vulkan program.
 */
class VkContext(
	val instance        : Instance,
	val debugMessenger  : DebugUtilsMessenger?,
	val physicalDevice  : PhysicalDevice,
	val queueFamily     : QueueFamily,
	val device          : Device,
	val queue           : Queue,
	val surfaceSystem   : SurfaceSystem?,
	val descriptorPool  : DescriptorPool,
	val memoryManager   : VkMemoryManager,
	val shaderDirectory : ShaderDirectory
) {


	/*
	Buffers
	 */



	val memoryRanges = DirectList(Vulkan.mem, 10) { MappedMemoryRange(it) { } }



	fun flushMemoryRanges() {
		device.commands.flushMappedMemoryRanges(memoryRanges.size, memoryRanges.buffer)
		memoryRanges.reset()
	}



	inline fun writeLazy(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())

		if(buffer.memory.type.isHostCoherent) return

		memoryRanges.buffer[memoryRanges.next].let {
			it.memory = buffer.memory
			it.offset = offset
			it.size = size
		}
	}



	inline fun write(
		buffer : Buffer,
		offset : Long = 0,
		size   : Long = buffer.size,
		block  : (DirectByteBuffer) -> Unit
	) {
		block(buffer.data())
		if(buffer.memory.type.isHostCoherent) return
		buffer.flush(offset, size)
	}



	fun buffer(size: Int, usage: BufferUsageFlags) = device.createBuffer(
		size.toLong(), usage
	).also {
		it.bindMemory(memoryManager.bufferAllocator.allocate(it))
	}



	fun stagingBuffer(size: Int) = buffer(size, BufferUsageFlags.TRANSFER_SRC)

	fun vertexBuffer(size: Int) = buffer(size, BufferUsageFlags.VERTEX_BUFFER)

	fun uniformBuffer(size: Int) = buffer(size, BufferUsageFlags.UNIFORM_BUFFER)



	fun stagingBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = stagingBuffer(size).also {
		write(it, block = block)
	}

	fun vertexBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = vertexBuffer(size).also {
		write(it, block = block)
	}

	fun uniformBuffer(size: Int, block: (DirectByteBuffer) -> Unit) = uniformBuffer(size).also {
		write(it, block = block)
	}

	fun vertexBuffer(size: Int, floats: FloatArray) = vertexBuffer(size) {
		it.setFloats(0, floats)
	}



	fun allocateImage(image: Image) = image.bindMemory(memoryManager.imageAllocator.allocate(image))



	/*
	Transient commands
	 */



	private val oneTimeSubmitCommandPool = device.createTransientCommandPool(queueFamily)

	private val oneTimeSubmitCommandBuffer = oneTimeSubmitCommandPool.allocatePrimary()

	private fun oneTimeSubmit(block: (CommandBuffer) -> Unit) {
		oneTimeSubmitCommandBuffer.beginOneTimeSubmit()
		block(oneTimeSubmitCommandBuffer)
		oneTimeSubmitCommandBuffer.end()
		queue.submit(oneTimeSubmitCommandBuffer)
		queue.waitIdle()
		oneTimeSubmitCommandPool.reset()
	}



	/*
	Image loading
	 */



	private val imageStagingBuffer = stagingBuffer(9_000_000)



	fun transitionImageLayout(
		commandBuffer : CommandBuffer,
		image         : Image,
		prevLayout    : ImageLayout,
		newLayout     : ImageLayout,
		srcAccessMask : AccessFlags,
		dstAccessMask : AccessFlags,
		srcStages     : PipelineStageFlags,
		dstStages     : PipelineStageFlags
	) = MemStacks.with {
		commandBuffer.pipelineImageMemoryBarrier(srcStages, dstStages, ImageMemoryBarrier {
			it.srcQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED
			it.dstQueueFamilyIndex = VK_QUEUE_FAMILY_IGNORED
			it.oldLayout = prevLayout
			it.newLayout = newLayout
			it.image = image
			it.subresourceRange.aspectMask = ImageAspectFlags.COLOR
			it.subresourceRange.baseMipLevel = 0
			it.subresourceRange.levelCount = image.mipLevels
			it.subresourceRange.baseArrayLayer = 0
			it.subresourceRange.layerCount = image.arrayLayers
			it.srcAccessMask = srcAccessMask
			it.dstAccessMask = dstAccessMask
		})
	}



	//https://github.com/PacktPublishing/Vulkan-Cookbook/blob/master/Library/Source%20Files/04%20Resources%20and%20Memory/16%20Using%20staging%20buffer%20to%20update%20an%20image%20with%20a%20device-local%20memory%20bound.cpp



	fun updateImage(image: Image, stagingBuffer: Buffer) {
		oneTimeSubmit {
			transitionImageLayout(
				it,
				image,
				ImageLayout.SHADER_READ_ONLY_OPTIMAL,
				ImageLayout.TRANSFER_DST_OPTIMAL,
				AccessFlags { MEMORY_WRITE + MEMORY_READ },
				AccessFlags { MEMORY_WRITE + MEMORY_READ },
				PipelineStageFlags.ALL_COMMANDS,
				PipelineStageFlags.ALL_COMMANDS
			)
		}

		transitionImageForShaderRead(image, stagingBuffer)
	}



	fun transitionImageForShaderRead(image: Image, stagingBuffer: Buffer) = oneTimeSubmit {
		transitionImageLayout(
			it,
			image,
			ImageLayout.UNDEFINED,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			AccessFlags.NONE,
			AccessFlags.TRANSFER_WRITE,
			PipelineStageFlags.TOP_OF_PIPE,
			PipelineStageFlags.TRANSFER
		)

		it.copyBufferToImage2D(stagingBuffer, image, ImageLayout.TRANSFER_DST_OPTIMAL)

		transitionImageLayout(
			it,
			image,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			ImageLayout.SHADER_READ_ONLY_OPTIMAL,
			AccessFlags.TRANSFER_WRITE,
			AccessFlags.SHADER_READ,
			PipelineStageFlags.TRANSFER,
			PipelineStageFlags.FRAGMENT_SHADER
		)
	}



	fun loadImageRgba(path: String): ImageView {
		val imageData = FileUtils.readRgba(path)

		Unsafe.copy(imageData.address, imageStagingBuffer.data().address, imageData.width * imageData.height * 4)

		val image = device.createImage2D(
			width  = imageData.width,
			height = imageData.height,
			format = Format.R8G8B8A8_SRGB,
			usage  = ImageUsageFlags { TRANSFER_DST + SAMPLED }
		)

		image.bindMemory(memoryManager.imageAllocator.allocate(image))
		transitionImageForShaderRead(image, imageStagingBuffer)
		return device.createImageView(image)
	}


}