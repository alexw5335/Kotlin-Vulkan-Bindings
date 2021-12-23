// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImageMemoryBarrier2KHR {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkPipelineStageFlags2KHR  srcStageMask
 *         VkAccessFlags2KHR         srcAccessMask
 *         VkPipelineStageFlags2KHR  dstStageMask
 *         VkAccessFlags2KHR         dstAccessMask
 *         VkImageLayout             oldLayout
 *         VkImageLayout             newLayout
 *         uint32_t                  srcQueueFamilyIndex
 *         uint32_t                  dstQueueFamilyIndex
 *         VkImage                   image
 *         VkImageSubresourceRange   subresourceRange
 *     }
 * 
 *     Valid pNext types:
 *         - VkSampleLocationsInfoEXT
 */
@JvmInline
value class ImageMemoryBarrier2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	var srcAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags2
		get()      = PipelineStageFlags2(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.value)
	
	var dstAccessMask: AccessFlags2
		get()      = AccessFlags2(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.value)
	
	var oldLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 48))
		set(value) = Unsafe.setInt(address + 48, value.value)
	
	var newLayout: ImageLayout
		get()      = _ImageLayout(Unsafe.getInt(address + 52))
		set(value) = Unsafe.setInt(address + 52, value.value)
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var image: ImageH
		get()      = ImageH(Unsafe.getLong(address + 64))
		set(value) = Unsafe.setLong(address + 64, value.address)
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 20)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageMemoryBarrier2(offset(index))
		
		operator fun set(index: Int, value: ImageMemoryBarrier2) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (ImageMemoryBarrier2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageMemoryBarrier2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageMemoryBarrier2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}