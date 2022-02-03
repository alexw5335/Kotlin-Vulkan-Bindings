package kvb.vkwrapper.persistent

import kvb.vulkan.MemoryHeapFlags
import kvb.vulkan.MemoryPropertyFlags
import kvb.vulkan.MemoryHeap
import kvb.vulkan.MemoryType

/**
 * Persistent implementation of [VkMemoryType][MemoryType].
 */
class MemoryTypeP(
	val index     : Int,
	val flags     : MemoryPropertyFlags,
	val heapIndex : Int,
	val heapSize  : Long,
	val heapFlags : MemoryHeapFlags
) {


	constructor(struct: MemoryType, typeIndex: Int, heaps: MemoryHeap.Buffer) : this(
		typeIndex,
		struct.propertyFlags,
		struct.heapIndex,
		heaps[struct.heapIndex].size,
		heaps[struct.heapIndex].flags
	)



	/*
	Properties
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



	fun isValid(memoryTypeBits: Int) = memoryTypeBits and (1 shl index) != 0



	/*
	toString
	 */


	override fun hashCode() = index



	override fun toString() =
		"MemoryType(index = $index, flags = ${flags.toString}, heapSize = ${heapFlags.toString})"



	private val MemoryPropertyFlags.toString get() = when(value) {
		1    -> "DEVICE_LOCAL"
		2    -> "HOST_VISIBLE"
		4    -> "HOST_COHERENT"
		8    -> "HOST_CACHED"
		16   -> "LAZILY_ALLOCATED"
		32   -> "PROTECTED"
		64   -> "DEVICE_COHERENT"
		128  -> "DEVICE_UNCACHED"
		256  -> "RDMA_CAPABLE"
		else -> "__INVALID__"
	}



	private val MemoryHeapFlags.toString get() = when(value) {
		1    -> "DEVICE_LOCAL"
		2    -> "MULTI_INSTANCE"
		else -> "__INVALID__"
	}


}