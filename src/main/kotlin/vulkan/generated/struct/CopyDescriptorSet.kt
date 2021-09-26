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
 *     struct VkCopyDescriptorSet {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkDescriptorSet  srcSet
 *         uint32_t         srcBinding
 *         uint32_t         srcArrayElement
 *         VkDescriptorSet  dstSet
 *         uint32_t         dstBinding
 *         uint32_t         dstArrayElement
 *         uint32_t         descriptorCount
 *     }
 */
@JvmInline
value class CopyDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var srcSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var srcBinding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var srcArrayElement: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getNativePointer(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address) }
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[8], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = CopyDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: CopyDescriptorSet) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (CopyDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (CopyDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "CopyDescriptorSet[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = CopyDescriptorSet(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = CopyDescriptorSet(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_DESCRIPTOR_SET
		}
		
		fun calloc(allocator: Allocator) = CopyDescriptorSet(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.COPY_DESCRIPTOR_SET
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COPY_DESCRIPTOR_SET }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.COPY_DESCRIPTOR_SET }
		}
	
	}


}