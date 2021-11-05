// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkMutableDescriptorTypeListVALVE {
 *         uint32_t           descriptorTypeCount
 *         VkDescriptorType*  pDescriptorTypes
 *     }
 */
@JvmInline
value class MutableDescriptorTypeList(override val address: Long) : Addressable {
	
	
	var descriptorTypeCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pDescriptorTypes: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	
	
	var descriptorTypes: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 8), descriptorTypeCount)
		set(value) { Unsafe.setLong(address + 8, value.address); descriptorTypeCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 16
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = MutableDescriptorTypeList(offset(index))
		
		operator fun set(index: Int, value: MutableDescriptorTypeList) = Unsafe.copy(value.address, offset(index), 16)
		
		inline fun forEach(block: (MutableDescriptorTypeList) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (MutableDescriptorTypeList) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, MutableDescriptorTypeList) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}