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
 *     struct VkClearRect {
 *         VkRect2D  rect
 *         uint32_t  baseArrayLayer
 *         uint32_t  layerCount
 *     }
 */
@JvmInline
value class ClearRect(override val address: Long) : Addressable {
	
	
	var rect: Rect2D
		get()      = Rect2D(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var baseArrayLayer: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var layerCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ClearRect(offset(index))
		
		operator fun set(index: Int, value: ClearRect) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ClearRect) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearRect) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ClearRect[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(Rect2D.LAYOUT)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ClearRect(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ClearRect(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ClearRect(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}