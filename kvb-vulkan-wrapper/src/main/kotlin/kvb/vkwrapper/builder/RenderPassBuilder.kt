package kvb.vkwrapper.builder

import kvb.core.memory.Allocator
import kvb.core.memory.DirectList
import kvb.core.memory.Unsafe
import kvb.vulkan.*

class RenderPassBuilder(private val allocator: Allocator) {


	/*
	Variables
	 */



	var flags = RenderPassCreateFlags(0)

	var bindPoint = PipelineBindPoint.GRAPHICS



	private var attachments = DirectList(allocator, 2) { AttachmentDescription(it) { } }

	private var subpasses = DirectList(allocator, 2) { SubpassDescription(it) { } }

	private var dependencies = DirectList(allocator, 2) { SubpassDependency(it) { } }



	/*
	Builder functions
	 */



	fun attachment(
		flags          : AttachmentDescriptionFlags  = AttachmentDescriptionFlags(0),
		format         : Format,
		samples        : SampleCountFlags            = SampleCountFlags._1,
		loadOp         : AttachmentLoadOp            = AttachmentLoadOp.DONT_CARE,
		storeOp        : AttachmentStoreOp           = AttachmentStoreOp.DONT_CARE,
		stencilLoadOp  : AttachmentLoadOp            = AttachmentLoadOp.DONT_CARE,
		stencilStoreOp : AttachmentStoreOp           = AttachmentStoreOp.DONT_CARE,
		initialLayout  : ImageLayout                 = ImageLayout.UNDEFINED,
		finalLayout    : ImageLayout
	) {
		attachments.buffer[attachments.next].let {
			it.flags = flags
			it.format = format
			it.samples = samples
			it.loadOp = loadOp
			it.storeOp = storeOp
			it.stencilLoadOp = stencilLoadOp
			it.stencilStoreOp = stencilStoreOp
			it.initialLayout = initialLayout
			it.finalLayout = finalLayout
		}
	}



	/**
	 * Creates a [SubpassDescription] with a single colour attachment.
	 */
	fun colourSubpass(colourAttachment: Int, colourLayout: ImageLayout) {
		subpasses.buffer[subpasses.next].also {
			it.pipelineBindPoint = bindPoint
			it.colorAttachmentCount = 1
			it.colorAttachments = allocator.AttachmentReference { ref ->
				ref.attachment = colourAttachment
				ref.layout = colourLayout
			}.asBuffer
		}
	}



	fun subpass(
		inputAttachments       : List<Pair<Int, ImageLayout>>? = null,
		colourAttachments      : List<Pair<Int, ImageLayout>>? = null,
		resolveAttachments     : List<Pair<Int, ImageLayout>>? = null,
		depthStencilAttachment : Pair<Int, ImageLayout>?       = null,
		preserveAttachments    : IntArray?                     = null,
		flags                  : SubpassDescriptionFlags       = SubpassDescriptionFlags(0)
	) {
		subpasses.buffer[subpasses.next].also {
			it.flags = flags
			it.pipelineBindPoint = bindPoint

			if(inputAttachments != null) {
				it.inputAttachmentCount = inputAttachments.size
				it.inputAttachments = inputAttachments.toBuffer()
			}

			if(colourAttachments != null) {
				it.colorAttachmentCount = colourAttachments.size
				it.colorAttachments = colourAttachments.toBuffer()
			}

			if(resolveAttachments != null) {
				it.resolveAttachments = resolveAttachments.toBuffer()
			}

			if(depthStencilAttachment != null) {
				it.depthStencilAttachment = allocator.AttachmentReference { ref ->
					ref.attachment = depthStencilAttachment.first
					ref.layout = depthStencilAttachment.second
				}
			}

			if(preserveAttachments != null) {
				it.preserveAttachmentCount = preserveAttachments.size
				it.preserveAttachments = allocator.wrapInts(preserveAttachments)
			}
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
			it.srcSubpass = srcSubpass
			it.dstSubpass = dstSubpass
			it.srcStageMask = srcStageMask
			it.dstStageMask = dstStageMask
			it.srcAccessMask = srcAccessMask
			it.dstAccessMask = dstAccessMask
			it.dependencyFlags = dependencyFlags
		}
	}



	private fun List<Pair<Int, ImageLayout>>.toBuffer() = allocator.AttachmentReference(size) { buffer ->
		for(i in indices) {
			buffer[i].let {
				it.attachment = get(i).first
				it.layout = get(i).second
			}
		}
	}



	fun build() = allocator.RenderPassCreateInfo {
		it.flags = flags
		it.attachmentCount = attachments.size
		it.pAttachments    = attachments.address
		it.subpassCount    = subpasses.size
		it.pSubpasses      = subpasses.address
		it.dependencyCount = dependencies.size
		it.pDependencies   = dependencies.address
	}


}