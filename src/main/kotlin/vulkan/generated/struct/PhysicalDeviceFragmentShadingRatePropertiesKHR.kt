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
value class PhysicalDeviceFragmentShadingRatePropertiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var minFragmentShadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var maxFragmentShadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var maxFragmentShadingRateAttachmentTexelSizeAspectRatio: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var primitiveFragmentShadingRateWithMultipleViewports: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var layeredShadingRateAttachments: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var fragmentShadingRateNonTrivialCombinerOps: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var maxFragmentSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[8])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.structSize) }
	
	var maxFragmentSizeAspectRatio: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var maxFragmentShadingRateCoverageSamples: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var maxFragmentShadingRateRasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + LAYOUT.offsets[11]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value.bitfield) }
	
	var fragmentShadingRateWithShaderDepthStencilWrites: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var fragmentShadingRateWithSampleMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var fragmentShadingRateWithShaderSampleMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var fragmentShadingRateWithConservativeRasterization: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var fragmentShadingRateWithFragmentShaderInterlock: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	var fragmentShadingRateWithCustomSampleLocations: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[17])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[17], value) }
	
	var fragmentShadingRateStrictMultiplyCombiner: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[18])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[18], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val minFragmentShadingRateAttachmentTexelSize: Extent2D.Persistent,
		val maxFragmentShadingRateAttachmentTexelSize: Extent2D.Persistent,
		val maxFragmentShadingRateAttachmentTexelSizeAspectRatio: Int,
		val primitiveFragmentShadingRateWithMultipleViewports: Int,
		val layeredShadingRateAttachments: Int,
		val fragmentShadingRateNonTrivialCombinerOps: Int,
		val maxFragmentSize: Extent2D.Persistent,
		val maxFragmentSizeAspectRatio: Int,
		val maxFragmentShadingRateCoverageSamples: Int,
		val maxFragmentShadingRateRasterizationSamples: SampleCountFlags,
		val fragmentShadingRateWithShaderDepthStencilWrites: Int,
		val fragmentShadingRateWithSampleMask: Int,
		val fragmentShadingRateWithShaderSampleMask: Int,
		val fragmentShadingRateWithConservativeRasterization: Int,
		val fragmentShadingRateWithFragmentShaderInterlock: Int,
		val fragmentShadingRateWithCustomSampleLocations: Int,
		val fragmentShadingRateStrictMultiplyCombiner: Int,
	) {
		override fun toString() = "PhysicalDeviceFragmentShadingRatePropertiesKHR(" + 
			"sType=$sType, " +
			"minFragmentShadingRateAttachmentTexelSize=$minFragmentShadingRateAttachmentTexelSize, " +
			"maxFragmentShadingRateAttachmentTexelSize=$maxFragmentShadingRateAttachmentTexelSize, " +
			"maxFragmentShadingRateAttachmentTexelSizeAspectRatio=$maxFragmentShadingRateAttachmentTexelSizeAspectRatio, " +
			"primitiveFragmentShadingRateWithMultipleViewports=$primitiveFragmentShadingRateWithMultipleViewports, " +
			"layeredShadingRateAttachments=$layeredShadingRateAttachments, " +
			"fragmentShadingRateNonTrivialCombinerOps=$fragmentShadingRateNonTrivialCombinerOps, " +
			"maxFragmentSize=$maxFragmentSize, " +
			"maxFragmentSizeAspectRatio=$maxFragmentSizeAspectRatio, " +
			"maxFragmentShadingRateCoverageSamples=$maxFragmentShadingRateCoverageSamples, " +
			"maxFragmentShadingRateRasterizationSamples=$maxFragmentShadingRateRasterizationSamples, " +
			"fragmentShadingRateWithShaderDepthStencilWrites=$fragmentShadingRateWithShaderDepthStencilWrites, " +
			"fragmentShadingRateWithSampleMask=$fragmentShadingRateWithSampleMask, " +
			"fragmentShadingRateWithShaderSampleMask=$fragmentShadingRateWithShaderSampleMask, " +
			"fragmentShadingRateWithConservativeRasterization=$fragmentShadingRateWithConservativeRasterization, " +
			"fragmentShadingRateWithFragmentShaderInterlock=$fragmentShadingRateWithFragmentShaderInterlock, " +
			"fragmentShadingRateWithCustomSampleLocations=$fragmentShadingRateWithCustomSampleLocations, " +
			"fragmentShadingRateStrictMultiplyCombiner=$fragmentShadingRateStrictMultiplyCombiner)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		minFragmentShadingRateAttachmentTexelSize.asPersistent, 
		maxFragmentShadingRateAttachmentTexelSize.asPersistent, 
		maxFragmentShadingRateAttachmentTexelSizeAspectRatio, 
		primitiveFragmentShadingRateWithMultipleViewports, 
		layeredShadingRateAttachments, 
		fragmentShadingRateNonTrivialCombinerOps, 
		maxFragmentSize.asPersistent, 
		maxFragmentSizeAspectRatio, 
		maxFragmentShadingRateCoverageSamples, 
		maxFragmentShadingRateRasterizationSamples, 
		fragmentShadingRateWithShaderDepthStencilWrites, 
		fragmentShadingRateWithSampleMask, 
		fragmentShadingRateWithShaderSampleMask, 
		fragmentShadingRateWithConservativeRasterization, 
		fragmentShadingRateWithFragmentShaderInterlock, 
		fragmentShadingRateWithCustomSampleLocations, 
		fragmentShadingRateStrictMultiplyCombiner, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
			member(Extent2D.LAYOUT)
			member(4)
			member(4)
			member(4)
			member(4)
			member(Extent2D.LAYOUT)
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
		
		val NULL = PhysicalDeviceFragmentShadingRatePropertiesKHR(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceFragmentShadingRatePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_FRAGMENT_SHADING_RATE_PROPERTIES
		}
	
	}


}