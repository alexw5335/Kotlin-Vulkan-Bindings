package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.vulkan.*
import kvb.core.memory.*
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.builder.RenderPassBuilder
import kvb.vkwrapper.exception.VkCommandException
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.persistent.Descriptor
import kvb.vkwrapper.persistent.PushConstant
import kvb.vkwrapper.persistent.QueueFamily

@Suppress("unused")
class Device(address: Long, val physicalDevice: PhysicalDevice) : DeviceH(address) {


	/**
	 * Dynamically loaded Vulkan functions that are specific to this device.
	 */
	val commands = DeviceCommands(this, physicalDevice.instance.commands)

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self = this

	/**
	 * Implementation of vkDestroyDevice.
	 */
	fun destroy() = commands.destroyDevice(null)



	/*
	Buffer
	 */



	/**
	 * Implementation of vkCreateBuffer.
	 */
	fun createBuffer(info: BufferCreateInfo) = stackGet {
		val buffer = mallocPointer()
		commands.createBuffer(info, null, buffer)
		Buffer(buffer.value, self, info.size, info.usage)
	}



	/**
	 * Convenience implementation of vkCreateBuffer. For buffers with exclusive sharing modes.
	 */
	fun createBuffer(
		size	: Long,
		usage	: BufferUsageFlags,
		flags	: BufferCreateFlags = BufferCreateFlags(0)
	) = stackGet {
		createBuffer(BufferCreateInfo {
			it.flags = flags
			it.size = size
			it.usage = usage
			it.sharingMode = SharingMode.EXCLUSIVE
		})
	}



	/**
	 * Convenience implementation of vkCreateBuffer.
	 */
	fun createVertexBuffer(size: Int) = createBuffer(size.toLong(), BufferUsageFlags.VERTEX_BUFFER)



	/*
	Buffer view
	 */



	/**
	 * Implementation of vkCreateBufferView.
	 */
	fun createBufferView(info: BufferViewCreateInfo) = stackGet {
		val bufferView = mallocPointer()
		commands.createBufferView(info, null, bufferView).check()
		BufferView(bufferView.value, self)
	}



	/*
	Command pool (complete)
	 */



	/**
	 * Convenience implementation of vkCreateCommandPool.
	 */
	fun createCommandPool(
		queueFamily : QueueFamily,
		flags       : CommandPoolCreateFlags = CommandPoolCreateFlags(0)
	) = stackGet {
		val pointer = mallocPointer()

		commands.createCommandPool(CommandPoolCreateInfo {
			it.queueFamilyIndex = queueFamily.index
			it.flags = flags
		}, null, pointer).check()

		CommandPool(pointer.value, self, queueFamily)
	}



	/**
	 * Convenience implementation of vkCreateCommandPool.
	 */
	fun createTransientCommandPool(queueFamily: QueueFamily) =
		createCommandPool(queueFamily, CommandPoolCreateFlags.TRANSIENT)



	/*
	Descriptor pool
	 */



	/**
	 * Implementation of vkCreateDescriptorPool.
	 */
	fun createDescriptorPool(info: DescriptorPoolCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createDescriptorPool(info, null, pointer).check()
		DescriptorPool(pointer.value, self)
	}



	/**
	 * Convenience implementation of vkCreateDescriptorSetPool. May only allocate descriptor sets of a single type.
	 */
	fun createDescriptorPool(
		type  : DescriptorType,
		count : Int = 20,
		flags : DescriptorPoolCreateFlags = DescriptorPoolCreateFlags(0)
	) = stackGet {
		createDescriptorPool(DescriptorPoolCreateInfo {
			it.maxSets   = count
			it.flags     = flags
			it.poolSizes = DescriptorPoolSize { sizeInfo ->
				sizeInfo.type = type
				sizeInfo.descriptorCount = count
			}.asBuffer
		})
	}



