// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImportFenceFdInfoKHR {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkFence                            fence
 *         VkFenceImportFlags                 flags
 *         VkExternalFenceHandleTypeFlagBits  handleType
 *         int                                fd
 *     }
 */
@JvmInline
value class ImportFenceFdInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var fence: FenceH
		get()      = FenceH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var flags: FenceImportFlags
		get()      = FenceImportFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var handleType: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var fd: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)


}