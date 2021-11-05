// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe

/**
 *     struct VkSparseImageMemoryBind {
 *         VkImageSubresource       subresource
 *         VkOffset3D               offset
 *         VkExtent3D               extent
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseImageMemoryBind(override val address: Long) : Addressable {
	
	
	var subresource: ImageSubresource
		get()      = ImageSubresource(address + 0)
		set(value) = Unsafe.copy(value.address, address + 0, 12)
	
	var offset: Offset3D
		get()      = Offset3D(address + 12)
		set(value) = Unsafe.copy(value.address, address + 12, 12)
	
	var extent: Extent3D
		get()      = Extent3D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 12)
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + 56))
		set(value) = Unsafe.setInt(address + 56, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SparseImageMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryBind) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (SparseImageMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SparseImageMemoryBind) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}