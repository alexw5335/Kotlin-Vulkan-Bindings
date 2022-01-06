// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_FUCHSIA_buffer_collection

 *     struct VkImageFormatConstraintsInfoFUCHSIA {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkImageCreateInfo                     imageCreateInfo
 *         VkFormatFeatureFlags                  requiredFormatFeatures
 *         VkImageFormatConstraintsFlagsFUCHSIA  flags (reserved, must be zero)
 *         uint64_t                              sysmemPixelFormat
 *         uint32_t                              colorSpaceCount
 *         VkSysmemColorSpaceFUCHSIA*            pColorSpaces
 *     }
 */
@JvmInline
value class ImageFormatConstraintsInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageCreateInfo: ImageCreateInfo
		get()      = ImageCreateInfo(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 88)
	
	var requiredFormatFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 104))
		set(value) = Unsafe.setInt(address + 104, value.value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var sysmemPixelFormat: Long
		get()      = Unsafe.getLong(address + 112)
		set(value) = Unsafe.setLong(address + 112, value)
	
	var colorSpaceCount: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var pColorSpaces: Long
		get()      = Unsafe.getLong(address + 128)
		set(value) = Unsafe.setLong(address + 128, value)
	
	
	
	var colorSpaces: SysmemColorSpace
		get()      = SysmemColorSpace(Unsafe.getLong(address + 128))
		set(value) { Unsafe.setLong(address + 128, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 136
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ImageFormatConstraintsInfo(offset(index))
		
		operator fun set(index: Int, value: ImageFormatConstraintsInfo) = Unsafe.copy(value.address, offset(index), 136)
		
		inline fun forEach(block: (ImageFormatConstraintsInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageFormatConstraintsInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ImageFormatConstraintsInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}