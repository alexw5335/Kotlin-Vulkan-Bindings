package kvb.vkwrapper.persistent

import kvb.vulkan.QueueFamilyProperties
import kvb.vulkan.QueueFlags
import kvb.vkwrapper.handle.PhysicalDevice
import kvb.vkwrapper.handle.Surface

/**
 * Persistent implementation of [VkQueueFamilyProperties][QueueFamilyProperties].
 *
 * - If an implementation exposes any queue family that supports graphics operations, at least one queue family of at
 * least one physical device exposed by the implementation must support both graphics and compute operations.
 * - All commands that are allowed on a queue that supports transfer operations are also allowed on a queue that
 * supports either graphics or compute operations. Thus, reporting transfer support is optional if graphics and compute
 * capabilities are also reported.
 * - This means that if graphics operations are supported by a physical device, then there is at least one queue family
 * that supports graphics, compute, and transfer operations.
 */
class QueueFamily(
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



	fun supportsSurface(surface: Surface) = physicalDevice.supportsSurface(this, surface)


}


