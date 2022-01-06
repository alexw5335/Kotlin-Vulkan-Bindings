// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_workgroup_memory_explicit_layout

 *     struct VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         workgroupMemoryExplicitLayout
 *         VkBool32         workgroupMemoryExplicitLayoutScalarBlockLayout
 *         VkBool32         workgroupMemoryExplicitLayout8BitAccess
 *         VkBool32         workgroupMemoryExplicitLayout16BitAccess
 *     }
 */
@JvmInline
value class PhysicalDeviceWorkgroupMemoryExplicitLayoutFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var workgroupMemoryExplicitLayout: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var workgroupMemoryExplicitLayoutScalarBlockLayout: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var workgroupMemoryExplicitLayout8BitAccess: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var workgroupMemoryExplicitLayout16BitAccess: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)


}