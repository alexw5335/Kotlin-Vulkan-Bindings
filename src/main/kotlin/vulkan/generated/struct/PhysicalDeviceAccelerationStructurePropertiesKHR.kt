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
 *     struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         maxGeometryCount
 *         uint64_t         maxInstanceCount
 *         uint64_t         maxPrimitiveCount
 *         uint32_t         maxPerStageDescriptorAccelerationStructures
 *         uint32_t         maxPerStageDescriptorUpdateAfterBindAccelerationStructures
 *         uint32_t         maxDescriptorSetAccelerationStructures
 *         uint32_t         maxDescriptorSetUpdateAfterBindAccelerationStructures
 *         uint32_t         minAccelerationStructureScratchOffsetAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceAccelerationStructurePropertiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxGeometryCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var maxInstanceCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var maxPrimitiveCount: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var maxPerStageDescriptorAccelerationStructures: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxPerStageDescriptorUpdateAfterBindAccelerationStructures: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxDescriptorSetAccelerationStructures: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var maxDescriptorSetUpdateAfterBindAccelerationStructures: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var minAccelerationStructureScratchOffsetAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxGeometryCount: Long,
		val maxInstanceCount: Long,
		val maxPrimitiveCount: Long,
		val maxPerStageDescriptorAccelerationStructures: Int,
		val maxPerStageDescriptorUpdateAfterBindAccelerationStructures: Int,
		val maxDescriptorSetAccelerationStructures: Int,
		val maxDescriptorSetUpdateAfterBindAccelerationStructures: Int,
		val minAccelerationStructureScratchOffsetAlignment: Int,
	) {
		override fun toString() = "PhysicalDeviceAccelerationStructurePropertiesKHR(" + 
			"sType=$sType, " +
			"maxGeometryCount=$maxGeometryCount, " +
			"maxInstanceCount=$maxInstanceCount, " +
			"maxPrimitiveCount=$maxPrimitiveCount, " +
			"maxPerStageDescriptorAccelerationStructures=$maxPerStageDescriptorAccelerationStructures, " +
			"maxPerStageDescriptorUpdateAfterBindAccelerationStructures=$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, " +
			"maxDescriptorSetAccelerationStructures=$maxDescriptorSetAccelerationStructures, " +
			"maxDescriptorSetUpdateAfterBindAccelerationStructures=$maxDescriptorSetUpdateAfterBindAccelerationStructures, " +
			"minAccelerationStructureScratchOffsetAlignment=$minAccelerationStructureScratchOffsetAlignment)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxGeometryCount, 
		maxInstanceCount, 
		maxPrimitiveCount, 
		maxPerStageDescriptorAccelerationStructures, 
		maxPerStageDescriptorUpdateAfterBindAccelerationStructures, 
		maxDescriptorSetAccelerationStructures, 
		maxDescriptorSetUpdateAfterBindAccelerationStructures, 
		minAccelerationStructureScratchOffsetAlignment, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
			member(8)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceAccelerationStructurePropertiesKHR(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceAccelerationStructurePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceAccelerationStructurePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES
		}
	
	}


}