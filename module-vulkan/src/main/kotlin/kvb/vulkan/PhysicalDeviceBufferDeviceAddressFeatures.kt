// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceBufferDeviceAddressFeatures {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         bufferDeviceAddress
 *         VkBool32         bufferDeviceAddressCaptureReplay
 *         VkBool32         bufferDeviceAddressMultiDevice
 *     }
 */
@JvmInline
value class PhysicalDeviceBufferDeviceAddressFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var bufferDeviceAddress: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var bufferDeviceAddressCaptureReplay: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var bufferDeviceAddressMultiDevice: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}