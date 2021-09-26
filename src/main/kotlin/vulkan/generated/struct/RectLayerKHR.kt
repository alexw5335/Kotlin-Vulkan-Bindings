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
 *     struct VkRectLayerKHR {
 *         VkOffset2D  offset
 *         VkExtent2D  extent
 *         uint32_t    layer
 *     }
 */
@JvmInline
value class RectLayerKHR(override val address: Long) : Addressable {
	
	
	var offset: Offset2D
		get()      = Offset2D(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var extent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var layer: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = RectLayerKHR(offset(index))
		
		operator fun set(index: Int, value: RectLayerKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (RectLayerKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (RectLayerKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "RectLayerKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(Offset2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RectLayerKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = RectLayerKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = RectLayerKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}