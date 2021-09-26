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
 *     struct VkImagePipeSurfaceCreateInfoFUCHSIA {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkImagePipeSurfaceCreateFlagsFUCHSIA  flags (reserved, must be zero)
 *         zx_handle_t                           imagePipeHandle
 *     }
 */
@JvmInline
value class ImagePipeSurfaceCreateInfoFUCHSIA(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: ImagePipeSurfaceCreateFlags
		get()      = ImagePipeSurfaceCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var imagePipeHandle: Long
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
		
		val NULL = ImagePipeSurfaceCreateInfoFUCHSIA(0)
		
		fun malloc(allocator: Allocator) = ImagePipeSurfaceCreateInfoFUCHSIA(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGEPIPE_SURFACE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImagePipeSurfaceCreateInfoFUCHSIA(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGEPIPE_SURFACE_CREATE_INFO
		}
	
	}


}