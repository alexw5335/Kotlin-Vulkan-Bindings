// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_video_encode_h264

 *     struct VkVideoEncodeH264EmitPictureParametersEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint8_t          spsId
 *         VkBool32         emitSpsEnable
 *         uint32_t         ppsIdEntryCount
 *         uint8_t*         ppsIdEntries
 *     }
 */
@JvmInline
value class VideoEncodeH264EmitPictureParameters(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var spsId: Byte
		get()      = Unsafe.getByte(address + 16)
		set(value) = Unsafe.setByte(address + 16, value)
	
	var emitSpsEnable: Int
		get()      = Unsafe.getInt(address + 17)
		set(value) = Unsafe.setInt(address + 17, value)
	
	var ppsIdEntryCount: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var ppsIdEntries: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var psIdEntries: DirectByteBuffer
		get()      = DirectByteBuffer(Unsafe.getLong(address + 32), ppsIdEntryCount)
		set(value) { Unsafe.setLong(address + 32, value.address); ppsIdEntryCount = value.capacity }


}