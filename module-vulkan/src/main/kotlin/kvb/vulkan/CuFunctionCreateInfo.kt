// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NVX_binary_import

 *     struct VkCuFunctionCreateInfoNVX {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkCuModuleNVX    module
 *         char*            pName
 *     }
 */
@JvmInline
value class CuFunctionCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var module: CuModuleH
		get()      = CuModuleH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var pName: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var name:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)


}