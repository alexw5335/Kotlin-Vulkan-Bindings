// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.DirectBuffer
import kvb.core.memory.Allocator
import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxTransformFeedbackStreams
 *         uint32_t         maxTransformFeedbackBuffers
 *         VkDeviceSize     maxTransformFeedbackBufferSize
 *         uint32_t         maxTransformFeedbackStreamDataSize
 *         uint32_t         maxTransformFeedbackBufferDataSize
 *         uint32_t         maxTransformFeedbackBufferDataStride
 *         VkBool32         transformFeedbackQueries
 *         VkBool32         transformFeedbackStreamsLinesTriangles
 *         VkBool32         transformFeedbackRasterizationStreamSelect
 *         VkBool32         transformFeedbackDraw
 *     }
 */
@JvmInline
value class PhysicalDeviceTransformFeedbackProperties(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var maxTransformFeedbackStreams: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var maxTransformFeedbackBuffers: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var maxTransformFeedbackBufferSize: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var maxTransformFeedbackStreamDataSize: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var maxTransformFeedbackBufferDataSize: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var maxTransformFeedbackBufferDataStride: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var transformFeedbackQueries: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var transformFeedbackStreamsLinesTriangles: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var transformFeedbackRasterizationStreamSelect: Int
		get()      = Unsafe.getInt(address + 52)
		set(value) = Unsafe.setInt(address + 52, value)
	
	var transformFeedbackDraw: Int
		get()      = Unsafe.getInt(address + 56)
		set(value) = Unsafe.setInt(address + 56, value)


}