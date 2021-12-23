// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceImageDrmFormatModifierInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         drmFormatModifier
 *         VkSharingMode    sharingMode
 *         uint32_t         queueFamilyIndexCount
 *         uint32_t*        pQueueFamilyIndices
 *     }
 */
@JvmInline
value class PhysicalDeviceImageDrmFormatModifierInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var drmFormatModifier: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var sharingMode: SharingMode
		get()      = _SharingMode(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var queueFamilyIndexCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pQueueFamilyIndices: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var queueFamilyIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 32), queueFamilyIndexCount)
		set(value) { Unsafe.setLong(address + 32, value.address); queueFamilyIndexCount = value.capacity }


}