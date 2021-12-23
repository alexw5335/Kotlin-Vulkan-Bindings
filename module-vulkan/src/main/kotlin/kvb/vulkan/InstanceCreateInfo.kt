// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkInstanceCreateInfo {
 *         VkStructureType        sType
 *         void*                  pNext
 *         VkInstanceCreateFlags  flags (reserved, must be zero)
 *         VkApplicationInfo*     pApplicationInfo
 *         uint32_t               enabledLayerCount
 *         char**                 ppEnabledLayerNames
 *         uint32_t               enabledExtensionCount
 *         char**                 ppEnabledExtensionNames
 *     }
 * 
 *     Valid pNext types:
 *         - VkDebugReportCallbackCreateInfoEXT
 *         - VkValidationFlagsEXT
 *         - VkValidationFeaturesEXT
 *         - VkDebugUtilsMessengerCreateInfoEXT
 */
@JvmInline
value class InstanceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pApplicationInfo: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var enabledLayerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var ppEnabledLayerNames: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var enabledExtensionCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var ppEnabledExtensionNames: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var applicationInfo: ApplicationInfo
		get()      = ApplicationInfo(Unsafe.getLong(address + 24))
		set(value) { Unsafe.setLong(address + 24, value.address) }
	
	var enabledLayerNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), enabledLayerCount)
		set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
	
	var enabledExtensionNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), enabledExtensionCount)
		set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }


}