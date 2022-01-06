// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_ARM_rasterization_order_attachment_access

 *     struct VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         rasterizationOrderColorAttachmentAccess
 *         VkBool32         rasterizationOrderDepthAttachmentAccess
 *         VkBool32         rasterizationOrderStencilAttachmentAccess
 *     }
 */
@JvmInline
value class PhysicalDeviceRasterizationOrderAttachmentAccessFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var rasterizationOrderColorAttachmentAccess: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rasterizationOrderDepthAttachmentAccess: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var rasterizationOrderStencilAttachmentAccess: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}