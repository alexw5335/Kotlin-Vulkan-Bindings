// This file has been automatically generated.

@file:Suppress("Unused", "FunctionName")

package kvb.vulkan

import kvb.core.memory.*
import kvb.core.memory.direct.*

/**
 *     // provided by VK_EXT_debug_utils
 *     VkResult vkSetDebugUtilsObjectNameEXT(
 *         VkDevice                        device
 *         VkDebugUtilsObjectNameInfoEXT*  pNameInfo
 *     );
 */
internal external fun setDebugUtilsObjectName(address: Long, device: Long, pNameInfo: Long): Int



/**
 *     // provided by VK_EXT_debug_utils
 *     VkResult vkSetDebugUtilsObjectTagEXT(
 *         VkDevice                       device
 *         VkDebugUtilsObjectTagInfoEXT*  pTagInfo
 *     );
 */
internal external fun setDebugUtilsObjectTag(address: Long, device: Long, pTagInfo: Long): Int



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkQueueBeginDebugUtilsLabelEXT(
 *         VkQueue                queue
 *         VkDebugUtilsLabelEXT*  pLabelInfo
 *     );
 */
internal external fun queueBeginDebugUtilsLabel(address: Long, queue: Long, pLabelInfo: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkQueueEndDebugUtilsLabelEXT(
 *         VkQueue  queue
 *     );
 */
internal external fun queueEndDebugUtilsLabel(address: Long, queue: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkQueueInsertDebugUtilsLabelEXT(
 *         VkQueue                queue
 *         VkDebugUtilsLabelEXT*  pLabelInfo
 *     );
 */
internal external fun queueInsertDebugUtilsLabel(address: Long, queue: Long, pLabelInfo: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkCmdBeginDebugUtilsLabelEXT(
 *         VkCommandBuffer        commandBuffer
 *         VkDebugUtilsLabelEXT*  pLabelInfo
 *     );
 */
internal external fun cmdBeginDebugUtilsLabel(address: Long, commandBuffer: Long, pLabelInfo: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkCmdEndDebugUtilsLabelEXT(
 *         VkCommandBuffer  commandBuffer
 *     );
 */
internal external fun cmdEndDebugUtilsLabel(address: Long, commandBuffer: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkCmdInsertDebugUtilsLabelEXT(
 *         VkCommandBuffer        commandBuffer
 *         VkDebugUtilsLabelEXT*  pLabelInfo
 *     );
 */
internal external fun cmdInsertDebugUtilsLabel(address: Long, commandBuffer: Long, pLabelInfo: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     VkResult vkCreateDebugUtilsMessengerEXT(
 *         VkInstance                           instance
 *         VkDebugUtilsMessengerCreateInfoEXT*  pCreateInfo
 *         VkAllocationCallbacks*               pAllocator
 *         VkDebugUtilsMessengerEXT*            pMessenger
 *     );
 */
internal external fun createDebugUtilsMessenger(address: Long, instance: Long, pCreateInfo: Long, pAllocator: Long, pMessenger: Long): Int



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkDestroyDebugUtilsMessengerEXT(
 *         VkInstance                instance
 *         VkDebugUtilsMessengerEXT  messenger
 *         VkAllocationCallbacks*    pAllocator
 *     );
 */
internal external fun destroyDebugUtilsMessenger(address: Long, instance: Long, messenger: Long, pAllocator: Long)



/**
 *     // provided by VK_EXT_debug_utils
 *     void vkSubmitDebugUtilsMessageEXT(
 *         VkInstance                              instance
 *         VkDebugUtilsMessageSeverityFlagBitsEXT  messageSeverity
 *         VkDebugUtilsMessageTypeFlagsEXT         messageTypes
 *         VkDebugUtilsMessengerCallbackDataEXT*   pCallbackData
 *     );
 */
internal external fun submitDebugUtilsMessage(address: Long, instance: Long, messageSeverity: Int, messageTypes: Int, pCallbackData: Long)



/**
 * Implementation of VkDebugUtilsMessengerEXT.
 */
open class DebugUtilsMessengerH(override val address: Long) : Addressable



/**
 *     // provided by VK_EXT_debug_utils
 *     enum VkDebugUtilsMessageSeverityFlagBitsEXT {
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT  = 1
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT     = 16
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT  = 256
 *         VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT    = 4096
 *     }
 */
@JvmInline
value class DebugUtilsMessageSeverityFlags(val value: Int) {
	
	
	companion object {
		
		val VERBOSE = DebugUtilsMessageSeverityFlags(1)
		
		val INFO = DebugUtilsMessageSeverityFlags(16)
		
		val WARNING = DebugUtilsMessageSeverityFlags(256)
		
		val ERROR = DebugUtilsMessageSeverityFlags(4096)
	
	}
	
	
	
	operator fun plus(mask: DebugUtilsMessageSeverityFlags) = DebugUtilsMessageSeverityFlags(value or mask.value)
	
	operator fun contains(mask: DebugUtilsMessageSeverityFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [DebugUtilsMessageSeverityFlags].
 */
inline fun DebugUtilsMessageSeverityFlags(block: DebugUtilsMessageSeverityFlags.Companion.() -> DebugUtilsMessageSeverityFlags) = block(DebugUtilsMessageSeverityFlags)



/**
 *     // provided by VK_EXT_debug_utils
 *     enum VkDebugUtilsMessageTypeFlagBitsEXT {
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT      = 1
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT   = 2
 *         VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT  = 4
 *     }
 */
@JvmInline
value class DebugUtilsMessageTypeFlags(val value: Int) {
	
	
	companion object {
		
		val GENERAL = DebugUtilsMessageTypeFlags(1)
		
		val VALIDATION = DebugUtilsMessageTypeFlags(2)
		
		val PERFORMANCE = DebugUtilsMessageTypeFlags(4)
	
	}
	
	
	
	operator fun plus(mask: DebugUtilsMessageTypeFlags) = DebugUtilsMessageTypeFlags(value or mask.value)
	
	operator fun contains(mask: DebugUtilsMessageTypeFlags) = value and mask.value == mask.value


}



/**
 * Bitmask builder for [DebugUtilsMessageTypeFlags].
 */
inline fun DebugUtilsMessageTypeFlags(block: DebugUtilsMessageTypeFlags.Companion.() -> DebugUtilsMessageTypeFlags) = block(DebugUtilsMessageTypeFlags)



/**
 *     // provided by VK_EXT_debug_utils
 *     struct VkDebugUtilsLabelEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         char*            pLabelName
 *         float            color[4]
 *     }
 */
@JvmInline
value class DebugUtilsLabel(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var pLabelName: Long
		get()      = Unsafe.getLong(address + 16)
		set(value) = Unsafe.setLong(address + 16, value)
	
	var color: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 24, 4)
		set(value) = Unsafe.copy(value.address, address + 24, value.byteSize)
	
	
	
	var labelName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DebugUtilsLabel(offset(index))
		
		operator fun set(index: Int, value: DebugUtilsLabel) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DebugUtilsLabel) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DebugUtilsLabel) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DebugUtilsLabel) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DebugUtilsLabel].
 */
inline fun Allocator.DebugUtilsLabel(block: (DebugUtilsLabel) -> Unit) = DebugUtilsLabel(calloc(40)).apply(block).also { it.sType = 1000128002 }



/**
 * Struct buffer calloc function for [DebugUtilsLabel].
 */
inline fun Allocator.DebugUtilsLabel(capacity: Int, block: (DebugUtilsLabel.Buffer) -> Unit) = DebugUtilsLabel.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128002 } }



/**
 *     // provided by VK_EXT_debug_utils
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



/**
 * Struct calloc function for [DebugUtilsMessengerCallbackData].
 */
inline fun Allocator.DebugUtilsMessengerCallbackData(block: (DebugUtilsMessengerCallbackData) -> Unit) = DebugUtilsMessengerCallbackData(calloc(96)).apply(block).also { it.sType = 1000128003 }



/**
 *     // provided by VK_EXT_debug_utils
 *     struct VkDebugUtilsMessengerCreateInfoEXT {
 *         VkStructureType                       sType
 *         void*                                 pNext (must be null)
 *         VkDebugUtilsMessengerCreateFlagsEXT   flags (reserved, must be zero)
 *         VkDebugUtilsMessageSeverityFlagsEXT   messageSeverity
 *         VkDebugUtilsMessageTypeFlagsEXT       messageType
 *         PFN_vkDebugUtilsMessengerCallbackEXT  pfnUserCallback
 *         void*                                 pUserData
 *     }
 */
@JvmInline
value class DebugUtilsMessengerCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var messageSeverity: DebugUtilsMessageSeverityFlags
		get()      = DebugUtilsMessageSeverityFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var messageType: DebugUtilsMessageTypeFlags
		get()      = DebugUtilsMessageTypeFlags(Unsafe.getInt(address + 24))
		set(value) = Unsafe.setInt(address + 24, value.value)
	
	var pfnUserCallback: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pUserData: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)


}



