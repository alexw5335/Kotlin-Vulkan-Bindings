// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDrmFormatModifierPropertiesEXT {
 *         uint64_t              drmFormatModifier
 *         uint32_t              drmFormatModifierPlaneCount
 *         VkFormatFeatureFlags  drmFormatModifierTilingFeatures
 *     }
 */
@JvmInline
value class DrmFormatModifierProperties(override val address: Long) : Addressable {
	
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var drmFormatModifierPlaneCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var drmFormatModifierTilingFeatures: FormatFeatureFlags
		get()      = FormatFeatureFlags(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DrmFormatModifierProperties(offset(index))
		
		operator fun set(index: Int, value: DrmFormatModifierProperties) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (DrmFormatModifierProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DrmFormatModifierProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DrmFormatModifierProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}