	/**
	 * Convenience implementation of vkCreateDescriptorSetPool.
	 */
	fun createDescriptorPool(
		types   : Map<DescriptorType, Int>,
		maxSets : Int                       = types.values.sum(),
		flags   : DescriptorPoolCreateFlags = DescriptorPoolCreateFlags(0)
	) = stackGet {
		createDescriptorPool(DescriptorPoolCreateInfo { ci ->
			ci.maxSets   = maxSets
			ci.flags     = flags
			ci.poolSizes = DescriptorPoolSize(types.size) { sizes ->
				var index = 0
				for((type, count) in types) {
					sizes[index++].let {
						it.type = type
						it.descriptorCount = count
					}
				}
			}
		})
	}



	/*
	Descriptor set layout
	 */



	/**
	 * Implementation of vkCreateDescriptorSetLayout.
	 */
	fun createDescriptorSetLayout(
		info        : DescriptorSetLayoutCreateInfo,
		descriptors : List<Descriptor>
	) = stackGet {
		val pointer = mallocPointer()
		commands.createDescriptorSetLayout(info, null, pointer).check()
		DescriptorSetLayout(pointer.value, self, descriptors)
	}



	/**
	 * Convenience version of vkCreateDescriptorSetLayout.
	 */
	fun createDescriptorSetLayout(
		descriptors : List<Descriptor>,
		flags		: DescriptorSetLayoutCreateFlags = DescriptorSetLayoutCreateFlags(0)
	) = stackGet {
		val bindings = DescriptorSetLayoutBinding(descriptors.size) { }

		for((i, d) in descriptors.withIndex()) {
			bindings[i].let {
				it.binding = d.binding
				it.descriptorType = d.type
				it.descriptorCount = d.count
				it.stageFlags = d.stages
			}
		}

		val info = DescriptorSetLayoutCreateInfo {
			it.bindings = bindings
			it.flags = flags
		}

		createDescriptorSetLayout(info, descriptors)
	}



	/*
	Event
	 */



	/**
	 * Complete implementation of vkCreateEvent.
	 */
	fun createEvent() = stackGet {
		val pointer = mallocPointer()
		commands.createEvent(EventCreateInfo { }, null, pointer).check()
		Event(pointer.value, self)
	}



	/*
	Fence
	 */



	/**
	 * Implementation of vkCreateFence.
	 */
	fun createFence(info: FenceCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createFence(info, null, pointer).check()
		Fence(pointer.value, self)
	}



	/**
	 * Convenience implementation of vkCreateFence.
	 */
	fun createFence() = stackGet {
		createFence(FenceCreateInfo { })
	}



	/**
	 * Convenience implementation of vkCreateFence.
	 */
	fun createSignalledFence() = stackGet {
		createFence(FenceCreateInfo { it.flags = FenceCreateFlags.SIGNALED })
	}



	/*
	Framebuffer
	 */



	/**
	 * Implementation of vkCreateFramebuffer.
	 */
	fun createFramebuffer(info: FramebufferCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createFramebuffer(info, null, pointer).check()
		Framebuffer(pointer.value, self, info.width, info.height, info.layers)
	}



	/**
	 * Convenience implementation of vkCreateFramebuffer. For framebuffers with a single attachment.
	 */
	fun createFramebuffer(
		renderPass  : RenderPass,
		attachments : List<ImageView>,
		width       : Int,
		height      : Int,
		layers      : Int
	) = stackGet {
		createFramebuffer(FramebufferCreateInfo {
			it.renderPass = renderPass
			it.attachments = wrapPointers(attachments)
			it.width = width
			it.height = height
			it.layers = layers
		})
	}



	/*
	Graphics pipeline
	 */



	fun createGraphicsPipeline(
		info           : GraphicsPipelineCreateInfo,
		layout         : PipelineLayout,
		descriptorSets : List<Pair<Int, DescriptorSet>>
	) = stackGet {
		val pointer = mallocPointer(1)
		commands.createGraphicsPipelines(null, 1, info.asBuffer, null, pointer).check()
		Pipeline(pointer[0], self, PipelineBindPoint.GRAPHICS, layout, descriptorSets)
	}



