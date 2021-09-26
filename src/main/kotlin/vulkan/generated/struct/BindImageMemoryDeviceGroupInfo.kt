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
 *     struct VkBindImageMemoryDeviceGroupInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         deviceIndexCount
 *         uint32_t**       pDeviceIndices
 *         uint32_t         splitInstanceBindRegionCount
 *         VkRect2D**       pSplitInstanceBindRegions
 *     }
 */
@JvmInline
value class BindImageMemoryDeviceGroupInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pDeviceIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var splitInstanceBindRegionCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var pSplitInstanceBindRegions: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), deviceIndexCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); deviceIndexCount = value.capacity }
	
	var splitInstanceBindRegions: Rect2D.Buffer
		get()      = Rect2D.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), splitInstanceBindRegionCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); splitInstanceBindRegionCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BindImageMemoryDeviceGroupInfo(0)
		
		fun malloc(allocator: Allocator) = BindImageMemoryDeviceGroupInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO
		}
		
		fun calloc(allocator: Allocator) = BindImageMemoryDeviceGroupInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO
		}
	
	}


}