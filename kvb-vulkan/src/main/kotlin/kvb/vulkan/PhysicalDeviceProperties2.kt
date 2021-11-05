// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceProperties2 {
 *         VkStructureType             sType
 *         void*                       pNext
 *         VkPhysicalDeviceProperties  properties
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV
 *         - VkPhysicalDevicePushDescriptorPropertiesKHR
 *         - VkPhysicalDeviceDriverProperties
 *         - VkPhysicalDeviceIDProperties
 *         - VkPhysicalDeviceMultiviewProperties
 *         - VkPhysicalDeviceDiscardRectanglePropertiesEXT
 *         - VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX
 *         - VkPhysicalDeviceSubgroupProperties
 *         - VkPhysicalDevicePointClippingProperties
 *         - VkPhysicalDeviceProtectedMemoryProperties
 *         - VkPhysicalDeviceSamplerFilterMinmaxProperties
 *         - VkPhysicalDeviceSampleLocationsPropertiesEXT
 *         - VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT
 *         - VkPhysicalDeviceInlineUniformBlockPropertiesEXT
 *         - VkPhysicalDeviceMaintenance3Properties
 *         - VkPhysicalDeviceFloatControlsProperties
 *         - VkPhysicalDeviceExternalMemoryHostPropertiesEXT
 *         - VkPhysicalDeviceConservativeRasterizationPropertiesEXT
 *         - VkPhysicalDeviceShaderCorePropertiesAMD
 *         - VkPhysicalDeviceShaderCoreProperties2AMD
 *         - VkPhysicalDeviceDescriptorIndexingProperties
 *         - VkPhysicalDeviceTimelineSemaphoreProperties
 *         - VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT
 *         - VkPhysicalDevicePCIBusInfoPropertiesEXT
 *         - VkPhysicalDeviceDepthStencilResolveProperties
 *         - VkPhysicalDeviceTransformFeedbackPropertiesEXT
 *         - VkPhysicalDeviceShadingRateImagePropertiesNV
 *         - VkPhysicalDeviceMeshShaderPropertiesNV
 *         - VkPhysicalDeviceAccelerationStructurePropertiesKHR
 *         - VkPhysicalDeviceRayTracingPipelinePropertiesKHR
 *         - VkPhysicalDeviceRayTracingPropertiesNV
 *         - VkPhysicalDeviceFragmentDensityMapPropertiesEXT
 *         - VkPhysicalDeviceFragmentDensityMap2PropertiesEXT
 *         - VkPhysicalDeviceCooperativeMatrixPropertiesNV
 *         - VkPhysicalDevicePerformanceQueryPropertiesKHR
 *         - VkPhysicalDeviceShaderSMBuiltinsPropertiesNV
 *         - VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT
 *         - VkPhysicalDeviceSubgroupSizeControlPropertiesEXT
 *         - VkPhysicalDeviceLineRasterizationPropertiesEXT
 *         - VkPhysicalDeviceVulkan11Properties
 *         - VkPhysicalDeviceVulkan12Properties
 *         - VkPhysicalDeviceCustomBorderColorPropertiesEXT
 *         - VkPhysicalDeviceRobustness2PropertiesEXT
 *         - VkPhysicalDevicePortabilitySubsetPropertiesKHR
 *         - VkPhysicalDeviceFragmentShadingRatePropertiesKHR
 *         - VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV
 */
@JvmInline
value class PhysicalDeviceProperties2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var properties: PhysicalDeviceProperties
		get()      = PhysicalDeviceProperties(address + 16)
		set(value) = Unsafe.copy(value.address, address + 16, 824)


}