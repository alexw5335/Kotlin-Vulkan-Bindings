package kvb.vkwrapper.handle

import kvb.vulkan.DescriptorSetLayoutH

class DescriptorSetLayout(address: Long, val device: Device) : DescriptorSetLayoutH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyDescriptorSetLayout.
	 */
	fun destroy() = commands.destroyDescriptorSetLayout(this, null)


}