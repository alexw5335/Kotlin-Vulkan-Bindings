// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceVulkan11Properties {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         uint8_t                  deviceUUID[16]
 *         uint8_t                  driverUUID[16]
 *         uint8_t                  deviceLUID[8]
 *         uint32_t                 deviceNodeMask
 *         VkBool32                 deviceLUIDValid
 *         uint32_t                 subgroupSize
 *         VkShaderStageFlags       subgroupSupportedStages
 *         VkSubgroupFeatureFlags   subgroupSupportedOperations
 *         VkBool32                 subgroupQuadOperationsInAllStages
 *         VkPointClippingBehavior  pointClippingBehavior
 *         uint32_t                 maxMultiviewViewCount
 *         uint32_t                 maxMultiviewInstanceIndex
 *         VkBool32                 protectedNoFault
 *         uint32_t                 maxPerSetDescriptors
 *         VkDeviceSize             maxMemoryAllocationSize
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan11Properties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var deviceUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 16)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var driverUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 32, 16)
		set(value) = Unsafe.copy(value.address, address + 32, value.byteSize)
	
	var deviceLUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 48, 8)
		set(value) = Unsafe.copy(value.address, address + 48, value.byteSize)
	
	var deviceNodeMask: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var deviceLUIDValid: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var subgroupSupportedStages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 68))
		set(value) = Unsafe.setInt(address + 68, value.value)
	
	var subgroupSupportedOperations: SubgroupFeatureFlags
		get()      = SubgroupFeatureFlags(Unsafe.getInt(address + 72))
		set(value) = Unsafe.setInt(address + 72, value.value)
	
	var subgroupQuadOperationsInAllStages: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var pointClippingBehavior: PointClippingBehavior
		get()      = PointClippingBehavior.values().first { it.value == Unsafe.getInt(address + 80) }
		set(value) = Unsafe.setInt(address + 80, value.value)
	
	var maxMultiviewViewCount: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxMultiviewInstanceIndex: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var protectedNoFault: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxPerSetDescriptors: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxMemoryAllocationSize: Long
		get()      = Unsafe.getLong(address + 104)
		set(value) = Unsafe.setLong(address + 104, value)


}