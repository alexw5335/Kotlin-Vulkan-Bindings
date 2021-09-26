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
 *     struct VkDescriptorSetLayoutSupport {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkBool32         supported
 *     }
 */
@JvmInline
value class DescriptorSetLayoutSupport(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var supported: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val supported: Int,
	) {
		override fun toString() = "DescriptorSetLayoutSupport(" + 
			"sType=$sType, " +
			"supported=$supported)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		supported, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorSetLayoutSupport(0)
		
		fun malloc(allocator: Allocator) = DescriptorSetLayoutSupport(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_LAYOUT_SUPPORT
		}
		
		fun calloc(allocator: Allocator) = DescriptorSetLayoutSupport(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DESCRIPTOR_SET_LAYOUT_SUPPORT
		}
	
	}


}