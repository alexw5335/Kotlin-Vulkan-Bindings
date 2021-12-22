// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSubpassDependency {
 *         uint32_t              srcSubpass
 *         uint32_t              dstSubpass
 *         VkPipelineStageFlags  srcStageMask
 *         VkPipelineStageFlags  dstStageMask
 *         VkAccessFlags         srcAccessMask
 *         VkAccessFlags         dstAccessMask
 *         VkDependencyFlags     dependencyFlags
 *     }
 */
@JvmInline
value class SubpassDependency(override val address: Long) : Addressable {
	
	
	var srcSubpass: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var dstSubpass: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var srcStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 8))
		set(value) = Unsafe.setInt(address + 8, value.value)
	
	var dstStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 12))
		set(value) = Unsafe.setInt(address + 12, value.value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 28
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDependency(offset(index))
		
		operator fun set(index: Int, value: SubpassDependency) = Unsafe.copy(value.address, offset(index), 28)
		
		inline fun forEach(block: (SubpassDependency) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDependency) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDependency) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}