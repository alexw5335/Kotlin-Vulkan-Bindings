// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

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
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var driverID: DriverId
		get()      = DriverId.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + 532)
		set(value) = Unsafe.copy(value.address, address + 532, 4)
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence.values().first { it.value == Unsafe.getInt(address + 536) }
		set(value) = Unsafe.setInt(address + 536, value.value)
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = ShaderFloatControlsIndependence.values().first { it.value == Unsafe.getInt(address + 540) }
		set(value) = Unsafe.setInt(address + 540, value.value)
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 544)
		set(value) = Unsafe.setInt(address + 544, value)
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 548)
		set(value) = Unsafe.setInt(address + 548, value)
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 552)
		set(value) = Unsafe.setInt(address + 552, value)
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 556)
		set(value) = Unsafe.setInt(address + 556, value)
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 560)
		set(value) = Unsafe.setInt(address + 560, value)
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 564)
		set(value) = Unsafe.setInt(address + 564, value)
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + 568)
		set(value) = Unsafe.setInt(address + 568, value)
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + 572)
		set(value) = Unsafe.setInt(address + 572, value)
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + 576)
		set(value) = Unsafe.setInt(address + 576, value)
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + 580)
		set(value) = Unsafe.setInt(address + 580, value)
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + 584)
		set(value) = Unsafe.setInt(address + 584, value)
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + 588)
		set(value) = Unsafe.setInt(address + 588, value)
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + 592)
		set(value) = Unsafe.setInt(address + 592, value)
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + 596)
		set(value) = Unsafe.setInt(address + 596, value)
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + 600)
		set(value) = Unsafe.setInt(address + 600, value)
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + 604)
		set(value) = Unsafe.setInt(address + 604, value)
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 608)
		set(value) = Unsafe.setInt(address + 608, value)
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 612)
		set(value) = Unsafe.setInt(address + 612, value)
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 616)
		set(value) = Unsafe.setInt(address + 616, value)
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 620)
		set(value) = Unsafe.setInt(address + 620, value)
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + 624)
		set(value) = Unsafe.setInt(address + 624, value)
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + 628)
		set(value) = Unsafe.setInt(address + 628, value)
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + 632)
		set(value) = Unsafe.setInt(address + 632, value)
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 636)
		set(value) = Unsafe.setInt(address + 636, value)
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 640)
		set(value) = Unsafe.setInt(address + 640, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 644)
		set(value) = Unsafe.setInt(address + 644, value)
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 648)
		set(value) = Unsafe.setInt(address + 648, value)
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 652)
		set(value) = Unsafe.setInt(address + 652, value)
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 656)
		set(value) = Unsafe.setInt(address + 656, value)
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + 660)
		set(value) = Unsafe.setInt(address + 660, value)
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + 664)
		set(value) = Unsafe.setInt(address + 664, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + 668)
		set(value) = Unsafe.setInt(address + 668, value)
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 672)
		set(value) = Unsafe.setInt(address + 672, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + 676)
		set(value) = Unsafe.setInt(address + 676, value)
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + 680)
		set(value) = Unsafe.setInt(address + 680, value)
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + 684)
		set(value) = Unsafe.setInt(address + 684, value)
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + 688)
		set(value) = Unsafe.setInt(address + 688, value)
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + 692)
		set(value) = Unsafe.setInt(address + 692, value)
	
	var supportedDepthResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 696))
		set(value) = Unsafe.setInt(address + 696, value.value)
	
	var supportedStencilResolveModes: ResolveModeFlags
		get()      = ResolveModeFlags(Unsafe.getInt(address + 700))
		set(value) = Unsafe.setInt(address + 700, value.value)
	
	var independentResolveNone: Int
		get()      = Unsafe.getInt(address + 704)
		set(value) = Unsafe.setInt(address + 704, value)
	
	var independentResolve: Int
		get()      = Unsafe.getInt(address + 708)
		set(value) = Unsafe.setInt(address + 708, value)
	
	var filterMinmaxSingleComponentFormats: Int
		get()      = Unsafe.getInt(address + 712)
		set(value) = Unsafe.setInt(address + 712, value)
	
	var filterMinmaxImageComponentMapping: Int
		get()      = Unsafe.getInt(address + 716)
		set(value) = Unsafe.setInt(address + 716, value)
	
	var maxTimelineSemaphoreValueDifference: Long
		get()      = Unsafe.getLong(address + 720)
		set(value) = Unsafe.setLong(address + 720, value)
	
	var framebufferIntegerColorSampleCounts: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 728))
		set(value) = Unsafe.setInt(address + 728, value.value)


}