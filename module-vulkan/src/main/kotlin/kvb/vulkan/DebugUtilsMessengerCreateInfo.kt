// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDebugUtilsMessengerCreateInfoEXT {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkDebugUtilsMessengerCreateFlagsEXT   flags (reserved, must be zero)
 *         VkDebugUtilsMessageSeverityFlagsEXT   messageSeverity
 *         VkDebugUtilsMessageTypeFlagsEXT       messageType
 *         PFN_vkDebugUtilsMessengerCallbackEXT  pfnUserCallback
 *         void*                                 pUserData
 *     }
 */
@JvmInline
value class DebugUtilsMessengerCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var messageSeverity: DebugUtilsMessageSeverityFlags
		get()      = DebugUtilsMessageSeverityFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var messageType: DebugUtilsMessageTypeFlags
		get()      = DebugUtilsMessageTypeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var pfnUserCallback: PFN_vkDebugUtilsMessengerCallbackEXT
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pUserData: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)


}