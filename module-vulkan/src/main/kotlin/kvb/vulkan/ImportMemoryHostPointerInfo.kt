// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_external_memory_host

 *     struct VkImportMemoryHostPointerInfoEXT {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalMemoryHandleTypeFlagBits  handleType
 *         void*                               pHostPointer
 *     }
 */
@JvmInline
value class ImportMemoryHostPointerInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pHostPointer: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}