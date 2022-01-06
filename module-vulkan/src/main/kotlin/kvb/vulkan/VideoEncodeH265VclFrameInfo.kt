// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h265

 *     struct VkVideoEncodeH265VclFrameInfoEXT {
 *         VkStructureType                      sType
 *         void*                                pNext (must be null)
 *         VkVideoEncodeH265ReferenceListsEXT*  pReferenceFinalLists
 *         uint32_t                             naluSliceEntryCount
 *         VkVideoEncodeH265NaluSliceEXT*       pNaluSliceEntries
 *         StdVideoEncodeH265PictureInfo*       pCurrentPictureInfo
 *     }
 */
@JvmInline
value class VideoEncodeH265VclFrameInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pReferenceFinalLists: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var naluSliceEntryCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var pNaluSliceEntries: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pCurrentPictureInfo: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	
	
	var referenceFinalLists: VideoEncodeH265ReferenceLists
		get()      = VideoEncodeH265ReferenceLists(Unsafe.getLong(address + 16))
		set(value) { Unsafe.setLong(address + 16, value.address) }
	
	var naluSliceEntries: VideoEncodeH265NaluSlice.Buffer
		get()      = VideoEncodeH265NaluSlice.Buffer(Unsafe.getLong(address + 32), naluSliceEntryCount)
		set(value) { Unsafe.setLong(address + 32, value.address); naluSliceEntryCount = value.capacity }


}