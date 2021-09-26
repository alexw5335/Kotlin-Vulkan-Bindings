// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var memoryTypes: MemoryType.Buffer
		get()      = MemoryType.Buffer(address + LAYOUT.offsets[1], 32)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.byteSize) }
	
	var memoryHeapCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var memoryHeaps: MemoryHeap.Buffer
		get()      = MemoryHeap.Buffer(address + LAYOUT.offsets[3], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	class Persistent(
		val memoryTypeCount: Int,
		val memoryTypes: List<MemoryType.Persistent>,
		val memoryHeapCount: Int,
		val memoryHeaps: List<MemoryHeap.Persistent>,
	) {
		override fun toString() = "PhysicalDeviceMemoryProperties(" + 
			"memoryTypeCount=$memoryTypeCount, " +
			"memoryTypes=$memoryTypes, " +
			"memoryHeapCount=$memoryHeapCount, " +
			"memoryHeaps=$memoryHeaps)"
	}
	
	
	
	val asPersistent get() = Persistent(
		memoryTypeCount, 
		memoryTypes.asPersistentList, 
		memoryHeapCount, 
		memoryHeaps.asPersistentList, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			array(MemoryType.LAYOUT, 32)
			member(4)
			array(MemoryHeap.LAYOUT, 16)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMemoryProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMemoryProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMemoryProperties(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}