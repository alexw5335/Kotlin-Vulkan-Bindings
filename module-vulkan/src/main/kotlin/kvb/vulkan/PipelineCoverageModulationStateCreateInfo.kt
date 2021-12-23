// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineCoverageModulationStateCreateInfoNV {
 *         VkStructureType                                 sType
 *         void*                                           pNext (must be null)
 *         VkPipelineCoverageModulationStateCreateFlagsNV  flags (reserved, must be zero)
 *         VkCoverageModulationModeNV                      coverageModulationMode
 *         VkBool32                                        coverageModulationTableEnable
 *         uint32_t                                        coverageModulationTableCount
 *         float*                                          pCoverageModulationTable
 *     }
 */
@JvmInline
value class PipelineCoverageModulationStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var coverageModulationMode: CoverageModulationMode
		get()      = _CoverageModulationMode(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var coverageModulationTableEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var coverageModulationTableCount: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var pCoverageModulationTable: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var coverageModulationTable: DirectFloatBuffer
		get()      = DirectFloatBuffer(Unsafe.getLong(address + 32), coverageModulationTableCount)
		set(value) { Unsafe.setLong(address + 32, value.address); coverageModulationTableCount = value.capacity }


}