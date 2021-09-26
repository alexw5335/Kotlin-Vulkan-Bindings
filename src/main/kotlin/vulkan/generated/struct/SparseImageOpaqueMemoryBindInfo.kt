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
 *     struct VkSparseImageOpaqueMemoryBindInfo {
 *         VkImage               image
 *         uint32_t              bindCount
 *         VkSparseMemoryBind**  pBinds
 *     }
 */
@JvmInline
value class SparseImageOpaqueMemoryBindInfo(override val address: Long) : Addressable {
	
	
	var image: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var bindCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var pBinds: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	
	
	var binds: SparseMemoryBind.Buffer
		get()      = SparseMemoryBind.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[2]), bindCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address); bindCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SparseImageOpaqueMemoryBindInfo(offset(index))
		
		operator fun set(index: Int, value: SparseImageOpaqueMemoryBindInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseImageOpaqueMemoryBindInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageOpaqueMemoryBindInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseImageOpaqueMemoryBindInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseImageOpaqueMemoryBindInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseImageOpaqueMemoryBindInfo(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SparseImageOpaqueMemoryBindInfo(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}