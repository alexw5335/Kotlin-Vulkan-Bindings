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
 *     struct VkDisplayPlaneCapabilities2KHR {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkDisplayPlaneCapabilitiesKHR  capabilities
 *     }
 */
@JvmInline
value class DisplayPlaneCapabilities2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var capabilities: DisplayPlaneCapabilitiesKHR
		get()      = DisplayPlaneCapabilitiesKHR(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val capabilities: DisplayPlaneCapabilitiesKHR.Persistent,
	) {
		override fun toString() = "DisplayPlaneCapabilities2KHR(" + 
			"sType=$sType, " +
			"capabilities=$capabilities)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		capabilities.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(DisplayPlaneCapabilitiesKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayPlaneCapabilities2KHR(0)
		
		fun malloc(allocator: Allocator) = DisplayPlaneCapabilities2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_PLANE_CAPABILITIES_2
		}
		
		fun calloc(allocator: Allocator) = DisplayPlaneCapabilities2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_PLANE_CAPABILITIES_2
		}
	
	}


}