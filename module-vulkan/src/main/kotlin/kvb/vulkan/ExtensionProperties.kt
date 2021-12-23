// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkExtensionProperties {
 *         char      extensionName[256]
 *         uint32_t  specVersion
 *     }
 */
@JvmInline
value class ExtensionProperties(override val address: Long) : Addressable {
	
	
	var extensionName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 0, 256)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 260
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = ExtensionProperties(offset(index))
		
		operator fun set(index: Int, value: ExtensionProperties) = Unsafe.copy(value.address, offset(index), 260)
		
		inline fun forEach(block: (ExtensionProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ExtensionProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, ExtensionProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}