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
 *     struct VkPhysicalDeviceMemoryProperties2 {
 *         VkStructureType                   sType
 *         void*                             pNext
 *         VkPhysicalDeviceMemoryProperties  memoryProperties
 *     }
 */
@JvmInline
value class PhysicalDeviceMemoryProperties2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var memoryProperties: PhysicalDeviceMemoryProperties
		get()      = PhysicalDeviceMemoryProperties(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val memoryProperties: PhysicalDeviceMemoryProperties.Persistent,
	) {
		override fun toString() = "PhysicalDeviceMemoryProperties2(" + 
			"sType=$sType, " +
			"memoryProperties=$memoryProperties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		memoryProperties.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(PhysicalDeviceMemoryProperties.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceMemoryProperties2(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceMemoryProperties2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MEMORY_PROPERTIES_2
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceMemoryProperties2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_MEMORY_PROPERTIES_2
		}
	
	}


}