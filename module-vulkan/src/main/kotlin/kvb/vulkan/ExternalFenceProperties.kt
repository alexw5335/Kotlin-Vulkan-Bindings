// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkExternalFenceProperties {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkExternalFenceHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalFenceHandleTypeFlags  compatibleHandleTypes
 *         VkExternalFenceFeatureFlags     externalFenceFeatures
 *     }
 */
@JvmInline
value class ExternalFenceProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var exportFromImportedHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var compatibleHandleTypes: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var externalFenceFeatures: ExternalFenceFeatureFlags
		get()      = ExternalFenceFeatureFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)


}