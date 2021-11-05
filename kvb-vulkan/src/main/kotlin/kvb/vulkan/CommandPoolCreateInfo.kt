// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkCommandPoolCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkCommandPoolCreateFlags  flags
 *         uint32_t                  queueFamilyIndex
 *     }
 */
@JvmInline
value class CommandPoolCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: CommandPoolCreateFlags
		get()      = CommandPoolCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var queueFamilyIndex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}