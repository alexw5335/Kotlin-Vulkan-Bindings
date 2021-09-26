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
 *     struct VkViewportSwizzleNV {
 *         VkViewportCoordinateSwizzleNV  x
 *         VkViewportCoordinateSwizzleNV  y
 *         VkViewportCoordinateSwizzleNV  z
 *         VkViewportCoordinateSwizzleNV  w
 *     }
 */
@JvmInline
value class ViewportSwizzleNV(override val address: Long) : Addressable {
	
	
	var x: ViewportCoordinateSwizzle
		get()      = ViewportCoordinateSwizzle(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var y: ViewportCoordinateSwizzle
		get()      = ViewportCoordinateSwizzle(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	var z: ViewportCoordinateSwizzle
		get()      = ViewportCoordinateSwizzle(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var w: ViewportCoordinateSwizzle
		get()      = ViewportCoordinateSwizzle(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ViewportSwizzleNV(offset(index))
		
		operator fun set(index: Int, value: ViewportSwizzleNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ViewportSwizzleNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ViewportSwizzleNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ViewportSwizzleNV[$capacity]"
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ViewportSwizzleNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ViewportSwizzleNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ViewportSwizzleNV(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}