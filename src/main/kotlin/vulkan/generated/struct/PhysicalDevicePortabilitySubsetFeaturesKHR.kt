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
 *     struct VkPhysicalDevicePortabilitySubsetFeaturesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         constantAlphaColorBlendFactors
 *         VkBool32         events
 *         VkBool32         imageViewFormatReinterpretation
 *         VkBool32         imageViewFormatSwizzle
 *         VkBool32         imageView2DOn3DImage
 *         VkBool32         multisampleArrayImage
 *         VkBool32         mutableComparisonSamplers
 *         VkBool32         pointPolygons
 *         VkBool32         samplerMipLodBias
 *         VkBool32         separateStencilMaskRef
 *         VkBool32         shaderSampleRateInterpolationFunctions
 *         VkBool32         tessellationIsolines
 *         VkBool32         tessellationPointMode
 *         VkBool32         triangleFans
 *         VkBool32         vertexAttributeAccessBeyondStride
 *     }
 */
@JvmInline
value class PhysicalDevicePortabilitySubsetFeaturesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var constantAlphaColorBlendFactors: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var events: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var imageViewFormatReinterpretation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var imageViewFormatSwizzle: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var imageView2DOn3DImage: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var multisampleArrayImage: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var mutableComparisonSamplers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var pointPolygons: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var samplerMipLodBias: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var separateStencilMaskRef: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var shaderSampleRateInterpolationFunctions: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var tessellationIsolines: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var tessellationPointMode: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var triangleFans: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	var vertexAttributeAccessBeyondStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[16])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[16], value) }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDevicePortabilitySubsetFeaturesKHR(0)
		
		fun malloc(allocator: Allocator) = PhysicalDevicePortabilitySubsetFeaturesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDevicePortabilitySubsetFeaturesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_PORTABILITY_SUBSET_FEATURES
		}
	
	}


}