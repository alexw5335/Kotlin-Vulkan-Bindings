// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkBindSparseInfo {
 *         VkStructureType                     sType
 *         void*                               pNext
 *         uint32_t                            waitSemaphoreCount
 *         VkSemaphore*                        pWaitSemaphores
 *         uint32_t                            bufferBindCount
 *         VkSparseBufferMemoryBindInfo*       pBufferBinds
 *         uint32_t                            imageOpaqueBindCount
 *         VkSparseImageOpaqueMemoryBindInfo*  pImageOpaqueBinds
 *         uint32_t                            imageBindCount
 *         VkSparseImageMemoryBindInfo*        pImageBinds
 *         uint32_t                            signalSemaphoreCount
 *         VkSemaphore*                        pSignalSemaphores
 *     }
 * 
 *     Valid pNext types:
 *         - VkDeviceGroupBindSparseInfo
 *         - VkTimelineSemaphoreSubmitInfo
 */
@JvmInline
value class BindSparseInfo(override val address: Long) : Addressable {
	
	
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
	
	var bufferBindCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pBufferBinds: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var imageOpaqueBindCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pImageOpaqueBinds: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var imageBindCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pImageBinds: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var signalSemaphoreCount: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var pSignalSemaphores: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)
	
	
	
	var waitSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), waitSemaphoreCount)
		set(value) { Unsafe.setLong(address + 24, value.address); waitSemaphoreCount = value.capacity }
	
	var bufferBinds: SparseBufferMemoryBindInfo.Buffer
		get()      = SparseBufferMemoryBindInfo.Buffer(Unsafe.getLong(address + 40), bufferBindCount)
		set(value) { Unsafe.setLong(address + 40, value.address); bufferBindCount = value.capacity }
	
	var imageOpaqueBinds: SparseImageOpaqueMemoryBindInfo.Buffer
		get()      = SparseImageOpaqueMemoryBindInfo.Buffer(Unsafe.getLong(address + 56), imageOpaqueBindCount)
		set(value) { Unsafe.setLong(address + 56, value.address); imageOpaqueBindCount = value.capacity }
	
	var imageBinds: SparseImageMemoryBindInfo.Buffer
		get()      = SparseImageMemoryBindInfo.Buffer(Unsafe.getLong(address + 72), imageBindCount)
		set(value) { Unsafe.setLong(address + 72, value.address); imageBindCount = value.capacity }
	
	var signalSemaphores: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 88), signalSemaphoreCount)
		set(value) { Unsafe.setLong(address + 88, value.address); signalSemaphoreCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = BindSparseInfo(offset(index))
		
		operator fun set(index: Int, value: BindSparseInfo) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (BindSparseInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindSparseInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, BindSparseInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}