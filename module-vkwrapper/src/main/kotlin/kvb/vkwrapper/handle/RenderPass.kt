package kvb.vkwrapper.handle

import kvb.vulkan.*

class RenderPass(address: Long, val device: Device) : RenderPassH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Implementation of vkDestroyRenderpass.
	 */
	fun destroy() = commands.destroyRenderPass(this, null)

}