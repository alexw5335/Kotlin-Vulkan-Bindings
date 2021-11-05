// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkShadingRatePaletteNV {
 *         uint32_t                      shadingRatePaletteEntryCount
 *         VkShadingRatePaletteEntryNV*  pShadingRatePaletteEntries
 *     }
 */
@JvmInline
value class ShadingRatePalette(override val address: Long) : Addressable {
	
	
	var shadingRatePaletteEntryCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pShadingRatePaletteEntries: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	var shadingRatePaletteEntries: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 8), shadingRatePaletteEntryCount)
		set(value) { Unsafe.setLong(address + 8, value.address); shadingRatePaletteEntryCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ShadingRatePalette(offset(index))
		
		operator fun set(index: Int, value: ShadingRatePalette) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (ShadingRatePalette) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ShadingRatePalette) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ShadingRatePalette) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}