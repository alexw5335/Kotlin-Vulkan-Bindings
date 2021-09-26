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
 *     struct VkCopyImageToBufferInfo2KHR {
 *         VkStructureType          sType
 *         void*                    pNext (must be null)
 *         VkImage                  srcImage
 *         VkImageLayout            srcImageLayout
 *         VkBuffer                 dstBuffer
 *         uint32_t                 regionCount
 *         VkBufferImageCopy2KHR**  pRegions
 *     }
 */
@JvmInline
value class CopyImageToBufferInfo2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcImage: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var srcImageLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var dstBuffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
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
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CopyImageToBufferInfo2KHR(0)
		
		fun malloc(allocator: Allocator) = CopyImageToBufferInfo2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_IMAGE_TO_BUFFER_INFO_2
		}
		
		fun calloc(allocator: Allocator) = CopyImageToBufferInfo2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_IMAGE_TO_BUFFER_INFO_2
		}
	
	}


}