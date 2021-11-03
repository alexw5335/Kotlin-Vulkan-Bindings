package kvb.vkwrapper.builder

import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.vulkan.*

class RenderPassBuilder(private val allocator: Allocator) {


	/*
	Variables
	 */



	var flags = RenderPassCreateFlags(0)

	var bindPoint = PipelineBindPoint.GRAPHICS



	private var attachmentCount = 0

	private var attachments = allocator.AttachmentDescription(5) { }



	private var subpassCount = 0

	private var subpasses = allocator.SubpassDescription(5) { }



	private var dependencyCount = 0

	private var dependencies = allocator.SubpassDependency(5) { }



	/*
	Struct buffer sizing
	 */



	private fun ensureAttachmentCapacity() {
		if(attachmentCount == attachments.capacity) attachments.let { previous ->
			attachments = allocator.AttachmentDescription(attachments.capacity * 2) { }
			Unsafe.copy(previous, attachments)
		}
	}



	private fun ensureSubpassCapacity() {
		if(subpassCount == subpasses.capacity) subpasses.let { previous ->
			subpasses = allocator.SubpassDescription(subpasses.capacity * 2) { }
			Unsafe.copy(previous, subpasses)
		}
	}



	private fun ensureDependencyCapacity() {
		if(dependencyCount == dependencies.capacity) dependencies.let { previous ->
			dependencies = allocator.SubpassDependency(dependencies.capacity * 2) { }
			Unsafe.copy(previous, dependencies)
		}
	}



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
		ensureAttachmentCapacity()

		attachments[attachmentCount++].let {
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
		ensureSubpassCapacity()

		subpasses[subpassCount++].also {
			it.pipelineBindPoint = bindPoint
			it.inputAttachmentCount = 1
			it.inputAttachments = allocator.AttachmentReference { ref ->
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
		ensureSubpassCapacity()

		subpasses[subpassCount++].also {
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
		ensureDependencyCapacity()

		dependencies[dependencyCount++].also {
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
		it.pAttachments    = attachments.address
		it.attachmentCount = attachmentCount
		it.pSubpasses      = subpasses.address
		it.subpassCount    = subpassCount
		it.pDependencies   = dependencies.address
		it.dependencyCount = dependencyCount
	}


}