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
 *     struct VkSparseImageMemoryBind {
 *         VkImageSubresource       subresource
 *         VkOffset3D               offset
 *         VkExtent3D               extent
 *         VkDeviceMemory           memory
 *         VkDeviceSize             memoryOffset
 *         VkSparseMemoryBindFlags  flags
 *     }
 */
@JvmInline
value class SparseImageMemoryBind(override val address: Long) : Addressable {
	
	
	var subresource: ImageSubresource
		get()      = ImageSubresource(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var offset: Offset3D
		get()      = Offset3D(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	var extent: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var flags: SparseMemoryBindFlags
		get()      = SparseMemoryBindFlags(Unsafe.getInt(address + LAYOUT.offsets[5]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value.bitfield) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = SparseImageMemoryBind(offset(index))
		
		operator fun set(index: Int, value: SparseImageMemoryBind) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (SparseImageMemoryBind) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (SparseImageMemoryBind) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "SparseImageMemoryBind[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(ImageSubresource.LAYOUT)
			member(Offset3D.LAYOUT)
			member(Extent3D.LAYOUT)
			member(NativeSizes.POINTER)
			member(8)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SparseImageMemoryBind(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = SparseImageMemoryBind(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SparseImageMemoryBind(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}