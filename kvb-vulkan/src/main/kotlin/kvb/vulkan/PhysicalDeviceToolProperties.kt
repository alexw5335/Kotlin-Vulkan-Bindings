// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer

/**
 *     struct VkPhysicalDeviceToolPropertiesEXT {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         char                   name[256]
 *         char                   version[256]
 *         VkToolPurposeFlagsEXT  purposes
 *         char                   description[256]
 *         char                   layer[256]
 *     }
 */
@JvmInline
value class PhysicalDeviceToolProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 256)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)
	
	var version: DirectByteBuffer
		get()      = DirectByteBuffer(address + 272, 256)
		set(value) = Unsafe.copy(value.address, address + 272, value.byteSize)
	
	var purposes: ToolPurposeFlags
		get()      = ToolPurposeFlags(Unsafe.getInt(address + 528))
		set(value) = Unsafe.setInt(address + 528, value.value)
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + 532, 256)
		set(value) = Unsafe.copy(value.address, address + 532, value.byteSize)
	
	var layer: DirectByteBuffer
		get()      = DirectByteBuffer(address + 788, 256)
		set(value) = Unsafe.copy(value.address, address + 788, value.byteSize)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 1048
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = PhysicalDeviceToolProperties(offset(index))
		
		operator fun set(index: Int, value: PhysicalDeviceToolProperties) = Unsafe.copy(value.address, offset(index), 1048)
		
		inline fun forEach(block: (PhysicalDeviceToolProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PhysicalDeviceToolProperties) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, PhysicalDeviceToolProperties) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}