// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkDeviceCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkDeviceCreateFlags        flags (reserved, must be zero)
 *         uint32_t                   queueCreateInfoCount
 *         VkDeviceQueueCreateInfo*   pQueueCreateInfos
 *         uint32_t                   enabledLayerCount
 *         char**                     ppEnabledLayerNames
 *         uint32_t                   enabledExtensionCount
 *         char**                     ppEnabledExtensionNames
 *         VkPhysicalDeviceFeatures*  pEnabledFeatures
 *     }
 * 
 *     Valid pNext types:
 *         - VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV
 *         - VkDevicePrivateDataCreateInfoEXT
 *         - VkPhysicalDevicePrivateDataFeaturesEXT
 *         - VkPhysicalDeviceFeatures2
 *         - VkPhysicalDeviceVariablePointersFeatures
 *         - VkPhysicalDeviceMultiviewFeatures
 *         - VkDeviceGroupDeviceCreateInfo
 *         - VkPhysicalDevicePresentIdFeaturesKHR
 *         - VkPhysicalDevicePresentWaitFeaturesKHR
 *         - VkPhysicalDevice16BitStorageFeatures
 *         - VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures
 *         - VkPhysicalDeviceSamplerYcbcrConversionFeatures
 *         - VkPhysicalDeviceProtectedMemoryFeatures
 *         - VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT
 *         - VkPhysicalDeviceMultiDrawFeaturesEXT
 *         - VkPhysicalDeviceInlineUniformBlockFeaturesEXT
 *         - VkPhysicalDeviceMaintenance4FeaturesKHR
 *         - VkPhysicalDeviceShaderDrawParametersFeatures
 *         - VkPhysicalDeviceShaderFloat16Int8Features
 *         - VkPhysicalDeviceHostQueryResetFeatures
 *         - VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT
 *         - VkPhysicalDeviceDeviceMemoryReportFeaturesEXT
 *         - VkDeviceDeviceMemoryReportCreateInfoEXT
 *         - VkPhysicalDeviceDescriptorIndexingFeatures
 *         - VkPhysicalDeviceTimelineSemaphoreFeatures
 *         - VkPhysicalDevice8BitStorageFeatures
 *         - VkPhysicalDeviceConditionalRenderingFeaturesEXT
 *         - VkPhysicalDeviceVulkanMemoryModelFeatures
 *         - VkPhysicalDeviceShaderAtomicInt64Features
 *         - VkPhysicalDeviceShaderAtomicFloatFeaturesEXT
 *         - VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT
 *         - VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT
 *         - VkPhysicalDeviceASTCDecodeFeaturesEXT
 *         - VkPhysicalDeviceTransformFeedbackFeaturesEXT
 *         - VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV
 *         - VkPhysicalDeviceExclusiveScissorFeaturesNV
 *         - VkPhysicalDeviceCornerSampledImageFeaturesNV
 *         - VkPhysicalDeviceComputeShaderDerivativesFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV
 *         - VkPhysicalDeviceShaderImageFootprintFeaturesNV
 *         - VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV
 *         - VkPhysicalDeviceShadingRateImageFeaturesNV
 *         - VkPhysicalDeviceInvocationMaskFeaturesHUAWEI
 *         - VkPhysicalDeviceMeshShaderFeaturesNV
 *         - VkPhysicalDeviceAccelerationStructureFeaturesKHR
 *         - VkPhysicalDeviceRayTracingPipelineFeaturesKHR
 *         - VkPhysicalDeviceRayQueryFeaturesKHR
 *         - VkDeviceMemoryOverallocationCreateInfoAMD
 *         - VkPhysicalDeviceFragmentDensityMapFeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMap2FeaturesEXT
 *         - VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM
 *         - VkPhysicalDeviceScalarBlockLayoutFeatures
 *         - VkPhysicalDeviceUniformBufferStandardLayoutFeatures
 *         - VkPhysicalDeviceDepthClipEnableFeaturesEXT
 *         - VkPhysicalDeviceMemoryPriorityFeaturesEXT
 *         - VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT
 *         - VkPhysicalDeviceBufferDeviceAddressFeatures
 *         - VkPhysicalDeviceBufferDeviceAddressFeaturesEXT
 *         - VkPhysicalDeviceImagelessFramebufferFeatures
 *         - VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT
 *         - VkPhysicalDeviceCooperativeMatrixFeaturesNV
 *         - VkPhysicalDeviceYcbcrImageArraysFeaturesEXT
 *         - VkPhysicalDevicePerformanceQueryFeaturesKHR
 *         - VkPhysicalDeviceCoverageReductionModeFeaturesNV
 *         - VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL
 *         - VkPhysicalDeviceShaderClockFeaturesKHR
 *         - VkPhysicalDeviceIndexTypeUint8FeaturesEXT
 *         - VkPhysicalDeviceShaderSMBuiltinsFeaturesNV
 *         - VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT
 *         - VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures
 *         - VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT
 *         - VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR
 *         - VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT
 *         - VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT
 *         - VkPhysicalDeviceSubgroupSizeControlFeaturesEXT
 *         - VkPhysicalDeviceLineRasterizationFeaturesEXT
 *         - VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT
 *         - VkPhysicalDeviceVulkan11Features
 *         - VkPhysicalDeviceVulkan12Features
 *         - VkPhysicalDeviceCoherentMemoryFeaturesAMD
 *         - VkPhysicalDeviceCustomBorderColorFeaturesEXT
 *         - VkPhysicalDeviceBorderColorSwizzleFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExtendedDynamicState2FeaturesEXT
 *         - VkPhysicalDeviceDiagnosticsConfigFeaturesNV
 *         - VkDeviceDiagnosticsConfigCreateInfoNV
 *         - VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR
 *         - VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR
 *         - VkPhysicalDeviceRobustness2FeaturesEXT
 *         - VkPhysicalDeviceImageRobustnessFeaturesEXT
 *         - VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR
 *         - VkPhysicalDevicePortabilitySubsetFeaturesKHR
 *         - VkPhysicalDevice4444FormatsFeaturesEXT
 *         - VkPhysicalDeviceSubpassShadingFeaturesHUAWEI
 *         - VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT
 *         - VkPhysicalDeviceFragmentShadingRateFeaturesKHR
 *         - VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR
 *         - VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV
 *         - VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE
 *         - VkPhysicalDeviceDepthClipControlFeaturesEXT
 *         - VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT
 *         - VkPhysicalDeviceExternalMemoryRDMAFeaturesNV
 *         - VkPhysicalDeviceColorWriteEnableFeaturesEXT
 *         - VkPhysicalDeviceSynchronization2FeaturesKHR
 *         - VkPhysicalDeviceInheritedViewportScissorFeaturesNV
 *         - VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT
 *         - VkPhysicalDeviceProvokingVertexFeaturesEXT
 *         - VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR
 *         - VkPhysicalDeviceRayTracingMotionBlurFeaturesNV
 *         - VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT
 *         - VkPhysicalDeviceDynamicRenderingFeaturesKHR
 *         - VkPhysicalDeviceImageViewMinLodFeaturesEXT
 *         - VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM
 *         - VkPhysicalDeviceLinearColorAttachmentFeaturesNV
 */
@JvmInline
value class DeviceCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var queueCreateInfoCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pQueueCreateInfos: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var enabledLayerCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var ppEnabledLayerNames: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var enabledExtensionCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var ppEnabledExtensionNames: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pEnabledFeatures: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var queueCreateInfos: DeviceQueueCreateInfo.Buffer
		get()      = DeviceQueueCreateInfo.Buffer(Unsafe.getLong(address + 24), queueCreateInfoCount)
		set(value) { Unsafe.setLong(address + 24, value.address); queueCreateInfoCount = value.capacity }
	
	var enabledLayerNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), enabledLayerCount)
		set(value) { ppEnabledLayerNames = value.address; enabledLayerCount = value.capacity }
	
	var enabledExtensionNames: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), enabledExtensionCount)
		set(value) { ppEnabledExtensionNames = value.address; enabledExtensionCount = value.capacity }
	
	var enabledFeatures: PhysicalDeviceFeatures
		get()      = PhysicalDeviceFeatures(Unsafe.getLong(address + 64))
		set(value) { Unsafe.setLong(address + 64, value.address) }


}