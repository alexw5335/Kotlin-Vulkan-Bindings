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
 *     struct VkImageBlit2KHR {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 */
@JvmInline
value class ImageBlit2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + LAYOUT.offsets[3], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + LAYOUT.offsets[5], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ImageBlit2KHR(offset(index))
		
		operator fun set(index: Int, value: ImageBlit2KHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ImageBlit2KHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit2KHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ImageBlit2KHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(ImageSubresourceLayers.LAYOUT)
			array(Offset3D.LAYOUT, 2)
			member(ImageSubresourceLayers.LAYOUT)
			array(Offset3D.LAYOUT, 2)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageBlit2KHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ImageBlit2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_BLIT_2
		}
		
		fun calloc(allocator: Allocator) = ImageBlit2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_BLIT_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_BLIT_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_BLIT_2 }
		}
	
	}


}