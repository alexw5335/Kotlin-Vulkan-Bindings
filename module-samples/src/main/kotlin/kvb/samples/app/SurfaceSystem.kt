package kvb.samples.app

import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.RenderPass
import kvb.vkwrapper.handle.Surface
import kvb.vkwrapper.handle.Swapchain

/**
 * Note: The [renderPass] is not necessarily the only renderpass. It is the final renderpass that will be used to render
 * to the swapchain's images.
 */
class SurfaceSystem(
	val surface: Surface,
	val device: Device,
	val renderPass: RenderPass,
	val createSwapchain: () -> Swapchain
) {


	var swapchain = createSwapchain()

	var images = createImages()

	var imageViews = createImageViews()

	var framebuffers = createFramebuffers()


	val viewports = Vulkan.mem.Viepo



	private fun createImages() = swapchain.getImages()

	private fun createImageViews() = images.map(device::createImageView)

	private fun createFramebuffers() = imageViews.map {
		device.createFramebuffer(renderPass, listOf(it), surface.width, surface.height, 1)
	}



	fun updateSwapchain() {
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