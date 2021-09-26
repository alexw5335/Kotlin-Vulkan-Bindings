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
 *     struct VkDisplaySurfaceCreateInfoKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkDisplaySurfaceCreateFlagsKHR  flags (reserved, must be zero)
 *         VkDisplayModeKHR                displayMode
 *         uint32_t                        planeIndex
 *         uint32_t                        planeStackIndex
 *         VkSurfaceTransformFlagBitsKHR   transform
 *         float                           globalAlpha
 *         VkDisplayPlaneAlphaFlagBitsKHR  alphaMode
 *         VkExtent2D                      imageExtent
 *     }
 */
@JvmInline
value class DisplaySurfaceCreateInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DisplaySurfaceCreateFlags
		get()      = DisplaySurfaceCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var planeIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var planeStackIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var transform: SurfaceTransformFlags
		get()      = SurfaceTransformFlags(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.bitfield) }
	
	var globalAlpha: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[7], value) }
	
	var alphaMode: DisplayPlaneAlphaFlags
		get()      = DisplayPlaneAlphaFlags(Unsafe.getInt(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value.bitfield) }
	
	var imageExtent: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[9])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[9], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(Extent2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplaySurfaceCreateInfoKHR(0)
		
		fun malloc(allocator: Allocator) = DisplaySurfaceCreateInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_SURFACE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = DisplaySurfaceCreateInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DISPLAY_SURFACE_CREATE_INFO
		}
	
	}


}