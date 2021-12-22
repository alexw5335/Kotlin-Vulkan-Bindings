package kvb.vkwrapper.handle

import kvb.vulkan.RenderPassH

class RenderPass(address: Long, val device: Device) : RenderPassH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyRenderpass.
	 */
	fun destroy() = commands.destroyRenderPass(this, null)


}