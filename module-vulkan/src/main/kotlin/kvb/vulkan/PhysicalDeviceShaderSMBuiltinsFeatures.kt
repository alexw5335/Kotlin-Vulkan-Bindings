// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_shader_sm_builtins

 *     struct VkPhysicalDeviceShaderSMBuiltinsFeaturesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkBool32         shaderSMBuiltins
 *     }
 */
@JvmInline
value class PhysicalDeviceShaderSMBuiltinsFeatures(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var shaderSMBuiltins: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}