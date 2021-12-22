package kvb.vkwrapper.handle

import kvb.vulkan.FramebufferH

class Framebuffer(
	address: Long,
	val device: Device,
	val width: Int,
	val height: Int,
	val layers: Int
) : FramebufferH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyFramebuffer.
	 */
	fun destroy() = commands.destroyFramebuffer(this, null)


}