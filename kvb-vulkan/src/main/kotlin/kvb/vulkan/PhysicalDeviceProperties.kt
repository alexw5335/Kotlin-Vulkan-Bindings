// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceProperties {
 *         uint32_t                          apiVersion
 *         uint32_t                          driverVersion
 *         uint32_t                          vendorID
 *         uint32_t                          deviceID
 *         VkPhysicalDeviceType              deviceType
 *         char                              deviceName[256]
 *         uint8_t                           pipelineCacheUUID[16]
 *         VkPhysicalDeviceLimits            limits
 *         VkPhysicalDeviceSparseProperties  sparseProperties
 *     }
 */
@JvmInline
value class PhysicalDeviceProperties(override val address: Long) : Addressable {
	
	
	var apiVersion: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var driverVersion: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var vendorID: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var deviceID: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var deviceType: PhysicalDeviceType
		get()      = PhysicalDeviceType.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var deviceName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var pipelineCacheUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 16)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var limits: PhysicalDeviceLimits
		get()      = PhysicalDeviceLimits(address + 296)
		set(value) = Unsafe.copy(value.address, address + 296, 504)
	
	var sparseProperties: PhysicalDeviceSparseProperties
		get()      = PhysicalDeviceSparseProperties(address + 800)
		set(value) = Unsafe.copy(value.address, address + 800, 20)


}