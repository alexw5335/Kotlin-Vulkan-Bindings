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
 *     struct VkClearAttachment {
 *         VkImageAspectFlags  aspectMask
 *         uint32_t            colorAttachment
 *         VkClearValue        clearValue
 *     }
 */
@JvmInline
value class ClearAttachment(override val address: Long) : Addressable {
	
	
	var aspectMask: ImageAspectFlags
		get()      = ImageAspectFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var colorAttachment: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var clearValue: ClearValue
		get()      = ClearValue(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = ClearAttachment(offset(index))
		
		operator fun set(index: Int, value: ClearAttachment) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (ClearAttachment) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (ClearAttachment) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "ClearAttachment[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(ClearValue.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ClearAttachment(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = ClearAttachment(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = ClearAttachment(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}