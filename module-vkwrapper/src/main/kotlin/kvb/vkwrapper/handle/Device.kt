package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.vulkan.*
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.builder.RenderPassBuilder

@Suppress("unused")
class Device(address: Long, val physicalDevice: PhysicalDevice) : DeviceH(address) {


	/**
	 * Dynamically loaded Vulkan functions that are specific to this device.
	 */
	val commands = DeviceCommands(this, physicalDevice.instance.commands)

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

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
	fun createBuffer(info: BufferCreateInfo, stack: MemStack = default) = stack.get {
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
		flags	: BufferCreateFlags = BufferCreateFlags(0),
		stack   : MemStack          = default
	) = stack.get {
		createBuffer(BufferCreateInfo {
			it.flags = flags
			it.size = size
			it.usage = usage
			it.sharingMode = SharingMode.EXCLUSIVE
		}, stack)
	}



	/*
	Buffer view
	 */



	/**
	 * Implementation of vkCreateBufferView.
	 */
	fun createBufferView(info: BufferViewCreateInfo, stack: MemStack = default) = stack.get {
		val bufferView = mallocPointer()
		commands.createBufferView(info, null, bufferView).check()
		BufferView(bufferView.value, self)
	}



	/*
	Command pool
	 */



	/**
	 * Implementation of vkCreateCommandPool.
	 */
	fun createCommandPool(info: CommandPoolCreateInfo, stack: MemStack = default) = stack.get {
		val commandPool = mallocPointer()
		commands.createCommandPool(info, null, commandPool).check()
		CommandPool(commandPool.value, self)
	}



	/**
	 * Convenience implementation of vkCreateCommandPool.
	 */
	fun createCommandPool(
		queueFamilyIndex : Int,
		flags            : CommandPoolCreateFlags = CommandPoolCreateFlags(0),
		stack            : MemStack = default
	) = stack.get {
		createCommandPool(CommandPoolCreateInfo {
			it.queueFamilyIndex = queueFamilyIndex
			it.flags = flags
		}, stack)
	}



	/*
	Descriptor pool
	 */



	/**
	 * Implementation of vkCreateDescriptorPool.
	 */
	fun createDescriptorPool(info: DescriptorPoolCreateInfo, stack: MemStack = default) = stack.get {
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
		flags : DescriptorPoolCreateFlags = DescriptorPoolCreateFlags(0),
		stack : MemStack = default
	) = stack.get {
		createDescriptorPool(DescriptorPoolCreateInfo {
			it.maxSets   = count
			it.flags     = flags
			it.poolSizes = DescriptorPoolSize { sizeInfo ->
				sizeInfo.type = type
				sizeInfo.descriptorCount = count
			}.asBuffer
		}, stack)
	}



	/*
	Descriptor set layout
	 */



