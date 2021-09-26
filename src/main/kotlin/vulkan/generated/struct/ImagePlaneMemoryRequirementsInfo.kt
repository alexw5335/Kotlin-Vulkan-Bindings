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
 *     struct VkImagePlaneMemoryRequirementsInfo {
 *         VkStructureType        sType
 *         void*                  pNext (must be null)
 *         VkImageAspectFlagBits  planeAspect
 *     }
 */
@JvmInline
value class ImagePlaneMemoryRequirementsInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var planeAspect: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
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
		
		val NULL = ImagePlaneMemoryRequirementsInfo(0)
		
		fun malloc(allocator: Allocator) = ImagePlaneMemoryRequirementsInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO
		}
		
		fun calloc(allocator: Allocator) = ImagePlaneMemoryRequirementsInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_PLANE_MEMORY_REQUIREMENTS_INFO
		}
	
	}


}