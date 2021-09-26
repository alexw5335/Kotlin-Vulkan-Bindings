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
 *     struct VkPhysicalDeviceProperties {
 *         uint32_t                          apiVersion
 *         uint32_t                          driverVersion
 *         uint32_t                          vendorID
 *         uint32_t                          deviceID
 *         VkPhysicalDeviceType              deviceType
 *         char                              deviceName[256]
 *         uint8_t                           pipelineCacheUUID[16]
 *         VkPhysicalDeviceLimits            limits
 *         VkPhysicalDeviceSparseProperties  sparseProperties
 *     }
 */
@JvmInline
value class PhysicalDeviceProperties(override val address: Long) : Addressable {
	
	
	var apiVersion: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var driverVersion: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var vendorID: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var deviceID: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var deviceType: PhysicalDeviceType
		get()      = PhysicalDeviceType(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var deviceName: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[5], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.byteSize) }
	
	var pipelineCacheUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[6], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.byteSize) }
	
	var limits: PhysicalDeviceLimits
		get()      = PhysicalDeviceLimits(address + LAYOUT.offsets[7])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[7], value.structSize) }
	
	var sparseProperties: PhysicalDeviceSparseProperties
		get()      = PhysicalDeviceSparseProperties(address + LAYOUT.offsets[8])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[8], value.structSize) }
	
	
	
	class Persistent(
		val apiVersion: Int,
		val driverVersion: Int,
		val vendorID: Int,
		val deviceID: Int,
		val deviceType: PhysicalDeviceType,
		val deviceName: String,
		val pipelineCacheUUID: ByteArray,
		val limits: PhysicalDeviceLimits.Persistent,
		val sparseProperties: PhysicalDeviceSparseProperties.Persistent,
	) {
		override fun toString() = "PhysicalDeviceProperties(" + 
			"apiVersion=$apiVersion, " +
			"driverVersion=$driverVersion, " +
			"vendorID=$vendorID, " +
			"deviceID=$deviceID, " +
			"deviceType=$deviceType, " +
			"deviceName=$deviceName, " +
			"pipelineCacheUUID=$pipelineCacheUUID, " +
			"limits=$limits, " +
			"sparseProperties=$sparseProperties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		apiVersion, 
		driverVersion, 
		vendorID, 
		deviceID, 
		deviceType, 
		Unsafe.decodeUtf8(deviceName), 
		pipelineCacheUUID.asArray, 
		limits.asPersistent, 
		sparseProperties.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			array(1, 256)
			array(1, 16)
			member(PhysicalDeviceLimits.LAYOUT)
			member(PhysicalDeviceSparseProperties.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PhysicalDeviceProperties(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}