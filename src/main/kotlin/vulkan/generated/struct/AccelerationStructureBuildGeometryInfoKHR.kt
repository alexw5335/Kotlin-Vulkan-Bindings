// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
 *         VkAccelerationStructureGeometryKHR**  pGeometries
 *         VkAccelerationStructureGeometryKHR**  ppGeometries
 *         VkDeviceOrHostAddressKHR              scratchData
 *     }
 */
@JvmInline
value class AccelerationStructureBuildGeometryInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var type: AccelerationStructureType
		get()      = AccelerationStructureType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var flags: BuildAccelerationStructureFlags
		get()      = BuildAccelerationStructureFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var mode: BuildAccelerationStructureMode
		get()      = BuildAccelerationStructureMode(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var srcAccelerationStructure: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var dstAccelerationStructure: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address) }
	
	var geometryCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pGeometries: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var ppGeometries: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	var scratchData: DeviceOrHostAddressKHR
		get()      = DeviceOrHostAddressKHR(address + LAYOUT.offsets[10])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[10], value.structSize) }
	
	
	
	var geometries: AccelerationStructureGeometryKHR.Buffer
		get()      = AccelerationStructureGeometryKHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), geometryCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); geometryCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = AccelerationStructureBuildGeometryInfoKHR(offset(index))
		
		operator fun set(index: Int, value: AccelerationStructureBuildGeometryInfoKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (AccelerationStructureBuildGeometryInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (AccelerationStructureBuildGeometryInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "AccelerationStructureBuildGeometryInfoKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(DeviceOrHostAddressKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = AccelerationStructureBuildGeometryInfoKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = AccelerationStructureBuildGeometryInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO
		}
		
		fun calloc(allocator: Allocator) = AccelerationStructureBuildGeometryInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.ACCELERATION_STRUCTURE_BUILD_GEOMETRY_INFO }
		}
	
	}


}