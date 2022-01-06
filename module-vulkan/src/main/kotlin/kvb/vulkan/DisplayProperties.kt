// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_display

 *     struct VkDisplayPropertiesKHR {
 *         VkDisplayKHR                display
 *         char*                       displayName
 *         VkExtent2D                  physicalDimensions
 *         VkExtent2D                  physicalResolution
 *         VkSurfaceTransformFlagsKHR  supportedTransforms
 *         VkBool32                    planeReorderPossible
 *         VkBool32                    persistentContent
 *     }
 */
@JvmInline
value class DisplayProperties(override val address: Long) : Addressable {
	
	
	var display: DisplayH
		get()      = DisplayH(Unsafe.getLong(address + 0))
		set(value) = Unsafe.setLong(address + 0, value.address)
	
	var displayName: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var physicalDimensions: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var physicalResolution: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var supportedTransforms: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var planeReorderPossible: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var persistentContent: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DisplayProperties(offset(index))
		
		operator fun set(index: Int, value: DisplayProperties) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (DisplayProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DisplayProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}