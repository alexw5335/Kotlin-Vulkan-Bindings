// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceLimits {
 *         uint32_t            maxImageDimension1D
 *         uint32_t            maxImageDimension2D
 *         uint32_t            maxImageDimension3D
 *         uint32_t            maxImageDimensionCube
 *         uint32_t            maxImageArrayLayers
 *         uint32_t            maxTexelBufferElements
 *         uint32_t            maxUniformBufferRange
 *         uint32_t            maxStorageBufferRange
 *         uint32_t            maxPushConstantsSize
 *         uint32_t            maxMemoryAllocationCount
 *         uint32_t            maxSamplerAllocationCount
 *         VkDeviceSize        bufferImageGranularity
 *         VkDeviceSize        sparseAddressSpaceSize
 *         uint32_t            maxBoundDescriptorSets
 *         uint32_t            maxPerStageDescriptorSamplers
 *         uint32_t            maxPerStageDescriptorUniformBuffers
 *         uint32_t            maxPerStageDescriptorStorageBuffers
 *         uint32_t            maxPerStageDescriptorSampledImages
 *         uint32_t            maxPerStageDescriptorStorageImages
 *         uint32_t            maxPerStageDescriptorInputAttachments
 *         uint32_t            maxPerStageResources
 *         uint32_t            maxDescriptorSetSamplers
 *         uint32_t            maxDescriptorSetUniformBuffers
 *         uint32_t            maxDescriptorSetUniformBuffersDynamic
 *         uint32_t            maxDescriptorSetStorageBuffers
 *         uint32_t            maxDescriptorSetStorageBuffersDynamic
 *         uint32_t            maxDescriptorSetSampledImages
 *         uint32_t            maxDescriptorSetStorageImages
 *         uint32_t            maxDescriptorSetInputAttachments
 *         uint32_t            maxVertexInputAttributes
 *         uint32_t            maxVertexInputBindings
 *         uint32_t            maxVertexInputAttributeOffset
 *         uint32_t            maxVertexInputBindingStride
 *         uint32_t            maxVertexOutputComponents
 *         uint32_t            maxTessellationGenerationLevel
 *         uint32_t            maxTessellationPatchSize
 *         uint32_t            maxTessellationControlPerVertexInputComponents
 *         uint32_t            maxTessellationControlPerVertexOutputComponents
 *         uint32_t            maxTessellationControlPerPatchOutputComponents
 *         uint32_t            maxTessellationControlTotalOutputComponents
 *         uint32_t            maxTessellationEvaluationInputComponents
 *         uint32_t            maxTessellationEvaluationOutputComponents
 *         uint32_t            maxGeometryShaderInvocations
 *         uint32_t            maxGeometryInputComponents
 *         uint32_t            maxGeometryOutputComponents
 *         uint32_t            maxGeometryOutputVertices
 *         uint32_t            maxGeometryTotalOutputComponents
 *         uint32_t            maxFragmentInputComponents
 *         uint32_t            maxFragmentOutputAttachments
 *         uint32_t            maxFragmentDualSrcAttachments
 *         uint32_t            maxFragmentCombinedOutputResources
 *         uint32_t            maxComputeSharedMemorySize
 *         uint32_t            maxComputeWorkGroupCount[3]
 *         uint32_t            maxComputeWorkGroupInvocations
 *         uint32_t            maxComputeWorkGroupSize[3]
 *         uint32_t            subPixelPrecisionBits
 *         uint32_t            subTexelPrecisionBits
 *         uint32_t            mipmapPrecisionBits
 *         uint32_t            maxDrawIndexedIndexValue
 *         uint32_t            maxDrawIndirectCount
 *         float               maxSamplerLodBias
 *         float               maxSamplerAnisotropy
 *         uint32_t            maxViewports
 *         uint32_t            maxViewportDimensions[2]
 *         float               viewportBoundsRange[2]
 *         uint32_t            viewportSubPixelBits
 *         size_t              minMemoryMapAlignment
 *         VkDeviceSize        minTexelBufferOffsetAlignment
 *         VkDeviceSize        minUniformBufferOffsetAlignment
 *         VkDeviceSize        minStorageBufferOffsetAlignment
 *         int32_t             minTexelOffset
 *         uint32_t            maxTexelOffset
 *         int32_t             minTexelGatherOffset
 *         uint32_t            maxTexelGatherOffset
 *         float               minInterpolationOffset
 *         float               maxInterpolationOffset
 *         uint32_t            subPixelInterpolationOffsetBits
 *         uint32_t            maxFramebufferWidth
 *         uint32_t            maxFramebufferHeight
 *         uint32_t            maxFramebufferLayers
 *         VkSampleCountFlags  framebufferColorSampleCounts
 *         VkSampleCountFlags  framebufferDepthSampleCounts
 *         VkSampleCountFlags  framebufferStencilSampleCounts
 *         VkSampleCountFlags  framebufferNoAttachmentsSampleCounts
 *         uint32_t            maxColorAttachments
 *         VkSampleCountFlags  sampledImageColorSampleCounts
 *         VkSampleCountFlags  sampledImageIntegerSampleCounts
 *         VkSampleCountFlags  sampledImageDepthSampleCounts
 *         VkSampleCountFlags  sampledImageStencilSampleCounts
 *         VkSampleCountFlags  storageImageSampleCounts
 *         uint32_t            maxSampleMaskWords
 *         VkBool32            timestampComputeAndGraphics
 *         float               timestampPeriod
 *         uint32_t            maxClipDistances
 *         uint32_t            maxCullDistances
 *         uint32_t            maxCombinedClipAndCullDistances
 *         uint32_t            discreteQueuePriorities
 *         float               pointSizeRange[2]
 *         float               lineWidthRange[2]
 *         float               pointSizeGranularity
 *         float               lineWidthGranularity
 *         VkBool32            strictLines
 *         VkBool32            standardSampleLocations
 *         VkDeviceSize        optimalBufferCopyOffsetAlignment
 *         VkDeviceSize        optimalBufferCopyRowPitchAlignment
 *         VkDeviceSize        nonCoherentAtomSize
 *     }
 */
