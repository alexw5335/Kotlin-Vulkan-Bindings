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
 *     struct VkMutableDescriptorTypeCreateInfoVALVE {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         uint32_t                            mutableDescriptorTypeListCount
 *         VkMutableDescriptorTypeListVALVE**  pMutableDescriptorTypeLists
 *     }
 */
@JvmInline
value class MutableDescriptorTypeCreateInfoVALVE(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var mutableDescriptorTypeListCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pMutableDescriptorTypeLists: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var mutableDescriptorTypeLists: MutableDescriptorTypeListVALVE.Buffer
		get()      = MutableDescriptorTypeListVALVE.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), mutableDescriptorTypeListCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); mutableDescriptorTypeListCount = value.capacity }
	
	
	
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
		
		val NULL = MutableDescriptorTypeCreateInfoVALVE(0)
		
		fun malloc(allocator: Allocator) = MutableDescriptorTypeCreateInfoVALVE(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = MutableDescriptorTypeCreateInfoVALVE(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO
		}
	
	}


}