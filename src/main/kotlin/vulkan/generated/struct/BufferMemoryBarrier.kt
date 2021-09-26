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
 *     struct VkBufferMemoryBarrier {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkAccessFlags    srcAccessMask
 *         VkAccessFlags    dstAccessMask
 *         uint32_t         srcQueueFamilyIndex
 *         uint32_t         dstQueueFamilyIndex
 *         VkBuffer         buffer
 *         VkDeviceSize     offset
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class BufferMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address) }
	
	var offset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[7], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[8], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = BufferMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: BufferMemoryBarrier) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (BufferMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "BufferMemoryBarrier[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BufferMemoryBarrier(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = BufferMemoryBarrier(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BUFFER_MEMORY_BARRIER
		}
		
		fun calloc(allocator: Allocator) = BufferMemoryBarrier(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BUFFER_MEMORY_BARRIER
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BUFFER_MEMORY_BARRIER }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BUFFER_MEMORY_BARRIER }
		}
	
	}


}