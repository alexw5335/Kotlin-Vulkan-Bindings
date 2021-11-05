// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkExternalSemaphoreProperties {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkExternalSemaphoreHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalSemaphoreHandleTypeFlags  compatibleHandleTypes
 *         VkExternalSemaphoreFeatureFlags     externalSemaphoreFeatures
 *     }
 */
@JvmInline
value class ExternalSemaphoreProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var exportFromImportedHandleTypes: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var compatibleHandleTypes: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var externalSemaphoreFeatures: ExternalSemaphoreFeatureFlags
		get()      = ExternalSemaphoreFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}