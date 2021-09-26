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
 *     union VkClearColorValue
 *         float     float32[4]
 *         int32_t   int32[4]
 *         uint32_t  uint32[4]
 *     }
 */
@JvmInline
value class ClearColorValue(override val address: Long) : Addressable {
	
	
	var float32: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[0], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.byteSize) }
	
	var int32: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[1], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.byteSize) }
	
	var uint32: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[2], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			array(4, 4)
			array(4, 4)
			array(4, 4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ClearColorValue(0)
		
		fun malloc(allocator: Allocator) = ClearColorValue(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ClearColorValue(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}