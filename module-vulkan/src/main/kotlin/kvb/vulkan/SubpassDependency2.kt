// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkSubpassDependency2 {
 *         VkStructureType       sType
 *         void*                 pNext
 *         uint32_t              srcSubpass
 *         uint32_t              dstSubpass
 *         VkPipelineStageFlags  srcStageMask
 *         VkPipelineStageFlags  dstStageMask
 *         VkAccessFlags         srcAccessMask
 *         VkAccessFlags         dstAccessMask
 *         VkDependencyFlags     dependencyFlags
 *         int32_t               viewOffset
 *     }
 * 
 *     Valid pNext types:
 *         - VkMemoryBarrier2KHR
 */
@JvmInline
value class SubpassDependency2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var srcSubpass: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var dstSubpass: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var srcStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var dstStageMask: PipelineStageFlags
		get()      = PipelineStageFlags(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + 40))
		set(value) = Unsafe.setInt(address + 40, value.value)
	
	var viewOffset: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 48
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = SubpassDependency2(offset(index))
		
		operator fun set(index: Int, value: SubpassDependency2) = Unsafe.copy(value.address, offset(index), 48)
		
		inline fun forEach(block: (SubpassDependency2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SubpassDependency2) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, SubpassDependency2) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}