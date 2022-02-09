package kvb.app

import kvb.core.Platform
import kvb.core.Platforms
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*
import kvb.window.Window

/**
 * Builds all basic Vulkan objects necessary for a simple Vulkan application.
 *
 *     Limitations:
 *         - One graphics queue, one compute queue, and one present queue.
 *         - Very simple memory management.
 *         - One descriptor pool.
 *         - One surface.
 *         - One device.
 *         - One instance.
 *         - One debug messenger.
 */
class VkContextBuilder {


	/*
	Build configuration
	 */



	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	val deviceExtensions = HashSet<String>()



	var window: Window? = null

	var debugEnabled = false

	var apiVersion = Vulkan.instanceVersion

	var choosePhysicalDevice = ::choosePhysicalDeviceDefault

	var usesGraphics = true

	var usesCompute = true



	/*
	Build variables
	 */



	lateinit var instance: Instance

	lateinit var debugMessenger: DebugUtilsMessenger

	lateinit var physicalDevice: PhysicalDevice

	lateinit var surface: Surface

	lateinit var graphicsQueueFamily: QueueFamily

	lateinit var computeQueueFamily: QueueFamily

	lateinit var presentQueueFamily: QueueFamily

	lateinit var device: Device

	lateinit var graphicsQueue: Queue

	lateinit var computeQueue: Queue

	lateinit var presentQueue: Queue



	private var singleQueueFamily: QueueFamily? = null



	/*
	Defaults
	 */



	fun choosePhysicalDeviceDefault(): PhysicalDevice {
		for(p in instance.physicalDevices)
			if(p.isDiscrete)
				return p

		return instance.physicalDevices[0]
	}



	/*
	Building
	 */



	private fun populateLayersAndExtensions() {
		if(window != null) {
			instanceExtensions.add("VK_KHR_surface")

			when(Platforms.current) {
				Platform.WINDOWS -> instanceExtensions.add("VK_KHR_win32_surface")
				else -> throw VkException("Windowing only supported on Windows")
			}

			deviceExtensions.add("VK_KHR_swapchain")
		}

		if(debugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}
	}



	private fun chooseQueueFamilies() {
		val queueFamilies = physicalDevice.queueFamilies

		singleQueueFamily = queueFamilies.firstOrNull {
			it.supportsGraphics && it.supportsCompute && (window == null || it.supportsSurface(surface))
		}

		if(singleQueueFamily != null) {
			graphicsQueueFamily = singleQueueFamily!!
			computeQueueFamily = singleQueueFamily!!
			presentQueueFamily = singleQueueFamily!!
		} else {
			graphicsQueueFamily = queueFamilies.first { it.supportsGraphics }
			computeQueueFamily = queueFamilies.first { it.supportsCompute }
			presentQueueFamily = queueFamilies.first { it.supportsSurface(surface) }
		}
	}



	private fun buildDevice() {
		val queueMap = HashMap<QueueFamily, Int>()

		if(singleQueueFamily != null) {
			queueMap[singleQueueFamily!!] = 1
		} else {
			if(usesGraphics)
				queueMap[graphicsQueueFamily] = 1

			if(window != null)
				queueMap[presentQueueFamily] = 1

			if(usesCompute)
				queueMap[computeQueueFamily] = 1
		}

		device = physicalDevice.createDevice(queueMap, deviceExtensions)
	}



	fun build() {
		populateLayersAndExtensions()

		instance = Vulkan.createInstance(
			appName       = "My App",
			appVersion    = Version(1, 0, 0),
			engineName    = "My Engine",
			engineVersion = Version(1, 0, 0),
			apiVersion    = apiVersion,
			layers        = instanceLayers,
			extensions    = instanceExtensions
		)

		if(debugEnabled) {
			debugMessenger = instance.createDebugMessenger(
				callback   = DebugUtils.defaultCallbackAddress(),
				severities = DebugUtilsMessageSeverityFlags { INFO + ERROR },
				types      = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }
			)
		}

		chooseQueueFamilies()
		buildDevice()

		if(singleQueueFamily != null) {
			val queue = device.getQueue(singleQueueFamily!!, 1)
			graphicsQueue = queue
			computeQueue = queue
			presentQueue = queue
		} else {
			if(usesGraphics)
				graphicsQueue = device.getQueue(graphicsQueueFamily, 1)
			if(usesCompute)
				computeQueue = device.getQueue(computeQueueFamily, 1)
			if(window != null)
				presentQueue = device.getQueue(presentQueueFamily, 1)
		}
	}


}