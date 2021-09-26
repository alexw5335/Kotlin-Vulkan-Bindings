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
 *     struct VkImageBlit {
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffsets[2]
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffsets[2]
 *     }
 */
@JvmInline
value class ImageBlit(override val address: Long) : Addressable {
	
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var srcOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + LAYOUT.offsets[1], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.byteSize) }
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var dstOffsets: Offset3D.Buffer
		get()      = Offset3D.Buffer(address + LAYOUT.offsets[3], 2)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ImageBlit(offset(index))
		
		operator fun set(index: Int, value: ImageBlit) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ImageBlit) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageBlit) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ImageBlit[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(ImageSubresourceLayers.LAYOUT)
			array(Offset3D.LAYOUT, 2)
			member(ImageSubresourceLayers.LAYOUT)
			array(Offset3D.LAYOUT, 2)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageBlit(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ImageBlit(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ImageBlit(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}