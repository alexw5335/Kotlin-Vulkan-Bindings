package kvb.vkwrapper.handle

import kvb.vulkan.DebugUtilsMessengerH

class DebugUtilsMessenger(address: Long, val instance: Instance) : DebugUtilsMessengerH(address) {


	/**
	 * Implementation of vkDestroyDebugUtilsMessengerEXT.
	 */
	fun destroy() = instance.commands.destroyDebugUtilsMessenger(this, null)


}