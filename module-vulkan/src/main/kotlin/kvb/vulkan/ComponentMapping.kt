// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkComponentMapping {
 *         VkComponentSwizzle  r
 *         VkComponentSwizzle  g
 *         VkComponentSwizzle  b
 *         VkComponentSwizzle  a
 *     }
 */
@JvmInline
value class ComponentMapping(override val address: Long) : Addressable {
	
	
	var r: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var g: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var b: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var a: ComponentSwizzle
		get()      = _ComponentSwizzle(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)


}