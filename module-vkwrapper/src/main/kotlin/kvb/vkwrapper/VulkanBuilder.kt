package kvb.vkwrapper

import kvb.core.memory.*
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*

object VulkanBuilder {


	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	var appName = "My App"

	var appVersion = Version(1, 0, 0)

	var engineName = "My Engine"

	var engineVersion = Version(1, 0, 0)

	var apiVersion = VulkanInfo.version

	var debugEnabled = false

	var debugTypes = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }

	var debugSeverities = DebugUtilsMessageSeverityFlags { VERBOSE + INFO + WARNING + ERROR }

	var debugCallback = DebugUtils.defaultCallbackAddress()



	lateinit var instance: Instance

	var debugMessenger: DebugUtilsMessenger? = null

	lateinit var physicalDevice: PhysicalDevice

	lateinit var queueFamily: QueueFamily

	lateinit var device: Device

	lateinit var queue: Queue



	fun build() {
		instance = createInstance()

		if(debugEnabled) {
			debugMessenger = instance.createDebugMessenger(debugSeverities, debugTypes, debugCallback)
		}

		physicalDevice = instance.physicalDevices.firstOrNull { it.isDiscrete } ?: instance.physicalDevices[0]
		device =
	}



	private fun createInstance() = stackGet {
		val appInfo = ApplicationInfo {
			it.applicationName 		= encodeUtf8NT(appName)
			it.applicationVersion 	= appVersion.value
			it.engineName 			= encodeUtf8NT(engineName)
			it.engineVersion 		= engineVersion.value
			it.apiVersion 			= apiVersion.value
		}

		val info = InstanceCreateInfo {
			it.applicationInfo 			= appInfo
			it.enabledLayerNames 		= encodeUtf8NTList(instanceLayers)
			it.enabledExtensionNames 	= encodeUtf8NTList(instanceExtensions)
		}

		val pointer = mallocLong()
		Commands.createInstance(info, null, pointer).check()
		Instance(pointer.value)
	}


}