	/**
	 * Builder implementation of vkCreateGraphicsPipelines.
	 */
	fun buildGraphicsPipeline(block: GraphicsPipelineBuilder.() -> Unit) =
		GraphicsPipelineBuilder(this, MemStack.current()).also(block).build()



	/*
	Image
	 */



	/**
	 * Implementation of vkCreateImage.
	 */
	fun createImage(info: ImageCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createImage(info, null, pointer).check()

		Image(
			pointer.value,
			self,
			info.imageType,
			info.format,
			info.extent.width,
			info.extent.height,
			info.extent.depth,
			info.mipLevels,
			info.arrayLayers,
			info.tiling
		)
	}



	/**
	 * Convenience implementation of vkCreateImage. The sharing mode is inferred from the value of [queueFamilies].
	 */
	fun createImage(
		type           : ImageType,
		format         : Format,
		width          : Int,
		height         : Int,
		depth          : Int,
		mipLevels      : Int              = 1,
		arrayLayers    : Int              = 1,
		samples        : SampleCountFlags = SampleCountFlags._1,
		tiling         : ImageTiling      = ImageTiling.OPTIMAL,
		usage          : ImageUsageFlags,
		queueFamilies  : IntArray?        = null,
		initialLayout  : ImageLayout      = ImageLayout.UNDEFINED,
		flags          : ImageCreateFlags = ImageCreateFlags(0)
	) = stackGet {
		createImage(ImageCreateInfo {
			it.flags = flags
			it.imageType = type
			it.format = format
			it.extent.width = width
			it.extent.height = height
			it.extent.depth = depth
			it.mipLevels = mipLevels
			it.arrayLayers = arrayLayers
			it.samples = samples
			it.tiling = tiling
			it.usage = usage
			it.sharingMode = if(queueFamilies != null) SharingMode.CONCURRENT else SharingMode.EXCLUSIVE
			if(queueFamilies != null) it.queueFamilyIndices = this.wrapInts(queueFamilies)
			it.initialLayout = initialLayout
		})
	}



	/**
	 * Convenience implementation of vkCreateImage for 2D images with exclusive sharing modes.
	 */
	fun createImage2D(
		width         : Int,
		height        : Int,
		usage         : ImageUsageFlags,
		format        : Format            = Format.R8G8B8A8_SRGB,
		mipLevels     : Int               = 1,
		arrayLayers   : Int               = 1,
		samples       : SampleCountFlags  = SampleCountFlags._1,
		initialLayout : ImageLayout       = ImageLayout.UNDEFINED,
		flags         : ImageCreateFlags  = ImageCreateFlags(0)
	) = stackGet {
		createImage(ImageCreateInfo {
			it.flags = flags
			it.imageType = ImageType._2D
			it.format = format
			it.extent.width = width
			it.extent.height = height
			it.extent.depth = 1
			it.mipLevels = mipLevels
			it.arrayLayers = arrayLayers
			it.samples = samples
			it.tiling = ImageTiling.OPTIMAL
			it.usage = usage
			it.sharingMode = SharingMode.EXCLUSIVE
			it.initialLayout = initialLayout
		})
	}



	/*
	Image view
	 */



	/**
	 * Implementation of vkCreateImageView.
	 */
	fun createImageView(info: ImageViewCreateInfo, image: Image) = stackGet {
		val pointer = mallocPointer()
		commands.createImageView(info, null, pointer).check()
		ImageView(pointer.value, self, image)
	}



