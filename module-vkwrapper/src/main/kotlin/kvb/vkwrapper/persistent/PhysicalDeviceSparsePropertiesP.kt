package kvb.vkwrapper.persistent

import kvb.vulkan.PhysicalDeviceSparseProperties

/**
 * Persistent implementation of [VkPhysicalDeviceSparseProperties][PhysicalDeviceSparseProperties]
 */
class PhysicalDeviceSparsePropertiesP(
	val residencyStandard2DBlockShape: Int,
	val residencyStandard2DMultisampleBlockShape: Int,
	val residencyStandard3DBlockShape: Int,
	val residencyAlignedMipSize: Int,
	val residencyNonResidentStrict: Int,
) {


	constructor(struct: PhysicalDeviceSparseProperties) : this(
		struct.residencyStandard2DBlockShape,
		struct.residencyStandard2DMultisampleBlockShape,
		struct.residencyStandard3DBlockShape,
		struct.residencyAlignedMipSize,
		struct.residencyNonResidentStrict,
	)


}