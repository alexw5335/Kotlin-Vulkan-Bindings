package kvb.vkwrapper.handle

import kvb.vulkan.SurfaceH

class Surface(address: Long, val instance: Instance) : SurfaceH(address) {


	/**
	 * Implementation of vkDestroySurfaceKHR.
	 */
	fun destroy() = instance.commands.destroySurface(this, null)


}