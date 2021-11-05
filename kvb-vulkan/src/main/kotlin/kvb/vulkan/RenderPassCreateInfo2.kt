// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer

/**
 *     struct VkRenderPassCreateInfo2 {
 *         VkStructureType            sType
 *         void*                      pNext
 *         VkRenderPassCreateFlags    flags
 *         uint32_t                   attachmentCount
 *         VkAttachmentDescription2*  pAttachments
 *         uint32_t                   subpassCount
 *         VkSubpassDescription2*     pSubpasses
 *         uint32_t                   dependencyCount
 *         VkSubpassDependency2*      pDependencies
 *         uint32_t                   correlatedViewMaskCount
 *         uint32_t*                  pCorrelatedViewMasks
 *     }
 * 
 *     Valid pNext types:
 *         - VkRenderPassFragmentDensityMapCreateInfoEXT
 */
@JvmInline
value class RenderPassCreateInfo2(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: RenderPassCreateFlags
		get()      = RenderPassCreateFlags(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var attachmentCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pAttachments: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSubpasses: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pDependencies: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var correlatedViewMaskCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pCorrelatedViewMasks: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	
	
	var attachments: AttachmentDescription2.Buffer
		get()      = AttachmentDescription2.Buffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription2.Buffer
		get()      = SubpassDescription2.Buffer(Unsafe.getLong(address + 40), subpassCount)
		set(value) { Unsafe.setLong(address + 40, value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency2.Buffer
		get()      = SubpassDependency2.Buffer(Unsafe.getLong(address + 56), dependencyCount)
		set(value) { Unsafe.setLong(address + 56, value.address); dependencyCount = value.capacity }
	
	var correlatedViewMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 72), correlatedViewMaskCount)
		set(value) { Unsafe.setLong(address + 72, value.address); correlatedViewMaskCount = value.capacity }


}