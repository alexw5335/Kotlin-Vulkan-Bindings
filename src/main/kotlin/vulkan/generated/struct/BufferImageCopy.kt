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
 *     struct VkBufferImageCopy {
 *         VkDeviceSize              bufferOffset
 *         uint32_t                  bufferRowLength
 *         uint32_t                  bufferImageHeight
 *         VkImageSubresourceLayers  imageSubresource
 *         VkOffset3D                imageOffset
 *         VkExtent3D                imageExtent
 *     }
 */
@JvmInline
value class BufferImageCopy(override val address: Long) : Addressable {
	
	
	var bufferOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var bufferRowLength: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var bufferImageHeight: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var imageSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var imageOffset: Offset3D
		get()      = Offset3D(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var imageExtent: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = BufferImageCopy(offset(index))
		
		operator fun set(index: Int, value: BufferImageCopy) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (BufferImageCopy) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BufferImageCopy) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "BufferImageCopy[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(4)
			member(4)
			member(ImageSubresourceLayers.LAYOUT)
			member(Offset3D.LAYOUT)
			member(Extent3D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BufferImageCopy(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = BufferImageCopy(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = BufferImageCopy(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}