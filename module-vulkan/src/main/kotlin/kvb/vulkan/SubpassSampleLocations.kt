// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_sample_locations

 *     struct VkSubpassSampleLocationsEXT {
 *         uint32_t                  subpassIndex
 *         VkSampleLocationsInfoEXT  sampleLocationsInfo
 *     }
 */
@JvmInline
value class SubpassSampleLocations(override val address: Long) : Addressable {
	
	
	var subpassIndex: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var sampleLocationsInfo: SampleLocationsInfo
		get()      = SampleLocationsInfo(address + 8)
		set(value) = Unsafe.copy(value.address, address + 8, 40)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassSampleLocations(offset(index))
		
		operator fun set(index: Int, value: SubpassSampleLocations) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SubpassSampleLocations) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassSampleLocations) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassSampleLocations) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}