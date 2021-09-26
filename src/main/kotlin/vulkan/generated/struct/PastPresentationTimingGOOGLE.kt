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
 *     struct VkPastPresentationTimingGOOGLE {
 *         uint32_t  presentID
 *         uint64_t  desiredPresentTime
 *         uint64_t  actualPresentTime
 *         uint64_t  earliestPresentTime
 *         uint64_t  presentMargin
 *     }
 */
@JvmInline
value class PastPresentationTimingGOOGLE(override val address: Long) : Addressable {
	
	
	var presentID: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var desiredPresentTime: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var actualPresentTime: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var earliestPresentTime: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var presentMargin: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PastPresentationTimingGOOGLE(offset(index))
		
		operator fun set(index: Int, value: PastPresentationTimingGOOGLE) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PastPresentationTimingGOOGLE) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PastPresentationTimingGOOGLE) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PastPresentationTimingGOOGLE[$capacity]"
	
	}
	
	
	
	class Persistent(
		val presentID: Int,
		val desiredPresentTime: Long,
		val actualPresentTime: Long,
		val earliestPresentTime: Long,
		val presentMargin: Long,
	) {
		override fun toString() = "PastPresentationTimingGOOGLE(" + 
			"presentID=$presentID, " +
			"desiredPresentTime=$desiredPresentTime, " +
			"actualPresentTime=$actualPresentTime, " +
			"earliestPresentTime=$earliestPresentTime, " +
			"presentMargin=$presentMargin)"
	}
	
	
	
	val asPersistent get() = Persistent(
		presentID, 
		desiredPresentTime, 
		actualPresentTime, 
		earliestPresentTime, 
		presentMargin, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(8)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PastPresentationTimingGOOGLE(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PastPresentationTimingGOOGLE(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PastPresentationTimingGOOGLE(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}