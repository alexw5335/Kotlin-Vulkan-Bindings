package kvb.vkwrapper.persistent

import kvb.vulkan.enumeration.MemoryHeapFlags
import kvb.vulkan.enumeration.MemoryPropertyFlags
import kvb.vulkan.struct.MemoryHeap
import kvb.vulkan.struct.MemoryType

/**
 * Persistent implementation of [VkMemoryType][MemoryType].
 */
class MemoryTypeP(
	val typeIndex: Int,
	val flags: MemoryPropertyFlags,
	val heapIndex: Int,
	val heapSize: Long,
	val heapFlags: MemoryHeapFlags
) {


	constructor(struct: MemoryType, typeIndex: Int, heaps: MemoryHeap.Buffer) : this(
		typeIndex,
		struct.propertyFlags,
		struct.heapIndex,
		heaps[struct.heapIndex].size,
		heaps[struct.heapIndex].flags
	)



	/*
	Wrapper functions
	 */



	val isDeviceLocal     get() = flags.contains(MemoryPropertyFlags.DEVICE_LOCAL)

	val isHostVisible     get() = flags.contains(MemoryPropertyFlags.HOST_VISIBLE)

	val isHostCoherent    get() = flags.contains(MemoryPropertyFlags.HOST_COHERENT)

	val isHostCached      get() = flags.contains(MemoryPropertyFlags.HOST_CACHED)

	val isLazilyAllocated get() = flags.contains(MemoryPropertyFlags.LAZILY_ALLOCATED)

	val isProtected       get() = flags.contains(MemoryPropertyFlags.PROTECTED)

	val isDeviceCoherent  get() = flags.contains(MemoryPropertyFlags.DEVICE_COHERENT)

	val isDeviceUncached  get() = flags.contains(MemoryPropertyFlags.DEVICE_UNCACHED)

	val isMultiInstance   get() = heapFlags.contains(MemoryHeapFlags.MULTI_INSTANCE)



	fun validMemoryTypeBits(memoryTypeBits: Int) = memoryTypeBits and (1 shl typeIndex) != 0



	override fun toString() = "MemoryType(index = $typeIndex, flags = $flags, heapSize = $heapSize)"


}