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
 *     struct VkSetStateFlagsIndirectCommandNV {
 *         uint32_t  data
 *     }
 */
@JvmInline
value class SetStateFlagsIndirectCommandNV(override val address: Long) : Addressable {
	
	
	var data: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SetStateFlagsIndirectCommandNV(0)
		
		fun malloc(allocator: Allocator) = SetStateFlagsIndirectCommandNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SetStateFlagsIndirectCommandNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}