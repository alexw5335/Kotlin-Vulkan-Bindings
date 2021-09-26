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
 *     struct VkRenderPassCreateInfo {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkRenderPassCreateFlags    flags
 *         uint32_t                   attachmentCount
 *         VkAttachmentDescription**  pAttachments
 *         uint32_t                   subpassCount
 *         VkSubpassDescription**     pSubpasses
 *         uint32_t                   dependencyCount
 *         VkSubpassDependency**      pDependencies
 *     }
 */
@JvmInline
value class RenderPassCreateInfo(override val address: Long) : Addressable {
	
	
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
	
	
	
	var attachments: AttachmentDescription.Buffer
		get()      = AttachmentDescription.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), attachmentCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription.Buffer
		get()      = SubpassDescription.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), subpassCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency.Buffer
		get()      = SubpassDependency.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), dependencyCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); dependencyCount = value.capacity }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RenderPassCreateInfo(0)
		
		fun malloc(allocator: Allocator) = RenderPassCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = RenderPassCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.RENDER_PASS_CREATE_INFO
		}
	
	}


}