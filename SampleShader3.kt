package app

import memory.allocation.MemStacks
import vulkan.generated.VkConstants
import vulkan.generated.allocation.*
import vulkan.generated.enumeration.*
import vulkan.wrapper.handle.CommandBuffer
import vulkan.wrapper.handle.Image
import java.nio.file.Files
import java.nio.file.Paths

object SampleShader3 : AppShader("sample3") {


	/*
	Image data
	 */



	val IMAGE_DATA = Files.readAllBytes(Paths.get("res/texture/image2.txt"))

	const val IMAGE_WIDTH = 5

	const val IMAGE_HEIGHT = 5

	const val IMAGE_PIXEL_COUNT = IMAGE_WIDTH * IMAGE_HEIGHT

	const val IMAGE_COMPONENTS = 4 // rgba

	const val IMAGE_SIZE = IMAGE_PIXEL_COUNT * IMAGE_COMPONENTS // in bytes



	val commandPool = context.device.createCommandPool(
		context.queueFamily.index,
		CommandPoolCreateFlags.TRANSIENT
	)



	val stagingBuffer = context.allocator.createBuffer(
		IMAGE_SIZE.toLong(),
		BufferUsageFlags.TRANSFER_SRC
	).also {
		it.flush { buffer -> buffer[0] = IMAGE_DATA }
	}



	val image = MemStacks.get {
		val info = ImageCreateInfo {
			it.imageType = ImageType._2D
			it.format = Format.R8G8B8A8_SRGB
			it.extent.width = IMAGE_WIDTH
			it.extent.height = IMAGE_HEIGHT
			it.extent.depth = 1
			it.mipLevels = 1
			it.arrayLayers = 1
			it.samples = SampleCountFlags._1
			it.tiling = ImageTiling.OPTIMAL
			it.usage = ImageUsageFlags.compose { TRANSFER_DST + SAMPLED }
			it.sharingMode = SharingMode.EXCLUSIVE
			it.initialLayout = ImageLayout.UNDEFINED
		}

		context.device.createImage(info)
	}.also {
		context.imageAllocator.allocateImage(it)
	}



	init {
		initImage()
	}



	val imageView = MemStacks.get {
		val info = ImageViewCreateInfo {
			it.image = image
			it.viewType = ImageViewType._2D
			it.format = Format.R8G8B8A8_SRGB
			it.subresourceRange.aspectMask = ImageAspectFlags.COLOR
			it.subresourceRange.baseMipLevel = 0
			it.subresourceRange.levelCount = 1
			it.subresourceRange.baseArrayLayer = 0
			it.subresourceRange.layerCount = 1
		}

		device.createImageView(info)
	}



	val sampler = MemStacks.get {
		val info = SamplerCreateInfo {
			it.magFilter = Filter.NEAREST
			it.minFilter = Filter.NEAREST
			it.addressModeU = SamplerAddressMode.REPEAT
			it.addressModeV = SamplerAddressMode.REPEAT
			it.addressModeW = SamplerAddressMode.REPEAT
			it.anisotropyEnable = VkConstants.FALSE
			it.maxAnisotropy = 1.0F
			it.borderColor = BorderColor.INT_OPAQUE_BLACK
			it.unnormalizedCoordinates = VkConstants.FALSE
			it.compareEnable = VkConstants.FALSE
			it.compareOp = CompareOp.ALWAYS
			it.mipmapMode = SamplerMipmapMode.LINEAR
		}

		context.device.createSampler(info)
	}



	/*
	Commands
	 */



	private fun oneTimeCommand(block: (CommandBuffer) -> Unit) {
		val commandBuffer = commandPool.allocatePrimaryCommandBuffer()
		commandBuffer.beginOneTimeSubmit()
		block(commandBuffer)
		commandBuffer.end()
		context.queue.submit(commandBuffer)
		context.queue.waitIdle()
		commandBuffer.free()
	}



