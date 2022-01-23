package kvb.samples.app

import kvb.core.memory.Unsafe
import kvb.vkwrapper.handle.*
import kvb.vulkan.*

/**
 * Note: The [renderPass] is not necessarily the only renderpass. It is the final renderpass that will be used to render
 * to the swapchain's images.
 */
class SurfaceSystem(
	val surface: Surface,
	val device: Device,
	val queue: Queue,
	val renderPass: RenderPass,
	val createSwapchain: () -> Swapchain
) {


	var swapchain = createSwapchain()

	var images = createImages()

	var imageViews = createImageViews()

	var framebuffers = createFramebuffers()

	val commandPool = device.createCommandPool(queue.family)

	val commandBuffers = commandPool.allocatePrimary(images.size)



	private var currentFrame = 0

	private val framesInFlight = 2

	private val imageAvailableSemaphores = List(framesInFlight) { device.createSemaphore() }

	private val renderFinishedSemaphores = List(framesInFlight) { device.createSemaphore() }

	private val inFlightFences = List(framesInFlight) { device.createFence() }

	private val imagesInFlight = arrayOfNulls<Image>(framesInFlight)



	private val viewports = Unsafe.Viewport(1) { }

	private val scissors = Unsafe.Rect2D(1) { }



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



	fun recreateSwapchain() {
		// All command buffers must be re-recorded
		commandPool.reset()
		imageViews.forEach { it.destroy() }
		framebuffers.forEach { it.destroy() }

		val prevSwapchain = this.swapchain
		this.swapchain = createSwapchain()
		prevSwapchain.destroy()

		images = createImages()
		imageViews = createImageViews()
		framebuffers = createFramebuffers()
	}


}