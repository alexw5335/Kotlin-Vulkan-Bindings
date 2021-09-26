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
 *     struct VkBindShaderGroupIndirectCommandNV {
 *         uint32_t  groupIndex
 *     }
 */
@JvmInline
value class BindShaderGroupIndirectCommandNV(override val address: Long) : Addressable {
	
	
	var groupIndex: Int
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
		
		val NULL = BindShaderGroupIndirectCommandNV(0)
		
		fun malloc(allocator: Allocator) = BindShaderGroupIndirectCommandNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = BindShaderGroupIndirectCommandNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}