@JvmInline
value class PhysicalDeviceLimits(override val address: Long) : Addressable {
	
	
	var maxImageDimension1D: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var maxImageDimension2D: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var maxImageDimension3D: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var maxImageDimensionCube: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxTexelBufferElements: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxUniformBufferRange: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var maxStorageBufferRange: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var maxPushConstantsSize: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxMemoryAllocationCount: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var maxSamplerAllocationCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var bufferImageGranularity: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	var sparseAddressSpaceSize: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var maxBoundDescriptorSets: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var maxPerStageDescriptorSamplers: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var maxPerStageDescriptorUniformBuffers: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var maxPerStageDescriptorStorageBuffers: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var maxPerStageDescriptorSampledImages: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var maxPerStageDescriptorStorageImages: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var maxPerStageDescriptorInputAttachments: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var maxPerStageResources: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var maxDescriptorSetSamplers: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var maxDescriptorSetUniformBuffers: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var maxDescriptorSetUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var maxDescriptorSetStorageBuffers: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var maxDescriptorSetStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var maxDescriptorSetSampledImages: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var maxDescriptorSetStorageImages: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var maxDescriptorSetInputAttachments: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var maxVertexInputAttributes: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var maxVertexInputBindings: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var maxVertexInputAttributeOffset: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var maxVertexInputBindingStride: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var maxVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var maxTessellationGenerationLevel: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var maxTessellationPatchSize: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var maxTessellationControlPerVertexInputComponents: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var maxTessellationControlPerVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var maxTessellationControlPerPatchOutputComponents: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var maxTessellationControlTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var maxTessellationEvaluationInputComponents: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var maxTessellationEvaluationOutputComponents: Int
		get()      = Unsafe.getInt(address + 176)
		set(value) = Unsafe.setInt(address + 176, value)
	
	var maxGeometryShaderInvocations: Int
		get()      = Unsafe.getInt(address + 180)
		set(value) = Unsafe.setInt(address + 180, value)
	
	var maxGeometryInputComponents: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var maxGeometryOutputComponents: Int
		get()      = Unsafe.getInt(address + 188)
		set(value) = Unsafe.setInt(address + 188, value)
	
	var maxGeometryOutputVertices: Int
		get()      = Unsafe.getInt(address + 192)
		set(value) = Unsafe.setInt(address + 192, value)
	
	var maxGeometryTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + 196)
		set(value) = Unsafe.setInt(address + 196, value)
	
	var maxFragmentInputComponents: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)
	
	var maxFragmentOutputAttachments: Int
		get()      = Unsafe.getInt(address + 204)
		set(value) = Unsafe.setInt(address + 204, value)
	
	var maxFragmentDualSrcAttachments: Int
		get()      = Unsafe.getInt(address + 208)
		set(value) = Unsafe.setInt(address + 208, value)
	
	var maxFragmentCombinedOutputResources: Int
		get()      = Unsafe.getInt(address + 212)
		set(value) = Unsafe.setInt(address + 212, value)
	
	var maxComputeSharedMemorySize: Int
		get()      = Unsafe.getInt(address + 216)
		set(value) = Unsafe.setInt(address + 216, value)
	
	var maxComputeWorkGroupCount: DirectIntBuffer
		get()      = DirectIntBuffer(address + 220, 3)
		set(value) = Unsafe.copy(value.address, address + 220, value.byteSize)
	
	var maxComputeWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + 232)
		set(value) = Unsafe.setInt(address + 232, value)
	
	var maxComputeWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + 236, 3)
		set(value) = Unsafe.copy(value.address, address + 236, value.byteSize)
	
	var subPixelPrecisionBits: Int
		get()      = Unsafe.getInt(address + 248)
		set(value) = Unsafe.setInt(address + 248, value)
	
	var subTexelPrecisionBits: Int
		get()      = Unsafe.getInt(address + 252)
		set(value) = Unsafe.setInt(address + 252, value)
	
	var mipmapPrecisionBits: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	var maxDrawIndexedIndexValue: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var maxDrawIndirectCount: Int
		get()      = Unsafe.getInt(address + 264)
		set(value) = Unsafe.setInt(address + 264, value)
	
	var maxSamplerLodBias: Float
		get()      = Unsafe.getFloat(address + 268)
		set(value) = Unsafe.setFloat(address + 268, value)
	
	var maxSamplerAnisotropy: Float
		get()      = Unsafe.getFloat(address + 272)
		set(value) = Unsafe.setFloat(address + 272, value)
	
	var maxViewports: Int
		get()      = Unsafe.getInt(address + 276)
		set(value) = Unsafe.setInt(address + 276, value)
	
	var maxViewportDimensions: DirectIntBuffer
		get()      = DirectIntBuffer(address + 280, 2)
		set(value) = Unsafe.copy(value.address, address + 280, value.byteSize)
	
	var viewportBoundsRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 288, 2)
		set(value) = Unsafe.copy(value.address, address + 288, value.byteSize)
	
	var viewportSubPixelBits: Int
		get()      = Unsafe.getInt(address + 296)
		set(value) = Unsafe.setInt(address + 296, value)
	
	var minMemoryMapAlignment: Long
		get()      = Unsafe.getLong(address + 304)
		set(value) = Unsafe.setLong(address + 304, value)
	
	var minTexelBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 312)
		set(value) = Unsafe.setLong(address + 312, value)
	
	var minUniformBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 320)
		set(value) = Unsafe.setLong(address + 320, value)
	
	var minStorageBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 328)
		set(value) = Unsafe.setLong(address + 328, value)
	
	var minTexelOffset: Int
		get()      = Unsafe.getInt(address + 336)
		set(value) = Unsafe.setInt(address + 336, value)
	
	var maxTexelOffset: Int
		get()      = Unsafe.getInt(address + 340)
		set(value) = Unsafe.setInt(address + 340, value)
	
	var minTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + 344)
		set(value) = Unsafe.setInt(address + 344, value)
	
	var maxTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + 348)
		set(value) = Unsafe.setInt(address + 348, value)
	
	var minInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + 352)
		set(value) = Unsafe.setFloat(address + 352, value)
	
	var maxInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + 356)
		set(value) = Unsafe.setFloat(address + 356, value)
	
	var subPixelInterpolationOffsetBits: Int
		get()      = Unsafe.getInt(address + 360)
		set(value) = Unsafe.setInt(address + 360, value)
	
	var maxFramebufferWidth: Int
		get()      = Unsafe.getInt(address + 364)
		set(value) = Unsafe.setInt(address + 364, value)
	
	var maxFramebufferHeight: Int
		get()      = Unsafe.getInt(address + 368)
		set(value) = Unsafe.setInt(address + 368, value)
	
	var maxFramebufferLayers: Int
		get()      = Unsafe.getInt(address + 372)
		set(value) = Unsafe.setInt(address + 372, value)
	
	var framebufferColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 376))
		set(value) = Unsafe.setInt(address + 376, value.value)
	
	var framebufferDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 380))
		set(value) = Unsafe.setInt(address + 380, value.value)
	
	var framebufferStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 384))
		set(value) = Unsafe.setInt(address + 384, value.value)
	
	var framebufferNoAttachmentsSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 388))
		set(value) = Unsafe.setInt(address + 388, value.value)
	
	var maxColorAttachments: Int
		get()      = Unsafe.getInt(address + 392)
		set(value) = Unsafe.setInt(address + 392, value)
	
	var sampledImageColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 396))
		set(value) = Unsafe.setInt(address + 396, value.value)
	
	var sampledImageIntegerSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 400))
		set(value) = Unsafe.setInt(address + 400, value.value)
	
	var sampledImageDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 404))
		set(value) = Unsafe.setInt(address + 404, value.value)
	
	var sampledImageStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 408))
		set(value) = Unsafe.setInt(address + 408, value.value)
	
	var storageImageSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 412))
		set(value) = Unsafe.setInt(address + 412, value.value)
	
	var maxSampleMaskWords: Int
		get()      = Unsafe.getInt(address + 416)
		set(value) = Unsafe.setInt(address + 416, value)
	
	var timestampComputeAndGraphics: Int
		get()      = Unsafe.getInt(address + 420)
		set(value) = Unsafe.setInt(address + 420, value)
	
	var timestampPeriod: Float
		get()      = Unsafe.getFloat(address + 424)
		set(value) = Unsafe.setFloat(address + 424, value)
	
	var maxClipDistances: Int
		get()      = Unsafe.getInt(address + 428)
		set(value) = Unsafe.setInt(address + 428, value)
	
	var maxCullDistances: Int
		get()      = Unsafe.getInt(address + 432)
		set(value) = Unsafe.setInt(address + 432, value)
	
	var maxCombinedClipAndCullDistances: Int
		get()      = Unsafe.getInt(address + 436)
		set(value) = Unsafe.setInt(address + 436, value)
	
	var discreteQueuePriorities: Int
		get()      = Unsafe.getInt(address + 440)
		set(value) = Unsafe.setInt(address + 440, value)
	
	var pointSizeRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 444, 2)
		set(value) = Unsafe.copy(value.address, address + 444, value.byteSize)
	
	var lineWidthRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 452, 2)
		set(value) = Unsafe.copy(value.address, address + 452, value.byteSize)
	
	var pointSizeGranularity: Float
		get()      = Unsafe.getFloat(address + 460)
		set(value) = Unsafe.setFloat(address + 460, value)
	
	var lineWidthGranularity: Float
		get()      = Unsafe.getFloat(address + 464)
		set(value) = Unsafe.setFloat(address + 464, value)
	
	var strictLines: Int
		get()      = Unsafe.getInt(address + 468)
		set(value) = Unsafe.setInt(address + 468, value)
	
	var standardSampleLocations: Int
		get()      = Unsafe.getInt(address + 472)
		set(value) = Unsafe.setInt(address + 472, value)
	
	var optimalBufferCopyOffsetAlignment: Long
		get()      = Unsafe.getLong(address + 480)
		set(value) = Unsafe.setLong(address + 480, value)
	
	var optimalBufferCopyRowPitchAlignment: Long
		get()      = Unsafe.getLong(address + 488)
		set(value) = Unsafe.setLong(address + 488, value)
	
	var nonCoherentAtomSize: Long
		get()      = Unsafe.getLong(address + 496)
		set(value) = Unsafe.setLong(address + 496, value)


}