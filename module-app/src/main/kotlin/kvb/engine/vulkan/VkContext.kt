package kvb.engine.vulkan

import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.memory.VkHeapAllocator
import kvb.vulkan.*
import kvb.window.Window
import kvb.window.winapi.WinApiWindow

object VkContext {


	init { VkContextBuilder.build() }



	val instance = VkContextBuilder.instance

	val debugMessenger = VkContextBuilder.debugMessenger

	val physicalDevice = VkContextBuilder.physicalDevice

	val device = VkContextBuilder.device

	val queue = VkContextBuilder.queue

	val memoryManager = VkContextBuilder.memoryManager

	val surfaceSystems = HashMap<Window, SurfaceSystem>()



	private val dummyVertexBuffer = device.createBuffer(32L, BufferUsageFlags.VERTEX_BUFFER)



	private val mappedMemoryType = device.physicalDevice.chooseMemoryType(
		property1      = MemoryPropertyFlags.HOST_VISIBLE,
		property2      = MemoryPropertyFlags.DEVICE_LOCAL,
		property3      = MemoryPropertyFlags.HOST_COHERENT,
		memoryTypeBits = dummyVertexBuffer.memoryTypeBits
	) ?: throw VkException("No mappable memory type found.")



	fun mappedHeapAllocator() = VkHeapAllocator(device, mappedMemoryType, true)



	/*
	Surface
	 */



	private fun createSurface(window: Window) = when(window) {
		is WinApiWindow -> physicalDevice.createWin32Surface(0L, window.hwnd)
		else            -> throw VkException("Only windows is supported")
	}



	fun createSurfaceSystem(window: Window): SurfaceSystem {
		val surface = createSurface(window)

		if(!queue.family.supportsSurface(surface)) {
			throw VkException("The current queue family does not support this surface.")
		}

		val formatPair = surface.formats.first {
			it.colourSpace == ColorSpace.SRGB_NONLINEAR &&
				(it.format == Format.R8G8B8A8_SRGB || it.format == Format.B8G8R8A8_SRGB)
		}

		if(!surface.presentModes.contains(VkContextBuilder.presentMode)) {
			println("Requested present mode ${VkContextBuilder.presentMode} is not supported, defaulting to FIFO.")
			VkContextBuilder.presentMode = PresentMode.FIFO
		}

		val format = formatPair.format

		val surfaceSystem = SurfaceSystem(
			surface,
			VkContextBuilder.device,
			VkContextBuilder.queue,
			createRenderPass(format, VkContextBuilder.sampleCount),
			format,
			formatPair.colourSpace,
			VkContextBuilder.presentMode,
			VkContextBuilder.sampleCount
		)

		surfaceSystems[window] = surfaceSystem

		return surfaceSystem
	}



	/*
	Render pass
	 */



	private fun createRenderPass(format: Format, samples: SampleCountFlags) = if(samples.isMulti)
		createMultiSampleRenderPass(format)
	else
		createSingleSampleRenderPass(format)



	private fun createMultiSampleRenderPass(format: Format) = VkContextBuilder.device.buildRenderPass {
		// Colour attachment (0)
		it.attachment(
			format         = format,
			samples        = VkContextBuilder.sampleCount,
			loadOp         = AttachmentLoadOp.CLEAR,
			storeOp        = AttachmentStoreOp.STORE,
			stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
			stencilStoreOp = AttachmentStoreOp.DONT_CARE,
			initialLayout  = ImageLayout.UNDEFINED,
			finalLayout    = ImageLayout.COLOR_ATTACHMENT_OPTIMAL
		)

		// Resolve attachment (1)
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
	}



	private fun createSingleSampleRenderPass(format: Format) = VkContextBuilder.device.buildRenderPass {
		it.attachment(
			format         = format,
			samples        = VkContextBuilder.sampleCount,
			loadOp         = AttachmentLoadOp.CLEAR,
			storeOp        = AttachmentStoreOp.STORE,
			stencilLoadOp  = AttachmentLoadOp.DONT_CARE,
			stencilStoreOp = AttachmentStoreOp.DONT_CARE,
			initialLayout  = ImageLayout.UNDEFINED,
			finalLayout    = ImageLayout.PRESENT_SRC
		)

		it.colourSubpass(0, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)
	}


}