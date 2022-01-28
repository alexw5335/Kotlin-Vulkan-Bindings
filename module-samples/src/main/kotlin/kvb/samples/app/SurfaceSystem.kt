package kvb.samples.app

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

	var images = createImages()

	var imageViews = createImageViews()

	var framebuffers = createFramebuffers()

	val commandPool = device.createCommandPool(queue.family)

	val commandBuffers = commandPool.allocatePrimary(images.size)

	val clearValues = Unsafe.ClearValue(r = 0.2F, g = 0.5F, b = 0.1F, a = 1.0F).asBuffer



	private var currentFrame = 0

	private val framesInFlight = 2

	private val imageAvailableSemaphores = List(framesInFlight) { device.createSemaphore() }

	private val renderFinishedSemaphores = List(framesInFlight) { device.createSemaphore() }

	private val inFlightFences = List(framesInFlight) { device.createFence() }

	private val imagesInFlight = arrayOfNulls<Fence>(framesInFlight)



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
		for(i in images.indices) record(i)
	}



	private fun record(frameIndex: Int) {
		val commandBuffer = commandBuffers[frameIndex]
		val framebuffer = framebuffers[frameIndex]

		commandBuffer.begin()

		commandBuffer.setViewport(viewports)
		commandBuffer.setScissor(scissors)

		commandBuffer.beginRenderPass(renderPass, framebuffer, clearValues)
		onRecord(commandBuffer)
		commandBuffer.endRenderPass()

		commandBuffer.end()
	}



	val imageAvailableSemaphore = device.createSemaphore()
	val renderFinishedSemaphore = device.createSemaphore()

	fun present() {
		val imageIndex = swapchain.acquireNextImage(semaphore = imageAvailableSemaphore)

		// Resizing
		if(imageIndex == -1) {
			updateDimensions()

			// Minimisation
			if(surface.width == 0 || surface.height == 0) return

			recreateSwapchain()
			record()

			return
		}

		queue.submit(
			waitSemaphore    = imageAvailableSemaphore,
			waitDstStageMask = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			commandBuffer    = commandBuffers[imageIndex],
			signalSemaphore  = renderFinishedSemaphore,
			fence            = null
		)

		// TODO: Handle ERROR_OUT_OF_DATE?
		try {
			queue.present(
				waitSemaphore = renderFinishedSemaphore,
				swapchain = swapchain,
				imageIndex = imageIndex
			)
		} catch(exception: VkCommandException) {
			if(exception.result != Result.ERROR_OUT_OF_DATE)
				throw exception
		}


		device.waitIdle()
	}
	/*fun present() {
		inFlightFences[currentFrame].wait()

		val imageIndex = swapchain.acquireNextImage(semaphore = imageAvailableSemaphores[currentFrame])

		// Resizing
		if(imageIndex == -1) {
			updateDimensions()

			// Minimisation
			if(surface.width == 0 || surface.height == 0) return

			recreateSwapchain()
			record()

			return
		}

		imagesInFlight[imageIndex]?.wait()
		imagesInFlight[imageIndex] = inFlightFences[currentFrame]
		inFlightFences[currentFrame].reset()

		// Complicated synchronisation is mostly only required for presenting.
		// For non-presentation work, a simple queue submit is enough.
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
	}*/


}