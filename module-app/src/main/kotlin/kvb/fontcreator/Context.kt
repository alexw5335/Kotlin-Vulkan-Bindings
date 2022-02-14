package kvb.fontcreator

import kvb.app.MemManager
import kvb.app.SurfaceSystem
import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.handle.ImageView
import kvb.vkwrapper.handle.Sampler
import kvb.vkwrapper.handle.Swapchain
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow

object Context {


	val window = WindowManager.create("My window", 0, 0, 700, 700)



	val instance = Vulkan.createInstance(
		appName       = "My App",
		appVersion    = Version(1, 0, 0),
		engineName    = "My Engine",
		engineVersion = Version(1, 0, 0),
		apiVersion    = Version(1, 2, 0),
		layers        = listOf("VK_LAYER_KHRONOS_validation"),
		extensions    = listOf("VK_EXT_debug_utils","VK_KHR_surface", "VK_KHR_win32_surface")
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



	/*
	Descriptors
	 */



	val transformUbo = memManager.uniformBuffer(4 * 5)

	val colourUbo = memManager.uniformBuffer(4 * 4)



	val transformDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.VERTEX).also {
		it.bufferWrite(0, transformUbo)
	}

	val textureDescriptor = descriptorPool.createSet(DescriptorType.COMBINED_IMAGE_SAMPLER, ShaderStageFlags.FRAGMENT)

	val colourDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.FRAGMENT).also {
		it.bufferWrite(0, colourUbo)
	}

	val testDescriptor = descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.FRAGMENT)



	fun setTexture(sampler: Sampler, imageView: ImageView) {
		textureDescriptor.imageWrite(0, sampler, imageView, ImageLayout.SHADER_READ_ONLY_OPTIMAL)
	}



	/*
	Pipelines
	 */



	val binaryTexturePipeline = device.buildGraphicsPipeline {
		vertexBinding { vec2(); vec2() }
		renderPass(this@Context.renderPass)
		descriptorSets(0 to transformDescriptor, 1 to textureDescriptor)
		shaders(shaderDirectory["binary_texture"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val linePipeline = device.buildGraphicsPipeline {
		vertexBinding { vec2() }
		renderPass(this@Context.renderPass)
		descriptorSets(0 to transformDescriptor, 1 to colourDescriptor)
		shaders(shaderDirectory["line"])
		lineList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val textPipeline = device.buildGraphicsPipeline {
		vertexBinding { vec2(); vec2() }
		renderPass(this@Context.renderPass)
		descriptorSets(0 to transformDescriptor, 1 to testDescriptor)
		shaders(shaderDirectory["binary_texture2"])
		triangleList()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	const val textureWidth = 64

	const val textureHeight = 64

	const val meshWidth = 512F

	const val meshHeight = 512F



	val vertexBuffer = memManager.vertexBuffer(floatArrayOf(
		0F, 0F, 0F, 0F,
		meshWidth, 0F, 1F, 0F,
		0F, meshHeight, 0F, 1F,
		meshWidth, meshHeight, 1F, 1F
	))



	val linesVertexBuffer = memManager.vertexBuffer((textureWidth - 1 + textureHeight - 1) * 16) {
		var index = 0
		val scale = meshWidth / textureWidth

		for(i in 1 until textureWidth) {
			it[index] = i.toFloat() * scale
			it[index + 4] = 0F
			it[index + 8] = i.toFloat() * scale
			it[index + 12] = textureHeight.toFloat() * scale
			index += 16
		}

		for(i in 1 until textureHeight) {
			it[index] = 0F
			it[index + 4] = i.toFloat() * scale
			it[index + 8] = textureWidth.toFloat() * scale
			it[index + 12] = i.toFloat() * scale
			index += 16
		}
	}

	val sampler = device.createSampler(Filter.NEAREST, Filter.NEAREST)

	val image = memManager.image(textureWidth, textureHeight, ImageUsageFlags { TRANSFER_DST + SAMPLED }, Format.R8_SRGB)

	val imageView = device.createImageView(image)

	val stagingBuffer = memManager.stagingBuffer(500_000)



	init {
		memManager.transitionImageForShaderRead(image, stagingBuffer)
		setTexture(sampler, imageView)
	}


}