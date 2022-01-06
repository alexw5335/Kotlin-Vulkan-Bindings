// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NVX_binary_import

 *     struct VkCuModuleCreateInfoNVX {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         size_t           dataSize
 *         void*            pData
 *     }
 */
@JvmInline
value class CuModuleCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var dataSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var pData: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var data: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), dataSize.toInt())
		set(value) { Unsafe.setLong(address + 24, value.address); dataSize = value.capacity.toLong() }


}