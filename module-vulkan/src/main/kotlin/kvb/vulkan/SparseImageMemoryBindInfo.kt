// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkSparseImageMemoryBindInfo {
 *         VkImage                   image
 *         uint32_t                  bindCount
 *         VkSparseImageMemoryBind*  pBinds
 *     }
 */
@JvmInline
value class SparseImageMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pBinds: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var binds: SparseImageMemoryBind.Buffer
		get()      = SparseImageMemoryBind.Buffer(Unsafe.getLong(address + 16), bindCount)
		set(value) { Unsafe.setLong(address + 16, value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryBindInfo) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (SparseImageMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryBindInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}