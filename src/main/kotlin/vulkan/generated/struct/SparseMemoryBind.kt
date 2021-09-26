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
 *     struct VkSparseMemoryBind {
 *         VkDeviceSize             resourceOffset
 *         VkDeviceSize             size
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseMemoryBind(override val address: Long) : Addressable {
	
	
	var resourceOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SparseMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseMemoryBind) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseMemoryBind[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(8)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseMemoryBind(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseMemoryBind(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SparseMemoryBind(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}