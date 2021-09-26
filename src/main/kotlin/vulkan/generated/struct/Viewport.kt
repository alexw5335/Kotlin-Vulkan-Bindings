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
 *     struct VkViewport {
 *         float  x
 *         float  y
 *         float  width
 *         float  height
 *         float  minDepth
 *         float  maxDepth
 *     }
 */
@JvmInline
value class Viewport(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[0], value) }
	
	var y: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[1], value) }
	
	var width: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[2], value) }
	
	var height: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[3], value) }
	
	var minDepth: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[4], value) }
	
	var maxDepth: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[5], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = Viewport(offset(index))
		
		operator fun set(index: Int, value: Viewport) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (Viewport) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Viewport) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "Viewport[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
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
		
		val NULL = Viewport(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = Viewport(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = Viewport(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}