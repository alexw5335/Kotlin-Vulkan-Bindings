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
 *     struct VkMemoryRequirements {
 *         VkDeviceSize  size
 *         VkDeviceSize  alignment
 *         uint32_t      memoryTypeBits
 *     }
 */
@JvmInline
value class MemoryRequirements(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var alignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var memoryTypeBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val size: Long,
		val alignment: Long,
		val memoryTypeBits: Int,
	) {
		override fun toString() = "MemoryRequirements(" + 
			"size=$size, " +
			"alignment=$alignment, " +
			"memoryTypeBits=$memoryTypeBits)"
	}
	
	
	
	val asPersistent get() = Persistent(
		size, 
		alignment, 
		memoryTypeBits, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MemoryRequirements(0)
		
		fun malloc(allocator: Allocator) = MemoryRequirements(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = MemoryRequirements(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}