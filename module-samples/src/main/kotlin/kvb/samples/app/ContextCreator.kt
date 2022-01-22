package kvb.samples.app

import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.builder.RenderPassBuilder
import kvb.vkwrapper.persistent.SurfaceFormatP
import kvb.vulkan.*
import kvb.window.winapi.WinApiWindow

interface ContextCreator {


	val window: WinApiWindow? get() = null

	val apiVersion get() = Version(1, 2, 0)

	val isDebugEnabled get() = false

	val presentMode get() = PresentMode.FIFO

	fun chooseFormat(format: SurfaceFormatP): Boolean =
		format.colourSpace == ColorSpace.SRGB_NONLINEAR &&
		(format.format == Format.B8G8R8A8_SRGB || format.format == Format.R8G8B8A8_SRGB)

	fun buildSurfaceRenderPass(builder: RenderPassBuilder)



	fun create() : Context {
		val instanceLayers = HashSet<String>()
		val instanceExtensions = HashSet<String>()
		val deviceExtensions = HashSet<String>()

		if(isDebugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}

		if(window != null) {
			instanceExtensions.add("VK_KHR_surface")
			instanceExtensions.add("VK_KHR_win32_surface")
			deviceExtensions.add("VK_KHR_swapchain")
		}

		val instance = Vulkan.createInstance(
			appName       = "My App",
			appVersion    = Version(1, 0, 0),
			engineName    = "My Engine",
			engineVersion = Version(1, 0, 0),
			apiVersion    = apiVersion,
			layers        = instanceLayers,
			extensions    = instanceExtensions
		)

		val debugMessenger = if(!isDebugEnabled)
			null
		else
			instance.createDebugMessenger(
				DebugUtils.defaultCallbackAddress(),
				DebugUtilsMessageSeverityFlags { WARNING + ERROR },
				DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }
			)


		val physicalDevice = instance.physicalDevices[0]

		val surface = window?.let {
			physicalDevice.createWin32Surface(0L, it.hwnd)
		}

		val queueFamily = physicalDevice.queueFamilies.first {
			it.supportsGraphics && (surface == null || it.supportsSurface(surface))
		}

		val device = physicalDevice.createDevice(listOf(queueFamily to 1), deviceExtensions)

		val queue = device.getQueue(queueFamily.index, 0)

		val surfaceSystem = surface?.let {
			val surfaceRenderPass = device.buildRenderPass(block = ::buildSurfaceRenderPass)

			val swapchain = device.createSwapchain(
				surface          = it,
				minImageCount    = surface.capabilities.minImageCount + 1,
				imageFormat      = surface.formats.first(::chooseFormat).format,
				imageColourSpace = surface.formats.first(::chooseFormat).colourSpace,
				width            = surface.width,
				height           = surface.height,
				presentMode      = presentMode
			)

			SurfaceSystem(surface, device, surfaceRenderPass, swapchain)
		}

		return Context(instance, debugMessenger, physicalDevice, queueFamily, device, queue, surfaceSystem)
	}



}