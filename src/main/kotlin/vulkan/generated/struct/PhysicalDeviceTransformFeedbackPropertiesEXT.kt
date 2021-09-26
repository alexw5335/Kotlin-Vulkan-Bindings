// This file has been automatically generated.

package vulkan.generated.struct

import memory.NativeSizes
import memory.type.DirectBuffer
import memory.struct.LayoutBuilder
import memory.allocation.Allocator
import memory.Unsafe
import memory.type.Addressable

import vulkan.generated.enumeration.*
import memory.primitive.*
import vulkan.generated.handle.*

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
value class PhysicalDeviceTransformFeedbackPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxTransformFeedbackStreams: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxTransformFeedbackBuffers: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxTransformFeedbackBufferSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var maxTransformFeedbackStreamDataSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxTransformFeedbackBufferDataSize: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxTransformFeedbackBufferDataStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var transformFeedbackQueries: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var transformFeedbackStreamsLinesTriangles: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var transformFeedbackRasterizationStreamSelect: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	var transformFeedbackDraw: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[11])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[11], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxTransformFeedbackStreams: Int,
		val maxTransformFeedbackBuffers: Int,
		val maxTransformFeedbackBufferSize: Long,
		val maxTransformFeedbackStreamDataSize: Int,
		val maxTransformFeedbackBufferDataSize: Int,
		val maxTransformFeedbackBufferDataStride: Int,
		val transformFeedbackQueries: Int,
		val transformFeedbackStreamsLinesTriangles: Int,
		val transformFeedbackRasterizationStreamSelect: Int,
		val transformFeedbackDraw: Int,
	) {
		override fun toString() = "PhysicalDeviceTransformFeedbackPropertiesEXT(" + 
			"sType=$sType, " +
			"maxTransformFeedbackStreams=$maxTransformFeedbackStreams, " +
			"maxTransformFeedbackBuffers=$maxTransformFeedbackBuffers, " +
			"maxTransformFeedbackBufferSize=$maxTransformFeedbackBufferSize, " +
			"maxTransformFeedbackStreamDataSize=$maxTransformFeedbackStreamDataSize, " +
			"maxTransformFeedbackBufferDataSize=$maxTransformFeedbackBufferDataSize, " +
			"maxTransformFeedbackBufferDataStride=$maxTransformFeedbackBufferDataStride, " +
			"transformFeedbackQueries=$transformFeedbackQueries, " +
			"transformFeedbackStreamsLinesTriangles=$transformFeedbackStreamsLinesTriangles, " +
			"transformFeedbackRasterizationStreamSelect=$transformFeedbackRasterizationStreamSelect, " +
			"transformFeedbackDraw=$transformFeedbackDraw)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxTransformFeedbackStreams, 
		maxTransformFeedbackBuffers, 
		maxTransformFeedbackBufferSize, 
		maxTransformFeedbackStreamDataSize, 
		maxTransformFeedbackBufferDataSize, 
		maxTransformFeedbackBufferDataStride, 
		transformFeedbackQueries, 
		transformFeedbackStreamsLinesTriangles, 
		transformFeedbackRasterizationStreamSelect, 
		transformFeedbackDraw, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(8)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceTransformFeedbackPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceTransformFeedbackPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceTransformFeedbackPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES
		}
	
	}


}