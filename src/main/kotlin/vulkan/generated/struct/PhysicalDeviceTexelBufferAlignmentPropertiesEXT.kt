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
 *     struct VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDeviceSize     storageTexelBufferOffsetAlignmentBytes
 *         VkBool32         storageTexelBufferOffsetSingleTexelAlignment
 *         VkDeviceSize     uniformTexelBufferOffsetAlignmentBytes
 *         VkBool32         uniformTexelBufferOffsetSingleTexelAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceTexelBufferAlignmentPropertiesEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var storageTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var storageTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var uniformTexelBufferOffsetAlignmentBytes: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var uniformTexelBufferOffsetSingleTexelAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val storageTexelBufferOffsetAlignmentBytes: Long,
		val storageTexelBufferOffsetSingleTexelAlignment: Int,
		val uniformTexelBufferOffsetAlignmentBytes: Long,
		val uniformTexelBufferOffsetSingleTexelAlignment: Int,
	) {
		override fun toString() = "PhysicalDeviceTexelBufferAlignmentPropertiesEXT(" + 
			"sType=$sType, " +
			"storageTexelBufferOffsetAlignmentBytes=$storageTexelBufferOffsetAlignmentBytes, " +
			"storageTexelBufferOffsetSingleTexelAlignment=$storageTexelBufferOffsetSingleTexelAlignment, " +
			"uniformTexelBufferOffsetAlignmentBytes=$uniformTexelBufferOffsetAlignmentBytes, " +
			"uniformTexelBufferOffsetSingleTexelAlignment=$uniformTexelBufferOffsetSingleTexelAlignment)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		storageTexelBufferOffsetAlignmentBytes, 
		storageTexelBufferOffsetSingleTexelAlignment, 
		uniformTexelBufferOffsetAlignmentBytes, 
		uniformTexelBufferOffsetSingleTexelAlignment, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PhysicalDeviceTexelBufferAlignmentPropertiesEXT(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceTexelBufferAlignmentPropertiesEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceTexelBufferAlignmentPropertiesEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES
		}
	
	}


}