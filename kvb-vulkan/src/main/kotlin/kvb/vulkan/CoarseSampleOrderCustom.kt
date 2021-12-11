// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkCoarseSampleOrderCustomNV {
 *         VkShadingRatePaletteEntryNV  shadingRate
 *         uint32_t                     sampleCount
 *         uint32_t                     sampleLocationCount
 *         VkCoarseSampleLocationNV*    pSampleLocations
 *     }
 */
@JvmInline
value class CoarseSampleOrderCustom(override val address: Long) : Addressable {
	
	
	var shadingRate: ShadingRatePaletteEntry
		get()      = _ShadingRatePaletteEntry(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var sampleCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var sampleLocationCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var pSampleLocations: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	
	
	var sampleLocations: CoarseSampleLocation.Buffer
		get()      = CoarseSampleLocation.Buffer(Unsafe.getLong(address + 16), sampleLocationCount)
		set(value) { Unsafe.setLong(address + 16, value.address); sampleLocationCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = CoarseSampleOrderCustom(offset(index))
		
		operator fun set(index: Int, value: CoarseSampleOrderCustom) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (CoarseSampleOrderCustom) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CoarseSampleOrderCustom) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, CoarseSampleOrderCustom) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}