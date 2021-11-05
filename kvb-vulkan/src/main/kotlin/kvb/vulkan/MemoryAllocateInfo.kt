// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkMemoryAllocateInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkDeviceSize     allocationSize
 *         uint32_t         memoryTypeIndex
 *     }
 * 
 *     Valid pNext types:
 *         - VkDedicatedAllocationMemoryAllocateInfoNV
 *         - VkExportMemoryAllocateInfoNV
 *         - VkImportMemoryWin32HandleInfoNV
 *         - VkExportMemoryWin32HandleInfoNV
 *         - VkExportMemoryAllocateInfo
 *         - VkImportMemoryWin32HandleInfoKHR
 *         - VkExportMemoryWin32HandleInfoKHR
 *         - VkImportMemoryZirconHandleInfoFUCHSIA
 *         - VkImportMemoryFdInfoKHR
 *         - VkMemoryAllocateFlagsInfo
 *         - VkMemoryDedicatedAllocateInfo
 *         - VkImportMemoryHostPointerInfoEXT
 *         - VkImportAndroidHardwareBufferInfoANDROID
 *         - VkMemoryPriorityAllocateInfoEXT
 *         - VkMemoryOpaqueCaptureAddressAllocateInfo
 */
@JvmInline
value class MemoryAllocateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var allocationSize: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var memoryTypeIndex: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}