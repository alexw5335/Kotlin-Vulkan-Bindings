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
 *     struct VkFragmentShadingRateAttachmentInfoKHR {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkAttachmentReference2*  pFragmentShadingRateAttachment
 *         VkExtent2D               shadingRateAttachmentTexelSize
 *     }
 */
@JvmInline
value class FragmentShadingRateAttachmentInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pFragmentShadingRateAttachment: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var shadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	
	
	var fragmentShadingRateAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(Extent2D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = FragmentShadingRateAttachmentInfoKHR(0)
		
		fun malloc(allocator: Allocator) = FragmentShadingRateAttachmentInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAGMENT_SHADING_RATE_ATTACHMENT_INFO
		}
		
		fun calloc(allocator: Allocator) = FragmentShadingRateAttachmentInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.FRAGMENT_SHADING_RATE_ATTACHMENT_INFO
		}
	
	}


}