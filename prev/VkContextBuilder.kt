package kvb.app

import kvb.core.Platforms
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.builder.RenderPassBuilder
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vkwrapper.persistent.SurfaceFormatP
import kvb.vkwrapper.pipeline.ShaderDirectory
import kvb.vulkan.*
import kvb.window.Window
import kvb.window.winapi.WinApiWindow

abstract class VkContextBuilder {


	/*
	Configuration
	 */



	open val window: Window? get() = null

	open val apiVersion get() = Version(1, 2, 0)

	open val isDebugEnabled get() = false

	open val presentMode get() = PresentMode.FIFO

	open fun surfaceFormat(format: SurfaceFormatP): Boolean =
		format.colourSpace == ColorSpace.SRGB_NONLINEAR &&
			(format.format == Format.B8G8R8A8_SRGB || format.format == Format.R8G8B8A8_SRGB)

	open fun createSurfaceRenderPass(builder: RenderPassBuilder) = defaultSurfaceRenderPass(builder)

	open fun createSwapchain(prevSwapchain: Swapchain?) = defaultSwapchain(prevSwapchain)

	open fun createDescriptorPool() = defaultDescriptorPool()

	open fun createMemoryManager() = defaultMemoryManager()

	open val shadersPath = "res/shader/out"



	/*
	Variables
	 */



	var surfaceFormat: SurfaceFormatP? = null

	lateinit var instance: Instance

	lateinit var physicalDevice: PhysicalDevice

	var surface: Surface? = null

	lateinit var queueFamily: QueueFamily

	lateinit var device: Device

	lateinit var queue: Queue

	lateinit var descriptorPool: DescriptorPool

	lateinit var memoryManager: VkMemoryManager

	lateinit var shaderDirectory: ShaderDirectory



	/*
	Creation
	 */



	private fun defaultSurfaceRenderPass(builder: RenderPassBuilder) {
		builder.attachment(
			format        = surfaceFormat!!.format,
			loadOp        = AttachmentLoadOp.CLEAR,
			storeOp       = AttachmentStoreOp.STORE,
			initialLayout = ImageLayout.UNDEFINED,
			finalLayout   = ImageLayout.PRESENT_SRC
		)

		builder.colourSubpass(0, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)

		builder.dependency(
			srcSubpass    = VK_SUBPASS_EXTERNAL,
			dstSubpass    = 0,
			srcStageMask  = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			dstStageMask  = PipelineStageFlags.COLOR_ATTACHMENT_OUTPUT,
			srcAccessMask = AccessFlags.NONE,
			dstAccessMask = AccessFlags.COLOR_ATTACHMENT_WRITE
		)
	}



	private fun defaultSwapchain(prevSwapchain: Swapchain?) = device.createSwapchain(
		surface          = surface!!,
		minImageCount    = surface!!.capabilities.minImageCount + 1,
		imageFormat      = surfaceFormat!!.format,
		imageColourSpace = surfaceFormat!!.colourSpace,
		width            = surface!!.width,
		height           = surface!!.height,
		presentMode      = presentMode,
		oldSwapchain     = prevSwapchain
	)



	private fun defaultDescriptorPool() = device.createDescriptorPool(
		maxSets = 10,
		types = listOf(DescriptorType.UNIFORM_BUFFER to 10)
	)



	private fun defaultMemoryManager() = VkMemoryManager(
		device           = device,
		bufferMemorySize = 10_000_000,
		imageMemorySize  = 50_000_000
	)



	/*
	Building
	 */



	fun build() : VkContext {
		val instanceLayers = HashSet<String>()
		val instanceExtensions = HashSet<String>()
		val deviceExtensions = HashSet<String>()

		if(isDebugEnabled) {
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
			instanceExtensions.add("VK_EXT_debug_utils")
		}

		if(window != null) {
			instanceExtensions.add("VK_KHR_surface")
			deviceExtensions.add("VK_KHR_swapchain")

			when {
				Platforms.isWindows -> 	instanceExtensions.add("VK_KHR_win32_surface")
				else -> throw RuntimeException("Windowing is only supported on Windows")
			}
		}

		instance = Vulkan.createInstance(
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


		physicalDevice = instance.physicalDevices[0]

		surface = when(val window = window) {
			null            -> null
			is WinApiWindow -> physicalDevice.createWin32Surface(0L, window.hwnd)
			else            -> throw RuntimeException("Windowing is only supported on Windows")
		}

		surfaceFormat = surface?.formats?.first(::surfaceFormat)

		queueFamily = physicalDevice.queueFamilies.first {
			it.supportsGraphics && (surface == null || it.supportsSurface(surface!!))
		}

		device = physicalDevice.createDevice(listOf(queueFamily to 1), deviceExtensions)

		queue = device.getQueue(queueFamily, 0)

		val surfaceSystem = surface?.let {
			val surfaceRenderPass = device.buildRenderPass(block = ::createSurfaceRenderPass)
			SurfaceSystem(it, device, queue, surfaceRenderPass, ::createSwapchain)
		}

		descriptorPool = createDescriptorPool()

		memoryManager = createMemoryManager()

		shaderDirectory = ShaderDirectory(shadersPath, device)

		return VkContext(
			instance,
			debugMessenger,
			physicalDevice,
			queueFamily,
			device,
			queue,
			surfaceSystem,
			descriptorPool,
			memoryManager,
			shaderDirectory
		)
	}
}