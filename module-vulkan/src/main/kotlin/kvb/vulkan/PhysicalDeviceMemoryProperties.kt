// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceMemoryProperties {
 *         uint32_t      memoryTypeCount
 *         VkMemoryType  memoryTypes[32]
 *         uint32_t      memoryHeapCount
 *         VkMemoryHeap  memoryHeaps[16]
 *     }
 */
@JvmInline
value class PhysicalDeviceMemoryProperties(override val address: Long) : Addressable {
	
	
	var memoryTypeCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var memoryTypes: MemoryType.Buffer
		get()      = MemoryType.Buffer(address + 4, 32)
		set(value) = Unsafe.copy(value.address, address + 4, value.byteSize)
	
	var memoryHeapCount: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var memoryHeaps: MemoryHeap.Buffer
		get()      = MemoryHeap.Buffer(address + 264, 16)
		set(value) = Unsafe.copy(value.address, address + 264, value.byteSize)


}