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
 *     struct VkVertexInputBindingDivisorDescriptionEXT {
 *         uint32_t  binding
 *         uint32_t  divisor
 *     }
 */
@JvmInline
value class VertexInputBindingDivisorDescriptionEXT(override val address: Long) : Addressable {
	
	
	var binding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var divisor: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = VertexInputBindingDivisorDescriptionEXT(offset(index))
		
		operator fun set(index: Int, value: VertexInputBindingDivisorDescriptionEXT) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (VertexInputBindingDivisorDescriptionEXT) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (VertexInputBindingDivisorDescriptionEXT) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "VertexInputBindingDivisorDescriptionEXT[$capacity]"
	
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
		
		val NULL = VertexInputBindingDivisorDescriptionEXT(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = VertexInputBindingDivisorDescriptionEXT(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = VertexInputBindingDivisorDescriptionEXT(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}