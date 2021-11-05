// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceSparseProperties {
 *         VkBool32  residencyStandard2DBlockShape
 *         VkBool32  residencyStandard2DMultisampleBlockShape
 *         VkBool32  residencyStandard3DBlockShape
 *         VkBool32  residencyAlignedMipSize
 *         VkBool32  residencyNonResidentStrict
 *     }
 */
@JvmInline
value class PhysicalDeviceSparseProperties(override val address: Long) : Addressable {
	
	
	var residencyStandard2DBlockShape: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var residencyStandard2DMultisampleBlockShape: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var residencyStandard3DBlockShape: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var residencyAlignedMipSize: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var residencyNonResidentStrict: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}