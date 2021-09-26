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
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var fullDrawIndexUint32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var imageCubeArray: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var independentBlend: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var geometryShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var tessellationShader: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var sampleRateShading: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var dualSrcBlend: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var logicOp: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var multiDrawIndirect: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var drawIndirectFirstInstance: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var depthClamp: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var depthBiasClamp: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var fillModeNonSolid: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var depthBounds: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var wideLines: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var largePoints: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var alphaToOne: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var multiViewport: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var samplerAnisotropy: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var textureCompressionETC2: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var textureCompressionASTC_LDR: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	var textureCompressionBC: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[22])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[22], value) }
	
	var occlusionQueryPrecise: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[23])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[23], value) }
	
	var pipelineStatisticsQuery: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[24])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[24], value) }
	
	var vertexPipelineStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[25])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[25], value) }
	
	var fragmentStoresAndAtomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[26])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[26], value) }
	
	var shaderTessellationAndGeometryPointSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[27])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[27], value) }
	
	var shaderImageGatherExtended: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[28])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[28], value) }
	
	var shaderStorageImageExtendedFormats: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[29])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[29], value) }
	
	var shaderStorageImageMultisample: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[30])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[30], value) }
	
	var shaderStorageImageReadWithoutFormat: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[31])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[31], value) }
	
	var shaderStorageImageWriteWithoutFormat: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[32])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[32], value) }
	
	var shaderUniformBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[33])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[33], value) }
	
	var shaderSampledImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[34])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[34], value) }
	
	var shaderStorageBufferArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[35])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[35], value) }
	
	var shaderStorageImageArrayDynamicIndexing: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[36])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[36], value) }
	
	var shaderClipDistance: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[37])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[37], value) }
	
	var shaderCullDistance: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[38])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[38], value) }
	
	var shaderFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[39])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[39], value) }
	
	var shaderInt64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[40])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[40], value) }
	
	var shaderInt16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[41])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[41], value) }
	
	var shaderResourceResidency: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[42])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[42], value) }
	
	var shaderResourceMinLod: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[43])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[43], value) }
	
	var sparseBinding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[44])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[44], value) }
	
	var sparseResidencyBuffer: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[45])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[45], value) }
	
	var sparseResidencyImage2D: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[46])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[46], value) }
	
	var sparseResidencyImage3D: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[47])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[47], value) }
	
	var sparseResidency2Samples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[48])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[48], value) }
	
	var sparseResidency4Samples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[49])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[49], value) }
	
	var sparseResidency8Samples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[50])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[50], value) }
	
	var sparseResidency16Samples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[51])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[51], value) }
	
	var sparseResidencyAliased: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[52])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[52], value) }
	
	var variableMultisampleRate: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[53])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[53], value) }
	
	var inheritedQueries: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[54])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[54], value) }
	
	
	
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
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceFeatures(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFeatures(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFeatures(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}