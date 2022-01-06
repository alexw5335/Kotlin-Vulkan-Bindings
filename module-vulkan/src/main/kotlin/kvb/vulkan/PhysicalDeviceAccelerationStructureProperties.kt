// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_acceleration_structure

 *     struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         maxGeometryCount
 *         uint64_t         maxInstanceCount
 *         uint64_t         maxPrimitiveCount
 *         uint32_t         maxPerStageDescriptorAccelerationStructures
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindAccelerationStructures
 *         uint32_t         maxDescriptorSetAccelerationStructures
 *         uint32_t         maxDescriptorSetUpdateAfterBindAccelerationStructures
 *         uint32_t         minAccelerationStructureScratchOffsetAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceAccelerationStructureProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxGeometryCount: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var maxInstanceCount: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var maxPrimitiveCount: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var maxPerStageDescriptorAccelerationStructures: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var maxPerStageDescriptorUpdateAfterBindAccelerationStructures: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxDescriptorSetAccelerationStructures: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxDescriptorSetUpdateAfterBindAccelerationStructures: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var minAccelerationStructureScratchOffsetAlignment: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}