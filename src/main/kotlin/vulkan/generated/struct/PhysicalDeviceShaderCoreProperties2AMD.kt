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
 *     struct VkPhysicalDeviceShaderCoreProperties2AMD {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkShaderCorePropertiesFlagsAMD  shaderCoreFeatures
 *         uint32_t                        activeComputeUnitCount
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderCoreProperties2AMD(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderCoreFeatures: ShaderCorePropertiesFlags
		get()      = ShaderCorePropertiesFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var activeComputeUnitCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shaderCoreFeatures: ShaderCorePropertiesFlags,
		val activeComputeUnitCount: Int,
	) {
		override fun toString() = "PhysicalDeviceShaderCoreProperties2AMD(" + 
			"sType=$sType, " +
			"shaderCoreFeatures=$shaderCoreFeatures, " +
			"activeComputeUnitCount=$activeComputeUnitCount)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shaderCoreFeatures, 
		activeComputeUnitCount, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceShaderCoreProperties2AMD(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceShaderCoreProperties2AMD(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceShaderCoreProperties2AMD(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2
		}
	
	}


}