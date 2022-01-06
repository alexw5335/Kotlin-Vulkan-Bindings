// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_1

 *     struct VkExternalMemoryProperties {
 *         VkExternalMemoryFeatureFlags     externalMemoryFeatures
 *         VkExternalMemoryHandleTypeFlags  exportFromImportedHandleTypes
 *         VkExternalMemoryHandleTypeFlags  compatibleHandleTypes
 *     }
 */
@JvmInline
value class ExternalMemoryProperties(override val address: Long) : Addressable {
	
	
	var externalMemoryFeatures: ExternalMemoryFeatureFlags
		get()      = ExternalMemoryFeatureFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var exportFromImportedHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var compatibleHandleTypes: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)


}