/**
 * Struct calloc function for [DebugUtilsMessengerCreateInfo].
 */
inline fun Allocator.DebugUtilsMessengerCreateInfo(block: (DebugUtilsMessengerCreateInfo) -> Unit) = DebugUtilsMessengerCreateInfo(calloc(48)).apply(block).also { it.sType = 1000128004 }



/**
 *     // provided by VK_EXT_debug_utils
 *     struct VkDebugUtilsObjectNameInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkObjectType     objectType
 *         uint64_t         objectHandle
 *         char*            pObjectName
 *     }
 */
@JvmInline
value class DebugUtilsObjectNameInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pObjectName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	
	
	var objectName:  DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getLong(address + 32))
		set(value) = Unsafe.setLong(address + 32, value.address)
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = 40
		
		val asList get() = List(capacity, ::get)
		
		operator fun get(index: Int) = DebugUtilsObjectNameInfo(offset(index))
		
		operator fun set(index: Int, value: DebugUtilsObjectNameInfo) = Unsafe.copy(value.address, offset(index), 40)
		
		inline fun forEach(block: (DebugUtilsObjectNameInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DebugUtilsObjectNameInfo) -> R) = List(capacity) { block(get(it)) }
		
		inline fun<R> mapIndexed(block: (Int, DebugUtilsObjectNameInfo) -> R) = List(capacity) { block(it, get(it)) }
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)


}



