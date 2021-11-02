// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAccelerationStructureBuildGeometryInfoKHR {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkAccelerationStructureTypeKHR        type
 *         VkBuildAccelerationStructureFlagsKHR  flags
 *         VkBuildAccelerationStructureModeKHR   mode
 *         VkAccelerationStructureKHR            srcAccelerationStructure
 *         VkAccelerationStructureKHR            dstAccelerationStructure
 *         uint32_t                              geometryCount
 *         VkAccelerationStructureGeometryKHR*   pGeometries
 *         VkAccelerationStructureGeometryKHR**  ppGeometries
 *         VkDeviceOrHostAddressKHR              scratchData
 *     }
 */
@JvmInline
value class AccelerationStructureBuildGeometryInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var type: AccelerationStructureType
		get()      = AccelerationStructureType.values().first { it.value == Unsafe.getInt(address + 16) }
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var flags: BuildAccelerationStructureFlags
		get()      = BuildAccelerationStructureFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var mode: BuildAccelerationStructureMode
		get()      = BuildAccelerationStructureMode.values().first { it.value == Unsafe.getInt(address + 24) }
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var srcAccelerationStructure: AccelerationStructureKHRH
		get()      = AccelerationStructureKHRH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	var dstAccelerationStructure: AccelerationStructureKHRH
		get()      = AccelerationStructureKHRH(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var geometryCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pGeometries: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var ppGeometries: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var scratchData: DeviceOrHostAddress
		get()      = DeviceOrHostAddress(address + 72)
		set(value) = Unsafe.copy(value.address, address + 72, 8)
	
	
	
	var geometries: AccelerationStructureGeometry.Buffer
		get()      = AccelerationStructureGeometry.Buffer(Unsafe.getLong(address + 56), geometryCount)
		set(value) { Unsafe.setLong(address + 56, value.address); geometryCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 80
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = AccelerationStructureBuildGeometryInfo(offset(index))
		
		operator fun set(index: Int, value: AccelerationStructureBuildGeometryInfo) = Unsafe.copy(value.address, offset(index), 80)
		
		inline fun forEach(block: (AccelerationStructureBuildGeometryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AccelerationStructureBuildGeometryInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, AccelerationStructureBuildGeometryInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}