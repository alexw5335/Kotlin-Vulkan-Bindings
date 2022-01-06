// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_2

 *     struct VkPhysicalDeviceFloatControlsProperties {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkShaderFloatControlsIndependence  denormBehaviorIndependence
 *         VkShaderFloatControlsIndependence  roundingModeIndependence
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat16
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat32
 *         VkBool32                           shaderSignedZeroInfNanPreserveFloat64
 *         VkBool32                           shaderDenormPreserveFloat16
 *         VkBool32                           shaderDenormPreserveFloat32
 *         VkBool32                           shaderDenormPreserveFloat64
 *         VkBool32                           shaderDenormFlushToZeroFloat16
 *         VkBool32                           shaderDenormFlushToZeroFloat32
 *         VkBool32                           shaderDenormFlushToZeroFloat64
 *         VkBool32                           shaderRoundingModeRTEFloat16
 *         VkBool32                           shaderRoundingModeRTEFloat32
 *         VkBool32                           shaderRoundingModeRTEFloat64
 *         VkBool32                           shaderRoundingModeRTZFloat16
 *         VkBool32                           shaderRoundingModeRTZFloat32
 *         VkBool32                           shaderRoundingModeRTZFloat64
 *     }
 */
@JvmInline
value class PhysicalDeviceFloatControlsProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var denormBehaviorIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var roundingModeIndependence: ShaderFloatControlsIndependence
		get()      = _ShaderFloatControlsIndependence(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var shaderSignedZeroInfNanPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var shaderSignedZeroInfNanPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var shaderSignedZeroInfNanPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var shaderDenormPreserveFloat16: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var shaderDenormPreserveFloat32: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var shaderDenormPreserveFloat64: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var shaderDenormFlushToZeroFloat16: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var shaderDenormFlushToZeroFloat32: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var shaderDenormFlushToZeroFloat64: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)
	
	var shaderRoundingModeRTEFloat16: Int
		get()      = Unsafe.getInt(address + 60)
		set(value) = Unsafe.setInt(address + 60, value)
	
	var shaderRoundingModeRTEFloat32: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var shaderRoundingModeRTEFloat64: Int
		get()      = Unsafe.getInt(address + 68)
		set(value) = Unsafe.setInt(address + 68, value)
	
	var shaderRoundingModeRTZFloat16: Int
		get()      = Unsafe.getInt(address + 72)
		set(value) = Unsafe.setInt(address + 72, value)
	
	var shaderRoundingModeRTZFloat32: Int
		get()      = Unsafe.getInt(address + 76)
		set(value) = Unsafe.setInt(address + 76, value)
	
	var shaderRoundingModeRTZFloat64: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)


}