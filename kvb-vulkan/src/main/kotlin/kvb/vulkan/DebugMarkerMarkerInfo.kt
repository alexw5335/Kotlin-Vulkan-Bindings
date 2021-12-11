// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDebugMarkerMarkerInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char*            pMarkerName
 *         float            color[4]
 *     }
 */
@JvmInline
value class DebugMarkerMarkerInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pMarkerName: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var color: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 24, 4)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	
	
	var markerName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)


}