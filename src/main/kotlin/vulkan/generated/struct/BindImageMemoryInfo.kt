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
 *     struct VkBindImageMemoryInfo {
 *         VkStructureType  sType
 *         void*            pNext
 *         VkImage          image
 *         VkDeviceMemory   memory
 *         VkDeviceSize     memoryOffset
 *     }
 */
@JvmInline
value class BindImageMemoryInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var image: ImageH
		get()      = ImageH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = BindImageMemoryInfo(offset(index))
		
		operator fun set(index: Int, value: BindImageMemoryInfo) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (BindImageMemoryInfo) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindImageMemoryInfo) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "BindImageMemoryInfo[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BindImageMemoryInfo(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = BindImageMemoryInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_IMAGE_MEMORY_INFO
		}
		
		fun calloc(allocator: Allocator) = BindImageMemoryInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_IMAGE_MEMORY_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_IMAGE_MEMORY_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_IMAGE_MEMORY_INFO }
		}
	
	}


}