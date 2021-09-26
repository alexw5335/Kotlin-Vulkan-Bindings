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
 *     struct VkSubresourceLayout {
 *         VkDeviceSize  offset
 *         VkDeviceSize  size
 *         VkDeviceSize  rowPitch
 *         VkDeviceSize  arrayPitch
 *         VkDeviceSize  depthPitch
 *     }
 */
@JvmInline
value class SubresourceLayout(override val address: Long) : Addressable {
	
	
	var offset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var rowPitch: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var arrayPitch: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var depthPitch: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = SubresourceLayout(offset(index))
		
		operator fun set(index: Int, value: SubresourceLayout) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SubresourceLayout) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubresourceLayout) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SubresourceLayout[$capacity]"
	
	}
	
	
	
	class Persistent(
		val offset: Long,
		val size: Long,
		val rowPitch: Long,
		val arrayPitch: Long,
		val depthPitch: Long,
	) {
		override fun toString() = "SubresourceLayout(" + 
			"offset=$offset, " +
			"size=$size, " +
			"rowPitch=$rowPitch, " +
			"arrayPitch=$arrayPitch, " +
			"depthPitch=$depthPitch)"
	}
	
	
	
	val asPersistent get() = Persistent(
		offset, 
		size, 
		rowPitch, 
		arrayPitch, 
		depthPitch, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(8)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubresourceLayout(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SubresourceLayout(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SubresourceLayout(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}