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
 *     struct VkAabbPositionsKHR {
 *         float  minX
 *         float  minY
 *         float  minZ
 *         float  maxX
 *         float  maxY
 *         float  maxZ
 *     }
 */
@JvmInline
value class AabbPositionsKHR(override val address: Long) : Addressable {
	
	
	var minX: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[0], value) }
	
	var minY: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[1], value) }
	
	var minZ: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[2], value) }
	
	var maxX: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[3], value) }
	
	var maxY: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[4], value) }
	
	var maxZ: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AabbPositionsKHR(0)
		
		fun malloc(allocator: Allocator) = AabbPositionsKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = AabbPositionsKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}