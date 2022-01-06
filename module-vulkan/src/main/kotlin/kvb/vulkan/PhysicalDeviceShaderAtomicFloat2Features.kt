// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_shader_atomic_float2

 *     struct VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderBufferFloat16Atomics
 *         VkBool32         shaderBufferFloat16AtomicAdd
 *         VkBool32         shaderBufferFloat16AtomicMinMax
 *         VkBool32         shaderBufferFloat32AtomicMinMax
 *         VkBool32         shaderBufferFloat64AtomicMinMax
 *         VkBool32         shaderSharedFloat16Atomics
 *         VkBool32         shaderSharedFloat16AtomicAdd
 *         VkBool32         shaderSharedFloat16AtomicMinMax
 *         VkBool32         shaderSharedFloat32AtomicMinMax
 *         VkBool32         shaderSharedFloat64AtomicMinMax
 *         VkBool32         shaderImageFloat32AtomicMinMax
 *         VkBool32         sparseImageFloat32AtomicMinMax
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderAtomicFloat2Features(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderBufferFloat16Atomics: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var shaderBufferFloat16AtomicAdd: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var shaderBufferFloat16AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderBufferFloat32AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderBufferFloat64AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderSharedFloat16Atomics: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderSharedFloat16AtomicAdd: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderSharedFloat16AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderSharedFloat32AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var shaderSharedFloat64AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var shaderImageFloat32AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var sparseImageFloat32AtomicMinMax: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)


}