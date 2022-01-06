// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_pipeline_executable_properties

 *     struct VkPipelineExecutablePropertiesKHR {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkShaderStageFlags  stages
 *         char                name[256]
 *         char                description[256]
 *         uint32_t            subgroupSize
 *     }
 */
@JvmInline
value class PipelineExecutableProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var stages: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 20, 256)
		set(value) = Unsafe.copy(value.address, address + 20, value.byteSize)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 276, 256)
		set(value) = Unsafe.copy(value.address, address + 276, value.byteSize)
	
	var subgroupSize: Int
		get()      = Unsafe.getInt(address + 532)
		set(value) = Unsafe.setInt(address + 532, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 536
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineExecutableProperties(offset(index))
		
		operator fun set(index: Int, value: PipelineExecutableProperties) = Unsafe.copy(value.address, offset(index), 536)
		
		inline fun forEach(block: (PipelineExecutableProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineExecutableProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineExecutableProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}