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
 *     struct VkSampleLocationEXT {
 *         float  x
 *         float  y
 *     }
 */
@JvmInline
value class SampleLocationEXT(override val address: Long) : Addressable {
	
	
	var x: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[0], value) }
	
	var y: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SampleLocationEXT(offset(index))
		
		operator fun set(index: Int, value: SampleLocationEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SampleLocationEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SampleLocationEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SampleLocationEXT[$capacity]"
	
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
		
		val NULL = SampleLocationEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SampleLocationEXT(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SampleLocationEXT(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}