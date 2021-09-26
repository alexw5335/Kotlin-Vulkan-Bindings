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
 *     struct VkMemoryBarrier2KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkPipelineStageFlags2KHR  srcStageMask
 *         VkAccessFlags2KHR         srcAccessMask
 *         VkPipelineStageFlags2KHR  dstStageMask
 *         VkAccessFlags2KHR         dstAccessMask
 *     }
 */
@JvmInline
value class MemoryBarrier2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value.bitfield) }
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value.bitfield) }
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value.bitfield) }
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[5], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = MemoryBarrier2KHR(offset(index))
		
		operator fun set(index: Int, value: MemoryBarrier2KHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (MemoryBarrier2KHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MemoryBarrier2KHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "MemoryBarrier2KHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MemoryBarrier2KHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = MemoryBarrier2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_BARRIER_2
		}
		
		fun calloc(allocator: Allocator) = MemoryBarrier2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_BARRIER_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.MEMORY_BARRIER_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.MEMORY_BARRIER_2 }
		}
	
	}


}