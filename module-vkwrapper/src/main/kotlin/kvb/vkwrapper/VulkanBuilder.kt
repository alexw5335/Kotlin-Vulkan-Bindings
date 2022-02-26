package kvb.vkwrapper

import kvb.core.Platform
import kvb.core.Platforms
import kvb.core.memory.*
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*

class VulkanBuilder {


	companion object {

		fun build(block: VulkanBuilder.() -> Unit): VulkanBuilder {
			val builder = VulkanBuilder()
			block(builder)
			builder.build()
			return builder
		}

	}



	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	var appName = "My App"

	var appVersion = Version(1, 0, 0)

	var engineName = "My Engine"

	var engineVersion = Version(1, 0, 0)

	var apiVersion = VulkanInfo.version

	var debugTypes = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }

	var debugSeverities = DebugUtilsMessageSeverityFlags { VERBOSE + INFO + WARNING + ERROR }

	var debugCallback = DebugUtils.defaultCallbackAddress()

	val deviceFeatures = Unsafe.PhysicalDeviceFeatures { }

	val deviceExtensions = HashSet<String>()

	var debugEnabled = false

	var windowingEnabled = false



	lateinit var instance: Instance

	var debugMessenger: DebugUtilsMessenger? = null

	lateinit var physicalDevice: PhysicalDevice

	lateinit var queueFamily: QueueFamily

	lateinit var device: Device

	lateinit var queue: Queue



	fun build() {
		if(debugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}

		if(windowingEnabled) {
			instanceExtensions.add("VK_KHR_swapchain")
			instanceExtensions.add("VK_KHR_surface")

			when(Platforms.current) {
				Platform.WINDOWS -> instanceExtensions.add("VK_KHR_win32_surface")
				else -> { }
			}
		}

		instance = createInstance()

		if(debugEnabled) {
			debugMessenger = instance.createDebugMessenger(debugSeverities, debugTypes, debugCallback)
		}

		physicalDevice = instance.physicalDevices.firstOrNull { it.isDiscrete } ?: instance.physicalDevices[0]

		queueFamily = physicalDevice.queueFamilies.first { it.supportsGraphics && it.supportsCompute }

		device = physicalDevice.createDevice(listOf(queueFamily), deviceExtensions, deviceFeatures)

		queue = device.getQueue(queueFamily, 0)
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