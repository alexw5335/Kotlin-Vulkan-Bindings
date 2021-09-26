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
 *     struct VkViSurfaceCreateInfoNN {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkViSurfaceCreateFlagsNN  flags (reserved, must be zero)
 *         void*                     window
 *     }
 */
@JvmInline
value class ViSurfaceCreateInfoNN(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: ViSurfaceCreateFlags
		get()      = ViSurfaceCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var window: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ViSurfaceCreateInfoNN(0)
		
		fun malloc(allocator: Allocator) = ViSurfaceCreateInfoNN(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.VI_SURFACE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ViSurfaceCreateInfoNN(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.VI_SURFACE_CREATE_INFO
		}
	
	}


}