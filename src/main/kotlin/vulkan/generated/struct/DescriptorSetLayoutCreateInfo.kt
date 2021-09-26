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
 *     struct VkDescriptorSetLayoutCreateInfo {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkDescriptorSetLayoutCreateFlags  flags
 *         uint32_t                          bindingCount
 *         VkDescriptorSetLayoutBinding**    pBindings
 *     }
 */
@JvmInline
value class DescriptorSetLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DescriptorSetLayoutCreateFlags
		get()      = DescriptorSetLayoutCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var bindingCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pBindings: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var bindings: DescriptorSetLayoutBinding.Buffer
		get()      = DescriptorSetLayoutBinding.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), bindingCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); bindingCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorSetLayoutCreateInfo(0)
		
		fun malloc(allocator: Allocator) = DescriptorSetLayoutCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_LAYOUT_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DescriptorSetLayoutCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_LAYOUT_CREATE_INFO
		}
	
	}


}