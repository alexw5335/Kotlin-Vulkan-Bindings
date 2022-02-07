package kvb.vkwrapper.persistent

import kvb.vulkan.*

/**
 * Persistent implementation of [VkAttachmentDescription][AttachmentDescription]
 */
class AttachmentDescriptionP(
	val flags          : AttachmentDescriptionFlags,
	val format         : Format,
	val samples        : SampleCountFlags,
	val loadOp         : AttachmentLoadOp,
	val storeOp        : AttachmentStoreOp,
	val stencilLoadOp  : AttachmentLoadOp,
	val stencilStoreOp : AttachmentStoreOp,
	val initialLayout  : ImageLayout,
	val finalLayout     : ImageLayout
) {


	constructor(struct: AttachmentDescription) : this(
		struct.flags,
		struct.format,
		struct.samples,
		struct.loadOp,
		struct.storeOp,
		struct.stencilLoadOp,
		struct.stencilStoreOp,
		struct.initialLayout,
		struct.finalLayout
	)


}