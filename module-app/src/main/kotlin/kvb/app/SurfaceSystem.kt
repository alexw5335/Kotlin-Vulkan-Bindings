package kvb.app

import kvb.core.memory.Unsafe
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class SurfaceSystem(
	val surface : Surface,
	val device  : Device,
	val queue   : Queue,
	val renderPass: RenderPass,
	val swapchainCreator: (Swapchain?) -> Swapchain
) {


	var onRecord: (CommandBuffer) -> Unit = { }

	var swapchain = swapchainCreator(null)

	var images = createImages()

	var imageViews = createImageViews()

	var framebuffers = createFramebuffers()

	val commandPool = device.createCommandPool(queue.family)

	val commandBuffers = commandPool.allocatePrimary(images.size)

	private val imageAvailableSemaphore = device.createSemaphore()

	private val renderFinishedSemaphore = device.createSemaphore()



	val clearValues = Unsafe.ClearValue(2) { }

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



	fun updateDimensions() {
		surface.updateCapabilities()
		viewports[0].width = surface.width.toFloat()
		viewports[0].height = surface.height.toFloat()
		scissors[0].extent.width = surface.width
		scissors[0].extent.height = surface.height
	}



	/*
	Object creation
	 */



	private fun createImages() = swapchain.getImages()

	private fun createImageViews() = images.map(device::createImageView)

	private fun createFramebuffers() = imageViews.map {
		device.createFramebuffer(renderPass, listOf(it), surface.width, surface.height, 1)
	}



	private fun recreateSwapchain() {
		imageViews.forEach { it.destroy() }
		framebuffers.forEach { it.destroy() }

		val prevSwapchain = this.swapchain
		this.swapchain = swapchainCreator(prevSwapchain)
		prevSwapchain.destroy()

		images = createImages()
		imageViews = createImageViews()
		framebuffers = createFramebuffers()
	}



	fun onResize() {
		updateDimensions()
		if(surface.width == 0 || surface.height == 0) return
		recreateSwapchain()
	}



	/*
	Commands
	 */



	fun record() {
		commandPool.reset()
		for(i in images.indices)
			record(commandBuffers[i], framebuffers[i])
	}



	private fun record(commandBuffer: CommandBuffer, framebuffer: Framebuffer) {
		commandBuffer.begin()

		commandBuffer.setViewport(viewports)
		commandBuffer.setScissor(scissors)

		commandBuffer.beginRenderPass(renderPass, framebuffer, clearValues)
		onRecord(commandBuffer)
		commandBuffer.endRenderPass()

		commandBuffer.end()
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