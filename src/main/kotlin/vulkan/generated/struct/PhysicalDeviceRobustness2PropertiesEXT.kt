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
 *     struct VkPhysicalDeviceRobustness2PropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     robustStorageBufferAccessSizeAlignment
 *         VkDeviceSize     robustUniformBufferAccessSizeAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceRobustness2PropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var robustStorageBufferAccessSizeAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var robustUniformBufferAccessSizeAlignment: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val robustStorageBufferAccessSizeAlignment: Long,
		val robustUniformBufferAccessSizeAlignment: Long,
	) {
		override fun toString() = "PhysicalDeviceRobustness2PropertiesEXT(" + 
			"sType=$sType, " +
			"robustStorageBufferAccessSizeAlignment=$robustStorageBufferAccessSizeAlignment, " +
			"robustUniformBufferAccessSizeAlignment=$robustUniformBufferAccessSizeAlignment)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		robustStorageBufferAccessSizeAlignment, 
		robustUniformBufferAccessSizeAlignment, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceRobustness2PropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceRobustness2PropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceRobustness2PropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_PROPERTIES
		}
	
	}


}