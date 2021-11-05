// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkShaderModuleCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkShaderModuleCreateFlags  flags
 *         size_t                     codeSize
 *         uint32_t*                  pCode
 *     }
 * 
 *     Valid pNext types:
 *         - VkShaderModuleValidationCacheCreateInfoEXT
 */
@JvmInline
value class ShaderModuleCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: ShaderModuleCreateFlags
		get()      = ShaderModuleCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var codeSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pCode: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)


}