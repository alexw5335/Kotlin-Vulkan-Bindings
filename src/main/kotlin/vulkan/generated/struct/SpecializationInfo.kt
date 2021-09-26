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
 *     struct VkSpecializationInfo {
 *         uint32_t                    mapEntryCount
 *         VkSpecializationMapEntry**  pMapEntries
 *         size_t                      dataSize
 *         void**                      pData
 *     }
 */
@JvmInline
value class SpecializationInfo(override val address: Long) : Addressable {
	
	
	var mapEntryCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var pMapEntries: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var dataSize: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[2], value) }
	
	var pData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	
	
	var mapEntries: SpecializationMapEntry.Buffer
		get()      = SpecializationMapEntry.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[1]), mapEntryCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address); mapEntryCount = value.capacity }
	
	var data: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), dataSize.toInt())
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); dataSize = value.capacity.toLong() }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SpecializationInfo(0)
		
		fun malloc(allocator: Allocator) = SpecializationInfo(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SpecializationInfo(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}