// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceDescriptorIndexingProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxUpdateAfterBindDescriptorsInAllPools
 *         VkBool32         shaderUniformBufferArrayNonUniformIndexingNative
 *         VkBool32         shaderSampledImageArrayNonUniformIndexingNative
 *         VkBool32         shaderStorageBufferArrayNonUniformIndexingNative
 *         VkBool32         shaderStorageImageArrayNonUniformIndexingNative
 *         VkBool32         shaderInputAttachmentArrayNonUniformIndexingNative
 *         VkBool32         robustBufferAccessUpdateAfterBind
 *         VkBool32         quadDivergentImplicitLod
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindSamplers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindUniformBuffers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindStorageBuffers
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindSampledImages
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindStorageImages
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindInputAttachments
 *         uint32_t         maxPerStageUpdateAfterBindResources
 *         uint32_t         maxDescriptorSetUpdateAfterBindSamplers
 *         uint32_t         maxDescriptorSetUpdateAfterBindUniformBuffers
 *         uint32_t         maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageBuffers
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
 *         uint32_t         maxDescriptorSetUpdateAfterBindSampledImages
 *         uint32_t         maxDescriptorSetUpdateAfterBindStorageImages
 *         uint32_t         maxDescriptorSetUpdateAfterBindInputAttachments
 *     }
 */
@JvmInline
value class PhysicalDeviceDescriptorIndexingProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)


}