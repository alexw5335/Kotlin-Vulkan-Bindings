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
 *     struct VkRenderPassCreateInfo2 {
 *         VkStructureType             sType
 *         void*                       pNext
 *         VkRenderPassCreateFlags     flags
 *         uint32_t                    attachmentCount
 *         VkAttachmentDescription2**  pAttachments
 *         uint32_t                    subpassCount
 *         VkSubpassDescription2**     pSubpasses
 *         uint32_t                    dependencyCount
 *         VkSubpassDependency2**      pDependencies
 *         uint32_t                    correlatedViewMaskCount
 *         uint32_t**                  pCorrelatedViewMasks
 *     }
 */
@JvmInline
value class RenderPassCreateInfo2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: RenderPassCreateFlags
		get()      = RenderPassCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pAttachments: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pSubpasses: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pDependencies: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var correlatedViewMaskCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var pCorrelatedViewMasks: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value) }
	
	
	
	var attachments: AttachmentDescription2.Buffer
		get()      = AttachmentDescription2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), attachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription2.Buffer
		get()      = SubpassDescription2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), subpassCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency2.Buffer
		get()      = SubpassDependency2.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), dependencyCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); dependencyCount = value.capacity }
	
	var correlatedViewMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[10]), correlatedViewMaskCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[10], value.address); correlatedViewMaskCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RenderPassCreateInfo2(0)
		
		fun malloc(allocator: Allocator) = RenderPassCreateInfo2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_CREATE_INFO_2
		}
		
		fun calloc(allocator: Allocator) = RenderPassCreateInfo2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_CREATE_INFO_2
		}
	
	}


}