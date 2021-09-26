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
 *     struct VkMemoryHeap {
 *         VkDeviceSize       size
 *         VkMemoryHeapFlags  flags
 *     }
 */
@JvmInline
value class MemoryHeap(override val address: Long) : Addressable {
	
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var flags: MemoryHeapFlags
		get()      = MemoryHeapFlags(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = MemoryHeap(offset(index))
		
		operator fun set(index: Int, value: MemoryHeap) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (MemoryHeap) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryHeap) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "MemoryHeap[$capacity]"
	
	}
	
	
	
	class Persistent(
		val size: Long,
		val flags: MemoryHeapFlags,
	) {
		override fun toString() = "MemoryHeap(" + 
			"size=$size, " +
			"flags=$flags)"
	}
	
	
	
	val asPersistent get() = Persistent(
		size, 
		flags, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MemoryHeap(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = MemoryHeap(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = MemoryHeap(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}