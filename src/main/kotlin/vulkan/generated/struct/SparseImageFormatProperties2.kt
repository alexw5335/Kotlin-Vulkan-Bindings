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
 *     struct VkSparseImageFormatProperties2 {
 *         VkStructureType                sType
 *         void*                          pNext (must be null)
 *         VkSparseImageFormatProperties  properties
 *     }
 */
@JvmInline
value class SparseImageFormatProperties2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var properties: SparseImageFormatProperties
		get()      = SparseImageFormatProperties(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = SparseImageFormatProperties2(offset(index))
		
		operator fun set(index: Int, value: SparseImageFormatProperties2) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseImageFormatProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageFormatProperties2) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseImageFormatProperties2[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val properties: SparseImageFormatProperties.Persistent,
	) {
		override fun toString() = "SparseImageFormatProperties2(" + 
			"sType=$sType, " +
			"properties=$properties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		properties.asPersistent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(SparseImageFormatProperties.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseImageFormatProperties2(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseImageFormatProperties2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SPARSE_IMAGE_FORMAT_PROPERTIES_2
		}
		
		fun calloc(allocator: Allocator) = SparseImageFormatProperties2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.SPARSE_IMAGE_FORMAT_PROPERTIES_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SPARSE_IMAGE_FORMAT_PROPERTIES_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.SPARSE_IMAGE_FORMAT_PROPERTIES_2 }
		}
	
	}


}