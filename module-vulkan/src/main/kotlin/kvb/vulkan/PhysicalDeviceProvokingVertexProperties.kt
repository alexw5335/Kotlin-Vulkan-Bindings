// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_provoking_vertex

 *     struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         provokingVertexModePerPipeline
 *         VkBool32         transformFeedbackPreservesTriangleFanProvokingVertex
 *     }
 */
@JvmInline
value class PhysicalDeviceProvokingVertexProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var provokingVertexModePerPipeline: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var transformFeedbackPreservesTriangleFanProvokingVertex: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)


}