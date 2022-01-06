// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkPipelineCacheHeaderVersionOne {
 *         uint32_t                      headerSize
 *         VkPipelineCacheHeaderVersion  headerVersion
 *         uint32_t                      vendorID
 *         uint32_t                      deviceID
 *         uint8_t                       pipelineCacheUUID[16]
 *     }
 */
@JvmInline
value class PipelineCacheHeaderVersionOne(override val address: Long) : Addressable {
	
	
	var headerSize: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var headerVersion: PipelineCacheHeaderVersion
		get()      = _PipelineCacheHeaderVersion(Unsafe.getInt(address + 4))
		set(value) = Unsafe.setInt(address + 4, value.value)
	
	var vendorID: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var deviceID: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var pipelineCacheUUID: DirectByteBuffer
		get()      = DirectByteBuffer(address + 16, 16)
		set(value) = Unsafe.copy(value.address, address + 16, value.byteSize)


}