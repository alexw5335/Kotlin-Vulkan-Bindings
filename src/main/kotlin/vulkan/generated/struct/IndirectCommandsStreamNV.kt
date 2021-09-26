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
 *     struct VkIndirectCommandsStreamNV {
 *         VkBuffer      buffer
 *         VkDeviceSize  offset
 *     }
 */
@JvmInline
value class IndirectCommandsStreamNV(override val address: Long) : Addressable {
	
	
	var buffer: BufferH
		get()      = BufferH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var offset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = IndirectCommandsStreamNV(offset(index))
		
		operator fun set(index: Int, value: IndirectCommandsStreamNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (IndirectCommandsStreamNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (IndirectCommandsStreamNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "IndirectCommandsStreamNV[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = IndirectCommandsStreamNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = IndirectCommandsStreamNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = IndirectCommandsStreamNV(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}