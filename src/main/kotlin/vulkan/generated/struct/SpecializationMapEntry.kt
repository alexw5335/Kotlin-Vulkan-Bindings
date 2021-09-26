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
 *     struct VkSpecializationMapEntry {
 *         uint32_t  constantID
 *         uint32_t  offset
 *         size_t    size
 *     }
 */
@JvmInline
value class SpecializationMapEntry(override val address: Long) : Addressable {
	
	
	var constantID: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var offset: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var size: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[2], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SpecializationMapEntry(offset(index))
		
		operator fun set(index: Int, value: SpecializationMapEntry) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SpecializationMapEntry) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SpecializationMapEntry) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SpecializationMapEntry[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(NativeSizes.SIZE_T)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SpecializationMapEntry(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SpecializationMapEntry(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SpecializationMapEntry(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}