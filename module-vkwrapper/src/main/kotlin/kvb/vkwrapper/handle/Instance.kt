package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.vulkan.*

class Instance(address: Long) : InstanceH(address) {


	/**
	 * Dynamically loaded Vulkan functions that are specific to this instance.
	 */
	val commands = InstanceCommands(this)

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self = this

	/**
	 * Implementation of vkDestroyInstance.
	 */
	fun destroy() = commands.destroyInstance(null)



	/*
	Physical Devices
	 */



	/**
	 * Implementation of vkEnumeratePhysicalDevices.
	 */
	val physicalDevices = stackGet {
		val count = mallocInt()
		commands.enumeratePhysicalDevices(count, null).check()
		val devices = mallocPointer(count.value)
		commands.enumeratePhysicalDevices(count, devices).check()
		devices.map { PhysicalDevice(it, self) }
	}



	/*
	Messengers
	 */




	/**
	 * Implementation of vkCreateDebugUtilsMessengerEXT.
	 */
	fun createDebugMessenger(
		severities	: DebugUtilsMessageSeverityFlags,
		types		: DebugUtilsMessageTypeFlags,
		callback	: Long
	) = stackGet {
		val info = DebugUtilsMessengerCreateInfo {
			it.messageSeverity = severities
			it.messageType = types
			it.pfnUserCallback = callback
		}

		val messenger = mallocLong()
		commands.createDebugUtilsMessenger(info, null, messenger).check()
		DebugUtilsMessenger(messenger.value, self)
	}


}