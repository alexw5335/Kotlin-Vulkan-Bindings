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
 *     struct VkWriteDescriptorSet {
 *         VkStructureType           sType
 *         void*                     pNext
 *         VkDescriptorSet           dstSet
 *         uint32_t                  dstBinding
 *         uint32_t                  dstArrayElement
 *         uint32_t                  descriptorCount
 *         VkDescriptorType          descriptorType
 *         VkDescriptorImageInfo**   pImageInfo
 *         VkDescriptorBufferInfo**  pBufferInfo
 *         VkBufferView**            pTexelBufferView
 *     }
 */
@JvmInline
value class WriteDescriptorSet(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var dstSet: DescriptorSetH
		get()      = DescriptorSetH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var dstBinding: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var dstArrayElement: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var descriptorCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var descriptorType: DescriptorType
		get()      = DescriptorType(Unsafe.getInt(address + LAYOUT.offsets[6]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value.id) }
	
	var pImageInfo: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var pBufferInfo: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	var pTexelBufferView: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[9])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value) }
	
	
	
	var imageInfo: DescriptorImageInfo.Buffer
		get()      = DescriptorImageInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), descriptorCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); descriptorCount = value.capacity }
	
	var bufferInfo: DescriptorBufferInfo.Buffer
		get()      = DescriptorBufferInfo.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), descriptorCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); descriptorCount = value.capacity }
	
	var texelBufferView: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[9]), descriptorCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[9], value.address); descriptorCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = WriteDescriptorSet(offset(index))
		
		operator fun set(index: Int, value: WriteDescriptorSet) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (WriteDescriptorSet) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (WriteDescriptorSet) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "WriteDescriptorSet[$capacity]"
	
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
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = WriteDescriptorSet(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = WriteDescriptorSet(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET
		}
		
		fun calloc(allocator: Allocator) = WriteDescriptorSet(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WRITE_DESCRIPTOR_SET
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.WRITE_DESCRIPTOR_SET }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.WRITE_DESCRIPTOR_SET }
		}
	
	}


}