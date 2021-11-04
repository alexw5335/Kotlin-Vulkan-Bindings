// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkImportSemaphoreZirconHandleInfoFUCHSIA {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkSemaphore                            semaphore
 *         VkSemaphoreImportFlags                 flags
 *         VkExternalSemaphoreHandleTypeFlagBits  handleType
 *         zx_handle_t                            zirconHandle
 *     }
 */
@JvmInline
value class ImportSemaphoreZirconHandleInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var flags: SemaphoreImportFlags
		get()      = SemaphoreImportFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var handleType: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var zirconHandle: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}