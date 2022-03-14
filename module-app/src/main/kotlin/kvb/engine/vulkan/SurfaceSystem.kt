package kvb.engine.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.stack
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class SurfaceSystem(
	val surface     : Surface,
	val device      : Device,
	val queue       : Queue,
	val renderPass  : RenderPass,
	val format      : Format,
	val colourSpace : ColorSpace,
	val presentMode : PresentMode,
	val sampleCount : SampleCountFlags
) {


	private var multisampleImage: Image? = null

	private var multisampleImageView: ImageView? = null

	private var multisampleImageMemory: DeviceMemory? = null



	init {
		if(sampleCount.isMulti) updateMultisample()
	}



	private fun updateMultisample() {
		multisampleImageView?.destroy()
		multisampleImage?.destroy()
		multisampleImageMemory?.free()

		multisampleImage = device.createImage2D(
			width   = surface.width,
			height  = surface.height,
			usage   = ImageUsageFlags { TRANSIENT_ATTACHMENT + COLOR_ATTACHMENT },
			format  = format,

			samples = sampleCount,
		)
		val memRequirements = multisampleImage!!.memoryRequirements()

		multisampleImageMemory = device.allocateMemory(
			size           = memRequirements.size,
			property1      = MemoryPropertyFlags.DEVICE_LOCAL,
			memoryTypeBits = memRequirements.memoryTypeBits
		)

		multisampleImage!!.bindMemory(multisampleImageMemory!!)

		multisampleImageView = device.createImageView(multisampleImage!!, ImageAspectFlags.COLOR)
	}



	private var swapchain = createSwapchain(null)

	private var images = createImages()

	private var imageViews = createImageViews()

	private var framebuffers = createFramebuffers()



	private val commandPool = device.createCommandPool(queue.family)

	private val commandBuffers = commandPool.allocatePrimary(images.size)

	private val imageAvailableSemaphore = device.createSemaphore()

	private val renderFinishedSemaphore = device.createSemaphore()



	private val clearValues = Unsafe.ClearValue(2) { }

	private val viewports = Unsafe.Viewport(1) { }

	private val scissors = Unsafe.Rect2D(1) { }



	init { updateDimensions() }



	/*
	Dimensions
	 */



	fun setViewportAndScissor(commandBuffer: CommandBuffer) {
		commandBuffer.setViewport(viewports)
		commandBuffer.setScissor(scissors)
	}



	private fun updateDimensions() {
		surface.updateCapabilities()
		viewports[0].width = surface.width.toFloat()
		viewports[0].height = surface.height.toFloat()
		scissors[0].extent.width = surface.width
		scissors[0].extent.height = surface.height
	}



	/*
	Clear Values
	 */



	fun backgroundColour(r: Float, g: Float, b: Float, a: Float) = clearValues[0].rgba(r, g, b, a)

	fun depthStencilClear(depth: Float, stencil: Int) = clearValues[1].depthStencil(depth, stencil)



	/*
	Object creation
	 */



	private fun createSwapchain(prevSwapchain: Swapchain?) = device.createSwapchain(
		surface,
		surface.capabilities.minImageCount + 1,
		format,
		colourSpace,
		surface.width,
		surface.height,
		presentMode,
		prevSwapchain
	)

	private fun createImages() = swapchain.getImages()

	private fun createImageViews() = images.map(device::createImageView)

	private fun createFramebuffers() = imageViews.map {
		if(sampleCount.isMulti)
			device.createFramebuffer(renderPass, listOf(multisampleImageView!!, it), surface.width, surface.height, 1)
		else
			device.createFramebuffer(renderPass, listOf(it), surface.width, surface.height, 1)
	}



	private fun recreateSwapchain() {
		imageViews.forEach { it.destroy() }
		framebuffers.forEach { it.destroy() }

		val prevSwapchain = this.swapchain
		swapchain = createSwapchain(prevSwapchain)
		prevSwapchain.destroy()

		images = createImages()
		imageViews = createImageViews()
		framebuffers = createFramebuffers()
	}



	private fun onResize() {
		updateDimensions()
		if(isMinimised) return
		recreateSwapchain()
		updateMultisample()
	}



	/*
	Commands
	 */



	val isMinimised get() = surface.width == 0 || surface.height == 0



	fun record(onRecord: (CommandBuffer) -> Unit) {
		if(isMinimised) return

		commandPool.reset()

		for(i in images.indices) {
			val commandBuffer = commandBuffers[i]
			val framebuffer = framebuffers[i]

			commandBuffer.begin()

			commandBuffer.setViewport(viewports)
			commandBuffer.setScissor(scissors)

			commandBuffer.beginRenderPass(renderPass, framebuffer, clearValues)
			onRecord(commandBuffer)
			commandBuffer.endRenderPass()

			commandBuffer.end()
		}
	}



	fun present() {
		val imageIndex = swapchain.acquireNextImage(semaphore = imageAvailableSemaphore)

		if(imageIndex == -1) {
			onResize()
			return
		}

		queue.submit(
			waitSemaphore    = imageAvailableSemaphore,
			waitDstStageMask = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			commandBuffer    = commandBuffers[imageIndex],
			signalSemaphore  = renderFinishedSemaphore,
			fence            = null
		)

		val presentResult = queue.present(
			waitSemaphore = renderFinishedSemaphore,
			swapchain     = swapchain,
			imageIndex    = imageIndex
		)

		device.waitIdle()

		if(!presentResult)
			onResize()
	}


}