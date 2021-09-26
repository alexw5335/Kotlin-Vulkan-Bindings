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
 *     struct VkDescriptorPoolCreateInfo {
 *         VkStructureType              sType
 *         void*                        pNext
 *         VkDescriptorPoolCreateFlags  flags
 *         uint32_t                     maxSets
 *         uint32_t                     poolSizeCount
 *         VkDescriptorPoolSize**       pPoolSizes
 *     }
 */
@JvmInline
value class DescriptorPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DescriptorPoolCreateFlags
		get()      = DescriptorPoolCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var maxSets: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var poolSizeCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pPoolSizes: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var poolSizes: DescriptorPoolSize.Buffer
		get()      = DescriptorPoolSize.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), poolSizeCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); poolSizeCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorPoolCreateInfo(0)
		
		fun malloc(allocator: Allocator) = DescriptorPoolCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_POOL_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DescriptorPoolCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_POOL_CREATE_INFO
		}
	
	}


}