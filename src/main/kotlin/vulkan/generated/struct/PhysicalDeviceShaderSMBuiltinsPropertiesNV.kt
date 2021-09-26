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
 *     struct VkPhysicalDeviceShaderSMBuiltinsPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         shaderSMCount
 *         uint32_t         shaderWarpsPerSM
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderSMBuiltinsPropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderSMCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var shaderWarpsPerSM: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val shaderSMCount: Int,
		val shaderWarpsPerSM: Int,
	) {
		override fun toString() = "PhysicalDeviceShaderSMBuiltinsPropertiesNV(" + 
			"sType=$sType, " +
			"shaderSMCount=$shaderSMCount, " +
			"shaderWarpsPerSM=$shaderWarpsPerSM)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		shaderSMCount, 
		shaderWarpsPerSM, 
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
		
		val NULL = PhysicalDeviceShaderSMBuiltinsPropertiesNV(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceShaderSMBuiltinsPropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_SM_BUILTINS_PROPERTIES
		}
	
	}


}