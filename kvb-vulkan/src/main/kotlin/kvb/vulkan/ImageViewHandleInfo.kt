// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkImageViewHandleInfoNVX {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         VkImageView       imageView
 *         VkDescriptorType  descriptorType
 *         VkSampler         sampler
 *     }
 */
@JvmInline
value class ImageViewHandleInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var descriptorType: DescriptorType
		get()      = _DescriptorType(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var sampler: SamplerH
		get()      = SamplerH(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)


}