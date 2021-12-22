// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkValidationFeaturesEXT {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         uint32_t                        enabledValidationFeatureCount
 *         VkValidationFeatureEnableEXT*   pEnabledValidationFeatures
 *         uint32_t                        disabledValidationFeatureCount
 *         VkValidationFeatureDisableEXT*  pDisabledValidationFeatures
 *     }
 */
@JvmInline
value class ValidationFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var enabledValidationFeatureCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pEnabledValidationFeatures: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var disabledValidationFeatureCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pDisabledValidationFeatures: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var enabledValidationFeatures: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), enabledValidationFeatureCount)
		set(value) { Unsafe.setLong(address + 24, value.address); enabledValidationFeatureCount = value.capacity }
	
	var disabledValidationFeatures: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), disabledValidationFeatureCount)
		set(value) { Unsafe.setLong(address + 40, value.address); disabledValidationFeatureCount = value.capacity }


}