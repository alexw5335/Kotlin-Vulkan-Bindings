// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkPipelineShaderStageCreateInfo {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkPipelineShaderStageCreateFlags  flags
 *         VkShaderStageFlagBits             stage
 *         VkShaderModule                    module
 *         char*                             pName
 *         VkSpecializationInfo*             pSpecializationInfo
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT
 */
@JvmInline
value class PipelineShaderStageCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: PipelineShaderStageCreateFlags
		get()      = PipelineShaderStageCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stage: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var module: ShaderModuleH
		get()      = ShaderModuleH(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var pName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pSpecializationInfo: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var name:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var specializationInfo: SpecializationInfo
		get()      = SpecializationInfo(Unsafe.getLong(address + 40))
		set(value) { Unsafe.setLong(address + 40, value.address) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineShaderStageCreateInfo(offset(index))
		
		operator fun set(index: Int, value: PipelineShaderStageCreateInfo) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (PipelineShaderStageCreateInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineShaderStageCreateInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineShaderStageCreateInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}