	/**
	 * Convenience implementation of vkCreateImageView.
	 */
	fun createImageView(
		image           : Image,
		aspectMask      : ImageAspectFlags = ImageAspectFlags.COLOR,
		baseMipLevel    : Int              = 0,
		mipLevelCount   : Int              = image.mipLevels,
		baseArrayLayer  : Int              = 0,
		arrayLayerCount : Int              = image.arrayLayers
	) = stackGet {
		createImageView(ImageViewCreateInfo {
			it.image     = image
			it.viewType  = image.type.asImageViewType
			it.format    = image.format
			it.subresourceRange.aspectMask     = aspectMask
			it.subresourceRange.baseMipLevel   = baseMipLevel
			it.subresourceRange.levelCount     = mipLevelCount
			it.subresourceRange.baseArrayLayer = baseArrayLayer
			it.subresourceRange.layerCount     = arrayLayerCount
		}, image)
	}



	/*
	PipelineLayout
	 */



	/**
	 * Convenience implementation of vkCreatePipelineLayout.
	 */
	fun createPipelineLayout(
		setLayouts    : List<DescriptorSetLayout>,
		pushConstants : List<PushConstant>
	) = stackGet {
		val info = PipelineLayoutCreateInfo {
			it.setLayouts = wrapPointers(setLayouts)
			it.pushConstantRanges = PushConstantRange(pushConstants.size) { buffer ->
				for((i, p) in pushConstants.withIndex()) {
					buffer[i].let { range ->
						range.stageFlags = p.stages
						range.offset     = p.offset
						range.size       = p.size
					}
				}
			}
		}

		val pointer = mallocPointer()
		commands.createPipelineLayout(info, null, pointer).check()
		PipelineLayout(pointer.value, self, setLayouts, pushConstants)
	}



	/*
	Render pass
	 */



	/**
	 * Implementation of vkCreateRenderPass.
	 */
	fun createRenderPass(info: RenderPassCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createRenderPass(info, null, pointer).check()
		RenderPass(pointer.value, self)
	}



	/**
	 * Builder implementation of vkCreateRenderPass.
	 */
	fun buildRenderPass(block: (RenderPassBuilder) -> Unit) = stackGet {
		createRenderPass(RenderPassBuilder(this).also(block).build())
	}



	/*
	Sampler
	 */



	/**
	 * Implementation of vkCreateSampler.
	 */
	fun createSampler(info: SamplerCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createSampler(info, null, pointer).check()
		Sampler(pointer.value, self)
	}



	/**
	 * Convenience implementation of vkCreateSampler.
	 */
	fun createSampler(
		magFilter               : Filter,
		minFilter               : Filter,
		mipmapMode              : SamplerMipmapMode   = SamplerMipmapMode.NEAREST,
		addressModeU            : SamplerAddressMode  = SamplerAddressMode.REPEAT,
		addressModeV            : SamplerAddressMode  = SamplerAddressMode.REPEAT,
		addressModeW            : SamplerAddressMode  = SamplerAddressMode.REPEAT,
		mipLodBias              : Float               = 0.0F,
		anisotropyEnable        : Boolean             = false,
		maxAnisotropy           : Float               = 0.0F,
		compareEnable           : Boolean             = false,
		compareOp               : CompareOp           = CompareOp.NEVER,
		minLod                  : Float               = 0.0F,
		maxLod                  : Float               = 0.0F,
		borderColour            : BorderColor         = BorderColor.FLOAT_TRANSPARENT_BLACK,
		unnormalisedCoordinates : Boolean             = false
	) = stackGet {
		createSampler(SamplerCreateInfo {
			it.magFilter               = magFilter
			it.minFilter               = minFilter
			it.mipmapMode              = mipmapMode
			it.addressModeU            = addressModeU
			it.addressModeV            = addressModeV
			it.addressModeW            = addressModeW
			it.mipLodBias              = mipLodBias
			it.anisotropyEnable        = VK_BOOL(anisotropyEnable)
			it.maxAnisotropy           = maxAnisotropy
			it.compareEnable           = VK_BOOL(compareEnable)
			it.compareOp               = compareOp
			it.minLod                  = minLod
			it.maxLod                  = maxLod
			it.borderColor             = borderColour
			it.unnormalizedCoordinates = VK_BOOL(unnormalisedCoordinates)
		})
	}