/**
 * Struct calloc function for [DebugUtilsObjectNameInfo].
 */
inline fun Allocator.DebugUtilsObjectNameInfo(block: (DebugUtilsObjectNameInfo) -> Unit) = DebugUtilsObjectNameInfo(calloc(40)).apply(block).also { it.sType = 1000128000 }



/**
 * Struct buffer calloc function for [DebugUtilsObjectNameInfo].
 */
inline fun Allocator.DebugUtilsObjectNameInfo(capacity: Int, block: (DebugUtilsObjectNameInfo.Buffer) -> Unit) = DebugUtilsObjectNameInfo.Buffer(calloc(capacity * 40), capacity).apply(block).apply { forEach { it.sType = 1000128000 } }



/**
 *     // provided by VK_EXT_debug_utils
 *     struct VkDebugUtilsObjectTagInfoEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkObjectType     objectType
 *         uint64_t         objectHandle
 *         uint64_t         tagName
 *         size_t           tagSize
 *         void*            pTag
 *     }
 */
@JvmInline
value class DebugUtilsObjectTagInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var tagName: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var tagSize: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var pTag: Long
		get()      = Unsafe.getLong(address + 48)
		set(value) = Unsafe.setLong(address + 48, value)
	
	
	
	var tag: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 48), tagSize.toInt())
		set(value) { Unsafe.setLong(address + 48, value.address); tagSize = value.capacity.toLong() }


}



/**
 * Struct calloc function for [DebugUtilsObjectTagInfo].
 */
inline fun Allocator.DebugUtilsObjectTagInfo(block: (DebugUtilsObjectTagInfo) -> Unit) = DebugUtilsObjectTagInfo(calloc(56)).apply(block).also { it.sType = 1000128001 }