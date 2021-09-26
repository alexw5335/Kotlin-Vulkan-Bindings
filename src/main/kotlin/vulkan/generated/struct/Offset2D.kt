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
 *     struct VkOffset2D {
 *         int32_t  x
 *         int32_t  y
 *     }
 */
@JvmInline
value class Offset2D(override val address: Long) : Addressable {
	
	
	var x: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var y: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Persistent(
		val x: Int,
		val y: Int,
	) {
		override fun toString() = "Offset2D(" + 
			"x=$x, " +
			"y=$y)"
	}
	
	
	
	val asPersistent get() = Persistent(
		x, 
		y, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = Offset2D(0)
		
		fun malloc(allocator: Allocator) = Offset2D(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = Offset2D(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}