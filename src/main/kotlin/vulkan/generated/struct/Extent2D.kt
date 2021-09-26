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
 *     struct VkExtent2D {
 *         uint32_t  width
 *         uint32_t  height
 *     }
 */
@JvmInline
value class Extent2D(override val address: Long) : Addressable {
	
	
	var width: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var height: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Persistent(
		val width: Int,
		val height: Int,
	) {
		override fun toString() = "Extent2D(" + 
			"width=$width, " +
			"height=$height)"
	}
	
	
	
	val asPersistent get() = Persistent(
		width, 
		height, 
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
		
		val NULL = Extent2D(0)
		
		fun malloc(allocator: Allocator) = Extent2D(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = Extent2D(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}