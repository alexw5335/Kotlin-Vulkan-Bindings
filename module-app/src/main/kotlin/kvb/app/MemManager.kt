package kvb.app

import kvb.core.memory.DirectList
import kvb.core.memory.MemStacks
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.VulkanInfo
import kvb.vkwrapper.allocation.VkLinearAllocator
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class MemManager(
	val device       : Device,
	val queue        : Queue,
	bufferMemorySize : Long = 10_000_000,
	imageMemorySize  : Long = 32_000_000
) {


	val mappedType = device.physicalDevice.chooseMemoryType(
		property1 = MemoryPropertyFlags { HOST_VISIBLE },
		property2 = MemoryPropertyFlags { DEVICE_LOCAL },
		property3 = MemoryPropertyFlags { HOST_COHERENT }
	) ?: throw VkException("No mappable memory types")



	val dummyImage = device.createImage2D(32, 32, ImageUsageFlags.COLOR_ATTACHMENT)



	val bufferAllocator = VkLinearAllocator(
		device.allocateMemory(bufferMemorySize, mappedType.index)
	).also {
		it.memory.mapWhole()
	}



	val imageAllocator = VkLinearAllocator(
		device.allocateMemory(
			size = imageMemorySize,
			property1 = MemoryPropertyFlags { DEVICE_LOCAL },
			memoryTypeBits = dummyImage.memoryRequirementsP().memoryTypeBits
		)
	)



	/*
	Writing
	 */



	val memoryRanges = DirectList(VulkanInfo.mem, 10) { MappedMemoryRange(it) { } }



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



	/*
	Allocation
	 */



	fun allocateBuffer(buffer: Buffer) = buffer.bindMemory(bufferAllocator.allocate(buffer))

	fun allocateImage(image: Image) = image.bindMemory(imageAllocator.allocate(image))



	/*
	Creation
	 */



	fun buffer(size: Int, usage: BufferUsageFlags) =
		device.createBuffer(size.toLong(), usage).also(::allocateBuffer)

	fun image(width: Int, height: Int, usage: ImageUsageFlags, format: Format) =
		device.createImage2D(width, height, usage, format).also(::allocateImage)



	/*
	Convenience creation
	 */



	fun buffer(size: Int, usage: BufferUsageFlags, block: (DirectByteBuffer) -> Unit): Buffer {
		val buffer = buffer(size, usage)
		write(buffer, block = block)
		return buffer
	}

	fun buffer(usage: BufferUsageFlags, floats: FloatArray): Buffer {
		val buffer = buffer(floats.size * 4, usage)
		write(buffer) { it.setFloats(0, floats) }
		return buffer
	}

	fun buffer(usage: BufferUsageFlags, bytes: ByteArray): Buffer {
		val buffer = buffer(bytes.size, usage)
		write(buffer) { it[0] = bytes }
		return buffer
	}



	/*
	Layout transitions
	 */



	private val commandPool = device.createCommandPool(queue.family, CommandPoolCreateFlags.RESET_COMMAND_BUFFER)

	private val commandBuffer = commandPool.allocatePrimary()

	private val fence = device.createFence()



	private fun oneTimeSubmit(block: (CommandBuffer) -> Unit) {
		commandBuffer.beginOneTimeSubmit()
		block(commandBuffer)
		commandBuffer.end()
		queue.submit(commandBuffer, fence)
		fence.wait()
		fence.reset()
		commandBuffer.reset()
	}



	private fun transitionImageLayout(
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



	fun updateImageForShaderRead(image: Image, stagingBuffer: Buffer) {
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


}