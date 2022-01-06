// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkPhysicalDeviceDepthStencilResolveProperties {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkResolveModeFlags  supportedDepthResolveModes
 *         VkResolveModeFlags  supportedStencilResolveModes
 *         VkBool32            independentResolveNone
 *         VkBool32            independentResolve
 *     }
 */
@JvmInline
value class PhysicalDeviceDepthStencilResolveProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}