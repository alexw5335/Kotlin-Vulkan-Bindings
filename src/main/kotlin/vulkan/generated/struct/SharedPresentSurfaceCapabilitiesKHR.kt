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
 *     struct VkSharedPresentSurfaceCapabilitiesKHR {
 *         VkStructureType    sType
 *         void*              pNext (must be null)
 *         VkImageUsageFlags  sharedPresentSupportedUsageFlags
 *     }
 */
@JvmInline
value class SharedPresentSurfaceCapabilitiesKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var sharedPresentSupportedUsageFlags: ImageUsageFlags
		get()      = ImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val sharedPresentSupportedUsageFlags: ImageUsageFlags,
	) {
		override fun toString() = "SharedPresentSurfaceCapabilitiesKHR(" + 
			"sType=$sType, " +
			"sharedPresentSupportedUsageFlags=$sharedPresentSupportedUsageFlags)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		sharedPresentSupportedUsageFlags, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SharedPresentSurfaceCapabilitiesKHR(0)
		
		fun malloc(allocator: Allocator) = SharedPresentSurfaceCapabilitiesKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SHARED_PRESENT_SURFACE_CAPABILITIES
		}
		
		fun calloc(allocator: Allocator) = SharedPresentSurfaceCapabilitiesKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SHARED_PRESENT_SURFACE_CAPABILITIES
		}
	
	}


}