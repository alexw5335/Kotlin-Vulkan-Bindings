// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_multi_draw

 *     struct VkMultiDrawIndexedInfoEXT {
 *         uint32_t  firstIndex
 *         uint32_t  indexCount
 *         int32_t   vertexOffset
 *     }
 */
@JvmInline
value class MultiDrawIndexedInfo(override val address: Long) : Addressable {
	
	
	var firstIndex: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var indexCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var vertexOffset: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MultiDrawIndexedInfo(offset(index))
		
		operator fun set(index: Int, value: MultiDrawIndexedInfo) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (MultiDrawIndexedInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MultiDrawIndexedInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MultiDrawIndexedInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}