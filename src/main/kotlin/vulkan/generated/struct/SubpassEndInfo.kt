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
 *     struct VkSubpassEndInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *     }
 */
@JvmInline
value class SubpassEndInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubpassEndInfo(0)
		
		fun malloc(allocator: Allocator) = SubpassEndInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_END_INFO
		}
		
		fun calloc(allocator: Allocator) = SubpassEndInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBPASS_END_INFO
		}
	
	}


}