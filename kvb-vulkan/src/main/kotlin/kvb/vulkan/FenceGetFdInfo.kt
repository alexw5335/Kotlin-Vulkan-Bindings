// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFenceGetFdInfoKHR {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkFence                            fence
 *         VkExternalFenceHandleTypeFlagBits  handleType
 *     }
 */
@JvmInline
value class FenceGetFdInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var fence: FenceH
		get()      = FenceH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var handleType: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}