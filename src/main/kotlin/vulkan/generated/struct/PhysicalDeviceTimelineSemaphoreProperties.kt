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
 *     struct VkPhysicalDeviceTimelineSemaphoreProperties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint64_t         maxTimelineSemaphoreValueDifference
 *     }
 */
@JvmInline
value class PhysicalDeviceTimelineSemaphoreProperties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxTimelineSemaphoreValueDifference: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxTimelineSemaphoreValueDifference: Long,
	) {
		override fun toString() = "PhysicalDeviceTimelineSemaphoreProperties(" + 
			"sType=$sType, " +
			"maxTimelineSemaphoreValueDifference=$maxTimelineSemaphoreValueDifference)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxTimelineSemaphoreValueDifference, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceTimelineSemaphoreProperties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceTimelineSemaphoreProperties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceTimelineSemaphoreProperties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TIMELINE_SEMAPHORE_PROPERTIES
		}
	
	}


}