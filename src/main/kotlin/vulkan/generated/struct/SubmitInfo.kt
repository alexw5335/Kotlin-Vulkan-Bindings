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
 *     struct VkSubmitInfo {
 *         VkStructureType         sType
 *         void*                   pNext
 *         uint32_t                waitSemaphoreCount
 *         VkSemaphore**           pWaitSemaphores
 *         VkPipelineStageFlags**  pWaitDstStageMask
 *         uint32_t                commandBufferCount
 *         VkCommandBuffer**       pCommandBuffers
 *         uint32_t                signalSemaphoreCount
 *         VkSemaphore**           pSignalSemaphores
 *     }
 */
@JvmInline
value class SubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var pWaitDstStageMask: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pCommandBuffers: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	
	
	var waitSemaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), waitSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); waitSemaphoreCount = value.capacity }
	
	var waitDstStageMask: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), waitSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); waitSemaphoreCount = value.capacity }
	
	var commandBuffers: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), commandBufferCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); commandBufferCount = value.capacity }
	
	var signalSemaphores: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), signalSemaphoreCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SubmitInfo(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SubmitInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SubmitInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SubmitInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBMIT_INFO
		}
		
		fun calloc(allocator: Allocator) = SubmitInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SUBMIT_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBMIT_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SUBMIT_INFO }
		}
	
	}


}