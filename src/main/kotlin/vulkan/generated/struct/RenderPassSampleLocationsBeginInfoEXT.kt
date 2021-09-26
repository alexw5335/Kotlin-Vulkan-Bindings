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
 *     struct VkRenderPassSampleLocationsBeginInfoEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         uint32_t                          attachmentInitialSampleLocationsCount
 *         VkAttachmentSampleLocationsEXT**  pAttachmentInitialSampleLocations
 *         uint32_t                          postSubpassSampleLocationsCount
 *         VkSubpassSampleLocationsEXT**     pPostSubpassSampleLocations
 *     }
 */
@JvmInline
value class RenderPassSampleLocationsBeginInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var attachmentInitialSampleLocationsCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pAttachmentInitialSampleLocations: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var postSubpassSampleLocationsCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pPostSubpassSampleLocations: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var attachmentInitialSampleLocations: AttachmentSampleLocationsEXT.Buffer
		get()      = AttachmentSampleLocationsEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), attachmentInitialSampleLocationsCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); attachmentInitialSampleLocationsCount = value.capacity }
	
	var postSubpassSampleLocations: SubpassSampleLocationsEXT.Buffer
		get()      = SubpassSampleLocationsEXT.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), postSubpassSampleLocationsCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); postSubpassSampleLocationsCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RenderPassSampleLocationsBeginInfoEXT(0)
		
		fun malloc(allocator: Allocator) = RenderPassSampleLocationsBeginInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO
		}
		
		fun calloc(allocator: Allocator) = RenderPassSampleLocationsBeginInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_SAMPLE_LOCATIONS_BEGIN_INFO
		}
	
	}


}