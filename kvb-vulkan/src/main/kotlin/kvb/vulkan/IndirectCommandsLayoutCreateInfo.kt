// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkIndirectCommandsLayoutCreateInfoNV {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkIndirectCommandsLayoutUsageFlagsNV  flags
 *         VkPipelineBindPoint                   pipelineBindPoint
 *         uint32_t                              tokenCount
 *         VkIndirectCommandsLayoutTokenNV*      pTokens
 *         uint32_t                              streamCount
 *         uint32_t*                             pStreamStrides
 *     }
 */
@JvmInline
value class IndirectCommandsLayoutCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: IndirectCommandsLayoutUsageFlags
		get()      = IndirectCommandsLayoutUsageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var pipelineBindPoint: PipelineBindPoint
		get()      = _PipelineBindPoint(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var tokenCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pTokens: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var streamCount: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var pStreamStrides: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var tokens: IndirectCommandsLayoutToken.Buffer
		get()      = IndirectCommandsLayoutToken.Buffer(Unsafe.getLong(address + 32), tokenCount)
		set(value) { Unsafe.setLong(address + 32, value.address); tokenCount = value.capacity }
	
	var streamStrides: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 48), streamCount)
		set(value) { Unsafe.setLong(address + 48, value.address); streamCount = value.capacity }


}