package kvb.app

import kvb.core.memory.Unsafe
import kvb.vkwrapper.exception.VkCommandException
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
	val createSwapchain: (Swapchain?) -> Swapchain
) {


	var onRecord: (CommandBuffer) -> Unit = { }

	var swapchain = createSwapchain(null)

	private var images = createImages()

	private var imageViews = createImageViews()

	private var framebuffers = createFramebuffers()

	private val commandPool = device.createCommandPool(queue.family)

	private val commandBuffers = commandPool.allocatePrimary(images.size)

	private val imageAvailableSemaphore = device.createSemaphore()

	private val renderFinishedSemaphore = device.createSemaphore()



	private val clearValues = Unsafe.ClearValue(r = 0.2F, g = 0.5F, b = 0.1F, a = 1.0F).asBuffer

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



	fun recreateSwapchain() {
		device.waitIdle()
		commandPool.reset() // All command buffers must be re-recorded
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



	fun record() {
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



	private fun onResize() {
		updateDimensions()

		// Minimisation
		if(surface.width == 0 || surface.height == 0) return

		recreateSwapchain()
		record()
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

		if(!queue.present(
			waitSemaphore = renderFinishedSemaphore,
			swapchain     = swapchain,
			imageIndex    = imageIndex
		)) {
			onResize()
			return
		}

		device.waitIdle()
	}
}