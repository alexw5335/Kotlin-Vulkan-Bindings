// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPhysicalDeviceFeatures {
 *         VkBool32  robustBufferAccess
 *         VkBool32  fullDrawIndexUint32
 *         VkBool32  imageCubeArray
 *         VkBool32  independentBlend
 *         VkBool32  geometryShader
 *         VkBool32  tessellationShader
 *         VkBool32  sampleRateShading
 *         VkBool32  dualSrcBlend
 *         VkBool32  logicOp
 *         VkBool32  multiDrawIndirect
 *         VkBool32  drawIndirectFirstInstance
 *         VkBool32  depthClamp
 *         VkBool32  depthBiasClamp
 *         VkBool32  fillModeNonSolid
 *         VkBool32  depthBounds
 *         VkBool32  wideLines
 *         VkBool32  largePoints
 *         VkBool32  alphaToOne
 *         VkBool32  multiViewport
 *         VkBool32  samplerAnisotropy
 *         VkBool32  textureCompressionETC2
 *         VkBool32  textureCompressionASTC_LDR
 *         VkBool32  textureCompressionBC
 *         VkBool32  occlusionQueryPrecise
 *         VkBool32  pipelineStatisticsQuery
 *         VkBool32  vertexPipelineStoresAndAtomics
 *         VkBool32  fragmentStoresAndAtomics
 *         VkBool32  shaderTessellationAndGeometryPointSize
 *         VkBool32  shaderImageGatherExtended
 *         VkBool32  shaderStorageImageExtendedFormats
 *         VkBool32  shaderStorageImageMultisample
 *         VkBool32  shaderStorageImageReadWithoutFormat
 *         VkBool32  shaderStorageImageWriteWithoutFormat
 *         VkBool32  shaderUniformBufferArrayDynamicIndexing
 *         VkBool32  shaderSampledImageArrayDynamicIndexing
 *         VkBool32  shaderStorageBufferArrayDynamicIndexing
 *         VkBool32  shaderStorageImageArrayDynamicIndexing
 *         VkBool32  shaderClipDistance
 *         VkBool32  shaderCullDistance
 *         VkBool32  shaderFloat64
 *         VkBool32  shaderInt64
 *         VkBool32  shaderInt16
 *         VkBool32  shaderResourceResidency
 *         VkBool32  shaderResourceMinLod
 *         VkBool32  sparseBinding
 *         VkBool32  sparseResidencyBuffer
 *         VkBool32  sparseResidencyImage2D
 *         VkBool32  sparseResidencyImage3D
 *         VkBool32  sparseResidency2Samples
 *         VkBool32  sparseResidency4Samples
 *         VkBool32  sparseResidency8Samples
 *         VkBool32  sparseResidency16Samples
 *         VkBool32  sparseResidencyAliased
 *         VkBool32  variableMultisampleRate
 *         VkBool32  inheritedQueries
 *     }
 */
