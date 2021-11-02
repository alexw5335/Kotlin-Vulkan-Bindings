// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPerformanceCounterKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkPerformanceCounterUnitKHR     unit
 *         VkPerformanceCounterScopeKHR    scope
 *         VkPerformanceCounterStorageKHR  storage
 *         uint8_t                         uuid[16]
 *     }
 */
@JvmInline
value class PerformanceCounter(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var unit: PerformanceCounterUnit
		get()      = PerformanceCounterUnit.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var scope: PerformanceCounterScope
		get()      = PerformanceCounterScope.values().first { it.value == Unsafe.getInt(address + 20) }
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var storage: PerformanceCounterStorage
		get()      = PerformanceCounterStorage.values().first { it.value == Unsafe.getInt(address + 24) }
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var uuid: DirectByteBuffer
		get()      = DirectByteBuffer(address + 28, 16)
		set(value) = Unsafe.copy(value.address, address + 28, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PerformanceCounter(offset(index))
		
		operator fun set(index: Int, value: PerformanceCounter) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (PerformanceCounter) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PerformanceCounter) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PerformanceCounter) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}