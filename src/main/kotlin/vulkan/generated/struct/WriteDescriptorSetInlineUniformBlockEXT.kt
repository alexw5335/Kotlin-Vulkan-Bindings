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
 *     struct VkWriteDescriptorSetInlineUniformBlockEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         dataSize
 *         void**           pData
 *     }
 */
@JvmInline
value class WriteDescriptorSetInlineUniformBlockEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var dataSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var data: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), dataSize)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); dataSize = value.capacity }
	
	
	
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
		
		val NULL = WriteDescriptorSetInlineUniformBlockEXT(0)
		
		fun malloc(allocator: Allocator) = WriteDescriptorSetInlineUniformBlockEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK
		}
		
		fun calloc(allocator: Allocator) = WriteDescriptorSetInlineUniformBlockEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK
		}
	
	}


}