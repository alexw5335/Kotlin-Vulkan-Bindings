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
 *     struct VkDescriptorSetVariableDescriptorCountAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         descriptorSetCount
 *         uint32_t**       pDescriptorCounts
 *     }
 */
@JvmInline
value class DescriptorSetVariableDescriptorCountAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var descriptorSetCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pDescriptorCounts: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var descriptorCounts: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), descriptorSetCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); descriptorSetCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorSetVariableDescriptorCountAllocateInfo(0)
		
		fun malloc(allocator: Allocator) = DescriptorSetVariableDescriptorCountAllocateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DescriptorSetVariableDescriptorCountAllocateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO
		}
	
	}


}