	fun transitionImageLayout(
		image         : Image,
		prevLayout    : ImageLayout,
		newLayout     : ImageLayout,
		srcAccessMask : AccessFlags,
		dstAccessMask : AccessFlags,
		srcStages     : PipelineStageFlags,
		dstStages     : PipelineStageFlags
	) = oneTimeCommand { commandBuffer ->
		MemStacks.with {
			val barrier = ImageMemoryBarrier {
				it.srcQueueFamilyIndex = VkConstants.QUEUE_FAMILY_IGNORED
				it.dstQueueFamilyIndex = VkConstants.QUEUE_FAMILY_IGNORED
				it.oldLayout = prevLayout
				it.newLayout = newLayout
				it.image = image
				it.subresourceRange.aspectMask = ImageAspectFlags.COLOR
				it.subresourceRange.baseMipLevel = 0
				it.subresourceRange.levelCount = 1
				it.subresourceRange.baseArrayLayer = 0
				it.subresourceRange.layerCount = 1
				it.srcAccessMask = srcAccessMask
				it.dstAccessMask = dstAccessMask
			}

			commandBuffer.pipelineImageMemoryBarrier(srcStages, dstStages, barrier)
		}
	}



	fun initImage() {
		transitionImageLayout(
			image,
			ImageLayout.UNDEFINED,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			AccessFlags.NONE,
			AccessFlags.TRANSFER_WRITE,
			PipelineStageFlags.TOP_OF_PIPE,
			PipelineStageFlags.TRANSFER
		)

		oneTimeCommand {
			it.copyBufferToImage2D(
				stagingBuffer,
				image,
				ImageLayout.TRANSFER_DST_OPTIMAL,
				IMAGE_WIDTH,
				IMAGE_HEIGHT
			)
		}

		transitionImageLayout(
			image,
			ImageLayout.TRANSFER_DST_OPTIMAL,
			ImageLayout.SHADER_READ_ONLY_OPTIMAL,
			AccessFlags.TRANSFER_WRITE,
			AccessFlags.SHADER_READ,
			PipelineStageFlags.TRANSFER,
			PipelineStageFlags.FRAGMENT_SHADER
		)
	}



	/*
	Descriptors
	 */



	val descriptorSetLayout = device.createDescriptorSetLayout(
		binding = 0,
		type    = DescriptorType.COMBINED_IMAGE_SAMPLER,
		count   = 1,
		stages  = ShaderStageFlags.FRAGMENT
	)



	val descriptorPool = device.createDescriptorPool(
		type  = DescriptorType.COMBINED_IMAGE_SAMPLER,
		count = 10
	)



	val descriptorSet = descriptorPool.allocateDescriptorSet(descriptorSetLayout)



	override val pipelineLayout = device.createPipelineLayout(descriptorSetLayout)



	fun updateDescriptorSet() = MemStacks.with {
		val imageInfo = DescriptorImageInfo {
			it.imageLayout = ImageLayout.SHADER_READ_ONLY_OPTIMAL
			it.imageView = imageView
			it.sampler = sampler
		}

		val writes = WriteDescriptorSet {
			it.dstSet = descriptorSet
			it.dstBinding = 0
			it.dstArrayElement = 0
			it.descriptorType = DescriptorType.COMBINED_IMAGE_SAMPLER
			it.descriptorCount = 1
			it.imageInfo = imageInfo.asBuffer
		}

		device.updateDescriptorSets(writes.asBuffer)
	}



	/*
	Misc.
	 */



	init {
		updateDescriptorSet()
	}



	override fun destroy() {
		super.destroy()
		descriptorSetLayout.destroy()
		descriptorPool.destroy()
		stagingBuffer.destroy()
		image.destroy()
		imageView.destroy()
		sampler.destroy()
		commandPool.destroy()
	}

}


//	private val graphicsPipeline = context.device.buildGraphicsPipeline {
//		it.renderPass = context.renderPass
//		it.shaders(SampleShader3)
//		it.topology = PrimitiveTopology.TRIANGLE_STRIP
//		it.singleColourAttachment()
//		it.dynamicViewportAndScissor()
//	}
//
//
//
//	override fun record(commandBuffer: CommandBuffer) {
//		commandBuffer.bindGraphicsPipeline(graphicsPipeline)
//		commandBuffer.bindGraphicsDescriptorSet(SampleShader3.pipelineLayout, SampleShader3.descriptorSet)
//		commandBuffer.draw(vertexCount = 4, instanceCount = 2)
//	}
//
//
//
//	override fun destroy() {
//		graphicsPipeline.destroy()
//	}