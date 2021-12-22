// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDebugMarkerObjectNameInfoEXT {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkDebugReportObjectTypeEXT  objectType
 *         uint64_t                    object
 *         char*                       pObjectName
 *     }
 */
@JvmInline
value class DebugMarkerObjectNameInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var objectType: DebugReportObjectType
		get()      = _DebugReportObjectType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var object: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pObjectName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var objectName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)


}