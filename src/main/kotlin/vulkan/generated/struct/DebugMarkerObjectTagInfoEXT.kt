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
 *     struct VkDebugMarkerObjectTagInfoEXT {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkDebugReportObjectTypeEXT  objectType
 *         uint64_t                    object
 *         uint64_t                    tagName
 *         size_t                      tagSize
 *         void**                      pTag
 *     }
 */
@JvmInline
value class DebugMarkerObjectTagInfoEXT(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var objectType: DebugReportObjectType
		get()      = DebugReportObjectType(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var _object: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var tagName: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var tagSize: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[5], value) }
	
	var pTag: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var tag: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), tagSize.toInt())
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); tagSize = value.capacity.toLong() }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(8)
			member(8)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DebugMarkerObjectTagInfoEXT(0)
		
		fun malloc(allocator: Allocator) = DebugMarkerObjectTagInfoEXT(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_MARKER_OBJECT_TAG_INFO
		}
		
		fun calloc(allocator: Allocator) = DebugMarkerObjectTagInfoEXT(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEBUG_MARKER_OBJECT_TAG_INFO
		}
	
	}


}