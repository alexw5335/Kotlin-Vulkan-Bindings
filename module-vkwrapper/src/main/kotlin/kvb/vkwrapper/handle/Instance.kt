package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.*

class Instance(address: Long) : InstanceH(address) {


	/**
	 * Dynamically loaded Vulkan functions that are specific to this instance.
	 */
	val commands = InstanceCommands(this)

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyInstance.
	 */
	fun destroy() = commands.destroyInstance(null)



	/*
	Physical Devices
	 */



	/**
	 * Member variable implementation of vkEnumeratePhysicalDevices.
	 */
	val physicalDevices = physicalDevices()



	/**
	 * Implementation of vkEnumeratePhysicalDevices.
	 */
	fun physicalDevices(stack: MemStack = default) = stack.get {
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
	fun createDebugMessenger(info: DebugUtilsMessengerCreateInfo, stack: MemStack = default) = stack.get {
		val messenger = mallocPointer()
		commands.createDebugUtilsMessenger(info, null, messenger).check()
		DebugUtilsMessenger(messenger.value, self)
	}



	/**
	 * Convenience implementation of vkCrateDebugUtilsMessengerEXT.
	 */
	fun createDebugMessenger(
		callback	: Long,
		severities	: DebugUtilsMessageSeverityFlags,
		types		: DebugUtilsMessageTypeFlags,
		stack       : MemStack = default
	) = stack.get {
		createDebugMessenger(DebugUtilsMessengerCreateInfo {
			it.messageSeverity = severities
			it.messageType     = types
			it.pfnUserCallback = callback
		}, stack)
	}


}