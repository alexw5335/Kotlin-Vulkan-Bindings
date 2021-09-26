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
 *     struct VkDescriptorUpdateTemplateEntry {
 *         uint32_t          dstBinding
 *         uint32_t          dstArrayElement
 *         uint32_t          descriptorCount
 *         VkDescriptorType  descriptorType
 *         size_t            offset
 *         size_t            stride
 *     }
 */
@JvmInline
value class DescriptorUpdateTemplateEntry(override val address: Long) : Addressable {
	
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var descriptorType: DescriptorType
		get()      = DescriptorType(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var offset: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[4], value) }
	
	var stride: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[5], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = DescriptorUpdateTemplateEntry(offset(index))
		
		operator fun set(index: Int, value: DescriptorUpdateTemplateEntry) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DescriptorUpdateTemplateEntry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DescriptorUpdateTemplateEntry) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DescriptorUpdateTemplateEntry[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.SIZE_T)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DescriptorUpdateTemplateEntry(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DescriptorUpdateTemplateEntry(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DescriptorUpdateTemplateEntry(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}