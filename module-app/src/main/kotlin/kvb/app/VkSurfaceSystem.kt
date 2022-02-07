package kvb.app

import kvb.vkwrapper.handle.*

class VkSurfaceSystem(
	val surface          : Surface,
	val device           : Device,
	val presentQueue     : Queue,
	val renderPass       : RenderPass,
	val swapchainCreator : (Swapchain?) -> Swapchain
) {


	var swapchain = swapchainCreator(null)

	var images = swapchain.getImages()

	var imageViews = images.map { device.createImageView(it) }

	private fun createImages() = swapchain.getImages()

	private fun createImageViews() = images.map { device.createImageView(it) }

	private fun createFramebuffers() = imageViews.map {
		device.createFramebuffer(renderPass, listOf(it), )
	}
}