// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265SessionParametersAddInfoEXT {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         uint32_t                           vpsStdCount
 *         StdVideoH265VideoParameterSet*     pVpsStd
 *         uint32_t                           spsStdCount
 *         StdVideoH265SequenceParameterSet*  pSpsStd
 *         uint32_t                           ppsStdCount
 *         StdVideoH265PictureParameterSet*   pPpsStd
 *     }
 */
@JvmInline
value class VideoEncodeH265SessionParametersAddInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var vpsStdCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pVpsStd: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var spsStdCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pSpsStd: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var ppsStdCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pPpsStd: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var vpsStd: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), vpsStdCount)
		set(value) { Unsafe.setLong(address + 24, value.address); vpsStdCount = value.capacity }
	
	var spsStd: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 40), spsStdCount)
		set(value) { Unsafe.setLong(address + 40, value.address); spsStdCount = value.capacity }
	
	var ppsStd: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), ppsStdCount)
		set(value) { Unsafe.setLong(address + 56, value.address); ppsStdCount = value.capacity }


}