package kvb.fontcreator

import kvb.core.Platform
import kvb.core.Platforms
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vkwrapper.persistent.SurfaceFormatP
import kvb.vulkan.*
import kvb.window.Window

/**
 * Builds all basic Vulkan objects necessary for a simple Vulkan application. The context must be created on the main
 * thread.
 *
 *     Limitations:
 *         - One surface
 *         - One device
 *         - One instance
 *         - One debug messenger
 *         - Simple memory management
 *         - One queue family (must support everything)
 *         - One queue
 */
class ContextBuilder {


	companion object {

		fun build(block: (ContextBuilder) -> Unit) = ContextBuilder().also(block).build()

	}



	/*
	Build configuration
	 */



	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	val deviceExtensions = HashSet<String>()



	var window: Window? = null

	var debugEnabled = false

	var apiVersion = Vulkan.instanceVersion

	var choosePhysicalDevice = ::defaultPhysicalDevice

	var presentMode = PresentMode.FIFO

	var chooseSurfaceFormat: () -> SurfaceFormatP = ::defaultSurfaceFormat



	/*
	Build variables
	 */



	lateinit var instance: Instance

	var debugMessenger: DebugUtilsMessenger? = null

	lateinit var physicalDevice: PhysicalDevice

	var surface: Surface? = null

	lateinit var queueFamily: QueueFamily

	lateinit var device: Device

	lateinit var queue: Queue



	/*
	Defaults
	 */



	private fun defaultPhysicalDevice(): PhysicalDevice {
		for(p in instance.physicalDevices)
			if(p.isDiscrete)
				return p

		return instance.physicalDevices[0]
	}



	private fun defaultSurfaceFormat(): SurfaceFormatP {
		val formats = physicalDevice.surfaceFormatsP(surface!!)

		for(format in formats)
			if(format.colourSpace == ColorSpace.SRGB_NONLINEAR &&
				(format.format == Format.B8G8R8A8_SRGB ||
					format.format == Format.R8G8B8A8_SRGB))
				return format

		return formats.first()
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



	fun build(): ContextBuilder {
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

		physicalDevice = choosePhysicalDevice()

		queueFamily = physicalDevice.queueFamilies.first {
			it.supportsGraphics && it.supportsCompute && (surface == null || it.supportsSurface(surface!!))
		}

		device = physicalDevice.createDevice(
			queues     = mapOf(queueFamily to 1),
			extensions = deviceExtensions
		)

		queue = device.getQueue(queueFamily, 0)

		return this
	}


}