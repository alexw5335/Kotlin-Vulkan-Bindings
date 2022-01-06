// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_dynamic_rendering

 *     struct VkAttachmentSampleCountInfoAMD {
 *         VkStructureType         sType
 *         void*                   pNext (must be null)
 *         uint32_t                colorAttachmentCount
 *         VkSampleCountFlagBits*  pColorAttachmentSamples
 *         VkSampleCountFlagBits   depthStencilAttachmentSamples
 *     }
 */
@JvmInline
value class AttachmentSampleCountInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var colorAttachmentCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pColorAttachmentSamples: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var depthStencilAttachmentSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	
	
	var colorAttachmentSamples: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), colorAttachmentCount)
		set(value) { Unsafe.setLong(address + 24, value.address); colorAttachmentCount = value.capacity }


}