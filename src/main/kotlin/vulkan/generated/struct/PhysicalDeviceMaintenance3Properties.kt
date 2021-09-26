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
 *     struct VkPhysicalDeviceMaintenance3Properties {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxPerSetDescriptors
 *         VkDeviceSize     maxMemoryAllocationSize
 *     }
 */
@JvmInline
value class PhysicalDeviceMaintenance3Properties(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxPerSetDescriptors: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxMemoryAllocationSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxPerSetDescriptors: Int,
		val maxMemoryAllocationSize: Long,
	) {
		override fun toString() = "PhysicalDeviceMaintenance3Properties(" + 
			"sType=$sType, " +
			"maxPerSetDescriptors=$maxPerSetDescriptors, " +
			"maxMemoryAllocationSize=$maxMemoryAllocationSize)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxPerSetDescriptors, 
		maxMemoryAllocationSize, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMaintenance3Properties(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMaintenance3Properties(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMaintenance3Properties(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES
		}
	
	}


}