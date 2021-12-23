// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSubmitInfo2KHR {
 *         VkStructureType                sType
 *         void*                          pNext
 *         VkSubmitFlagsKHR               flags
 *         uint32_t                       waitSemaphoreInfoCount
 *         VkSemaphoreSubmitInfoKHR*      pWaitSemaphoreInfos
 *         uint32_t                       commandBufferInfoCount
 *         VkCommandBufferSubmitInfoKHR*  pCommandBufferInfos
 *         uint32_t                       signalSemaphoreInfoCount
 *         VkSemaphoreSubmitInfoKHR*      pSignalSemaphoreInfos
 *     }
 * 
 *     Valid pNext types:
 *         - VkWin32KeyedMutexAcquireReleaseInfoNV
 *         - VkWin32KeyedMutexAcquireReleaseInfoKHR
 *         - VkPerformanceQuerySubmitInfoKHR
 */
@JvmInline
value class SubmitInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: SubmitFlags
		get()      = SubmitFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var waitSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pWaitSemaphoreInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var commandBufferInfoCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pCommandBufferInfos: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var signalSemaphoreInfoCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pSignalSemaphoreInfos: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var waitSemaphoreInfos: SemaphoreSubmitInfo.Buffer
		get()      = SemaphoreSubmitInfo.Buffer(Unsafe.getLong(address + 24), waitSemaphoreInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreInfoCount = value.capacity }
	
	var commandBufferInfos: CommandBufferSubmitInfo.Buffer
		get()      = CommandBufferSubmitInfo.Buffer(Unsafe.getLong(address + 40), commandBufferInfoCount)
		set(value) { Unsafe.setLong(address + 40, value.address); commandBufferInfoCount = value.capacity }
	
	var signalSemaphoreInfos: SemaphoreSubmitInfo.Buffer
		get()      = SemaphoreSubmitInfo.Buffer(Unsafe.getLong(address + 56), signalSemaphoreInfoCount)
		set(value) { Unsafe.setLong(address + 56, value.address); signalSemaphoreInfoCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubmitInfo2(offset(index))
		
		operator fun set(index: Int, value: SubmitInfo2) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SubmitInfo2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubmitInfo2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubmitInfo2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}