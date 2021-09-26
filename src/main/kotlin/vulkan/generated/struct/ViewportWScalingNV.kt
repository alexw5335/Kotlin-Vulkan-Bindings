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
 *     struct VkViewportWScalingNV {
 *         float  xcoeff
 *         float  ycoeff
 *     }
 */
@JvmInline
value class ViewportWScalingNV(override val address: Long) : Addressable {
	
	
	var xcoeff: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[0], value) }
	
	var ycoeff: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ViewportWScalingNV(offset(index))
		
		operator fun set(index: Int, value: ViewportWScalingNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ViewportWScalingNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ViewportWScalingNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ViewportWScalingNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ViewportWScalingNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ViewportWScalingNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ViewportWScalingNV(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}