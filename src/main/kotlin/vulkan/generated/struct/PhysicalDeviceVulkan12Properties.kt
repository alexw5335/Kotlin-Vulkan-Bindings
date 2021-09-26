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
 *     struct VkPhysicalDeviceVulkan12Properties {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkDriverId                         driverID
 *         char                               driverName[256]
 *         char                               driverInfo[256]
 *         VkConformanceVersion               conformanceVersion
 *         VkShaderFloatControlsIndependence  denormBehaviorIndependence
 *         VkShaderFloatControlsIndependence  roundingModeIndependence
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat16
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat32
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat64
 *         VkBool32                           shaderDenormPreserveFloat16
 *         VkBool32                           shaderDenormPreserveFloat32
 *         VkBool32                           shaderDenormPreserveFloat64
 *         VkBool32                           shaderDenormFlushToZeroFloat16
 *         VkBool32                           shaderDenormFlushToZeroFloat32
 *         VkBool32                           shaderDenormFlushToZeroFloat64
 *         VkBool32                           shaderRoundingModeRTEFloat16
 *         VkBool32                           shaderRoundingModeRTEFloat32
 *         VkBool32                           shaderRoundingModeRTEFloat64
 *         VkBool32                           shaderRoundingModeRTZFloat16
 *         VkBool32                           shaderRoundingModeRTZFloat32
 *         VkBool32                           shaderRoundingModeRTZFloat64
 *         uint32_t                           maxUpdateAfterBindDescriptorsInAllPools
 *         VkBool32                           shaderUniformBufferArrayNonUniformIndexingNative
 *         VkBool32                           shaderSampledImageArrayNonUniformIndexingNative
 *         VkBool32                           shaderStorageBufferArrayNonUniformIndexingNative
 *         VkBool32                           shaderStorageImageArrayNonUniformIndexingNative
 *         VkBool32                           shaderInputAttachmentArrayNonUniformIndexingNative
 *         VkBool32                           robustBufferAccessUpdateAfterBind
 *         VkBool32                           quadDivergentImplicitLod
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindSamplers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindUniformBuffers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindStorageBuffers
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindSampledImages
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindStorageImages
 *         uint32_t                           maxPerStageDescriptorUpdateAfterBindInputAttachments
 *         uint32_t                           maxPerStageUpdateAfterBindResources
 *         uint32_t                           maxDescriptorSetUpdateAfterBindSamplers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindUniformBuffers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindUniformBuffersDynamic
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageBuffers
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageBuffersDynamic
 *         uint32_t                           maxDescriptorSetUpdateAfterBindSampledImages
 *         uint32_t                           maxDescriptorSetUpdateAfterBindStorageImages
 *         uint32_t                           maxDescriptorSetUpdateAfterBindInputAttachments
 *         VkResolveModeFlags                 supportedDepthResolveModes
 *         VkResolveModeFlags                 supportedStencilResolveModes
 *         VkBool32                           independentResolveNone
 *         VkBool32                           independentResolve
 *         VkBool32                           filterMinmaxSingleComponentFormats
 *         VkBool32                           filterMinmaxImageComponentMapping
 *         uint64_t                           maxTimelineSemaphoreValueDifference
 *         VkSampleCountFlags                 framebufferIntegerColorSampleCounts
 *     }
 */
