package kvb.vkwrapper.handle

import kvb.vulkan.ImageViewH

class ImageView(address: Long, val device: Device, val image: Image) : ImageViewH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false; private set

	/**
	 * Implementation of vkDestroyImageView. Calls after the first will have no effect.
	 */
	fun destroy() {
		if(!isDestroyed) commands.destroyImageView(this, null)
		isDestroyed = true
	}


}