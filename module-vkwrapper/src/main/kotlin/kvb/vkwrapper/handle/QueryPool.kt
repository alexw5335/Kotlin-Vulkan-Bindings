package kvb.vkwrapper.handle

import kvb.vulkan.QueryPoolH

class QueryPool(address: Long, val device: Device) : QueryPoolH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyQueryPool.
	 */
	fun destroy() = commands.destroyQueryPool(this, null)


}