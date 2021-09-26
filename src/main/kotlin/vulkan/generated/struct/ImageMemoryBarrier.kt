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
 *     struct VkImageMemoryBarrier {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkAccessFlags            srcAccessMask
 *         VkAccessFlags            dstAccessMask
 *         VkImageLayout            oldLayout
 *         VkImageLayout            newLayout
 *         uint32_t                 srcQueueFamilyIndex
 *         uint32_t                 dstQueueFamilyIndex
 *         VkImage                  image
 *         VkImageSubresourceRange  subresourceRange
 *     }
 */
@JvmInline
value class ImageMemoryBarrier(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var dstAccessMask: AccessFlags
		get()      = AccessFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var oldLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var newLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.id) }
	
	var srcQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var dstQueueFamilyIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var image: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[8]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address) }
	
	var subresourceRange: ImageSubresourceRange
		get()      = ImageSubresourceRange(address + LAYOUT.offsets[9])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[9], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ImageMemoryBarrier(offset(index))
		
		operator fun set(index: Int, value: ImageMemoryBarrier) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ImageMemoryBarrier) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ImageMemoryBarrier) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ImageMemoryBarrier[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(ImageSubresourceRange.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImageMemoryBarrier(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ImageMemoryBarrier(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_MEMORY_BARRIER
		}
		
		fun calloc(allocator: Allocator) = ImageMemoryBarrier(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMAGE_MEMORY_BARRIER
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_MEMORY_BARRIER }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.IMAGE_MEMORY_BARRIER }
		}
	
	}


}