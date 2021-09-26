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
 *     struct VkPhysicalDeviceIDProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint8_t          deviceUUID[16]
 *         uint8_t          driverUUID[16]
 *         uint8_t          deviceLUID[8]
 *         uint32_t         deviceNodeMask
 *         VkBool32         deviceLUIDValid
 *     }
 */
@JvmInline
value class PhysicalDeviceIDProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var deviceUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[2], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.byteSize) }
	
	var driverUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var deviceLUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 8)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var deviceNodeMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var deviceLUIDValid: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val deviceUUID: ByteArray,
		val driverUUID: ByteArray,
		val deviceLUID: ByteArray,
		val deviceNodeMask: Int,
		val deviceLUIDValid: Int,
	) {
		override fun toString() = "PhysicalDeviceIDProperties(" + 
			"sType=$sType, " +
			"deviceUUID=$deviceUUID, " +
			"driverUUID=$driverUUID, " +
			"deviceLUID=$deviceLUID, " +
			"deviceNodeMask=$deviceNodeMask, " +
			"deviceLUIDValid=$deviceLUIDValid)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		deviceUUID.asArray, 
		driverUUID.asArray, 
		deviceLUID.asArray, 
		deviceNodeMask, 
		deviceLUIDValid, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			array(1, 16)
			array(1, 16)
			array(1, 8)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceIDProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceIDProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ID_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceIDProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ID_PROPERTIES
		}
	
	}


}