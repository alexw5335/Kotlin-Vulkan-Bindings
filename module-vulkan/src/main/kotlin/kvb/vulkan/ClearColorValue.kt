// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     union VkClearColorValue {
 *         float     float32[4]
 *         int32_t   int32[4]
 *         uint32_t  uint32[4]
 *     }
 */
@JvmInline
value class ClearColorValue(override val address: Long) : Addressable {
	
	
	var float32: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var int32: DirectIntBuffer
		get()      = DirectIntBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var uint32: DirectIntBuffer
		get()      = DirectIntBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)


}