@JvmInline
value class PhysicalDeviceVulkan12Properties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var driverID: DriverId
		get()      = DriverId(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence(Unsafe.getInt(address + LAYOUT.offsets[7]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value.id) }
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[22])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[22], value) }
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[23])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[23], value) }
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[24])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[24], value) }
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[25])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[25], value) }
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[26])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[26], value) }
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[27])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[27], value) }
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[28])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[28], value) }
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[29])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[29], value) }
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[30])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[30], value) }
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[31])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[31], value) }
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[32])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[32], value) }
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[33])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[33], value) }
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[34])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[34], value) }
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[35])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[35], value) }
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[36])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[36], value) }
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[37])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[37], value) }
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[38])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[38], value) }
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[39])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[39], value) }
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[40])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[40], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[41])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[41], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[42])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[42], value) }
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[43])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[43], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[44])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[44], value) }
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[45])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[45], value) }
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[46]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[46], value.bitfield) }
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + LAYOUT.offsets[47]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[47], value.bitfield) }
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[48])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[48], value) }
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[49])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[49], value) }
	
	var filterMinmaxSingleComponentFormats: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[50])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[50], value) }
	
	var filterMinmaxImageComponentMapping: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[51])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[51], value) }
	
	var maxTimelineSemaphoreValueDifference: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[52])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[52], value) }
	
	var framebufferIntegerColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[53]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[53], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val driverID: DriverId,
		val driverName: String,
		val driverInfo: String,
		val conformanceVersion: ConformanceVersion.Persistent,
		val denormBehaviorIndependence: ShaderFloatControlsIndependence,
		val roundingModeIndependence: ShaderFloatControlsIndependence,
		val shaderSignedZeroInfNanPreserveFloat16: Int,
		val shaderSignedZeroInfNanPreserveFloat32: Int,
		val shaderSignedZeroInfNanPreserveFloat64: Int,
		val shaderDenormPreserveFloat16: Int,
		val shaderDenormPreserveFloat32: Int,
		val shaderDenormPreserveFloat64: Int,
		val shaderDenormFlushToZeroFloat16: Int,
		val shaderDenormFlushToZeroFloat32: Int,
		val shaderDenormFlushToZeroFloat64: Int,
		val shaderRoundingModeRTEFloat16: Int,
		val shaderRoundingModeRTEFloat32: Int,
		val shaderRoundingModeRTEFloat64: Int,
		val shaderRoundingModeRTZFloat16: Int,
		val shaderRoundingModeRTZFloat32: Int,
		val shaderRoundingModeRTZFloat64: Int,
		val maxUpdateAfterBindDescriptorsInAllPools: Int,
		val shaderUniformBufferArrayNonUniformIndexingNative: Int,
		val shaderSampledImageArrayNonUniformIndexingNative: Int,
		val shaderStorageBufferArrayNonUniformIndexingNative: Int,
		val shaderStorageImageArrayNonUniformIndexingNative: Int,
		val shaderInputAttachmentArrayNonUniformIndexingNative: Int,
		val robustBufferAccessUpdateAfterBind: Int,
		val quadDivergentImplicitLod: Int,
		val maxPerStageDescriptorUpdateAfterBindSamplers: Int,
		val maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int,
		val maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int,
		val maxPerStageDescriptorUpdateAfterBindSampledImages: Int,
		val maxPerStageDescriptorUpdateAfterBindStorageImages: Int,
		val maxPerStageDescriptorUpdateAfterBindInputAttachments: Int,
		val maxPerStageUpdateAfterBindResources: Int,
		val maxDescriptorSetUpdateAfterBindSamplers: Int,
		val maxDescriptorSetUpdateAfterBindUniformBuffers: Int,
		val maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int,
		val maxDescriptorSetUpdateAfterBindStorageBuffers: Int,
		val maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int,
		val maxDescriptorSetUpdateAfterBindSampledImages: Int,
		val maxDescriptorSetUpdateAfterBindStorageImages: Int,
		val maxDescriptorSetUpdateAfterBindInputAttachments: Int,
		val supportedDepthResolveModes: ResolveModeFlags,
		val supportedStencilResolveModes: ResolveModeFlags,
		val independentResolveNone: Int,
		val independentResolve: Int,
		val filterMinmaxSingleComponentFormats: Int,
		val filterMinmaxImageComponentMapping: Int,
		val maxTimelineSemaphoreValueDifference: Long,
		val framebufferIntegerColorSampleCounts: SampleCountFlags,
	) {
		override fun toString() = "PhysicalDeviceVulkan12Properties(" + 
			"sType=$sType, " +
			"driverID=$driverID, " +
			"driverName=$driverName, " +
			"driverInfo=$driverInfo, " +
			"conformanceVersion=$conformanceVersion, " +
			"denormBehaviorIndependence=$denormBehaviorIndependence, " +
			"roundingModeIndependence=$roundingModeIndependence, " +
			"shaderSignedZeroInfNanPreserveFloat16=$shaderSignedZeroInfNanPreserveFloat16, " +
			"shaderSignedZeroInfNanPreserveFloat32=$shaderSignedZeroInfNanPreserveFloat32, " +
			"shaderSignedZeroInfNanPreserveFloat64=$shaderSignedZeroInfNanPreserveFloat64, " +
			"shaderDenormPreserveFloat16=$shaderDenormPreserveFloat16, " +
			"shaderDenormPreserveFloat32=$shaderDenormPreserveFloat32, " +
			"shaderDenormPreserveFloat64=$shaderDenormPreserveFloat64, " +
			"shaderDenormFlushToZeroFloat16=$shaderDenormFlushToZeroFloat16, " +
			"shaderDenormFlushToZeroFloat32=$shaderDenormFlushToZeroFloat32, " +
			"shaderDenormFlushToZeroFloat64=$shaderDenormFlushToZeroFloat64, " +
			"shaderRoundingModeRTEFloat16=$shaderRoundingModeRTEFloat16, " +
			"shaderRoundingModeRTEFloat32=$shaderRoundingModeRTEFloat32, " +
			"shaderRoundingModeRTEFloat64=$shaderRoundingModeRTEFloat64, " +
			"shaderRoundingModeRTZFloat16=$shaderRoundingModeRTZFloat16, " +
			"shaderRoundingModeRTZFloat32=$shaderRoundingModeRTZFloat32, " +
			"shaderRoundingModeRTZFloat64=$shaderRoundingModeRTZFloat64, " +
			"maxUpdateAfterBindDescriptorsInAllPools=$maxUpdateAfterBindDescriptorsInAllPools, " +
			"shaderUniformBufferArrayNonUniformIndexingNative=$shaderUniformBufferArrayNonUniformIndexingNative, " +
			"shaderSampledImageArrayNonUniformIndexingNative=$shaderSampledImageArrayNonUniformIndexingNative, " +
			"shaderStorageBufferArrayNonUniformIndexingNative=$shaderStorageBufferArrayNonUniformIndexingNative, " +
			"shaderStorageImageArrayNonUniformIndexingNative=$shaderStorageImageArrayNonUniformIndexingNative, " +
			"shaderInputAttachmentArrayNonUniformIndexingNative=$shaderInputAttachmentArrayNonUniformIndexingNative, " +
			"robustBufferAccessUpdateAfterBind=$robustBufferAccessUpdateAfterBind, " +
			"quadDivergentImplicitLod=$quadDivergentImplicitLod, " +
			"maxPerStageDescriptorUpdateAfterBindSamplers=$maxPerStageDescriptorUpdateAfterBindSamplers, " +
			"maxPerStageDescriptorUpdateAfterBindUniformBuffers=$maxPerStageDescriptorUpdateAfterBindUniformBuffers, " +
			"maxPerStageDescriptorUpdateAfterBindStorageBuffers=$maxPerStageDescriptorUpdateAfterBindStorageBuffers, " +
			"maxPerStageDescriptorUpdateAfterBindSampledImages=$maxPerStageDescriptorUpdateAfterBindSampledImages, " +
			"maxPerStageDescriptorUpdateAfterBindStorageImages=$maxPerStageDescriptorUpdateAfterBindStorageImages, " +
			"maxPerStageDescriptorUpdateAfterBindInputAttachments=$maxPerStageDescriptorUpdateAfterBindInputAttachments, " +
			"maxPerStageUpdateAfterBindResources=$maxPerStageUpdateAfterBindResources, " +
			"maxDescriptorSetUpdateAfterBindSamplers=$maxDescriptorSetUpdateAfterBindSamplers, " +
			"maxDescriptorSetUpdateAfterBindUniformBuffers=$maxDescriptorSetUpdateAfterBindUniformBuffers, " +
			"maxDescriptorSetUpdateAfterBindUniformBuffersDynamic=$maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, " +
			"maxDescriptorSetUpdateAfterBindStorageBuffers=$maxDescriptorSetUpdateAfterBindStorageBuffers, " +
			"maxDescriptorSetUpdateAfterBindStorageBuffersDynamic=$maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, " +
			"maxDescriptorSetUpdateAfterBindSampledImages=$maxDescriptorSetUpdateAfterBindSampledImages, " +
			"maxDescriptorSetUpdateAfterBindStorageImages=$maxDescriptorSetUpdateAfterBindStorageImages, " +
			"maxDescriptorSetUpdateAfterBindInputAttachments=$maxDescriptorSetUpdateAfterBindInputAttachments, " +
			"supportedDepthResolveModes=$supportedDepthResolveModes, " +
			"supportedStencilResolveModes=$supportedStencilResolveModes, " +
			"independentResolveNone=$independentResolveNone, " +
			"independentResolve=$independentResolve, " +
			"filterMinmaxSingleComponentFormats=$filterMinmaxSingleComponentFormats, " +
			"filterMinmaxImageComponentMapping=$filterMinmaxImageComponentMapping, " +
			"maxTimelineSemaphoreValueDifference=$maxTimelineSemaphoreValueDifference, " +
			"framebufferIntegerColorSampleCounts=$framebufferIntegerColorSampleCounts)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		driverID, 
		Unsafe.decodeUtf8(driverName), 
		Unsafe.decodeUtf8(driverInfo), 
		conformanceVersion.asPersistent, 
		denormBehaviorIndependence, 
		roundingModeIndependence, 
		shaderSignedZeroInfNanPreserveFloat16, 
		shaderSignedZeroInfNanPreserveFloat32, 
		shaderSignedZeroInfNanPreserveFloat64, 
		shaderDenormPreserveFloat16, 
		shaderDenormPreserveFloat32, 
		shaderDenormPreserveFloat64, 
		shaderDenormFlushToZeroFloat16, 
		shaderDenormFlushToZeroFloat32, 
		shaderDenormFlushToZeroFloat64, 
		shaderRoundingModeRTEFloat16, 
		shaderRoundingModeRTEFloat32, 
		shaderRoundingModeRTEFloat64, 
		shaderRoundingModeRTZFloat16, 
		shaderRoundingModeRTZFloat32, 
		shaderRoundingModeRTZFloat64, 
		maxUpdateAfterBindDescriptorsInAllPools, 
		shaderUniformBufferArrayNonUniformIndexingNative, 
		shaderSampledImageArrayNonUniformIndexingNative, 
		shaderStorageBufferArrayNonUniformIndexingNative, 
		shaderStorageImageArrayNonUniformIndexingNative, 
		shaderInputAttachmentArrayNonUniformIndexingNative, 
		robustBufferAccessUpdateAfterBind, 
		quadDivergentImplicitLod, 
		maxPerStageDescriptorUpdateAfterBindSamplers, 
		maxPerStageDescriptorUpdateAfterBindUniformBuffers, 
		maxPerStageDescriptorUpdateAfterBindStorageBuffers, 
		maxPerStageDescriptorUpdateAfterBindSampledImages, 
		maxPerStageDescriptorUpdateAfterBindStorageImages, 
		maxPerStageDescriptorUpdateAfterBindInputAttachments, 
		maxPerStageUpdateAfterBindResources, 
		maxDescriptorSetUpdateAfterBindSamplers, 
		maxDescriptorSetUpdateAfterBindUniformBuffers, 
		maxDescriptorSetUpdateAfterBindUniformBuffersDynamic, 
		maxDescriptorSetUpdateAfterBindStorageBuffers, 
		maxDescriptorSetUpdateAfterBindStorageBuffersDynamic, 
		maxDescriptorSetUpdateAfterBindSampledImages, 
		maxDescriptorSetUpdateAfterBindStorageImages, 
		maxDescriptorSetUpdateAfterBindInputAttachments, 
		supportedDepthResolveModes, 
		supportedStencilResolveModes, 
		independentResolveNone, 
		independentResolve, 
		filterMinmaxSingleComponentFormats, 
		filterMinmaxImageComponentMapping, 
		maxTimelineSemaphoreValueDifference, 
		framebufferIntegerColorSampleCounts, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			array(1, 256)
			array(1, 256)
			member(ConformanceVersion.LAYOUT)
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
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceVulkan12Properties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceVulkan12Properties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceVulkan12Properties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_VULKAN_1_2_PROPERTIES
		}
	
	}


}