	/**
	 * Implementation of vkCreateDescriptorSetLayout.
	 */
	fun createDescriptorSetLayout(info: DescriptorSetLayoutCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createDescriptorSetLayout(info, null, pointer).check()
		DescriptorSetLayout(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateDescriptorSetLayout.
	 */
	fun createDescriptorSetLayout(
		bindings	: DescriptorSetLayoutBinding.Buffer,
		flags		: DescriptorSetLayoutCreateFlags = DescriptorSetLayoutCreateFlags(0),
		stack       : MemStack = default
	) = stack.get {
		createDescriptorSetLayout(DescriptorSetLayoutCreateInfo {
			it.bindings = bindings
			it.flags = flags
		}, stack)
	}



	/**
	 * Convenience implementation of vkCreateDescriptorSetLayout with only one binding.
	 */
	fun createDescriptorSetLayout(
		binding : Int,
		type    : DescriptorType,
		count   : Int,
		stages  : ShaderStageFlags,
		stack   : MemStack = default
	) = stack.get {
		createDescriptorSetLayout(
			DescriptorSetLayoutCreateInfo { info ->
				info.bindings = DescriptorSetLayoutBinding {
					it.binding         = binding
					it.descriptorType  = type
					it.descriptorCount = count
					it.stageFlags      = stages
				}.asBuffer
		}, stack)
	}



	/*
	Event
	 */



	/**
	 * Implementation of vkCreateEvent.
	 */
	fun createEvent(info: EventCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createEvent(info, null, pointer).check()
		Event(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateEvent.
	 */
	fun createEvent(stack: MemStack = default) = stack.get {
		createEvent(EventCreateInfo { }, stack)
	}



	/*
	Fence
	 */



	/**
	 * Implementation of vkCreateFence.
	 */
	fun createFence(info: FenceCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createFence(info, null, pointer).check()
		Fence(pointer.value, self)
	}



	/**
	 * Convenience implementation of vkCreateFence.
	 */
	fun createFence(stack: MemStack = default) = stack.get {
		createFence(FenceCreateInfo { }, stack)
	}



	/**
	 * Convenience implementation of vkCreateFence.
	 */
	fun createSignalledFence(stack: MemStack = default) = stack.get {
		createFence(FenceCreateInfo { it.flags = FenceCreateFlags.SIGNALED }, stack)
	}



	/*
	Framebuffer
	 */



	/**
	 * Implementation of vkCreateFramebuffer.
	 */
	fun createFramebuffer(info: FramebufferCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createFramebuffer(info, null, pointer).check()
		Framebuffer(pointer.value, self, info.width, info.height, info.layers)
	}



	/**
	 * Convenience implementation of vkCreateFramebuffer.
	 */
	fun createFramebuffer(
		renderPass  : RenderPass,
		attachments : List<ImageView>,
		width       : Int,
		height      : Int,
		layers      : Int,
		stack       : MemStack = default
	) = stack.get {
		createFramebuffer(FramebufferCreateInfo {
			it.renderPass = renderPass
			it.attachments = wrapPointers(attachments)
			it.width = width
			it.height = height
			it.layers = layers
		}, stack)
	}



	/*
	Graphics pipeline
	 */



	/**
	 * Builder implementation of vkCreateGraphicsPipelines.
	 */
	fun buildGraphicsPipeline(
		stack: MemStack = default,
		block: (GraphicsPipelineBuilder) -> Unit,
	) = stack.get {
		val pointer = mallocPointer(1)
		val builder = GraphicsPipelineBuilder(self, this).also(block)

		commands.createGraphicsPipelines(
			null,
			1,
			builder.build().asBuffer,
			null,
			pointer
		).check()

		Pipeline(pointer[0], self, PipelineBindPoint.GRAPHICS, builder.layout!!)
	}



	/*
	Image
	 */



	/**
	 * Implementation of vkCreateImage.
	 */
	fun createImage(info: ImageCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createImage(info, null, pointer).check()
		Image(pointer.value, self, info.imageType, info.format, info.mipLevels, info.arrayLayers, info.tiling)
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
		flags          : ImageCreateFlags = ImageCreateFlags(0),
		stack          : MemStack         = default
	) = stack.get {
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
		}, stack)
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
		flags         : ImageCreateFlags  = ImageCreateFlags(0),
		stack         : MemStack          = default
	) = stack.get {
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
	fun createImageView(info: ImageViewCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createImageView(info, null, pointer).check()
		ImageView(pointer.value, self)
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
		arrayLayerCount : Int              = image.arrayLayers,
		stack           : MemStack         = default
	) = stack.get {
		createImageView(ImageViewCreateInfo {
			it.image     = image
			it.viewType  = image.type.asImageViewType
			it.format    = image.format
			it.subresourceRange.aspectMask     = aspectMask
			it.subresourceRange.baseMipLevel   = baseMipLevel
			it.subresourceRange.levelCount     = mipLevelCount
			it.subresourceRange.baseArrayLayer = baseArrayLayer
			it.subresourceRange.layerCount     = arrayLayerCount
		}, stack)
	}



	/*
	PipelineLayout
	 */



	/**
	 * Implementation of vkCreatePipelineLayout.
	 */
	fun createPipelineLayout(info: PipelineLayoutCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createPipelineLayout(info, null, pointer).check()
		PipelineLayout(pointer.value, self)
	}



	/**
	 * Convenience implementation of vkCreatePipelineLayout. Creates an empty layout.
	 */
	fun createPipelineLayout(stack: MemStack = default) = stack.get {
		createPipelineLayout(PipelineLayoutCreateInfo { }, stack)
	}



	/**
	 * Convenience implementation of vkCreatePipelineLayout. No push constants.
	 */
	fun createPipelineLayout(
		setLayouts : List<DescriptorSetLayout>,
		stack      : MemStack = default
	) = stack.get {
		createPipelineLayout(PipelineLayoutCreateInfo {
			it.setLayouts = wrapPointers(setLayouts)
		}, stack)
	}



	/**
	 * Convenience implementation of vkCreatePipelineLayout. One descriptor set, no push constant ranges.
	 */
	fun createPipelineLayout(
		setLayout : DescriptorSetLayout,
		stack     : MemStack = default
	) = stack.get {
		createPipelineLayout(PipelineLayoutCreateInfo {
			it.setLayouts = wrapPointer(setLayout)
		}, stack)
	}



	/*
	Render pass
	 */



	/**
	 * Implementation of vkCreateRenderPass.
	 */
	fun createRenderPass(info: RenderPassCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createRenderPass(info, null, pointer).check()
		RenderPass(pointer.value, self)
	}



	/**
	 * Builder implementation of vkCreateRenderPass.
	 */
	fun buildRenderPass(
		stack: MemStack = default,
		block: (RenderPassBuilder) -> Unit,
	) = stack.get {
		createRenderPass(RenderPassBuilder(this).also(block).build(), stack)
	}



	/*
	Sampler
	 */



	/**
	 * Implementation of vkCreateSampler
	 */
	fun createSampler(info: SamplerCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createSampler(info, null, pointer).check()
		Sampler(pointer.value, self)
	}



	/*
	Semaphore
	 */



	/**
	 * Implementation of vkCreateSemaphore.
	 */
	fun createSemaphore(info: SemaphoreCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createSemaphore(info, null, pointer).check()
		Semaphore(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateSemaphore.
	 */
	fun createSemaphore(stack: MemStack = default) = stack.get {
		createSemaphore(SemaphoreCreateInfo { }, stack)
	}



	/*
	Shader module
	 */



	/**
	 * Implementation of vkCreateShaderModule.
	 */
	fun createShaderModule(info: ShaderModuleCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createShaderModule(info, null, pointer).check()
		ShaderModule(pointer.value, self)
	}



	/**
	 * Convenience version of vkCreateShaderModule.
	 */
	fun createShaderModule(
		codeSize : Long,
		pCode    : Long,
		stack    : MemStack = default
	) = stack.get {
		createShaderModule(ShaderModuleCreateInfo {
			it.codeSize = codeSize
			it.pCode = pCode
		}, stack)
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
	fun createSwapchain(info: SwapchainCreateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.createSwapchain(info, null, pointer).check()
		Swapchain(pointer.value, self, info.imageFormat)
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
		oldSwapchain     : SwapchainH? = null,
		stack            : MemStack = default
	) = stack.get {
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
	fun allocateMemory(info: MemoryAllocateInfo, stack: MemStack = default) = stack.get {
		val pointer = mallocPointer()
		commands.allocateMemory(info, null, pointer).check()
		DeviceMemory(pointer.value, self, info.allocationSize, physicalDevice.memoryTypes[info.memoryTypeIndex])
	}



	/**
	 * Convenience implementation of vkAllocateMemory.
	 */
	fun allocateMemory(
		allocationSize  : Long,
		memoryTypeIndex : Int,
		stack           : MemStack = default
	) = stack.get {
		allocateMemory(MemoryAllocateInfo {
			it.allocationSize = allocationSize
			it.memoryTypeIndex = memoryTypeIndex
		}, stack)
	}



	/**
	 * Convenience implementation of vkAllocateMemory.
	 */
	fun allocateMemory(
		size           : Long,
		flags          : MemoryPropertyFlags,
		memoryTypeBits : Int = UInt.MAX_VALUE.toInt(),
		stack          : MemStack = default
	) = stack.get {
		allocateMemory(MemoryAllocateInfo {
			it.allocationSize = size
			it.memoryTypeIndex = physicalDevice.chooseMemoryType(flags, memoryTypeBits)!!.typeIndex
		}, stack)
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
	fun getQueue(
		queueFamilyIndex : Int,
		queueIndex       : Int,
		stack            : MemStack = default
	) = stack.get {
		val queue = mallocPointer()
		commands.getDeviceQueue(queueFamilyIndex, queueIndex, queue)
		Queue(queue.value, self)
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
		timeout : Long         = ULong.MAX_VALUE.toLong(),
		stack   : MemStack     = default
	) = stack.with {
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
	fun resetFences(
		fences: List<Fence>,
		stack: MemStack = default
	) = stack.with {
		commands.resetFences(
			fences.size,
			wrapPointers(fences)
		)
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