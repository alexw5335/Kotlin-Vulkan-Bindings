package kvb.vkwrapper.persistent

import kvb.vulkan.enumeration.QueueFlags
import kvb.vulkan.handle.SurfaceH
import kvb.vulkan.struct.QueueFamilyProperties

/**
 * Persistent implementation of [VkQueueFamilyProperties][QueueFamilyProperties].
 */
/*class QueueFamilyPropertiesP(
	val index: Int,
	val physicalDevice: PhysicalDevice,
	val queueFlags: QueueFlags,
	val queueCount: Int,
	val timestampValidBits: Int,
	val minImageTransferGranularity: Extent3DP,
) {


	constructor(index: Int, physicalDevice: PhysicalDevice, struct: QueueFamilyProperties) : this(
		index,
		physicalDevice,
		struct.queueFlags,
		struct.queueCount,
		struct.timestampValidBits,
		Extent3DP(struct.minImageTransferGranularity)
	)



	val supportsGraphics       get() = queueFlags.value and QueueFlags.GRAPHICS.value != 0

	val supportsCompute        get() = queueFlags.value and QueueFlags.COMPUTE.value != 0

	val supportsTransfer       get() = queueFlags.value and QueueFlags.TRANSFER.value != 0

	val supportsSparseBinding  get() = queueFlags.value and QueueFlags.SPARSE_BINDING.value != 0

	val isProtected            get() = queueFlags.value and QueueFlags.PROTECTED.value != 0



	fun supportsSurface(surface: SurfaceH) = physicalDevice.supportsSurface(index, surface)


}*/


