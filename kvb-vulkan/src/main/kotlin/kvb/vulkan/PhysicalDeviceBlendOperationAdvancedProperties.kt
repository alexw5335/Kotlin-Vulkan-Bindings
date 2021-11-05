// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         advancedBlendMaxColorAttachments
 *         VkBool32         advancedBlendIndependentBlend
 *         VkBool32         advancedBlendNonPremultipliedSrcColor
 *         VkBool32         advancedBlendNonPremultipliedDstColor
 *         VkBool32         advancedBlendCorrelatedOverlap
 *         VkBool32         advancedBlendAllOperations
 *     }
 */
@JvmInline
value class PhysicalDeviceBlendOperationAdvancedProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var advancedBlendMaxColorAttachments: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var advancedBlendIndependentBlend: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var advancedBlendNonPremultipliedSrcColor: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var advancedBlendNonPremultipliedDstColor: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var advancedBlendCorrelatedOverlap: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var advancedBlendAllOperations: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)


}