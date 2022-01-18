package kvb.samples.sample0

import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.winapi.WinApiWindow

class AppContext(window: WinApiWindow) {


	/*
	Constants
	 */



	private val layers = listOf("VK_LAYER_KHRONOS_validation")

	private val extensions = listOf("VK_EXT_debug_utils", "VK_KHR_surface", "VK_KHR_win32_surface")

	private val deviceExtensions = listOf("VK_KHR_swapchain")



	/*
	Variables
	 */



	val start          = System.currentTimeMillis()

	val instance       = createInstance()

	val messenger      = createDebugMessenger()

	val physicalDevice = choosePhysicalDevice()

	val surface        = AppSurface(instance.createWin32Surface(0, window.hwnd), physicalDevice)

	val queueFamily    = chooseQueueFamily()

	val device         = createDevice()

	val queue          = createQueue()

	val allocator      = createAllocator()



	var swapchain       = createSwapchain()

	val renderPass      = createRenderPass()

	var images          = getSwapchainImages()

	var imageViews      = createImageViews()

	var framebuffers    = createFramebuffers()

	val commandPool     = createCommandPool()

	val commandBuffers  = allocateCommandBuffers()

	val uniformPool     = createUniformPool()

	val shaderDirectory = createShaderDirectory()



	val framesInFlight = 2

	val imageAvailableSemaphores = List(framesInFlight) { device.createSemaphore() }

	val renderFinishedSemaphores = List(framesInFlight) { device.createSemaphore() }

	val inFlightFences = List(framesInFlight) { device.createSignalledFence() }

	val imagesInFlight = arrayOfNulls<Fence>(images.size)



	/*
	Creation
	 */



	private fun createInstance() = Vulkan.createInstance(
		appName       = "My app",
		appVersion    = Version(1, 0, 0),
		engineName    = "My engine",
		engineVersion = Version(1, 0, 0),
		apiVersion    = Version(1, 2, 0),
		layers        = layers,
		extensions    = extensions
	)



