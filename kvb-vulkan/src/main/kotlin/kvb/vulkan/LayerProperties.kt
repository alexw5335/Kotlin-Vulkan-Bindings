// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkLayerProperties {
 *         char      layerName[256]
 *         uint32_t  specVersion
 *         uint32_t  implementationVersion
 *         char      description[256]
 *     }
 */
@JvmInline
value class LayerProperties(override val address: Long) : Addressable {
	
	
	var layerName: DirectByteBuffer
		get()      = DirectByteBuffer(address + 0, 256)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)
	
	var specVersion: Int
		get()      = Unsafe.getInt(address + 256)
		set(value) = Unsafe.setInt(address + 256, value)
	
	var implementationVersion: Int
		get()      = Unsafe.getInt(address + 260)
		set(value) = Unsafe.setInt(address + 260, value)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 264, 256)
		set(value) = Unsafe.copy(value.address, address + 264, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 520
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = LayerProperties(offset(index))
		
		operator fun set(index: Int, value: LayerProperties) = Unsafe.copy(value.address, offset(index), 520)
		
		inline fun forEach(block: (LayerProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (LayerProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, LayerProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}