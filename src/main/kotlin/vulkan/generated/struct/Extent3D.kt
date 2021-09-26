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
 *     struct VkExtent3D {
 *         uint32_t  width
 *         uint32_t  height
 *         uint32_t  depth
 *     }
 */
@JvmInline
value class Extent3D(override val address: Long) : Addressable {
	
	
	var width: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var height: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var depth: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val width: Int,
		val height: Int,
		val depth: Int,
	) {
		override fun toString() = "Extent3D(" + 
			"width=$width, " +
			"height=$height, " +
			"depth=$depth)"
	}
	
	
	
	val asPersistent get() = Persistent(
		width, 
		height, 
		depth, 
	)
	
	
	
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
		
		val NULL = Extent3D(0)
		
		fun malloc(allocator: Allocator) = Extent3D(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = Extent3D(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}