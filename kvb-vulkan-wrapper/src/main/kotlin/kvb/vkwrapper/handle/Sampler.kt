package kvb.vkwrapper.handle

import kvb.vulkan.SamplerH

class Sampler(address: Long, val device: Device) : SamplerH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroySampler.
	 */
	fun destroy() = commands.destroySampler(this, null)


}