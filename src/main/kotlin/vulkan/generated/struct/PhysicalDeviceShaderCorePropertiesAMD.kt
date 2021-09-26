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
 *     struct VkPhysicalDeviceShaderCorePropertiesAMD {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderEngineCount
 *         uint32_t         shaderArraysPerEngineCount
 *         uint32_t         computeUnitsPerShaderArray
 *         uint32_t         simdPerComputeUnit
 *         uint32_t         wavefrontsPerSimd
 *         uint32_t         wavefrontSize
 *         uint32_t         sgprsPerSimd
 *         uint32_t         minSgprAllocation
 *         uint32_t         maxSgprAllocation
 *         uint32_t         sgprAllocationGranularity
 *         uint32_t         vgprsPerSimd
 *         uint32_t         minVgprAllocation
 *         uint32_t         maxVgprAllocation
 *         uint32_t         vgprAllocationGranularity
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderCorePropertiesAMD(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderEngineCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var shaderArraysPerEngineCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var computeUnitsPerShaderArray: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var simdPerComputeUnit: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var wavefrontsPerSimd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var wavefrontSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var sgprsPerSimd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var minSgprAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var maxSgprAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var sgprAllocationGranularity: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var vgprsPerSimd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var minVgprAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	var maxVgprAllocation: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[14])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[14], value) }
	
	var vgprAllocationGranularity: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[15])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[15], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shaderEngineCount: Int,
		val shaderArraysPerEngineCount: Int,
		val computeUnitsPerShaderArray: Int,
		val simdPerComputeUnit: Int,
		val wavefrontsPerSimd: Int,
		val wavefrontSize: Int,
		val sgprsPerSimd: Int,
		val minSgprAllocation: Int,
		val maxSgprAllocation: Int,
		val sgprAllocationGranularity: Int,
		val vgprsPerSimd: Int,
		val minVgprAllocation: Int,
		val maxVgprAllocation: Int,
		val vgprAllocationGranularity: Int,
	) {
		override fun toString() = "PhysicalDeviceShaderCorePropertiesAMD(" + 
			"sType=$sType, " +
			"shaderEngineCount=$shaderEngineCount, " +
			"shaderArraysPerEngineCount=$shaderArraysPerEngineCount, " +
			"computeUnitsPerShaderArray=$computeUnitsPerShaderArray, " +
			"simdPerComputeUnit=$simdPerComputeUnit, " +
			"wavefrontsPerSimd=$wavefrontsPerSimd, " +
			"wavefrontSize=$wavefrontSize, " +
			"sgprsPerSimd=$sgprsPerSimd, " +
			"minSgprAllocation=$minSgprAllocation, " +
			"maxSgprAllocation=$maxSgprAllocation, " +
			"sgprAllocationGranularity=$sgprAllocationGranularity, " +
			"vgprsPerSimd=$vgprsPerSimd, " +
			"minVgprAllocation=$minVgprAllocation, " +
			"maxVgprAllocation=$maxVgprAllocation, " +
			"vgprAllocationGranularity=$vgprAllocationGranularity)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shaderEngineCount, 
		shaderArraysPerEngineCount, 
		computeUnitsPerShaderArray, 
		simdPerComputeUnit, 
		wavefrontsPerSimd, 
		wavefrontSize, 
		sgprsPerSimd, 
		minSgprAllocation, 
		maxSgprAllocation, 
		sgprAllocationGranularity, 
		vgprsPerSimd, 
		minVgprAllocation, 
		maxVgprAllocation, 
		vgprAllocationGranularity, 
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceShaderCorePropertiesAMD(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceShaderCorePropertiesAMD(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceShaderCorePropertiesAMD(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES
		}
	
	}


}