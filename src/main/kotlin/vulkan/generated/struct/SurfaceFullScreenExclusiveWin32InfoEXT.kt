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
 *     struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         HMONITOR         hmonitor
 *     }
 */
@JvmInline
value class SurfaceFullScreenExclusiveWin32InfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var hmonitor: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SurfaceFullScreenExclusiveWin32InfoEXT(0)
		
		fun malloc(allocator: Allocator) = SurfaceFullScreenExclusiveWin32InfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO
		}
		
		fun calloc(allocator: Allocator) = SurfaceFullScreenExclusiveWin32InfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO
		}
	
	}


}