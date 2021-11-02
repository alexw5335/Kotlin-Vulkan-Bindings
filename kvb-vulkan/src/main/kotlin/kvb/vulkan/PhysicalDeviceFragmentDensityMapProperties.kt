// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkExtent2D       minFragmentDensityTexelSize
 *         VkExtent2D       maxFragmentDensityTexelSize
 *         VkBool32         fragmentDensityInvocations
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentDensityMapProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minFragmentDensityTexelSize: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var maxFragmentDensityTexelSize: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var fragmentDensityInvocations: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}