// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

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
value class PhysicalDevicePortabilitySubsetFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var constantAlphaColorBlendFactors: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var events: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var imageViewFormatReinterpretation: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var imageViewFormatSwizzle: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var imageView2DOn3DImage: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var multisampleArrayImage: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var mutableComparisonSamplers: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pointPolygons: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var samplerMipLodBias: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var separateStencilMaskRef: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var shaderSampleRateInterpolationFunctions: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var tessellationIsolines: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var tessellationPointMode: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var triangleFans: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var vertexAttributeAccessBeyondStride: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)


}