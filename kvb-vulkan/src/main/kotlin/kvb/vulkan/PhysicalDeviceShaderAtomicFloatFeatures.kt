// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

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
value class PhysicalDeviceShaderAtomicFloatFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderBufferFloat32Atomics: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderBufferFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var shaderBufferFloat64Atomics: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderBufferFloat64AtomicAdd: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderSharedFloat32Atomics: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderSharedFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderSharedFloat64Atomics: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderSharedFloat64AtomicAdd: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderImageFloat32Atomics: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var shaderImageFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var sparseImageFloat32Atomics: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var sparseImageFloat32AtomicAdd: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)


}