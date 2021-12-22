// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkFragmentShadingRateAttachmentInfoKHR {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkAttachmentReference2*  pFragmentShadingRateAttachment
 *         VkExtent2D               shadingRateAttachmentTexelSize
 *     }
 */
@JvmInline
value class FragmentShadingRateAttachmentInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pFragmentShadingRateAttachment: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var shadingRateAttachmentTexelSize: Extent2D
		get()      = Extent2D(address + 24)
		set(value) = Unsafe.copy(value.address, address + 24, 8)
	
	
	
	var fragmentShadingRateAttachment: AttachmentReference2
		get()      = AttachmentReference2(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }


}