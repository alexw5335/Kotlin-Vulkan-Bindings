package vulkan.wrapper

import memory.allocation.MemStack
import memory.allocation.MemStacks
import vulkan.generated.command.StandaloneCommands
import vulkan.generated.enumeration.Result
import vulkan.generated.handle.InstanceH
import vulkan.generated.struct.InstanceCreateInfo
import vulkan.wrapper.exception.VkCommandException
import vulkan.generated.allocation.*

/**
 * Encapsulates standalone Vulkan commands that are not associated with an Instance nor with a Device.
 */
object Vulkan {


	/**
	 * Checks the return [Result] of a Vulkan command and throws a [VkCommandException] if the result is not
	 * [Result.SUCCESS]. Note that for some commands, a result other than SUCCESS does not necessarily indicate an
	 * error. The [VkCommandException] keeps track of the [Result] so that these situations can be handled.
	 */
	fun Result.check() {
		if(!this.is_SUCCESS)
			throw VkCommandException(this)
	}



	/*
	Instance
	 */



	/**
	 * Implementation of vkCreateInstance.
	 */
	fun createInstance(info: InstanceCreateInfo) = MemStacks.get {
		val instance = mallocPointer()
		StandaloneCommands.createInstance(info, null, instance).check()
		InstanceH(instance.value)
	}



	/**
	 * Convenience version of vkCreateInstance.
	 */
	fun createInstance(
		applicationName       : String       = "applicationName",
		applicationVersion    : Version      = Version(0, 0, 1),
		engineName            : String       = "engineName",
		engineVersion         : Version      = Version(0, 0, 1),
		apiVersion            : Version      = latestApiVersion,
		enabledLayerNames     : List<String> = emptyList(),
		enabledExtensionNames : List<String> = emptyList(),
	) = MemStacks.get {
		val appInfo = ApplicationInfo {
			it.applicationName = encodeUtf8NT(applicationName)
			it.applicationVersion = applicationVersion.value
			it.engineName = encodeUtf8NT(engineName)
			it.engineVersion = engineVersion.value
			it.apiVersion = apiVersion.value
		}

		val info = InstanceCreateInfo {
			it.applicationInfo = appInfo
			it.enabledLayerNames = encodeUtf8NTList(enabledLayerNames)
			it.enabledExtensionNames = encodeUtf8NTList(enabledExtensionNames)
		}

		createInstance(info)
	}



	/*
	Version
	 */



	/**
	 * The version of the Vulkan API that is available on this system.
	 */
	val version = enumerateInstanceVersion()



	/**
	 * The latest Vulkan API version that can be passed to vkCreateInstance.
	 */
	val latestApiVersion = Version(1, 2, 0)



	/**
	 * Implementation of vkEnumerateInstanceVersion.
	 */
	fun enumerateInstanceVersion() = MemStacks.get {
		val version = mallocInt()
		StandaloneCommands.enumerateInstanceVersion(version).check()
		Version(version.value)
	}


}