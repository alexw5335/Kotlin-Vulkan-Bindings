package kvb.vkwrapper.handle

import kvb.vulkan.SemaphoreH

class Semaphore(address: Long, val device: Device) : SemaphoreH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroySemaphore.
	 */
	fun destroy() = commands.destroySemaphore(this, null)


}