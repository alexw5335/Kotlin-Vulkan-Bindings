// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var maxImageDimension2D: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var maxImageDimension3D: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxImageDimensionCube: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxImageArrayLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var maxTexelBufferElements: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxUniformBufferRange: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxStorageBufferRange: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var maxPushConstantsSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var maxMemoryAllocationCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var maxSamplerAllocationCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var bufferImageGranularity: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[11], value) }
	
	var sparseAddressSpaceSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[12], value) }
	
	var maxBoundDescriptorSets: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var maxPerStageDescriptorSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var maxPerStageDescriptorUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var maxPerStageDescriptorStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var maxPerStageDescriptorSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var maxPerStageDescriptorStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var maxPerStageDescriptorInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var maxPerStageResources: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var maxDescriptorSetSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	var maxDescriptorSetUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[22])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[22], value) }
	
	var maxDescriptorSetUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[23])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[23], value) }
	
	var maxDescriptorSetStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[24])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[24], value) }
	
	var maxDescriptorSetStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[25])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[25], value) }
	
	var maxDescriptorSetSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[26])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[26], value) }
	
	var maxDescriptorSetStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[27])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[27], value) }
	
	var maxDescriptorSetInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[28])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[28], value) }
	
	var maxVertexInputAttributes: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[29])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[29], value) }
	
	var maxVertexInputBindings: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[30])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[30], value) }
	
	var maxVertexInputAttributeOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[31])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[31], value) }
	
	var maxVertexInputBindingStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[32])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[32], value) }
	
	var maxVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[33])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[33], value) }
	
	var maxTessellationGenerationLevel: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[34])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[34], value) }
	
	var maxTessellationPatchSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[35])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[35], value) }
	
	var maxTessellationControlPerVertexInputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[36])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[36], value) }
	
	var maxTessellationControlPerVertexOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[37])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[37], value) }
	
	var maxTessellationControlPerPatchOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[38])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[38], value) }
	
	var maxTessellationControlTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[39])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[39], value) }
	
	var maxTessellationEvaluationInputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[40])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[40], value) }
	
	var maxTessellationEvaluationOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[41])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[41], value) }
	
	var maxGeometryShaderInvocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[42])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[42], value) }
	
	var maxGeometryInputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[43])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[43], value) }
	
	var maxGeometryOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[44])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[44], value) }
	
	var maxGeometryOutputVertices: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[45])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[45], value) }
	
	var maxGeometryTotalOutputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[46])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[46], value) }
	
	var maxFragmentInputComponents: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[47])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[47], value) }
	
	var maxFragmentOutputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[48])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[48], value) }
	
	var maxFragmentDualSrcAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[49])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[49], value) }
	
	var maxFragmentCombinedOutputResources: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[50])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[50], value) }
	
	var maxComputeSharedMemorySize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[51])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[51], value) }
	
	var maxComputeWorkGroupCount: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[52], 3)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[52], value.byteSize) }
	
	var maxComputeWorkGroupInvocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[53])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[53], value) }
	
	var maxComputeWorkGroupSize: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[54], 3)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[54], value.byteSize) }
	
	var subPixelPrecisionBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[55])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[55], value) }
	
	var subTexelPrecisionBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[56])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[56], value) }
	
	var mipmapPrecisionBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[57])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[57], value) }
	
	var maxDrawIndexedIndexValue: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[58])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[58], value) }
	
	var maxDrawIndirectCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[59])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[59], value) }
	
	var maxSamplerLodBias: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[60])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[60], value) }
	
	var maxSamplerAnisotropy: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[61])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[61], value) }
	
	var maxViewports: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[62])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[62], value) }
	
	var maxViewportDimensions: DirectIntBuffer
		get()      = DirectIntBuffer(address + LAYOUT.offsets[63], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[63], value.byteSize) }
	
	var viewportBoundsRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[64], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[64], value.byteSize) }
	
	var viewportSubPixelBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[65])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[65], value) }
	
	var minMemoryMapAlignment: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[66])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[66], value) }
	
	var minTexelBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[67])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[67], value) }
	
	var minUniformBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[68])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[68], value) }
	
	var minStorageBufferOffsetAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[69])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[69], value) }
	
	var minTexelOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[70])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[70], value) }
	
	var maxTexelOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[71])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[71], value) }
	
	var minTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[72])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[72], value) }
	
	var maxTexelGatherOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[73])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[73], value) }
	
	var minInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[74])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[74], value) }
	
	var maxInterpolationOffset: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[75])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[75], value) }
	
	var subPixelInterpolationOffsetBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[76])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[76], value) }
	
	var maxFramebufferWidth: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[77])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[77], value) }
	
	var maxFramebufferHeight: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[78])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[78], value) }
	
	var maxFramebufferLayers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[79])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[79], value) }
	
	var framebufferColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[80]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[80], value.bitfield) }
	
	var framebufferDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[81]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[81], value.bitfield) }
	
	var framebufferStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[82]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[82], value.bitfield) }
	
	var framebufferNoAttachmentsSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[83]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[83], value.bitfield) }
	
	var maxColorAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[84])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[84], value) }
	
	var sampledImageColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[85]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[85], value.bitfield) }
	
	var sampledImageIntegerSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[86]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[86], value.bitfield) }
	
	var sampledImageDepthSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[87]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[87], value.bitfield) }
	
	var sampledImageStencilSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[88]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[88], value.bitfield) }
	
	var storageImageSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[89]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[89], value.bitfield) }
	
	var maxSampleMaskWords: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[90])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[90], value) }
	
	var timestampComputeAndGraphics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[91])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[91], value) }
	
	var timestampPeriod: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[92])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[92], value) }
	
	var maxClipDistances: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[93])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[93], value) }
	
	var maxCullDistances: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[94])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[94], value) }
	
	var maxCombinedClipAndCullDistances: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[95])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[95], value) }
	
	var discreteQueuePriorities: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[96])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[96], value) }
	
	var pointSizeRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[97], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[97], value.byteSize) }
	
	var lineWidthRange: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[98], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[98], value.byteSize) }
	
	var pointSizeGranularity: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[99])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[99], value) }
	
	var lineWidthGranularity: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[100])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[100], value) }
	
	var strictLines: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[101])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[101], value) }
	
	var standardSampleLocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[102])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[102], value) }
	
	var optimalBufferCopyOffsetAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[103])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[103], value) }
	
	var optimalBufferCopyRowPitchAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[104])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[104], value) }
	
	var nonCoherentAtomSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[105])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[105], value) }
	
	
	
	class Persistent(
		val maxImageDimension1D: Int,
		val maxImageDimension2D: Int,
		val maxImageDimension3D: Int,
		val maxImageDimensionCube: Int,
		val maxImageArrayLayers: Int,
		val maxTexelBufferElements: Int,
		val maxUniformBufferRange: Int,
		val maxStorageBufferRange: Int,
		val maxPushConstantsSize: Int,
		val maxMemoryAllocationCount: Int,
		val maxSamplerAllocationCount: Int,
		val bufferImageGranularity: Long,
		val sparseAddressSpaceSize: Long,
		val maxBoundDescriptorSets: Int,
		val maxPerStageDescriptorSamplers: Int,
		val maxPerStageDescriptorUniformBuffers: Int,
		val maxPerStageDescriptorStorageBuffers: Int,
		val maxPerStageDescriptorSampledImages: Int,
		val maxPerStageDescriptorStorageImages: Int,
		val maxPerStageDescriptorInputAttachments: Int,
		val maxPerStageResources: Int,
		val maxDescriptorSetSamplers: Int,
		val maxDescriptorSetUniformBuffers: Int,
		val maxDescriptorSetUniformBuffersDynamic: Int,
		val maxDescriptorSetStorageBuffers: Int,
		val maxDescriptorSetStorageBuffersDynamic: Int,
		val maxDescriptorSetSampledImages: Int,
		val maxDescriptorSetStorageImages: Int,
		val maxDescriptorSetInputAttachments: Int,
		val maxVertexInputAttributes: Int,
		val maxVertexInputBindings: Int,
		val maxVertexInputAttributeOffset: Int,
		val maxVertexInputBindingStride: Int,
		val maxVertexOutputComponents: Int,
		val maxTessellationGenerationLevel: Int,
		val maxTessellationPatchSize: Int,
		val maxTessellationControlPerVertexInputComponents: Int,
		val maxTessellationControlPerVertexOutputComponents: Int,
		val maxTessellationControlPerPatchOutputComponents: Int,
		val maxTessellationControlTotalOutputComponents: Int,
		val maxTessellationEvaluationInputComponents: Int,
		val maxTessellationEvaluationOutputComponents: Int,
		val maxGeometryShaderInvocations: Int,
		val maxGeometryInputComponents: Int,
		val maxGeometryOutputComponents: Int,
		val maxGeometryOutputVertices: Int,
		val maxGeometryTotalOutputComponents: Int,
		val maxFragmentInputComponents: Int,
		val maxFragmentOutputAttachments: Int,
		val maxFragmentDualSrcAttachments: Int,
		val maxFragmentCombinedOutputResources: Int,
		val maxComputeSharedMemorySize: Int,
		val maxComputeWorkGroupCount: IntArray,
		val maxComputeWorkGroupInvocations: Int,
		val maxComputeWorkGroupSize: IntArray,
		val subPixelPrecisionBits: Int,
		val subTexelPrecisionBits: Int,
		val mipmapPrecisionBits: Int,
		val maxDrawIndexedIndexValue: Int,
		val maxDrawIndirectCount: Int,
		val maxSamplerLodBias: Float,
		val maxSamplerAnisotropy: Float,
		val maxViewports: Int,
		val maxViewportDimensions: IntArray,
		val viewportBoundsRange: FloatArray,
		val viewportSubPixelBits: Int,
		val minMemoryMapAlignment: Long,
		val minTexelBufferOffsetAlignment: Long,
		val minUniformBufferOffsetAlignment: Long,
		val minStorageBufferOffsetAlignment: Long,
		val minTexelOffset: Int,
		val maxTexelOffset: Int,
		val minTexelGatherOffset: Int,
		val maxTexelGatherOffset: Int,
		val minInterpolationOffset: Float,
		val maxInterpolationOffset: Float,
		val subPixelInterpolationOffsetBits: Int,
		val maxFramebufferWidth: Int,
		val maxFramebufferHeight: Int,
		val maxFramebufferLayers: Int,
		val framebufferColorSampleCounts: SampleCountFlags,
		val framebufferDepthSampleCounts: SampleCountFlags,
		val framebufferStencilSampleCounts: SampleCountFlags,
		val framebufferNoAttachmentsSampleCounts: SampleCountFlags,
		val maxColorAttachments: Int,
		val sampledImageColorSampleCounts: SampleCountFlags,
		val sampledImageIntegerSampleCounts: SampleCountFlags,
		val sampledImageDepthSampleCounts: SampleCountFlags,
		val sampledImageStencilSampleCounts: SampleCountFlags,
		val storageImageSampleCounts: SampleCountFlags,
		val maxSampleMaskWords: Int,
		val timestampComputeAndGraphics: Int,
		val timestampPeriod: Float,
		val maxClipDistances: Int,
		val maxCullDistances: Int,
		val maxCombinedClipAndCullDistances: Int,
		val discreteQueuePriorities: Int,
		val pointSizeRange: FloatArray,
		val lineWidthRange: FloatArray,
		val pointSizeGranularity: Float,
		val lineWidthGranularity: Float,
		val strictLines: Int,
		val standardSampleLocations: Int,
		val optimalBufferCopyOffsetAlignment: Long,
		val optimalBufferCopyRowPitchAlignment: Long,
		val nonCoherentAtomSize: Long,
	) {
		override fun toString() = "PhysicalDeviceLimits(" + 
			"maxImageDimension1D=$maxImageDimension1D, " +
			"maxImageDimension2D=$maxImageDimension2D, " +
			"maxImageDimension3D=$maxImageDimension3D, " +
			"maxImageDimensionCube=$maxImageDimensionCube, " +
			"maxImageArrayLayers=$maxImageArrayLayers, " +
			"maxTexelBufferElements=$maxTexelBufferElements, " +
			"maxUniformBufferRange=$maxUniformBufferRange, " +
			"maxStorageBufferRange=$maxStorageBufferRange, " +
			"maxPushConstantsSize=$maxPushConstantsSize, " +
			"maxMemoryAllocationCount=$maxMemoryAllocationCount, " +
			"maxSamplerAllocationCount=$maxSamplerAllocationCount, " +
			"bufferImageGranularity=$bufferImageGranularity, " +
			"sparseAddressSpaceSize=$sparseAddressSpaceSize, " +
			"maxBoundDescriptorSets=$maxBoundDescriptorSets, " +
			"maxPerStageDescriptorSamplers=$maxPerStageDescriptorSamplers, " +
			"maxPerStageDescriptorUniformBuffers=$maxPerStageDescriptorUniformBuffers, " +
			"maxPerStageDescriptorStorageBuffers=$maxPerStageDescriptorStorageBuffers, " +
			"maxPerStageDescriptorSampledImages=$maxPerStageDescriptorSampledImages, " +
			"maxPerStageDescriptorStorageImages=$maxPerStageDescriptorStorageImages, " +
			"maxPerStageDescriptorInputAttachments=$maxPerStageDescriptorInputAttachments, " +
			"maxPerStageResources=$maxPerStageResources, " +
			"maxDescriptorSetSamplers=$maxDescriptorSetSamplers, " +
			"maxDescriptorSetUniformBuffers=$maxDescriptorSetUniformBuffers, " +
			"maxDescriptorSetUniformBuffersDynamic=$maxDescriptorSetUniformBuffersDynamic, " +
			"maxDescriptorSetStorageBuffers=$maxDescriptorSetStorageBuffers, " +
			"maxDescriptorSetStorageBuffersDynamic=$maxDescriptorSetStorageBuffersDynamic, " +
			"maxDescriptorSetSampledImages=$maxDescriptorSetSampledImages, " +
			"maxDescriptorSetStorageImages=$maxDescriptorSetStorageImages, " +
			"maxDescriptorSetInputAttachments=$maxDescriptorSetInputAttachments, " +
			"maxVertexInputAttributes=$maxVertexInputAttributes, " +
			"maxVertexInputBindings=$maxVertexInputBindings, " +
			"maxVertexInputAttributeOffset=$maxVertexInputAttributeOffset, " +
			"maxVertexInputBindingStride=$maxVertexInputBindingStride, " +
			"maxVertexOutputComponents=$maxVertexOutputComponents, " +
			"maxTessellationGenerationLevel=$maxTessellationGenerationLevel, " +
			"maxTessellationPatchSize=$maxTessellationPatchSize, " +
			"maxTessellationControlPerVertexInputComponents=$maxTessellationControlPerVertexInputComponents, " +
			"maxTessellationControlPerVertexOutputComponents=$maxTessellationControlPerVertexOutputComponents, " +
			"maxTessellationControlPerPatchOutputComponents=$maxTessellationControlPerPatchOutputComponents, " +
			"maxTessellationControlTotalOutputComponents=$maxTessellationControlTotalOutputComponents, " +
			"maxTessellationEvaluationInputComponents=$maxTessellationEvaluationInputComponents, " +
			"maxTessellationEvaluationOutputComponents=$maxTessellationEvaluationOutputComponents, " +
			"maxGeometryShaderInvocations=$maxGeometryShaderInvocations, " +
			"maxGeometryInputComponents=$maxGeometryInputComponents, " +
			"maxGeometryOutputComponents=$maxGeometryOutputComponents, " +
			"maxGeometryOutputVertices=$maxGeometryOutputVertices, " +
			"maxGeometryTotalOutputComponents=$maxGeometryTotalOutputComponents, " +
			"maxFragmentInputComponents=$maxFragmentInputComponents, " +
			"maxFragmentOutputAttachments=$maxFragmentOutputAttachments, " +
			"maxFragmentDualSrcAttachments=$maxFragmentDualSrcAttachments, " +
			"maxFragmentCombinedOutputResources=$maxFragmentCombinedOutputResources, " +
			"maxComputeSharedMemorySize=$maxComputeSharedMemorySize, " +
			"maxComputeWorkGroupCount=$maxComputeWorkGroupCount, " +
			"maxComputeWorkGroupInvocations=$maxComputeWorkGroupInvocations, " +
			"maxComputeWorkGroupSize=$maxComputeWorkGroupSize, " +
			"subPixelPrecisionBits=$subPixelPrecisionBits, " +
			"subTexelPrecisionBits=$subTexelPrecisionBits, " +
			"mipmapPrecisionBits=$mipmapPrecisionBits, " +
			"maxDrawIndexedIndexValue=$maxDrawIndexedIndexValue, " +
			"maxDrawIndirectCount=$maxDrawIndirectCount, " +
			"maxSamplerLodBias=$maxSamplerLodBias, " +
			"maxSamplerAnisotropy=$maxSamplerAnisotropy, " +
			"maxViewports=$maxViewports, " +
			"maxViewportDimensions=$maxViewportDimensions, " +
			"viewportBoundsRange=$viewportBoundsRange, " +
			"viewportSubPixelBits=$viewportSubPixelBits, " +
			"minMemoryMapAlignment=$minMemoryMapAlignment, " +
			"minTexelBufferOffsetAlignment=$minTexelBufferOffsetAlignment, " +
			"minUniformBufferOffsetAlignment=$minUniformBufferOffsetAlignment, " +
			"minStorageBufferOffsetAlignment=$minStorageBufferOffsetAlignment, " +
			"minTexelOffset=$minTexelOffset, " +
			"maxTexelOffset=$maxTexelOffset, " +
			"minTexelGatherOffset=$minTexelGatherOffset, " +
			"maxTexelGatherOffset=$maxTexelGatherOffset, " +
			"minInterpolationOffset=$minInterpolationOffset, " +
			"maxInterpolationOffset=$maxInterpolationOffset, " +
			"subPixelInterpolationOffsetBits=$subPixelInterpolationOffsetBits, " +
			"maxFramebufferWidth=$maxFramebufferWidth, " +
			"maxFramebufferHeight=$maxFramebufferHeight, " +
			"maxFramebufferLayers=$maxFramebufferLayers, " +
			"framebufferColorSampleCounts=$framebufferColorSampleCounts, " +
			"framebufferDepthSampleCounts=$framebufferDepthSampleCounts, " +
			"framebufferStencilSampleCounts=$framebufferStencilSampleCounts, " +
			"framebufferNoAttachmentsSampleCounts=$framebufferNoAttachmentsSampleCounts, " +
			"maxColorAttachments=$maxColorAttachments, " +
			"sampledImageColorSampleCounts=$sampledImageColorSampleCounts, " +
			"sampledImageIntegerSampleCounts=$sampledImageIntegerSampleCounts, " +
			"sampledImageDepthSampleCounts=$sampledImageDepthSampleCounts, " +
			"sampledImageStencilSampleCounts=$sampledImageStencilSampleCounts, " +
			"storageImageSampleCounts=$storageImageSampleCounts, " +
			"maxSampleMaskWords=$maxSampleMaskWords, " +
			"timestampComputeAndGraphics=$timestampComputeAndGraphics, " +
			"timestampPeriod=$timestampPeriod, " +
			"maxClipDistances=$maxClipDistances, " +
			"maxCullDistances=$maxCullDistances, " +
			"maxCombinedClipAndCullDistances=$maxCombinedClipAndCullDistances, " +
			"discreteQueuePriorities=$discreteQueuePriorities, " +
			"pointSizeRange=$pointSizeRange, " +
			"lineWidthRange=$lineWidthRange, " +
			"pointSizeGranularity=$pointSizeGranularity, " +
			"lineWidthGranularity=$lineWidthGranularity, " +
			"strictLines=$strictLines, " +
			"standardSampleLocations=$standardSampleLocations, " +
			"optimalBufferCopyOffsetAlignment=$optimalBufferCopyOffsetAlignment, " +
			"optimalBufferCopyRowPitchAlignment=$optimalBufferCopyRowPitchAlignment, " +
			"nonCoherentAtomSize=$nonCoherentAtomSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		maxImageDimension1D, 
		maxImageDimension2D, 
		maxImageDimension3D, 
		maxImageDimensionCube, 
		maxImageArrayLayers, 
		maxTexelBufferElements, 
		maxUniformBufferRange, 
		maxStorageBufferRange, 
		maxPushConstantsSize, 
		maxMemoryAllocationCount, 
		maxSamplerAllocationCount, 
		bufferImageGranularity, 
		sparseAddressSpaceSize, 
		maxBoundDescriptorSets, 
		maxPerStageDescriptorSamplers, 
		maxPerStageDescriptorUniformBuffers, 
		maxPerStageDescriptorStorageBuffers, 
		maxPerStageDescriptorSampledImages, 
		maxPerStageDescriptorStorageImages, 
		maxPerStageDescriptorInputAttachments, 
		maxPerStageResources, 
		maxDescriptorSetSamplers, 
		maxDescriptorSetUniformBuffers, 
		maxDescriptorSetUniformBuffersDynamic, 
		maxDescriptorSetStorageBuffers, 
		maxDescriptorSetStorageBuffersDynamic, 
		maxDescriptorSetSampledImages, 
		maxDescriptorSetStorageImages, 
		maxDescriptorSetInputAttachments, 
		maxVertexInputAttributes, 
		maxVertexInputBindings, 
		maxVertexInputAttributeOffset, 
		maxVertexInputBindingStride, 
		maxVertexOutputComponents, 
		maxTessellationGenerationLevel, 
		maxTessellationPatchSize, 
		maxTessellationControlPerVertexInputComponents, 
		maxTessellationControlPerVertexOutputComponents, 
		maxTessellationControlPerPatchOutputComponents, 
		maxTessellationControlTotalOutputComponents, 
		maxTessellationEvaluationInputComponents, 
		maxTessellationEvaluationOutputComponents, 
		maxGeometryShaderInvocations, 
		maxGeometryInputComponents, 
		maxGeometryOutputComponents, 
		maxGeometryOutputVertices, 
		maxGeometryTotalOutputComponents, 
		maxFragmentInputComponents, 
		maxFragmentOutputAttachments, 
		maxFragmentDualSrcAttachments, 
		maxFragmentCombinedOutputResources, 
		maxComputeSharedMemorySize, 
		maxComputeWorkGroupCount.asArray, 
		maxComputeWorkGroupInvocations, 
		maxComputeWorkGroupSize.asArray, 
		subPixelPrecisionBits, 
		subTexelPrecisionBits, 
		mipmapPrecisionBits, 
		maxDrawIndexedIndexValue, 
		maxDrawIndirectCount, 
		maxSamplerLodBias, 
		maxSamplerAnisotropy, 
		maxViewports, 
		maxViewportDimensions.asArray, 
		viewportBoundsRange.asArray, 
		viewportSubPixelBits, 
		minMemoryMapAlignment, 
		minTexelBufferOffsetAlignment, 
		minUniformBufferOffsetAlignment, 
		minStorageBufferOffsetAlignment, 
		minTexelOffset, 
		maxTexelOffset, 
		minTexelGatherOffset, 
		maxTexelGatherOffset, 
		minInterpolationOffset, 
		maxInterpolationOffset, 
		subPixelInterpolationOffsetBits, 
		maxFramebufferWidth, 
		maxFramebufferHeight, 
		maxFramebufferLayers, 
		framebufferColorSampleCounts, 
		framebufferDepthSampleCounts, 
		framebufferStencilSampleCounts, 
		framebufferNoAttachmentsSampleCounts, 
		maxColorAttachments, 
		sampledImageColorSampleCounts, 
		sampledImageIntegerSampleCounts, 
		sampledImageDepthSampleCounts, 
		sampledImageStencilSampleCounts, 
		storageImageSampleCounts, 
		maxSampleMaskWords, 
		timestampComputeAndGraphics, 
		timestampPeriod, 
		maxClipDistances, 
		maxCullDistances, 
		maxCombinedClipAndCullDistances, 
		discreteQueuePriorities, 
		pointSizeRange.asArray, 
		lineWidthRange.asArray, 
		pointSizeGranularity, 
		lineWidthGranularity, 
		strictLines, 
		standardSampleLocations, 
		optimalBufferCopyOffsetAlignment, 
		optimalBufferCopyRowPitchAlignment, 
		nonCoherentAtomSize, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(8)
			member(8)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			array(4, 3)
			member(4)
			array(4, 3)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			array(4, 2)
			array(4, 2)
			member(4)
			member(NativeSizes.SIZE_T)
			member(8)
			member(8)
			member(8)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			array(4, 2)
			array(4, 2)
			member(4)
			member(4)
			member(4)
			member(4)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceLimits(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceLimits(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PhysicalDeviceLimits(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}