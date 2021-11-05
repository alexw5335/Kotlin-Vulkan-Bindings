// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkSubmitInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         uint32_t               waitSemaphoreCount
 *         VkSemaphore*           pWaitSemaphores
 *         VkPipelineStageFlags*  pWaitDstStageMask
 *         uint32_t               commandBufferCount
 *         VkCommandBuffer*       pCommandBuffers
 *         uint32_t               signalSemaphoreCount
 *         VkSemaphore*           pSignalSemaphores
 *     }
 * 
 *     Valid pNext types:
 *         - VkWin32KeyedMutexAcquireReleaseInfoNV
 *         - VkWin32KeyedMutexAcquireReleaseInfoKHR
 *         - VkD3D12FenceSubmitInfoKHR
 *         - VkDeviceGroupSubmitInfo
 *         - VkProtectedSubmitInfo
 *         - VkTimelineSemaphoreSubmitInfo
 *         - VkPerformanceQuerySubmitInfoKHR
 */
@JvmInline
value class SubmitInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var waitSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pWaitSemaphores: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pWaitDstStageMask: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var commandBufferCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pCommandBuffers: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var waitDstStageMask: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 32, value.address); waitSemaphoreCount = value.capacity }
	
	var commandBuffers: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 48), commandBufferCount)
		set(value) { Unsafe.setLong(address + 48, value.address); commandBufferCount = value.capacity }
	
	var signalSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 64), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 64, value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubmitInfo(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (SubmitInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubmitInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}