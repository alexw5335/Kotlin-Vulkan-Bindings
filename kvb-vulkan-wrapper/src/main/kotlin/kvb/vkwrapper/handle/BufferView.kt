package kvb.vkwrapper.handle

import kvb.vulkan.BufferViewH

class BufferView(address: Long, val device: Device) : BufferViewH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyBufferView.
	 */
	fun destroy() = commands.destroyBufferView(this, null)


}