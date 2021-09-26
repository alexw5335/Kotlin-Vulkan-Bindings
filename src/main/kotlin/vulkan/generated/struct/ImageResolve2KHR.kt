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
 *     struct VkImageResolve2KHR {
 *         VkStructureType           sType
 *         void*                     pNext (must be null)
 *         VkImageSubresourceLayers  srcSubresource
 *         VkOffset3D                srcOffset
 *         VkImageSubresourceLayers  dstSubresource
 *         VkOffset3D                dstOffset
 *         VkExtent3D                extent
 *     }
 */
@JvmInline
value class ImageResolve2KHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var srcOffset: Offset3D
		get()      = Offset3D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	var dstSubresource: ImageSubresourceLayers
		get()      = ImageSubresourceLayers(address + LAYOUT.offsets[4])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.structSize) }
	
	var dstOffset: Offset3D
		get()      = Offset3D(address + LAYOUT.offsets[5])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.structSize) }
	
	var extent: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[6])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[6], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ImageResolve2KHR(offset(index))
		
		operator fun set(index: Int, value: ImageResolve2KHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ImageResolve2KHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageResolve2KHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ImageResolve2KHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(ImageSubresourceLayers.LAYOUT)
			member(Offset3D.LAYOUT)
			member(ImageSubresourceLayers.LAYOUT)
			member(Offset3D.LAYOUT)
			member(Extent3D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageResolve2KHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ImageResolve2KHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_RESOLVE_2
		}
		
		fun calloc(allocator: Allocator) = ImageResolve2KHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_RESOLVE_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_RESOLVE_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_RESOLVE_2 }
		}
	
	}


}