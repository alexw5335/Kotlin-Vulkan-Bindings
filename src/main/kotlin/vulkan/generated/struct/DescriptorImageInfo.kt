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
 *     struct VkDescriptorImageInfo {
 *         VkSampler      sampler
 *         VkImageView    imageView
 *         VkImageLayout  imageLayout
 *     }
 */
@JvmInline
value class DescriptorImageInfo(override val address: Long) : Addressable {
	
	
	var sampler: SamplerH
		get()      = SamplerH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var imageView: ImageViewH
		get()      = ImageViewH(Unsafe.getNativePointer(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value.address) }
	
	var imageLayout: ImageLayout
		get()      = ImageLayout(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = DescriptorImageInfo(offset(index))
		
		operator fun set(index: Int, value: DescriptorImageInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DescriptorImageInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorImageInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DescriptorImageInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorImageInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DescriptorImageInfo(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DescriptorImageInfo(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}