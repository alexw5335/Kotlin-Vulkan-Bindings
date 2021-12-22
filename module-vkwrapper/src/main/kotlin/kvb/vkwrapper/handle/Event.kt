package kvb.vkwrapper.handle

import kvb.vulkan.EventH

class Event(address: Long, val device: Device) : EventH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyEvent.
	 */
	fun destroy() = commands.destroyEvent(this, null)


}