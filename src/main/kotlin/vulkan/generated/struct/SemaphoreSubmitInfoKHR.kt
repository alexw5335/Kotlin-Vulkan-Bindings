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
 *     struct VkSemaphoreSubmitInfoKHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkSemaphore               semaphore
 *         uint64_t                  value
 *         VkPipelineStageFlags2KHR  stageMask
 *         uint32_t                  deviceIndex
 *     }
 */
@JvmInline
value class SemaphoreSubmitInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var value: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var stageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value.bitfield) }
	
	var deviceIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SemaphoreSubmitInfoKHR(offset(index))
		
		operator fun set(index: Int, value: SemaphoreSubmitInfoKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SemaphoreSubmitInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SemaphoreSubmitInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SemaphoreSubmitInfoKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SemaphoreSubmitInfoKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SemaphoreSubmitInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_SUBMIT_INFO
		}
		
		fun calloc(allocator: Allocator) = SemaphoreSubmitInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SEMAPHORE_SUBMIT_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SEMAPHORE_SUBMIT_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SEMAPHORE_SUBMIT_INFO }
		}
	
	}


}