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
 *     struct VkXYColorEXT {
 *         float  x
 *         float  y
 *     }
 */
@JvmInline
value class XYColorEXT(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[0], value) }
	
	var y: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[1], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = XYColorEXT(0)
		
		fun malloc(allocator: Allocator) = XYColorEXT(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = XYColorEXT(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}