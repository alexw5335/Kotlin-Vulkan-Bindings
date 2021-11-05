// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectByteBuffer

/**
 *     struct VkDebugUtilsMessengerCallbackDataEXT {
 *         VkStructureType                            sType
 *         void*                                      pNext (must be null)
 *         VkDebugUtilsMessengerCallbackDataFlagsEXT  flags (reserved, must be zero)
 *         char*                                      pMessageIdName
 *         int32_t                                    messageIdNumber
 *         char*                                      pMessage
 *         uint32_t                                   queueLabelCount
 *         VkDebugUtilsLabelEXT*                      pQueueLabels
 *         uint32_t                                   cmdBufLabelCount
 *         VkDebugUtilsLabelEXT*                      pCmdBufLabels
 *         uint32_t                                   objectCount
 *         VkDebugUtilsObjectNameInfoEXT*             pObjects
 *     }
 */
@JvmInline
value class DebugUtilsMessengerCallbackData(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pMessageIdName: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var messageIdNumber: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pMessage: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var queueLabelCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pQueueLabels: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var cmdBufLabelCount: Int
		get()      = Unsafe.getInt(address + 64)
		set(value) = Unsafe.setInt(address + 64, value)
	
	var pCmdBufLabels: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var objectCount: Int
		get()      = Unsafe.getInt(address + 80)
		set(value) = Unsafe.setInt(address + 80, value)
	
	var pObjects: Long
		get()      = Unsafe.getLong(address + 88)
		set(value) = Unsafe.setLong(address + 88, value)
	
	
	
	var messageIdName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 24))
		set(value) = Unsafe.setLong(address + 24, value.address)
	
	var message:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 40))
		set(value) = Unsafe.setLong(address + 40, value.address)
	
	var queueLabels: DebugUtilsLabel.Buffer
		get()      = DebugUtilsLabel.Buffer(Unsafe.getLong(address + 56), queueLabelCount)
		set(value) { Unsafe.setLong(address + 56, value.address); queueLabelCount = value.capacity }
	
	var cmdBufLabels: DebugUtilsLabel.Buffer
		get()      = DebugUtilsLabel.Buffer(Unsafe.getLong(address + 72), cmdBufLabelCount)
		set(value) { Unsafe.setLong(address + 72, value.address); cmdBufLabelCount = value.capacity }
	
	var objects: DebugUtilsObjectNameInfo.Buffer
		get()      = DebugUtilsObjectNameInfo.Buffer(Unsafe.getLong(address + 88), objectCount)
		set(value) { Unsafe.setLong(address + 88, value.address); objectCount = value.capacity }


}