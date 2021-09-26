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
 *     union VkClearValue
 *         VkClearColorValue         color
 *         VkClearDepthStencilValue  depthStencil
 *     }
 */
@JvmInline
value class ClearValue(override val address: Long) : Addressable {
	
	
	var color: ClearColorValue
		get()      = ClearColorValue(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var depthStencil: ClearDepthStencilValue
		get()      = ClearDepthStencilValue(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ClearValue(offset(index))
		
		operator fun set(index: Int, value: ClearValue) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ClearValue) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearValue) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ClearValue[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(ClearColorValue.LAYOUT)
			member(ClearDepthStencilValue.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ClearValue(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ClearValue(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ClearValue(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}