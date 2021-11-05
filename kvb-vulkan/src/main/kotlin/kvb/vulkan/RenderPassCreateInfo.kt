// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkRenderPassCreateInfo {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkRenderPassCreateFlags   flags
 *         uint32_t                  attachmentCount
 *         VkAttachmentDescription*  pAttachments
 *         uint32_t                  subpassCount
 *         VkSubpassDescription*     pSubpasses
 *         uint32_t                  dependencyCount
 *         VkSubpassDependency*      pDependencies
 *     }
 * 
 *     Valid pNext types:
 *         - VkRenderPassMultiviewCreateInfo
 *         - VkRenderPassInputAttachmentAspectCreateInfo
 *         - VkRenderPassFragmentDensityMapCreateInfoEXT
 */
@JvmInline
value class RenderPassCreateInfo(override val address: Long) : Addressable {
	
	
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
	
	
	
	var attachments: AttachmentDescription.Buffer
		get()      = AttachmentDescription.Buffer(Unsafe.getLong(address + 24), attachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentCount = value.capacity }
	
	var subpasses: SubpassDescription.Buffer
		get()      = SubpassDescription.Buffer(Unsafe.getLong(address + 40), subpassCount)
		set(value) { Unsafe.setLong(address + 40, value.address); subpassCount = value.capacity }
	
	var dependencies: SubpassDependency.Buffer
		get()      = SubpassDependency.Buffer(Unsafe.getLong(address + 56), dependencyCount)
		set(value) { Unsafe.setLong(address + 56, value.address); dependencyCount = value.capacity }


}