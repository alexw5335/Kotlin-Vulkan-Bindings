// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_AMD_shader_info

 *     struct VkShaderResourceUsageAMD {
 *         uint32_t  numUsedVgprs
 *         uint32_t  numUsedSgprs
 *         uint32_t  ldsSizePerLocalWorkGroup
 *         size_t    ldsUsageSizeInBytes
 *         size_t    scratchMemUsageInBytes
 *     }
 */
@JvmInline
value class ShaderResourceUsage(override val address: Long) : Addressable {
	
	
	var numUsedVgprs: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var numUsedSgprs: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var ldsSizePerLocalWorkGroup: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var ldsUsageSizeInBytes: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var scratchMemUsageInBytes: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)


}