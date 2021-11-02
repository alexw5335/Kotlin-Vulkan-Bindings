// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkRenderPassSampleLocationsBeginInfoEXT {
 *         VkStructureType                  sType
 *         void*                            pNext (must be null)
 *         uint32_t                         attachmentInitialSampleLocationsCount
 *         VkAttachmentSampleLocationsEXT*  pAttachmentInitialSampleLocations
 *         uint32_t                         postSubpassSampleLocationsCount
 *         VkSubpassSampleLocationsEXT*     pPostSubpassSampleLocations
 *     }
 */
@JvmInline
value class RenderPassSampleLocationsBeginInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var attachmentInitialSampleLocationsCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAttachmentInitialSampleLocations: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var postSubpassSampleLocationsCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pPostSubpassSampleLocations: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var attachmentInitialSampleLocations: AttachmentSampleLocations.Buffer
		get()      = AttachmentSampleLocations.Buffer(Unsafe.getLong(address + 24), attachmentInitialSampleLocationsCount)
		set(value) { Unsafe.setLong(address + 24, value.address); attachmentInitialSampleLocationsCount = value.capacity }
	
	var postSubpassSampleLocations: SubpassSampleLocations.Buffer
		get()      = SubpassSampleLocations.Buffer(Unsafe.getLong(address + 40), postSubpassSampleLocationsCount)
		set(value) { Unsafe.setLong(address + 40, value.address); postSubpassSampleLocationsCount = value.capacity }


}