package kvb.engine.vulkan

import kvb.core.Core
import kvb.core.memory.Unsafe
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.memory.VkMemoryManager
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

	val multisampled get() = sampleCount != SampleCountFlags._1

	var stagingBufferSize = 1L shl 20



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

	lateinit var memoryManager: VkMemoryManager



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

		if(!surface.presentModes.contains(presentMode)) {
			println("Requested present mode $presentMode is not supported, defaulting to FIFO.")
			presentMode = PresentMode.FIFO
		}

		surfaceSystem = SurfaceSystem(
			surface,
			device,
			queue,
			createRenderPass(formatPair.format),
			formatPair.format,
			formatPair.colourSpace,
			presentMode,
			sampleCount
		)

		memoryManager = VkMemoryManager(device, queue, stagingBufferSize)
	}



	private fun createRenderPass(format: Format) = device.buildRenderPass {
		// Colour attachment
		it.attachment(
			format         = format,
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
				format         = format,
				samples        = SampleCountFlags._1,
				loadOp         = AttachmentLoadOp.CLEAR,
				storeOp        = AttachmentStoreOp.STORE,
				stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
				stencilStoreOp = AttachmentStoreOp.DONT_CARE,
				initialLayout  = ImageLayout.UNDEFINED,
				finalLayout    = ImageLayout.PRESENT_SRC
			)

			it.colourResolveSubpass(
				colourAttachment  = 0,
				colourLayout      = ImageLayout.COLOR_ATTACHMENT_OPTIMAL,
				resolveAttachment = 1,
				resolveLayout     = ImageLayout.COLOR_ATTACHMENT_OPTIMAL
			)
		} else {
			it.colourSubpass(
				attachment = 0,
				layout     = ImageLayout.COLOR_ATTACHMENT_OPTIMAL
			)
		}
	}


}