// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     storageTexelBufferOffsetAlignmentBytes
 *         VkBool32         storageTexelBufferOffsetSingleTexelAlignment
 *         VkDeviceSize     uniformTexelBufferOffsetAlignmentBytes
 *         VkBool32         uniformTexelBufferOffsetSingleTexelAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceTexelBufferAlignmentProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var storageTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var storageTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var uniformTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var uniformTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)


}