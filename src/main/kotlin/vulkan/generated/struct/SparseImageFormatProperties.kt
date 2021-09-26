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
 *     struct VkSparseImageFormatProperties {
 *         VkImageAspectFlags        aspectMask
 *         VkExtent3D                imageGranularity
 *         VkSparseImageFormatFlags  flags
 *     }
 */
@JvmInline
value class SparseImageFormatProperties(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var imageGranularity: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var flags: SparseImageFormatFlags
		get()      = SparseImageFormatFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = SparseImageFormatProperties(offset(index))
		
		operator fun set(index: Int, value: SparseImageFormatProperties) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseImageFormatProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageFormatProperties) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseImageFormatProperties[$capacity]"
	
	}
	
	
	
	class Persistent(
		val aspectMask: ImageAspectFlags,
		val imageGranularity: Extent3D.Persistent,
		val flags: SparseImageFormatFlags,
	) {
		override fun toString() = "SparseImageFormatProperties(" + 
			"aspectMask=$aspectMask, " +
			"imageGranularity=$imageGranularity, " +
			"flags=$flags)"
	}
	
	
	
	val asPersistent get() = Persistent(
		aspectMask, 
		imageGranularity.asPersistent, 
		flags, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(Extent3D.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseImageFormatProperties(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseImageFormatProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SparseImageFormatProperties(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}