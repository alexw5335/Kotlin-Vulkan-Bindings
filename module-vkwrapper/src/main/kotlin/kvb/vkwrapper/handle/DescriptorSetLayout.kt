package kvb.vkwrapper.handle

import kvb.vkwrapper.persistent.Descriptor
import kvb.vulkan.DescriptorSetLayoutH

class DescriptorSetLayout(
	address         : Long,
	val device      : Device,
	val descriptors : List<Descriptor>
) : DescriptorSetLayoutH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Implementation of vkDestroyDescriptorSetLayout.
	 */
	fun destroy() = commands.destroyDescriptorSetLayout(this, null)


}