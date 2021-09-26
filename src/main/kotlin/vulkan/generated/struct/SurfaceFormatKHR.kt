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
 *     struct VkSurfaceFormatKHR {
 *         VkFormat         format
 *         VkColorSpaceKHR  colorSpace
 *     }
 */
@JvmInline
value class SurfaceFormatKHR(override val address: Long) : Addressable {
	
	
	var format: Format
		get()      = Format(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var colorSpace: ColorSpace
		get()      = ColorSpace(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = SurfaceFormatKHR(offset(index))
		
		operator fun set(index: Int, value: SurfaceFormatKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SurfaceFormatKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SurfaceFormatKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SurfaceFormatKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val format: Format,
		val colorSpace: ColorSpace,
	) {
		override fun toString() = "SurfaceFormatKHR(" + 
			"format=$format, " +
			"colorSpace=$colorSpace)"
	}
	
	
	
	val asPersistent get() = Persistent(
		format, 
		colorSpace, 
	)
	
	
	
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
		
		val NULL = SurfaceFormatKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SurfaceFormatKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SurfaceFormatKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}