package kvb.samples.sample0

import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.PhysicalDevice
import kvb.vkwrapper.handle.Surface
import kvb.vulkan.*

class AppSurface(
	val surface: Surface,
	val physicalDevice: PhysicalDevice
) {


	/*
	Format
	 */



	private val formatPair = physicalDevice.surfaceFormatsP(surface).first {
		it.format == Format.R8G8B8A8_SRGB || it.format == Format.B8G8R8A8_SRGB
	}

	val format = formatPair.format

	val colourSpace = formatPair.colourSpace

	val presentMode = PresentMode.FIFO



	/*
	Dimensions
	 */



	val capabilities = Vulkan.mem.SurfaceCapabilities { }

	val viewports = Vulkan.mem.Viewport(1) { }

	val scissors = Vulkan.mem.Rect2D(1) { }

	val clearValues = Vulkan.mem.ClearValue(1) { it[0].rgba(0F, 0.4F, 0.2F, 0F) }

	val width get() = capabilities.currentExtent.width

	val height get() = capabilities.currentExtent.height



	init { updateDimensions() }



	fun updateDimensions() {
		physicalDevice.surfaceCapabilities(surface, capabilities)
		viewports[0].width = width.toFloat()
		viewports[0].height = height.toFloat()
		scissors[0].extent.width = width
		scissors[0].extent.height = height
	}



	fun destroy() {
		surface.destroy()
	}


}