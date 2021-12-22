// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPushConstantRange {
 *         VkShaderStageFlags  stageFlags
 *         uint32_t            offset
 *         uint32_t            size
 *     }
 */
@JvmInline
value class PushConstantRange(override val address: Long) : Addressable {
	
	
	var stageFlags: ShaderStageFlags
		get()      = ShaderStageFlags(Unsafe.getInt(address + 0))
		set(value) = Unsafe.setInt(address + 0, value.value)
	
	var offset: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var size: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 12
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PushConstantRange(offset(index))
		
		operator fun set(index: Int, value: PushConstantRange) = Unsafe.copy(value.address, offset(index), 12)
		
		inline fun forEach(block: (PushConstantRange) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PushConstantRange) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PushConstantRange) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}