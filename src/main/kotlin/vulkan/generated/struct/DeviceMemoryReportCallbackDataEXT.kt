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
 *     struct VkDeviceMemoryReportCallbackDataEXT {
 *         VkStructureType                   sType
 *         void*                             pNext (must be null)
 *         VkDeviceMemoryReportFlagsEXT      flags (reserved, must be zero)
 *         VkDeviceMemoryReportEventTypeEXT  type
 *         uint64_t                          memoryObjectId
 *         VkDeviceSize                      size
 *         VkObjectType                      objectType
 *         uint64_t                          objectHandle
 *         uint32_t                          heapIndex
 *     }
 */
@JvmInline
value class DeviceMemoryReportCallbackDataEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: DeviceMemoryReportFlags
		get()      = DeviceMemoryReportFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var type: DeviceMemoryReportEventType
		get()      = DeviceMemoryReportEventType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var memoryObjectId: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[5], value) }
	
	var objectType: ObjectType
		get()      = ObjectType(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var objectHandle: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[7], value) }
	
	var heapIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	
	
	class Persistent(
		val sType: StructureType,
		val flags: DeviceMemoryReportFlags,
		val type: DeviceMemoryReportEventType,
		val memoryObjectId: Long,
		val size: Long,
		val objectType: ObjectType,
		val objectHandle: Long,
		val heapIndex: Int,
	) {
		override fun toString() = "DeviceMemoryReportCallbackDataEXT(" + 
			"sType=$sType, " +
			"flags=$flags, " +
			"type=$type, " +
			"memoryObjectId=$memoryObjectId, " +
			"size=$size, " +
			"objectType=$objectType, " +
			"objectHandle=$objectHandle, " +
			"heapIndex=$heapIndex)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		flags, 
		type, 
		memoryObjectId, 
		size, 
		objectType, 
		objectHandle, 
		heapIndex, 
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
			member(8)
			member(4)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DeviceMemoryReportCallbackDataEXT(0)
		
		fun malloc(allocator: Allocator) = DeviceMemoryReportCallbackDataEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_MEMORY_REPORT_CALLBACK_DATA
		}
		
		fun calloc(allocator: Allocator) = DeviceMemoryReportCallbackDataEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEVICE_MEMORY_REPORT_CALLBACK_DATA
		}
	
	}


}