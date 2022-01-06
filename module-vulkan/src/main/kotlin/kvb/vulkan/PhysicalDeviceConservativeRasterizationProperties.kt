// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_conservative_rasterization

 *     struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         float            primitiveOverestimationSize
 *         float            maxExtraPrimitiveOverestimationSize
 *         float            extraPrimitiveOverestimationSizeGranularity
 *         VkBool32         primitiveUnderestimation
 *         VkBool32         conservativePointAndLineRasterization
 *         VkBool32         degenerateTrianglesRasterized
 *         VkBool32         degenerateLinesRasterized
 *         VkBool32         fullyCoveredFragmentShaderInputVariable
 *         VkBool32         conservativeRasterizationPostDepthCoverage
 *     }
 */
@JvmInline
value class PhysicalDeviceConservativeRasterizationProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var primitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + 16)
		set(value) = Unsafe.setFloat(address + 16, value)
	
	var maxExtraPrimitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + 20)
		set(value) = Unsafe.setFloat(address + 20, value)
	
	var extraPrimitiveOverestimationSizeGranularity: Float
		get()      = Unsafe.getFloat(address + 24)
		set(value) = Unsafe.setFloat(address + 24, value)
	
	var primitiveUnderestimation: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var conservativePointAndLineRasterization: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var degenerateTrianglesRasterized: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var degenerateLinesRasterized: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var fullyCoveredFragmentShaderInputVariable: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var conservativeRasterizationPostDepthCoverage: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)


}