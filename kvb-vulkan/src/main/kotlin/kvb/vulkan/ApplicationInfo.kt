// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer

/**
 *     struct VkApplicationInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char*            pApplicationName
 *         uint32_t         applicationVersion
 *         char*            pEngineName
 *         uint32_t         engineVersion
 *         uint32_t         apiVersion
 *     }
 */
@JvmInline
value class ApplicationInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pApplicationName: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var applicationVersion: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pEngineName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var engineVersion: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var apiVersion: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	
	
	var applicationName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var engineName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)


}