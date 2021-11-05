// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkDeviceMemoryReportCallbackDataEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         VkDeviceMemoryReportFlagsEXT      flags (reserved, must be zero)
 *         VkDeviceMemoryReportEventTypeEXT  type
 *         uint64_t                          memoryObjectId
 *         VkDeviceSize                      size
 *         VkObjectType                      objectType
 *         uint64_t                          objectHandle
 *         uint32_t                          heapIndex
 *     }
 */
@JvmInline
value class DeviceMemoryReportCallbackData(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var type: DeviceMemoryReportEventType
		get()      = _DeviceMemoryReportEventType(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var memoryObjectId: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var size: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var heapIndex: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}