package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks
import kvb.vkwrapper.DebugUtils
import kvb.vulkan.*
import kvb.vulkan.command.InstanceCommands

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
	fun physicalDevices(stack: MemStack = MemStacks.default) = stack.get {
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
	fun createMessenger(info: DebugUtilsMessengerCreateInfo, stack: MemStack = MemStacks.default) = stack.get {
		val messenger = mallocPointer()
		commands.createDebugUtilsMessenger(info, null, messenger).check()
		DebugUtilsMessenger(messenger.value, self)
	}



	/**
	 * Convenience version of vkCrateDebugUtilsMessengerEXT.
	 */
	fun createMessenger(
		callback	: Long 								= DebugUtils.defaultCallbackAddress(),
		severities	: DebugUtilsMessageSeverityFlags 	= DebugUtilsMessageSeverityFlags { ERROR + WARNING },
		types		: DebugUtilsMessageTypeFlags 		= DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE },
		stack       : MemStack = MemStacks.default
	) = stack.get {
		createMessenger(DebugUtilsMessengerCreateInfo {
			it.messageSeverity = severities
			it.messageType     = types
			it.pfnUserCallback = callback
		}, stack)
	}



	/*
	Surface
	 */



	/**
	 * Implementation of vkCreateWin32SurfaceKHR.
	 */
	fun createWin32Surface(info: Win32SurfaceCreateInfo, stack: MemStack = MemStacks.default) = stack.get {
		val surface = mallocPointer()
		commands.createWin32Surface(info, null, surface).check()
		Surface(surface.value, self)
	}



	/**
	 * Convenience version of vkCreateWin32SurfaceKHR. Creates a [Surface] that is tied to a native Win32 window.
	 */
	fun createWin32Surface(hinstance: Long, hwnd: Long, stack: MemStack = MemStacks.default) = stack.get {
		val info = Win32SurfaceCreateInfo {
			it.hinstance 	= hinstance
			it.hwnd 		= hwnd
		}

		createWin32Surface(info)
	}


}