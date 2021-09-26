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
 *     struct VkCopyBufferToImageInfo2KHR {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkBuffer                 srcBuffer
 *         VkImage                  dstImage
 *         VkImageLayout            dstImageLayout
 *         uint32_t                 regionCount
 *         VkBufferImageCopy2KHR**  pRegions
 *     }
 */
@JvmInline
value class CopyBufferToImageInfo2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcBuffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var dstImage: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var dstImageLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var regionCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pRegions: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var regions: BufferImageCopy2KHR.Buffer
		get()      = BufferImageCopy2KHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), regionCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); regionCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CopyBufferToImageInfo2KHR(0)
		
		fun malloc(allocator: Allocator) = CopyBufferToImageInfo2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_BUFFER_TO_IMAGE_INFO_2
		}
		
		fun calloc(allocator: Allocator) = CopyBufferToImageInfo2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_BUFFER_TO_IMAGE_INFO_2
		}
	
	}


}