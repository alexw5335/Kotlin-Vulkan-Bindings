package kvb.vkwrapper.handle

import kvb.vulkan.ShaderModuleH

class ShaderModule(address: Long, val device: Device) : ShaderModuleH(address) {


	/*
	Handle implementation
	 */



	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false
		private set

	/**
	 * Implementation of vkDestroyShaderModule. Calls after the first will have no effect.
	 */
	fun destroy() {
		if(!isDestroyed) commands.destroyShaderModule(this, null)
		isDestroyed = true
	}


}