// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing

 *     struct VkGeometryNV {
 *         VkStructureType     sType
 *         void*               pNext (must be null)
 *         VkGeometryTypeKHR   geometryType
 *         VkGeometryDataNV    geometry
 *         VkGeometryFlagsKHR  flags
 *     }
 */
@JvmInline
value class Geometry(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var geometryType: GeometryType
		get()      = _GeometryType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var geometry: GeometryData
		get()      = GeometryData(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 136)
	
	var flags: GeometryFlags
		get()      = GeometryFlags(Unsafe.getInt(address + 160))
		set(value) = Unsafe.setInt(address + 160, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 168
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = Geometry(offset(index))
		
		operator fun set(index: Int, value: Geometry) = Unsafe.copy(value.address, offset(index), 168)
		
		inline fun forEach(block: (Geometry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (Geometry) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, Geometry) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}