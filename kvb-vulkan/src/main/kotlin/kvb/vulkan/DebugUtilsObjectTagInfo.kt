// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDebugUtilsObjectTagInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkObjectType     objectType
 *         uint64_t         objectHandle
 *         uint64_t         tagName
 *         size_t           tagSize
 *         void*            pTag
 *     }
 */
@JvmInline
value class DebugUtilsObjectTagInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var tagName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var tagSize: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pTag: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var tag: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 48), tagSize.toInt())
		set(value) { Unsafe.setLong(address + 48, value.address); tagSize = value.capacity.toLong() }


}