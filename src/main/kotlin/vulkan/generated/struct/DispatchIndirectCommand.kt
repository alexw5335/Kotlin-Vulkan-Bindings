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
 *     struct VkDispatchIndirectCommand {
 *         uint32_t  x
 *         uint32_t  y
 *         uint32_t  z
 *     }
 */
@JvmInline
value class DispatchIndirectCommand(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var y: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var z: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DispatchIndirectCommand(0)
		
		fun malloc(allocator: Allocator) = DispatchIndirectCommand(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DispatchIndirectCommand(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}