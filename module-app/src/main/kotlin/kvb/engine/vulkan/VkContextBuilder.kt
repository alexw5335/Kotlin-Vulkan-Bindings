package kvb.engine.vulkan

import kvb.core.Platform
import kvb.core.Platforms
import kvb.core.memory.*
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vulkan.*
import kvb.window.winapi.WinApiWindow

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

	var sampleCount: SampleCountFlags = SampleCountFlags._1

	private val multisampled get() = sampleCount != SampleCountFlags._1


	/*
	Building results
	 */



	var debugMessenger: DebugUtilsMessenger? = null



	lateinit var window: WinApiWindow

	lateinit var instance: Instance

	lateinit var physicalDevice: PhysicalDevice

	lateinit var device: Device

	lateinit var queue: Queue

	lateinit var surfaceSystem: SurfaceSystem



	/*
	Building
	 */



	fun build() {
		if(debugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}

		if(windowingEnabled) {
			deviceExtensions.add("VK_KHR_swapchain")
			instanceExtensions.add("VK_KHR_surface")

			when(Platforms.current) {
				Platform.WINDOWS -> instanceExtensions.add("VK_KHR_win32_surface")
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

		if(debugEnabled) {
			debugMessenger = instance.createDebugMessenger(
				debugSeverities,
				debugTypes,
				debugCallback
			)
		}

		physicalDevice = instance.physicalDevices.firstOrNull { it.isDiscrete } ?: instance.physicalDevices[0]

		if(!physicalDevice.combinedSampleCounts.contains(sampleCount)) {
			println("Sample count '$sampleCount' not supported on this physical device.")
			sampleCount = SampleCountFlags._1
		}

		val surface = physicalDevice.createWin32Surface(0L, window.hwnd)

		val queueFamily = physicalDevice.queueFamilies.first {
			it.supportsGraphics && it.supportsCompute && it.supportsSurface(surface)
		}

		device = physicalDevice.createDevice(queueFamily, deviceExtensions, deviceFeatures)

		queue = device.getQueue(queueFamily, 0)

		val formatPair = surface.formats.first {
			it.colourSpace == ColorSpace.SRGB_NONLINEAR &&
				(it.format == Format.R8G8B8A8_SRGB || it.format == Format.B8G8R8A8_SRGB)
		}

		val format = formatPair.format

		val colourSpace = formatPair.colourSpace

		val presentMode = surface.presentModes.first {
			it == this.presentMode
		}

		val renderPass = device.buildRenderPass {
			// Colour attachment
			it.attachment(
				format         = formatPair.format,
				samples        = sampleCount,
				loadOp         = AttachmentLoadOp.CLEAR,
				storeOp        = AttachmentStoreOp.STORE,
				stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
				stencilStoreOp = AttachmentStoreOp.DONT_CARE,
				initialLayout  = ImageLayout.UNDEFINED,
				finalLayout    = if(multisampled) ImageLayout.COLOR_ATTACHMENT_OPTIMAL else ImageLayout.PRESENT_SRC
			)

			if(multisampled) {
				// Resolve attachment
				it.attachment(
					format         = formatPair.format,
					samples        = SampleCountFlags._1,
					loadOp         = AttachmentLoadOp.CLEAR,
					storeOp        = AttachmentStoreOp.STORE,
					stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
					stencilStoreOp = AttachmentStoreOp.DONT_CARE,
					initialLayout  = ImageLayout.UNDEFINED,
					finalLayout    = ImageLayout.PRESENT_SRC
				)

				it.colourResolveSubpass(0, ImageLayout.COLOR_ATTACHMENT_OPTIMAL, 1, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)
			} else {
				it.colourSubpass(attachment = 0, layout = ImageLayout.COLOR_ATTACHMENT_OPTIMAL)
			}
		}

		surfaceSystem = SurfaceSystem(surface, device, queue, renderPass, format, colourSpace, presentMode, sampleCount)
	}


}