@JvmInline
value class PhysicalDeviceFeatures(override val address: Long) : Addressable {
	
	
	var robustBufferAccess: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var fullDrawIndexUint32: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var imageCubeArray: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var independentBlend: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var geometryShader: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var tessellationShader: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var sampleRateShading: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var dualSrcBlend: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var logicOp: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var multiDrawIndirect: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var drawIndirectFirstInstance: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var depthClamp: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var depthBiasClamp: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var fillModeNonSolid: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var depthBounds: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var wideLines: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var largePoints: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var alphaToOne: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var multiViewport: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var samplerAnisotropy: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var textureCompressionETC2: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var textureCompressionASTC_LDR: Int
		get()      = Unsafe.getInt(address + 84)
		set(value) = Unsafe.setInt(address + 84, value)
	
	var textureCompressionBC: Int
		get()      = Unsafe.getInt(address + 88)
		set(value) = Unsafe.setInt(address + 88, value)
	
	var occlusionQueryPrecise: Int
		get()      = Unsafe.getInt(address + 92)
		set(value) = Unsafe.setInt(address + 92, value)
	
	var pipelineStatisticsQuery: Int
		get()      = Unsafe.getInt(address + 96)
		set(value) = Unsafe.setInt(address + 96, value)
	
	var vertexPipelineStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + 100)
		set(value) = Unsafe.setInt(address + 100, value)
	
	var fragmentStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + 104)
		set(value) = Unsafe.setInt(address + 104, value)
	
	var shaderTessellationAndGeometryPointSize: Int
		get()      = Unsafe.getInt(address + 108)
		set(value) = Unsafe.setInt(address + 108, value)
	
	var shaderImageGatherExtended: Int
		get()      = Unsafe.getInt(address + 112)
		set(value) = Unsafe.setInt(address + 112, value)
	
	var shaderStorageImageExtendedFormats: Int
		get()      = Unsafe.getInt(address + 116)
		set(value) = Unsafe.setInt(address + 116, value)
	
	var shaderStorageImageMultisample: Int
		get()      = Unsafe.getInt(address + 120)
		set(value) = Unsafe.setInt(address + 120, value)
	
	var shaderStorageImageReadWithoutFormat: Int
		get()      = Unsafe.getInt(address + 124)
		set(value) = Unsafe.setInt(address + 124, value)
	
	var shaderStorageImageWriteWithoutFormat: Int
		get()      = Unsafe.getInt(address + 128)
		set(value) = Unsafe.setInt(address + 128, value)
	
	var shaderUniformBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 132)
		set(value) = Unsafe.setInt(address + 132, value)
	
	var shaderSampledImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 136)
		set(value) = Unsafe.setInt(address + 136, value)
	
	var shaderStorageBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 140)
		set(value) = Unsafe.setInt(address + 140, value)
	
	var shaderStorageImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + 144)
		set(value) = Unsafe.setInt(address + 144, value)
	
	var shaderClipDistance: Int
		get()      = Unsafe.getInt(address + 148)
		set(value) = Unsafe.setInt(address + 148, value)
	
	var shaderCullDistance: Int
		get()      = Unsafe.getInt(address + 152)
		set(value) = Unsafe.setInt(address + 152, value)
	
	var shaderFloat64: Int
		get()      = Unsafe.getInt(address + 156)
		set(value) = Unsafe.setInt(address + 156, value)
	
	var shaderInt64: Int
		get()      = Unsafe.getInt(address + 160)
		set(value) = Unsafe.setInt(address + 160, value)
	
	var shaderInt16: Int
		get()      = Unsafe.getInt(address + 164)
		set(value) = Unsafe.setInt(address + 164, value)
	
	var shaderResourceResidency: Int
		get()      = Unsafe.getInt(address + 168)
		set(value) = Unsafe.setInt(address + 168, value)
	
	var shaderResourceMinLod: Int
		get()      = Unsafe.getInt(address + 172)
		set(value) = Unsafe.setInt(address + 172, value)
	
	var sparseBinding: Int
		get()      = Unsafe.getInt(address + 176)
		set(value) = Unsafe.setInt(address + 176, value)
	
	var sparseResidencyBuffer: Int
		get()      = Unsafe.getInt(address + 180)
		set(value) = Unsafe.setInt(address + 180, value)
	
	var sparseResidencyImage2D: Int
		get()      = Unsafe.getInt(address + 184)
		set(value) = Unsafe.setInt(address + 184, value)
	
	var sparseResidencyImage3D: Int
		get()      = Unsafe.getInt(address + 188)
		set(value) = Unsafe.setInt(address + 188, value)
	
	var sparseResidency2Samples: Int
		get()      = Unsafe.getInt(address + 192)
		set(value) = Unsafe.setInt(address + 192, value)
	
	var sparseResidency4Samples: Int
		get()      = Unsafe.getInt(address + 196)
		set(value) = Unsafe.setInt(address + 196, value)
	
	var sparseResidency8Samples: Int
		get()      = Unsafe.getInt(address + 200)
		set(value) = Unsafe.setInt(address + 200, value)
	
	var sparseResidency16Samples: Int
		get()      = Unsafe.getInt(address + 204)
		set(value) = Unsafe.setInt(address + 204, value)
	
	var sparseResidencyAliased: Int
		get()      = Unsafe.getInt(address + 208)
		set(value) = Unsafe.setInt(address + 208, value)
	
	var variableMultisampleRate: Int
		get()      = Unsafe.getInt(address + 212)
		set(value) = Unsafe.setInt(address + 212, value)
	
	var inheritedQueries: Int
		get()      = Unsafe.getInt(address + 216)
		set(value) = Unsafe.setInt(address + 216, value)


}