// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineCoverageReductionStateCreateInfoNV {
 *         VkStructureType                                sType
 *         void*                                          pNext (must be null)
 *         VkPipelineCoverageReductionStateCreateFlagsNV  flags (reserved, must be zero)
 *         VkCoverageReductionModeNV                      coverageReductionMode
 *     }
 */
@JvmInline
value class PipelineCoverageReductionStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var coverageReductionMode: CoverageReductionMode
		get()      = CoverageReductionMode.values().first { it.value == Unsafe.getInt(address + 20) }
		set(value) = Unsafe.setInt(address + 20, value.value)


}