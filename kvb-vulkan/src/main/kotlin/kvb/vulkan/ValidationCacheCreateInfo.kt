// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkValidationCacheCreateInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         VkValidationCacheCreateFlagsEXT  flags (reserved, must be zero)
 *         size_t                           initialDataSize
 *         void*                            pInitialData
 *     }
 */
@JvmInline
value class ValidationCacheCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var initialDataSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pInitialData: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var initialData: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), initialDataSize.toInt())
		set(value) { Unsafe.setLong(address + 32, value.address); initialDataSize = value.capacity.toLong() }


}