// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineInputAssemblyStateCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext (must be null)
 *         VkPipelineInputAssemblyStateCreateFlags  flags (reserved, must be zero)
 *         VkPrimitiveTopology                      topology
 *         VkBool32                                 primitiveRestartEnable
 *     }
 */
@JvmInline
value class PipelineInputAssemblyStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var topology: PrimitiveTopology
		get()      = _PrimitiveTopology(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var primitiveRestartEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)


}