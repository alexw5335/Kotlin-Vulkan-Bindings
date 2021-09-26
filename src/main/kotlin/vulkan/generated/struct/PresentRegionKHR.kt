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
 *     struct VkPresentRegionKHR {
 *         uint32_t          rectangleCount
 *         VkRectLayerKHR**  pRectangles
 *     }
 */
@JvmInline
value class PresentRegionKHR(override val address: Long) : Addressable {
	
	
	var rectangleCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var pRectangles: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	
	
	var rectangles: RectLayerKHR.Buffer
		get()      = RectLayerKHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[1]), rectangleCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address); rectangleCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = PresentRegionKHR(offset(index))
		
		operator fun set(index: Int, value: PresentRegionKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PresentRegionKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PresentRegionKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PresentRegionKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PresentRegionKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PresentRegionKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PresentRegionKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}