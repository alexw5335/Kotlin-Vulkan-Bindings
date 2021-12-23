// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImportMemoryZirconHandleInfoFUCHSIA {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalMemoryHandleTypeFlagBits  handleType
 *         zx_handle_t                         handle
 *     }
 */
@JvmInline
value class ImportMemoryZirconHandleInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var handleType: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var handle: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}