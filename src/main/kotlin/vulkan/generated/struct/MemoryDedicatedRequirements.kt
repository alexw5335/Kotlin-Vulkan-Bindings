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
 *     struct VkMemoryDedicatedRequirements {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         prefersDedicatedAllocation
 *         VkBool32         requiresDedicatedAllocation
 *     }
 */
@JvmInline
value class MemoryDedicatedRequirements(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var prefersDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var requiresDedicatedAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val prefersDedicatedAllocation: Int,
		val requiresDedicatedAllocation: Int,
	) {
		override fun toString() = "MemoryDedicatedRequirements(" + 
			"sType=$sType, " +
			"prefersDedicatedAllocation=$prefersDedicatedAllocation, " +
			"requiresDedicatedAllocation=$requiresDedicatedAllocation)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		prefersDedicatedAllocation, 
		requiresDedicatedAllocation, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MemoryDedicatedRequirements(0)
		
		fun malloc(allocator: Allocator) = MemoryDedicatedRequirements(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_DEDICATED_REQUIREMENTS
		}
		
		fun calloc(allocator: Allocator) = MemoryDedicatedRequirements(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_DEDICATED_REQUIREMENTS
		}
	
	}


}