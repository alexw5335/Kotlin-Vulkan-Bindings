// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceFragmentShadingRatePropertiesKHR {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkExtent2D             minFragmentShadingRateAttachmentTexelSize
 *         VkExtent2D             maxFragmentShadingRateAttachmentTexelSize
 *         uint32_t               maxFragmentShadingRateAttachmentTexelSizeAspectRatio
 *         VkBool32               primitiveFragmentShadingRateWithMultipleViewports
 *         VkBool32               layeredShadingRateAttachments
 *         VkBool32               fragmentShadingRateNonTrivialCombinerOps
 *         VkExtent2D             maxFragmentSize
 *         uint32_t               maxFragmentSizeAspectRatio
 *         uint32_t               maxFragmentShadingRateCoverageSamples
 *         VkSampleCountFlagBits  maxFragmentShadingRateRasterizationSamples
 *         VkBool32               fragmentShadingRateWithShaderDepthStencilWrites
 *         VkBool32               fragmentShadingRateWithSampleMask
 *         VkBool32               fragmentShadingRateWithShaderSampleMask
 *         VkBool32               fragmentShadingRateWithConservativeRasterization
 *         VkBool32               fragmentShadingRateWithFragmentShaderInterlock
 *         VkBool32               fragmentShadingRateWithCustomSampleLocations
 *         VkBool32               fragmentShadingRateStrictMultiplyCombiner
 *     }
 */
@JvmInline
value class PhysicalDeviceFragmentShadingRateProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var minFragmentShadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 8)
	
	var maxFragmentShadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	var maxFragmentShadingRateAttachmentTexelSizeAspectRatio: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var primitiveFragmentShadingRateWithMultipleViewports: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var layeredShadingRateAttachments: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var fragmentShadingRateNonTrivialCombinerOps: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var maxFragmentSize: Extent2D
		get()      = Extent2D(address + 48)
		set(value) = Unsafe.copy(value.address, address + 48, 8)
	
	var maxFragmentSizeAspectRatio: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var maxFragmentShadingRateCoverageSamples: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var maxFragmentShadingRateRasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 64))
		set(value) = Unsafe.setInt(address + 64, value.value)
	
	var fragmentShadingRateWithShaderDepthStencilWrites: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var fragmentShadingRateWithSampleMask: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var fragmentShadingRateWithShaderSampleMask: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var fragmentShadingRateWithConservativeRasterization: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var fragmentShadingRateWithFragmentShaderInterlock: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var fragmentShadingRateWithCustomSampleLocations: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var fragmentShadingRateStrictMultiplyCombiner: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)


}