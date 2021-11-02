// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureGeometryKHR {
 *         VkStructureType                         sType
 *         void*                                   pNext (must be null)
 *         VkGeometryTypeKHR                       geometryType
 *         VkAccelerationStructureGeometryDataKHR  geometry
 *         VkGeometryFlagsKHR                      flags
 *     }
 */
@JvmInline
value class AccelerationStructureGeometry(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var geometryType: GeometryType
		get()      = GeometryType.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var geometry: AccelerationStructureGeometryData
		get()      = AccelerationStructureGeometryData(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 64)
	
	var flags: GeometryFlags
		get()      = GeometryFlags(Unsafe.getInt(address + 88))
		set(value) = Unsafe.setInt(address + 88, value.value)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 96
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AccelerationStructureGeometry(offset(index))
		
		operator fun set(index: Int, value: AccelerationStructureGeometry) = Unsafe.copy(value.address, offset(index), 96)
		
		inline fun forEach(block: (AccelerationStructureGeometry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AccelerationStructureGeometry) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AccelerationStructureGeometry) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}