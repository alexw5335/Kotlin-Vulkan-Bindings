// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_debug_utils

 *     struct VkDebugUtilsLabelEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char*            pLabelName
 *         float            color[4]
 *     }
 */
@JvmInline
value class DebugUtilsLabel(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pLabelName: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var color: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 24, 4)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	
	
	var labelName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DebugUtilsLabel(offset(index))
		
		operator fun set(index: Int, value: DebugUtilsLabel) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DebugUtilsLabel) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DebugUtilsLabel) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DebugUtilsLabel) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}