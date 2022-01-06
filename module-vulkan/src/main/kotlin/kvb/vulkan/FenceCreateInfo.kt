// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkFenceCreateInfo {
 *         VkStructureType     sType
 *         void*               pNext
 *         VkFenceCreateFlags  flags
 *     }
 * 
 *     Valid pNext types:
 *         - VkExportFenceCreateInfo
 *         - VkExportFenceWin32HandleInfoKHR
 */
@JvmInline
value class FenceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: FenceCreateFlags
		get()      = FenceCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)


}