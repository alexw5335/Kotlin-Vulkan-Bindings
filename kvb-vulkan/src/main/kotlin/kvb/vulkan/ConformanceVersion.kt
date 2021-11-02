// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkConformanceVersion {
 *         uint8_t  major
 *         uint8_t  minor
 *         uint8_t  subminor
 *         uint8_t  patch
 *     }
 */
@JvmInline
value class ConformanceVersion(override val address: Long) : Addressable {
	
	
	var major: Byte
		get()      = Unsafe.getByte(address + 0)
		set(value) = Unsafe.setByte(address + 0, value)
	
	var minor: Byte
		get()      = Unsafe.getByte(address + 1)
		set(value) = Unsafe.setByte(address + 1, value)
	
	var subminor: Byte
		get()      = Unsafe.getByte(address + 2)
		set(value) = Unsafe.setByte(address + 2, value)
	
	var patch: Byte
		get()      = Unsafe.getByte(address + 3)
		set(value) = Unsafe.setByte(address + 3, value)


}