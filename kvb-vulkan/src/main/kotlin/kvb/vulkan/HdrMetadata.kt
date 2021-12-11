// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkHdrMetadataEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkXYColorEXT     displayPrimaryRed
 *         VkXYColorEXT     displayPrimaryGreen
 *         VkXYColorEXT     displayPrimaryBlue
 *         VkXYColorEXT     whitePoint
 *         float            maxLuminance
 *         float            minLuminance
 *         float            maxContentLightLevel
 *         float            maxFrameAverageLightLevel
 *     }
 */
@JvmInline
value class HdrMetadata(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var displayPrimaryRed: XYColor
		get()      = XYColor(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var displayPrimaryGreen: XYColor
		get()      = XYColor(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var displayPrimaryBlue: XYColor
		get()      = XYColor(address + 32)
		set(value) = Unsafe.copy(value.address, address + 32, 8)
	
	var whitePoint: XYColor
		get()      = XYColor(address + 40)
		set(value) = Unsafe.copy(value.address, address + 40, 8)
	
	var maxLuminance: Float
		get()      = Unsafe.getFloat(address + 48)
		set(value) = Unsafe.setFloat(address + 48, value)
	
	var minLuminance: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var maxContentLightLevel: Float
		get()      = Unsafe.getFloat(address + 56)
		set(value) = Unsafe.setFloat(address + 56, value)
	
	var maxFrameAverageLightLevel: Float
		get()      = Unsafe.getFloat(address + 60)
		set(value) = Unsafe.setFloat(address + 60, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 64
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = HdrMetadata(offset(index))
		
		operator fun set(index: Int, value: HdrMetadata) = Unsafe.copy(value.address, offset(index), 64)
		
		inline fun forEach(block: (HdrMetadata) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (HdrMetadata) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, HdrMetadata) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}