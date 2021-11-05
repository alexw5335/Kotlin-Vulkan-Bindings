// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

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
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var rowPitch: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var arrayPitch: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var depthPitch: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubresourceLayout(offset(index))
		
		operator fun set(index: Int, value: SubresourceLayout) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (SubresourceLayout) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubresourceLayout) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubresourceLayout) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}