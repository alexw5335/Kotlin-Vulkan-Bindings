// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkImageMemoryBarrier {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkAccessFlags            srcAccessMask
 *         VkAccessFlags            dstAccessMask
 *         VkImageLayout            oldLayout
 *         VkImageLayout            newLayout
 *         uint32_t                 srcQueueFamilyIndex
 *         uint32_t                 dstQueueFamilyIndex
 *         VkImage                  image
 *         VkImageSubresourceRange  subresourceRange
 *     }
 * 
 *     Valid pNext types:
 *         - VkSampleLocationsInfoEXT
 */
@JvmInline
value class ImageMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var oldLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var newLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 20)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 72
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: ImageMemoryBarrier) = Unsafe.copy(value.address, offset(index), 72)
		
		inline fun forEach(block: (ImageMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageMemoryBarrier) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}