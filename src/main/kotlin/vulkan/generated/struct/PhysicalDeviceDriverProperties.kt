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
 *     struct VkPhysicalDeviceDriverProperties {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         VkDriverId            driverID
 *         char                  driverName[256]
 *         char                  driverInfo[256]
 *         VkConformanceVersion  conformanceVersion
 *     }
 */
@JvmInline
value class PhysicalDeviceDriverProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var driverID: DriverId
		get()      = DriverId(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var driverName: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var driverInfo: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var conformanceVersion: ConformanceVersion
		get()      = ConformanceVersion(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val driverID: DriverId,
		val driverName: String,
		val driverInfo: String,
		val conformanceVersion: ConformanceVersion.Persistent,
	) {
		override fun toString() = "PhysicalDeviceDriverProperties(" + 
			"sType=$sType, " +
			"driverID=$driverID, " +
			"driverName=$driverName, " +
			"driverInfo=$driverInfo, " +
			"conformanceVersion=$conformanceVersion)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		driverID, 
		Unsafe.decodeUtf8(driverName), 
		Unsafe.decodeUtf8(driverInfo), 
		conformanceVersion.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			array(1, 256)
			array(1, 256)
			member(ConformanceVersion.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceDriverProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceDriverProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DRIVER_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceDriverProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DRIVER_PROPERTIES
		}
	
	}


}