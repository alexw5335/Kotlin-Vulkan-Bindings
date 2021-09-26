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
 *     struct VkPhysicalDeviceShaderAtomicFloatFeaturesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderBufferFloat32Atomics
 *         VkBool32         shaderBufferFloat32AtomicAdd
 *         VkBool32         shaderBufferFloat64Atomics
 *         VkBool32         shaderBufferFloat64AtomicAdd
 *         VkBool32         shaderSharedFloat32Atomics
 *         VkBool32         shaderSharedFloat32AtomicAdd
 *         VkBool32         shaderSharedFloat64Atomics
 *         VkBool32         shaderSharedFloat64AtomicAdd
 *         VkBool32         shaderImageFloat32Atomics
 *         VkBool32         shaderImageFloat32AtomicAdd
 *         VkBool32         sparseImageFloat32Atomics
 *         VkBool32         sparseImageFloat32AtomicAdd
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderAtomicFloatFeaturesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var shaderBufferFloat32Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var shaderBufferFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var shaderBufferFloat64Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var shaderBufferFloat64AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var shaderSharedFloat32Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var shaderSharedFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var shaderSharedFloat64Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var shaderSharedFloat64AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var shaderImageFloat32Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var shaderImageFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	var sparseImageFloat32Atomics: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[12])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[12], value) }
	
	var sparseImageFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[13])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[13], value) }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceShaderAtomicFloatFeaturesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceShaderAtomicFloatFeaturesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_SHADER_ATOMIC_FLOAT_FEATURES
		}
	
	}


}