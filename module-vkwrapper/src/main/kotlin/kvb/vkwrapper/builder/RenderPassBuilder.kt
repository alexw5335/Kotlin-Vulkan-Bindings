package kvb.vkwrapper.builder

import kvb.core.memory.*
import kvb.vulkan.*

class RenderPassBuilder(private val stack: MemStack) {


	/*
	Variables
	 */



	var bindPoint = PipelineBindPoint.GRAPHICS



	private val attachments = DirectList(stack) { AttachmentDescription(it) { } }

	private val subpasses = DirectList(stack) { SubpassDescription(it) { } }

	private val dependencies = DirectList(stack) { SubpassDependency(it) { } }



	/*
	Builder functions
	 */



	fun build() = stack.RenderPassCreateInfo {
		it.attachmentCount  = attachments.size
		it.pAttachments     = attachments.address
		it.subpassCount     = subpasses.size
		it.pSubpasses       = subpasses.address
		it.dependencyCount  = dependencies.size
		it.pDependencies    = dependencies.address
	}



	fun attachment(
		format         : Format,
		samples        : SampleCountFlags,
		loadOp         : AttachmentLoadOp,
		storeOp        : AttachmentStoreOp,
		stencilLoadOp  : AttachmentLoadOp,
		stencilStoreOp : AttachmentStoreOp,
		initialLayout  : ImageLayout,
		finalLayout    : ImageLayout,
		flags          : AttachmentDescriptionFlags = AttachmentDescriptionFlags(0),
	) {
		attachments.buffer[attachments.next].let {
			it.flags          = flags
			it.format         = format
			it.samples        = samples
			it.loadOp         = loadOp
			it.storeOp        = storeOp
			it.stencilLoadOp  = stencilLoadOp
			it.stencilStoreOp = stencilStoreOp
			it.initialLayout  = initialLayout
			it.finalLayout    = finalLayout
		}
	}



	fun dependency(
		srcSubpass      : Int,
		dstSubpass      : Int,
		srcStageMask    : PipelineStageFlags,
		dstStageMask    : PipelineStageFlags,
		srcAccessMask   : AccessFlags,
		dstAccessMask   : AccessFlags,
		dependencyFlags : DependencyFlags = DependencyFlags(0)
	) {
		dependencies.buffer[dependencies.next].also {
			it.srcSubpass       = srcSubpass
			it.dstSubpass       = dstSubpass
			it.srcStageMask     = srcStageMask
			it.dstStageMask     = dstStageMask
			it.srcAccessMask    = srcAccessMask
			it.dstAccessMask    = dstAccessMask
			it.dependencyFlags  = dependencyFlags
		}
	}



	/**
	 * Creates an [AttachmentDescription] that uses swapchain images that will be presented.
	 */
	fun presentAttachment(
		format      : Format,
		sampleCount : SampleCountFlags = SampleCountFlags._1
	) = attachment(
		format,
		sampleCount,
		AttachmentLoadOp.CLEAR,
		AttachmentStoreOp.STORE,
		AttachmentLoadOp.DONT_CARE,
		AttachmentStoreOp.DONT_CARE,
		ImageLayout.UNDEFINED,
		ImageLayout.PRESENT_SRC
	)



	/**
	 * Creates a [SubpassDescription] with a single colour attachment.
	 */
	fun colourSubpass(attachment: Int = 0, layout: ImageLayout = ImageLayout.COLOR_ATTACHMENT_OPTIMAL) {
		subpasses.buffer[subpasses.next].also {
			it.pipelineBindPoint = bindPoint

			it.colorAttachments = stack.AttachmentReference { ref ->
				ref.attachment = attachment
				ref.layout = layout
			}.asBuffer
		}
	}



	/**
	 * Creates a [SubpassDescription] with a single colour attachment and a corresponding resolve attachment.
	 */
	fun colourResolveSubpass(
		colourAttachment: Int,
		colourLayout: ImageLayout,
		resolveAttachment: Int,
		resolveLayout: ImageLayout
	) {
		subpasses.buffer[subpasses.next].also {
			it.pipelineBindPoint = bindPoint

			it.colorAttachments = stack.AttachmentReference { ref ->
				ref.attachment = colourAttachment
				ref.layout = colourLayout
			}.asBuffer

			it.resolveAttachments = stack.AttachmentReference { ref ->
				ref.attachment = resolveAttachment
				ref.layout = resolveLayout
			}.asBuffer
		}
	}

}