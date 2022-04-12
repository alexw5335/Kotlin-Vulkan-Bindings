package kvb.engine.vulkan

import kvb.core.Core
import kvb.core.memory.Unsafe
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.memory.VkMemoryManager
import kvb.vulkan.*

object VkContextBuilder {


	/*
	Instance variables
	 */



	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	var appName = "My App"

	var appVersion = Version(1, 0, 0)

	var engineName = "My Engine"

	var engineVersion = Version(1, 0, 0)

	var apiVersion = Vulkan.version

	var debugTypes = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }

	var debugSeverities = DebugUtilsMessageSeverityFlags { WARNING + ERROR }

	var debugCallback = DebugUtils.defaultCallbackAddress()

	val deviceFeatures = Unsafe.PhysicalDeviceFeatures { }

	val deviceExtensions = HashSet<String>()

	var debugEnabled = true

	var windowingEnabled = true

	var presentMode = PresentMode.FIFO

	var sampleCount = SampleCountFlags._1

	val multisampled get() = sampleCount != SampleCountFlags._1

	var stagingBufferSize = 1L shl 20



	/*
	Building results
	 */



	var debugMessenger: DebugUtilsMessenger? = null

	lateinit var instance: Instance

	lateinit var physicalDevice: PhysicalDevice

	lateinit var device: Device

	lateinit var queue: Queue

	lateinit var memoryManager: VkMemoryManager



	/*
	Building
	 */



	private var built = false



	fun build() {
		if(built) return

		built = true

		if(debugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}

		if(windowingEnabled) {
			deviceExtensions.add("VK_KHR_swapchain")
			instanceExtensions.add("VK_KHR_surface")

			when {
				Core.isWindows -> instanceExtensions.add("VK_KHR_win32_surface")
				else -> { }
			}
		}

		instance = Vulkan.createInstance(
			appName,
			appVersion,
			engineName,
			engineVersion,
			apiVersion,
			instanceLayers,
			instanceExtensions
		)

		if(debugEnabled) debugMessenger = instance.createDebugMessenger(
			debugSeverities,
			debugTypes,
			debugCallback
		)

		physicalDevice = instance.physicalDevices.firstOrNull { it.isDiscrete } ?: instance.physicalDevices[0]

		if(!physicalDevice.combinedSampleCounts.contains(sampleCount)) {
			println("Sample count '$sampleCount' not supported on this physical device.")
			sampleCount = SampleCountFlags._1
		}

		val queueFamily = physicalDevice.queueFamilies.first {
			it.supportsGraphics && it.supportsCompute
		}

		device = physicalDevice.createDevice(queueFamily, deviceExtensions, deviceFeatures)

		queue = device.getQueue(queueFamily, 0)

		memoryManager = VkMemoryManager(device, queue, stagingBufferSize)
	}


}