	private fun createDebugMessenger() = instance.createDebugMessenger(
		callback   = DebugUtils.defaultCallbackAddress(),
		severities = DebugUtilsMessageSeverityFlags { WARNING + ERROR },
		types      = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }
	)



	private fun choosePhysicalDevice() = instance.physicalDevices[0]

	private fun chooseQueueFamily() = physicalDevice.queueFamilies.first {
		it.supportsGraphics && it.supportsSurface(surface.surface)
	}

	private fun createDevice() = physicalDevice.createDevice(listOf(queueFamily to 1), deviceExtensions)

	private fun createQueue() = device.getQueue(queueFamily.index, 0)

	private fun createAllocator() = AppAllocator(device, 1L shl 20, 1L shl 22)



	private fun createSwapchain(previous: SwapchainH? = null) = device.createSwapchain(
		surface          = surface.surface,
		minImageCount    = surface.capabilities.minImageCount + 1,
		imageFormat      = surface.format,
		imageColourSpace = surface.colourSpace,
		width            = surface.width,
		height           = surface.height,
		presentMode      = surface.presentMode,
		oldSwapchain     = previous
	)



	private fun createRenderPass() = device.buildRenderPass {
		it.attachment(
			format        = surface.format,
			loadOp        = AttachmentLoadOp.CLEAR,
			storeOp       = AttachmentStoreOp.STORE,
			initialLayout = ImageLayout.UNDEFINED,
			finalLayout   = ImageLayout.PRESENT_SRC
		)

		it.colourSubpass(0, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)

		it.dependency(
			srcSubpass    = VK_SUBPASS_EXTERNAL,
			dstSubpass    = 0,
			srcStageMask  = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			dstStageMask  = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			srcAccessMask = AccessFlags.NONE,
			dstAccessMask = AccessFlags.COLOR_ATTACHMENT_WRITE
		)
	}



	private fun getSwapchainImages() = swapchain.getImages()

	private fun createImageViews() = images.map(device::createImageView)

	private fun createFramebuffers() = imageViews.map {
		device.createFramebuffer(renderPass, listOf(it), surface.width, surface.height, 1)
	}

	private fun createCommandPool() = device.createCommandPool(queueFamily.index)

	private fun allocateCommandBuffers() = commandPool.allocatePrimaryCommandBuffers(imageViews.size)

	private fun createUniformPool() = device.createDescriptorPool(DescriptorType.UNIFORM_BUFFER, 20)

	private fun createShaderDirectory() = ShaderDirectory("res/shader/out", device)



	/*
	Allocation
	 */



	fun allocateBuffer(buffer: Buffer) = allocator.bufferAllocator.allocateBuffer(buffer)

	fun allocateImage(image: Image) = allocator.imageAllocator.allocateImage(image)

	fun createBuffer(size: Long, usage: BufferUsageFlags) = device.createBuffer(size, usage).also(::allocateBuffer)

	fun createUniformBuffer(size: Long) = createBuffer(size, BufferUsageFlags.UNIFORM_BUFFER)

	fun createVertexBuffer(size: Long) = createBuffer(size, BufferUsageFlags.VERTEX_BUFFER)



	/*
	Update
	 */



	var onRecord: (CommandBuffer) -> Unit = { }



	fun record() {
		commandPool.reset()

		for(i in images.indices) {
			record(framebuffers[i], commandBuffers[i])
		}
	}



	private fun record(framebuffer: Framebuffer, commandBuffer: CommandBuffer) {
		commandBuffer.begin() // CommandBuffer in recording state

		commandBuffer.setViewport(surface.viewports)
		commandBuffer.setScissor(surface.scissors)

		commandBuffer.beginRenderPass(renderPass, framebuffer, surface.clearValues)
		onRecord(commandBuffer)
		commandBuffer.endRenderPass()

		commandBuffer.end() // CommandBuffer in executable state
	}



	var currentFrame = 0



	fun present() {
		inFlightFences[currentFrame].wait()

		val imageIndex = swapchain.acquireNextImage(semaphore = imageAvailableSemaphores[currentFrame])

		// Resizing
		if(imageIndex == -1) {
			surface.updateDimensions()

			// Minimisation
			if(surface.width == 0 || surface.height == 0) return

			onResize()
			record()

			return
		}

		imagesInFlight[imageIndex]?.wait()
		imagesInFlight[imageIndex] = inFlightFences[currentFrame]
		inFlightFences[currentFrame].reset()

		queue.submit(
			waitSemaphore    = imageAvailableSemaphores[currentFrame],
			waitDstStageMask = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			commandBuffer    = commandBuffers[imageIndex],
			signalSemaphore  = renderFinishedSemaphores[currentFrame],
			fence            = inFlightFences[currentFrame]
		)

		queue.present(
			waitSemaphore = renderFinishedSemaphores[currentFrame],
			swapchain     = swapchain,
			imageIndex    = imageIndex
		)

		currentFrame = (currentFrame + 1) % framesInFlight
	}



	private fun onResize() {
		device.waitIdle()
		commandPool.reset()
		imageViews.forEach { it.destroy() }
		framebuffers.forEach { it.destroy() }

		// Recycle the swapchain's images when destroying it.
		// Slightly faster (half a millisecond)
		swapchain.let {
			swapchain = createSwapchain(it)
			it.destroy()
		}

		// The images still need to be gotten from the new swapchain.
		// New image views and frame buffers must also be made from the new images.
		images = swapchain.getImages()
		imageViews = createImageViews()
		framebuffers = createFramebuffers()
	}



	/*
	Cleanup
	 */



	fun destroy() {
		device.waitForFences(inFlightFences)
		imageAvailableSemaphores.forEach { it.destroy() }
		renderFinishedSemaphores.forEach { it.destroy() }
		inFlightFences.forEach { it.destroy() }
		allocator.destroy()
		uniformPool.destroy()
		shaderDirectory.destroy()
		commandPool.destroy()
		framebuffers.forEach { it.destroy() }
		imageViews.forEach { it.destroy() }
		renderPass.destroy()
		swapchain.destroy()
		device.destroy()
		surface.destroy()
		messenger.destroy()
		instance.destroy()
	}


}