	/*
	Semaphore
	 */



	/**
	 * Implementation of vkCreateSemaphore.
	 */
	fun createSemaphore(info: SemaphoreCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createSemaphore(info, null, pointer).check()
		Semaphore(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateSemaphore.
	 */
	fun createSemaphore() = stackGet {
		createSemaphore(SemaphoreCreateInfo { })
	}



	/*
	Shader module
	 */



	/**
	 * Implementation of vkCreateShaderModule.
	 */
	fun createShaderModule(info: ShaderModuleCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createShaderModule(info, null, pointer).check()
		ShaderModule(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateShaderModule.
	 */
	fun createShaderModule(
		codeSize : Long,
		pCode    : Long
	) = stackGet {
		createShaderModule(ShaderModuleCreateInfo {
			it.codeSize = codeSize
			it.pCode = pCode
		})
	}



	/**
	 * Convenience version of vkCreateShaderModule.
	 */
	fun createShaderModule(code: DirectByteBuffer) = createShaderModule(code.capacity.toLong(), code.address)



	/*
	Swapchain
	 */



	/**
	 * Implementation of vkCreateSwapchain.
	 */
	fun createSwapchain(info: SwapchainCreateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.createSwapchain(info, null, pointer).check()

		Swapchain(
			pointer.value,
			self,
			info.minImageCount,
			info.imageFormat,
			info.imageColorSpace,
			info.imageExtent.width,
			info.imageExtent.height,
			info.imageArrayLayers,
			info.imageUsage,
			info.preTransform,
			info.compositeAlpha,
			info.presentMode,
			info.clipped == VK_TRUE
		)
	}



	/**
	 * Convenience implementation of vkCreateSwapchainKHR.
	 */
	fun createSwapchain(
		surface          : Surface,
		minImageCount    : Int,
		imageFormat      : Format,
		imageColourSpace : ColorSpace,
		width            : Int,
		height           : Int,
		presentMode      : PresentMode,
		oldSwapchain     : SwapchainH? = null
	) = stackGet {
		createSwapchain(SwapchainCreateInfo {
			it.surface = surface
			it.minImageCount = minImageCount
			it.imageFormat = imageFormat
			it.imageColorSpace = imageColourSpace
			it.imageExtent.width = width
			it.imageExtent.height = height
			it.imageArrayLayers = 1
			it.imageUsage = ImageUsageFlags.COLOR_ATTACHMENT
			it.imageSharingMode = SharingMode.EXCLUSIVE
			it.preTransform = SurfaceTransformFlags.IDENTITY
			it.compositeAlpha = CompositeAlphaFlags.OPAQUE
			it.presentMode = presentMode
			it.clipped = VK_TRUE
			it.oldSwapchain = oldSwapchain ?: SwapchainH(0L)
		})

	}



	/*
	DeviceMemory allocation
	 */



	/**
	 * Implementation of vkAllocateMemory.
	 */
	fun allocateMemory(info: MemoryAllocateInfo) = stackGet {
		val pointer = mallocPointer()
		commands.allocateMemory(info, null, pointer).check()
		DeviceMemory(pointer.value, self, info.allocationSize, physicalDevice.memoryTypes[info.memoryTypeIndex])
	}



	/**
	 * Convenience implementation of vkAllocateMemory.
	 */
	fun allocateMemory(size: Long, memoryTypeIndex: Int) = stackGet {
		allocateMemory(MemoryAllocateInfo {
			it.allocationSize = size
			it.memoryTypeIndex = memoryTypeIndex
		})
	}



	/**
	 * Convenience implementation of vkAllocateMemory.
	 */
	fun allocateMemory(
		size           : Long,
		property1      : MemoryPropertyFlags,
		property2      : MemoryPropertyFlags  = MemoryPropertyFlags(0),
		property3      : MemoryPropertyFlags  = MemoryPropertyFlags(0),
		memoryTypeBits : Int                  = UInt.MAX_VALUE.toInt()
	) = stackGet {
		var failureIndex = -1
		var typeIndex = -1
		var memory: DeviceMemory

		while(true) {
			try {
				typeIndex = physicalDevice.chooseMemoryType(
					property1,
					property2,
					property3,
					memoryTypeBits,
					failureIndex
				)?.index ?: throw VkException(
					"No memory type with required flags: $property1 and memory type bits: $memoryTypeBits."
				)

				memory = allocateMemory(MemoryAllocateInfo {
					it.allocationSize = size
					it.memoryTypeIndex = typeIndex
				})

				break
			} catch(e: VkCommandException) {
				failureIndex = typeIndex
			}
		}

		memory
	}



	/*
	Functions
	 */



	/**
	 * Implementation of vkDeviceWaitIdle.
	 */
	fun waitIdle() = commands.deviceWaitIdle()



	/**
	 * Implementation of vkGetDeviceQueue.
	 */
	fun getQueue(queueFamily: QueueFamily, queueIndex: Int) = stackGet {
		val queue = mallocPointer()
		commands.getDeviceQueue(queueFamily.index, queueIndex, queue)
		Queue(queue.value, self, queueFamily)
	}



	/**
	 * Implementation of vkFlushMappedMemoryRanges.
	 */
	fun flushMappedMemoryRanges(memoryRanges: MappedMemoryRange.Buffer) = commands.flushMappedMemoryRanges(
		memoryRangeCount 	= memoryRanges.capacity,
		pMemoryRanges 		= memoryRanges
	).check()



	/**
	 * Implementation of vkUpdateDescriptorSets.
	 */
	fun updateDescriptorSets(
		writes: WriteDescriptorSet.Buffer,
		copies: CopyDescriptorSet.Buffer
	) = commands.updateDescriptorSets(
		descriptorWriteCount 	= writes.capacity,
		pDescriptorWrites 		= writes,
		descriptorCopyCount 	= copies.capacity,
		pDescriptorCopies 		= copies
	)



	/**
	 * Write-only convenience version of vkUpdateDescriptorSets.
	 */
	fun updateDescriptorSets(writes: WriteDescriptorSet.Buffer) = commands.updateDescriptorSets(
		descriptorWriteCount = writes.capacity,
		pDescriptorWrites    = writes,
		descriptorCopyCount  = 0,
		pDescriptorCopies    = CopyDescriptorSet.Buffer(0, 0)
	)



	/**
	 * Implementation of vkWaitForFences.
	 */
	fun waitForFences(
		fences  : List<Fence>,
		waitAll : Boolean      = true,
		timeout : Long         = ULong.MAX_VALUE.toLong()
	) = stack {
		commands.waitForFences(
			fenceCount = fences.size,
			pFences    = wrapPointers(fences),
			waitAll    = if(waitAll) VK_TRUE else VK_FALSE,
			timeout   = timeout
		).check()
	}



	/**
	 * Implementation of vkResetFences.
	 */
	fun resetFences(fences: List<Fence>) = stack { 
		commands.resetFences(fences.size, wrapPointers(fences))
	}



	/*
	Memory alignment
	 */



	/**
	 * Floors the [value] to the nearest multiple of [PhysicalDeviceLimits.nonCoherentAtomSize].
	 */
	fun alignMemOffset(value: Long): Long {
		val alignment = physicalDevice.properties.limits.nonCoherentAtomSize
		return value and (alignment - 1).inv()
	}



	/**
	 * Ceils the [value] to the nearest multiple of [PhysicalDeviceLimits.nonCoherentAtomSize].
	 */
	fun alignMemSize(value: Long): Long {
		val alignment = physicalDevice.properties.limits.nonCoherentAtomSize
		return (value + (alignment - 1)) and -alignment
	}


}