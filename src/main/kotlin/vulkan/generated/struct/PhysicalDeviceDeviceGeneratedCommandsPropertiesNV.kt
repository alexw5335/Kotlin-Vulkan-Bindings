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
 *     struct VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         maxGraphicsShaderGroupCount
 *         uint32_t         maxIndirectSequenceCount
 *         uint32_t         maxIndirectCommandsTokenCount
 *         uint32_t         maxIndirectCommandsStreamCount
 *         uint32_t         maxIndirectCommandsTokenOffset
 *         uint32_t         maxIndirectCommandsStreamStride
 *         uint32_t         minSequencesCountBufferOffsetAlignment
 *         uint32_t         minSequencesIndexBufferOffsetAlignment
 *         uint32_t         minIndirectCommandsBufferOffsetAlignment
 *     }
 */
@JvmInline
value class PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var maxGraphicsShaderGroupCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var maxIndirectSequenceCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var maxIndirectCommandsTokenCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var maxIndirectCommandsStreamCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var maxIndirectCommandsTokenOffset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var maxIndirectCommandsStreamStride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var minSequencesCountBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	var minSequencesIndexBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[9], value) }
	
	var minIndirectCommandsBufferOffsetAlignment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[10])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[10], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val maxGraphicsShaderGroupCount: Int,
		val maxIndirectSequenceCount: Int,
		val maxIndirectCommandsTokenCount: Int,
		val maxIndirectCommandsStreamCount: Int,
		val maxIndirectCommandsTokenOffset: Int,
		val maxIndirectCommandsStreamStride: Int,
		val minSequencesCountBufferOffsetAlignment: Int,
		val minSequencesIndexBufferOffsetAlignment: Int,
		val minIndirectCommandsBufferOffsetAlignment: Int,
	) {
		override fun toString() = "PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(" + 
			"sType=$sType, " +
			"maxGraphicsShaderGroupCount=$maxGraphicsShaderGroupCount, " +
			"maxIndirectSequenceCount=$maxIndirectSequenceCount, " +
			"maxIndirectCommandsTokenCount=$maxIndirectCommandsTokenCount, " +
			"maxIndirectCommandsStreamCount=$maxIndirectCommandsStreamCount, " +
			"maxIndirectCommandsTokenOffset=$maxIndirectCommandsTokenOffset, " +
			"maxIndirectCommandsStreamStride=$maxIndirectCommandsStreamStride, " +
			"minSequencesCountBufferOffsetAlignment=$minSequencesCountBufferOffsetAlignment, " +
			"minSequencesIndexBufferOffsetAlignment=$minSequencesIndexBufferOffsetAlignment, " +
			"minIndirectCommandsBufferOffsetAlignment=$minIndirectCommandsBufferOffsetAlignment)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		maxGraphicsShaderGroupCount, 
		maxIndirectSequenceCount, 
		maxIndirectCommandsTokenCount, 
		maxIndirectCommandsStreamCount, 
		maxIndirectCommandsTokenOffset, 
		maxIndirectCommandsStreamStride, 
		minSequencesCountBufferOffsetAlignment, 
		minSequencesIndexBufferOffsetAlignment, 
		minIndirectCommandsBufferOffsetAlignment, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
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
		
		val NULL = PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(0)
		
		fun malloc(allocator: Allocator) = PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES
		}
		
		fun calloc(allocator: Allocator) = PhysicalDeviceDeviceGeneratedCommandsPropertiesNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES
		}
	
	}


}