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
 *     struct VkSurfaceCapabilities2KHR {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkSurfaceCapabilitiesKHR  surfaceCapabilities
 *     }
 */
@JvmInline
value class SurfaceCapabilities2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var surfaceCapabilities: SurfaceCapabilitiesKHR
		get()      = SurfaceCapabilitiesKHR(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val surfaceCapabilities: SurfaceCapabilitiesKHR.Persistent,
	) {
		override fun toString() = "SurfaceCapabilities2KHR(" + 
			"sType=$sType, " +
			"surfaceCapabilities=$surfaceCapabilities)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		surfaceCapabilities.asPersistent, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(SurfaceCapabilitiesKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SurfaceCapabilities2KHR(0)
		
		fun malloc(allocator: Allocator) = SurfaceCapabilities2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_CAPABILITIES_2_KHR
		}
		
		fun calloc(allocator: Allocator) = SurfaceCapabilities2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_CAPABILITIES_2_KHR
		}
	
	}


}