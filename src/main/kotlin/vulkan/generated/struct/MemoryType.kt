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
 *     struct VkMemoryType {
 *         VkMemoryPropertyFlags  propertyFlags
 *         uint32_t               heapIndex
 *     }
 */
@JvmInline
value class MemoryType(override val address: Long) : Addressable {
	
	
	var propertyFlags: MemoryPropertyFlags
		get()      = MemoryPropertyFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var heapIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = MemoryType(offset(index))
		
		operator fun set(index: Int, value: MemoryType) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (MemoryType) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryType) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "MemoryType[$capacity]"
	
	}
	
	
	
	class Persistent(
		val propertyFlags: MemoryPropertyFlags,
		val heapIndex: Int,
	) {
		override fun toString() = "MemoryType(" + 
			"propertyFlags=$propertyFlags, " +
			"heapIndex=$heapIndex)"
	}
	
	
	
	val asPersistent get() = Persistent(
		propertyFlags, 
		heapIndex, 
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
		
		val NULL = MemoryType(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = MemoryType(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = MemoryType(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}