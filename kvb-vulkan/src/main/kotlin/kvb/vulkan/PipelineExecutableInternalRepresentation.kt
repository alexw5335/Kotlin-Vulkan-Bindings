// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineExecutableInternalRepresentationKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char             name[256]
 *         char             description[256]
 *         VkBool32         isText
 *         size_t           dataSize
 *         void*            pData
 *     }
 */
@JvmInline
value class PipelineExecutableInternalRepresentation(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 256)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 272, 256)
		set(value) = Unsafe.copy(value.address, address + 272, value.byteSize)
	
	var isText: Int
		get()      = Unsafe.getInt(address + 528)
		set(value) = Unsafe.setInt(address + 528, value)
	
	var dataSize: Long
		get()      = Unsafe.getLong(address + 536)
		set(value) = Unsafe.setLong(address + 536, value)
	
	var pData: Long
		get()      = Unsafe.getLong(address + 544)
		set(value) = Unsafe.setLong(address + 544, value)
	
	
	
	var data: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 544), dataSize.toInt())
		set(value) { Unsafe.setLong(address + 544, value.address); dataSize = value.capacity.toLong() }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 552
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PipelineExecutableInternalRepresentation(offset(index))
		
		operator fun set(index: Int, value: PipelineExecutableInternalRepresentation) = Unsafe.copy(value.address, offset(index), 552)
		
		inline fun forEach(block: (PipelineExecutableInternalRepresentation) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PipelineExecutableInternalRepresentation) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PipelineExecutableInternalRepresentation) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}