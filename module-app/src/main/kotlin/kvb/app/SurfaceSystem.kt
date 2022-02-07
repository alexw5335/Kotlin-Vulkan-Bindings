package kvb.app

import kvb.core.memory.Unsafe
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

class SurfaceSystem(
	val surface              : Surface,
	val device               : Device,
	val compatibleRenderPass : RenderPass,
	val createSwapchain      : (Swapchain?) -> Swapchain
) {


	var onRecord: (CommandBuffer) -> Unit = { }

	var swapchain = createSwapchain(null)

	private var images = createImages()

	private var imageViews = createImageViews()

	private var framebuffers = createFramebuffers()

	private val imageAvailableSemaphore = device.createSemaphore()

	private val renderFinishedSemaphore = device.createSemaphore()



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
		device.createFramebuffer(compatibleRenderPass, listOf(it), surface.width, surface.height, 1)
	}



	fun recreateSwapchain() {
		device.waitIdle()
		imageViews.forEach { it.destroy() }
		framebuffers.forEach { it.destroy() }

		val prevSwapchain = this.swapchain
		this.swapchain = createSwapchain(prevSwapchain)
		prevSwapchain.destroy()

		images = createImages()
		imageViews = createImageViews()
		framebuffers = createFramebuffers()
	}



	/*
	Commands
	 */



	/**
	 * Must be called when vkQueuePresentKHR or vkAcquireNextImageKHR fails with VK_ERROR_OUT_OF_DATE. The submit and
	 * present queues must be waited upon before recreating the swapchain.
	 */
	fun onResize() {
		updateDimensions()
		if(surface.width == 0 || surface.height == 0) return
		recreateSwapchain()
	}


}