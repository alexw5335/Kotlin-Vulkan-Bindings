// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         accelerationStructure
 *         VkBool32         accelerationStructureCaptureReplay
 *         VkBool32         accelerationStructureIndirectBuild
 *         VkBool32         accelerationStructureHostCommands
 *         VkBool32         descriptorBindingAccelerationStructureUpdateAfterBind
 *     }
 */
@JvmInline
value class PhysicalDeviceAccelerationStructureFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var accelerationStructure: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var accelerationStructureCaptureReplay: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var accelerationStructureIndirectBuild: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var accelerationStructureHostCommands: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var descriptorBindingAccelerationStructureUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}