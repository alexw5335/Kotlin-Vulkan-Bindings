package kvb.vkwrapper.handle

import kvb.vulkan.DescriptorUpdateTemplateH

class DescriptorUpdateTemplate(address: Long, val device: Device) : DescriptorUpdateTemplateH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyDescriptorUpdateTemplate.
	 */
	fun destroy() = commands.destroyDescriptorUpdateTemplate(this, null)


}