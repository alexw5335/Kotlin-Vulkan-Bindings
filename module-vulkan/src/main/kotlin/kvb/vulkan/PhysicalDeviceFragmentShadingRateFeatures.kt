// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceFragmentShadingRateFeaturesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         pipelineFragmentShadingRate
 *         VkBool32         primitiveFragmentShadingRate
 *         VkBool32         attachmentFragmentShadingRate
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentShadingRateFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pipelineFragmentShadingRate: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var primitiveFragmentShadingRate: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var attachmentFragmentShadingRate: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}