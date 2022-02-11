package kvb.fontcreator

import kvb.app.MemManager
import kvb.app.SurfaceSystem
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.Swapchain
import kvb.vkwrapper.pipeline.ShaderCreation
import kvb.vkwrapper.pipeline.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow
import java.io.File

object FontCreatorContext {


	val window = WindowManager.create("My window", 0, 0, 700, 700)



	val instance = Vulkan.createInstance(
		appName       = "My App",
		appVersion    = Version(1, 0, 0),
		engineName    = "My Engine",
		engineVersion = Version(1, 0, 0),
		apiVersion    = Version(1, 2, 0),
		layers        = listOf("VK_LAYER_KHRONOS_validation"),
		extensions    = listOf("VK_EXT_debug_utils", "VK_KHR_surface", "VK_KHR_win32_surface")
	)



	val debugMessenger = instance.createDebugMessenger(
		callback   = DebugUtils.defaultCallbackAddress(),
		severities = DebugUtilsMessageSeverityFlags { ERROR + WARNING },
		types      = DebugUtilsMessageTypeFlags { GENERAL + VALIDATION + PERFORMANCE }
	)



	val physicalDevice = instance.physicalDevices.firstOrNull {
		it.isDiscrete
	} ?: instance.physicalDevices[0]



	val surface = physicalDevice.createWin32Surface(0L, (window as WinApiWindow).hwnd)



	val queueFamily = physicalDevice.queueFamilies.first {
		it.supportsGraphics && it.supportsSurface(surface)
	}



	val device = physicalDevice.createDevice(mapOf(queueFamily to 1), extensions = listOf("VK_KHR_swapchain"))



	val queue = device.getQueue(queueFamily, 0)



	val surfaceFormat = physicalDevice.surfaceFormatsP(surface).first {
		it.colourSpace == ColorSpace.SRGB_NONLINEAR &&
			(it.format == Format.B8G8R8A8_SRGB || it.format == Format.R8G8B8A8_SRGB)
	}



	val presentMode = physicalDevice.surfacePresentModesP(surface).first {
		it == PresentMode.IMMEDIATE
	}



	val renderPass = device.buildRenderPass {
		it.attachment(
			format         = surfaceFormat.format,
			samples        = SampleCountFlags._1,
			loadOp         = AttachmentLoadOp.CLEAR,
			storeOp        = AttachmentStoreOp.STORE,
			stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
			stencilStoreOp = AttachmentStoreOp.DONT_CARE,
			initialLayout  = ImageLayout.UNDEFINED,
			finalLayout    = ImageLayout.PRESENT_SRC
		)

		it.colourSubpass(0, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)

		it.dependency(
			srcSubpass    = VK_SUBPASS_EXTERNAL,
			dstSubpass    = 0,
			srcStageMask  = PipelineStageFlags { COLOR_ATTACHMENT_OUTPUT},
			dstStageMask  = PipelineStageFlags { COLOR_ATTACHMENT_OUTPUT},
			srcAccessMask = AccessFlags { NONE },
			dstAccessMask = AccessFlags { COLOR_ATTACHMENT_WRITE }
		)
	}



	private fun createSwapchain(prevSwapchain: Swapchain?) = device.createSwapchain(
		surface          = surface,
		minImageCount    = surface.capabilities.minImageCount + 1,
		imageFormat      = surfaceFormat.format,
		imageColourSpace = surfaceFormat.colourSpace,
		width            = surface.width,
		height           = surface.height,
		presentMode      = presentMode,
		oldSwapchain     = prevSwapchain
	)



	val surfaceSystem = SurfaceSystem(surface, device, queue, renderPass, ::createSwapchain)



	val descriptorPool = device.createDescriptorPool(mapOf(
		DescriptorType.UNIFORM_BUFFER to 20,
		DescriptorType.COMBINED_IMAGE_SAMPLER to 20
	))



	init {
		ShaderCreation.compileAll("res/shader/font_creator", "res/shader/font_creator/out")
	}



	val shaderDirectory = ShaderDirectory("res/shader/font_creator/out", device)



	val memManager = MemManager(device, queue)



	val sampler = device.createSampler(Filter.NEAREST, Filter.NEAREST)

	val windowUbo = memManager.uniformBuffer(4 * 5)



	init {
		windowUboDescriptor.bufferWrite(0, windowUbo)
	}


}