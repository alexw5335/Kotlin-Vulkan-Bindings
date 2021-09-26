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
 *     struct VkSparseImageMemoryRequirements {
 *         VkSparseImageFormatProperties  formatProperties
 *         uint32_t                       imageMipTailFirstLod
 *         VkDeviceSize                   imageMipTailSize
 *         VkDeviceSize                   imageMipTailOffset
 *         VkDeviceSize                   imageMipTailStride
 *     }
 */
@JvmInline
value class SparseImageMemoryRequirements(override val address: Long) : Addressable {
	
	
	var formatProperties: SparseImageFormatProperties
		get()      = SparseImageFormatProperties(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var imageMipTailFirstLod: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var imageMipTailSize: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var imageMipTailOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var imageMipTailStride: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = SparseImageMemoryRequirements(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryRequirements) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseImageMemoryRequirements) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryRequirements) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseImageMemoryRequirements[$capacity]"
	
	}
	
	
	
	class Persistent(
		val formatProperties: SparseImageFormatProperties.Persistent,
		val imageMipTailFirstLod: Int,
		val imageMipTailSize: Long,
		val imageMipTailOffset: Long,
		val imageMipTailStride: Long,
	) {
		override fun toString() = "SparseImageMemoryRequirements(" + 
			"formatProperties=$formatProperties, " +
			"imageMipTailFirstLod=$imageMipTailFirstLod, " +
			"imageMipTailSize=$imageMipTailSize, " +
			"imageMipTailOffset=$imageMipTailOffset, " +
			"imageMipTailStride=$imageMipTailStride)"
	}
	
	
	
	val asPersistent get() = Persistent(
		formatProperties.asPersistent, 
		imageMipTailFirstLod, 
		imageMipTailSize, 
		imageMipTailOffset, 
		imageMipTailStride, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(SparseImageFormatProperties.LAYOUT)
			member(4)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseImageMemoryRequirements(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseImageMemoryRequirements(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SparseImageMemoryRequirements(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}