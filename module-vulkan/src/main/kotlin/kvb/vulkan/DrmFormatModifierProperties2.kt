// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_image_drm_format_modifier

 *     struct VkDrmFormatModifierProperties2EXT {
 *         uint64_t                  drmFormatModifier
 *         uint32_t                  drmFormatModifierPlaneCount
 *         VkFormatFeatureFlags2KHR  drmFormatModifierTilingFeatures
 *     }
 */
@JvmInline
value class DrmFormatModifierProperties2(override val address: Long) : Addressable {
	
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var drmFormatModifierPlaneCount: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var drmFormatModifierTilingFeatures: FormatFeatureFlags2
		get()      = FormatFeatureFlags2(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 24
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DrmFormatModifierProperties2(offset(index))
		
		operator fun set(index: Int, value: DrmFormatModifierProperties2) = Unsafe.copy(value.address, offset(index), 24)
		
		inline fun forEach(block: (DrmFormatModifierProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DrmFormatModifierProperties2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DrmFormatModifierProperties2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}