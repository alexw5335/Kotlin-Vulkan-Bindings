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
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxUpdateAfterBindDescriptorsInAllPools: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var shaderUniformBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var shaderSampledImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderStorageBufferArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var shaderStorageImageArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var shaderInputAttachmentArrayNonUniformIndexingNative: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var robustBufferAccessUpdateAfterBind: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var quadDivergentImplicitLod: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var maxPerStageDescriptorUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var maxPerStageDescriptorUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var maxPerStageDescriptorUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var maxPerStageDescriptorUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var maxPerStageDescriptorUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var maxPerStageDescriptorUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var maxPerStageUpdateAfterBindResources: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var maxDescriptorSetUpdateAfterBindSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var maxDescriptorSetUpdateAfterBindUniformBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	var maxDescriptorSetUpdateAfterBindUniformBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[19])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[19], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[20])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[20], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageBuffersDynamic: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[21])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[21], value) }
	
	var maxDescriptorSetUpdateAfterBindSampledImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[22])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[22], value) }
	
	var maxDescriptorSetUpdateAfterBindStorageImages: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[23])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[23], value) }
	
	var maxDescriptorSetUpdateAfterBindInputAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[24])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[24], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
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
	) {
		override fun toString() = "PhysicalDeviceDescriptorIndexingProperties(" + 
			"sType=$sType, " +
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
			"maxDescriptorSetUpdateAfterBindInputAttachments=$maxDescriptorSetUpdateAfterBindInputAttachments)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
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
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
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
		
		val NULL = PhysicalDeviceDescriptorIndexingProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceDescriptorIndexingProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceDescriptorIndexingProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_PROPERTIES
		}
	
	}


}