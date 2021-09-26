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
 *     struct VkSubmitInfo2KHR {
 *         VkStructureType                 sType
 *         void*                           pNext
 *         VkSubmitFlagsKHR                flags
 *         uint32_t                        waitSemaphoreInfoCount
 *         VkSemaphoreSubmitInfoKHR**      pWaitSemaphoreInfos
 *         uint32_t                        commandBufferInfoCount
 *         VkCommandBufferSubmitInfoKHR**  pCommandBufferInfos
 *         uint32_t                        signalSemaphoreInfoCount
 *         VkSemaphoreSubmitInfoKHR**      pSignalSemaphoreInfos
 *     }
 */
@JvmInline
value class SubmitInfo2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: SubmitFlags
		get()      = SubmitFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var waitSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pWaitSemaphoreInfos: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var commandBufferInfoCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pCommandBufferInfos: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var signalSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pSignalSemaphoreInfos: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	
	
	var waitSemaphoreInfos: SemaphoreSubmitInfoKHR.Buffer
		get()      = SemaphoreSubmitInfoKHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), waitSemaphoreInfoCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); waitSemaphoreInfoCount = value.capacity }
	
	var commandBufferInfos: CommandBufferSubmitInfoKHR.Buffer
		get()      = CommandBufferSubmitInfoKHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), commandBufferInfoCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); commandBufferInfoCount = value.capacity }
	
	var signalSemaphoreInfos: SemaphoreSubmitInfoKHR.Buffer
		get()      = SemaphoreSubmitInfoKHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), signalSemaphoreInfoCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); signalSemaphoreInfoCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SubmitInfo2KHR(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo2KHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SubmitInfo2KHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo2KHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SubmitInfo2KHR[$capacity]"
	
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
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubmitInfo2KHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SubmitInfo2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBMIT_INFO_2
		}
		
		fun calloc(allocator: Allocator) = SubmitInfo2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBMIT_INFO_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBMIT_INFO_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBMIT_INFO_2 }
		}
	
	}


}