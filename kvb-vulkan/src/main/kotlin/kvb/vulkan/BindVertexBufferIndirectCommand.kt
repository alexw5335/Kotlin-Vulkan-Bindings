// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkBindVertexBufferIndirectCommandNV {
 *         VkDeviceAddress  bufferAddress
 *         uint32_t         size
 *         uint32_t         stride
 *     }
 */
@JvmInline
value class BindVertexBufferIndirectCommand(override val address: Long) : Addressable {
	
	
	var bufferAddress: Long
		get()      = Unsafe.getLong(address + 0)
		set(value) = Unsafe.setLong(address + 0, value)
	
	var size: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var stride: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)


}