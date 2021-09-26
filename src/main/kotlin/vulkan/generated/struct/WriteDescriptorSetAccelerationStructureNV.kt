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
 *     struct VkWriteDescriptorSetAccelerationStructureNV {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         uint32_t                     accelerationStructureCount
 *         VkAccelerationStructureNV**  pAccelerationStructures
 *     }
 */
@JvmInline
value class WriteDescriptorSetAccelerationStructureNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var accelerationStructureCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pAccelerationStructures: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var accelerationStructures: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), accelerationStructureCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); accelerationStructureCount = value.capacity }
	
	
	
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
		
		val NULL = WriteDescriptorSetAccelerationStructureNV(0)
		
		fun malloc(allocator: Allocator) = WriteDescriptorSetAccelerationStructureNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV
		}
		
		fun calloc(allocator: Allocator) = WriteDescriptorSetAccelerationStructureNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV
		}
	
	}


}