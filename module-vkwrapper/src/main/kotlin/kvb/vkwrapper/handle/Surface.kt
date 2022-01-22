package kvb.vkwrapper.handle

import kvb.core.memory.Unsafe
import kvb.vulkan.*

class Surface(address: Long, val physicalDevice: PhysicalDevice) : SurfaceH(address) {


	/**
	 * Implementation of vkDestroySurfaceKHR.
	 */
	fun destroy() {
		Unsafe.free(capabilities)
		physicalDevice.instance.commands.destroySurface(this, null)
	}



	val formats = physicalDevice.surfaceFormatsP(this)

	val capabilities = Unsafe.SurfaceCapabilities { }

	val width get() = capabilities.currentExtent.width

	val height get() = capabilities.currentExtent.height



	init {
		updateCapabilities()
	}



	fun updateCapabilities() = physicalDevice.surfaceCapabilities(this, capabilities)


}