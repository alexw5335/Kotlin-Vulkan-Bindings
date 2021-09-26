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
value class PhysicalDeviceConservativeRasterizationPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var primitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[2], value) }
	
	var maxExtraPrimitiveOverestimationSize: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[3], value) }
	
	var extraPrimitiveOverestimationSizeGranularity: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[4], value) }
	
	var primitiveUnderestimation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var conservativePointAndLineRasterization: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var degenerateTrianglesRasterized: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var degenerateLinesRasterized: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var fullyCoveredFragmentShaderInputVariable: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var conservativeRasterizationPostDepthCoverage: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val primitiveOverestimationSize: Float,
		val maxExtraPrimitiveOverestimationSize: Float,
		val extraPrimitiveOverestimationSizeGranularity: Float,
		val primitiveUnderestimation: Int,
		val conservativePointAndLineRasterization: Int,
		val degenerateTrianglesRasterized: Int,
		val degenerateLinesRasterized: Int,
		val fullyCoveredFragmentShaderInputVariable: Int,
		val conservativeRasterizationPostDepthCoverage: Int,
	) {
		override fun toString() = "PhysicalDeviceConservativeRasterizationPropertiesEXT(" + 
			"sType=$sType, " +
			"primitiveOverestimationSize=$primitiveOverestimationSize, " +
			"maxExtraPrimitiveOverestimationSize=$maxExtraPrimitiveOverestimationSize, " +
			"extraPrimitiveOverestimationSizeGranularity=$extraPrimitiveOverestimationSizeGranularity, " +
			"primitiveUnderestimation=$primitiveUnderestimation, " +
			"conservativePointAndLineRasterization=$conservativePointAndLineRasterization, " +
			"degenerateTrianglesRasterized=$degenerateTrianglesRasterized, " +
			"degenerateLinesRasterized=$degenerateLinesRasterized, " +
			"fullyCoveredFragmentShaderInputVariable=$fullyCoveredFragmentShaderInputVariable, " +
			"conservativeRasterizationPostDepthCoverage=$conservativeRasterizationPostDepthCoverage)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		primitiveOverestimationSize, 
		maxExtraPrimitiveOverestimationSize, 
		extraPrimitiveOverestimationSizeGranularity, 
		primitiveUnderestimation, 
		conservativePointAndLineRasterization, 
		degenerateTrianglesRasterized, 
		degenerateLinesRasterized, 
		fullyCoveredFragmentShaderInputVariable, 
		conservativeRasterizationPostDepthCoverage, 
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceConservativeRasterizationPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceConservativeRasterizationPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES
		}
	
	}


}