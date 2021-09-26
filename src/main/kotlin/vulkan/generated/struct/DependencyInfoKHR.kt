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
 *     struct VkDependencyInfoKHR {
 *         VkStructureType              sType
 *         void*                        pNext (must be null)
 *         VkDependencyFlags            dependencyFlags
 *         uint32_t                     memoryBarrierCount
 *         VkMemoryBarrier2KHR**        pMemoryBarriers
 *         uint32_t                     bufferMemoryBarrierCount
 *         VkBufferMemoryBarrier2KHR**  pBufferMemoryBarriers
 *         uint32_t                     imageMemoryBarrierCount
 *         VkImageMemoryBarrier2KHR**   pImageMemoryBarriers
 *     }
 */
@JvmInline
value class DependencyInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var dependencyFlags: DependencyFlags
		get()      = DependencyFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var memoryBarrierCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var pMemoryBarriers: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var bufferMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pBufferMemoryBarriers: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	var imageMemoryBarrierCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[7], value) }
	
	var pImageMemoryBarriers: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	
	
	var memoryBarriers: MemoryBarrier2KHR.Buffer
		get()      = MemoryBarrier2KHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), memoryBarrierCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); memoryBarrierCount = value.capacity }
	
	var bufferMemoryBarriers: BufferMemoryBarrier2KHR.Buffer
		get()      = BufferMemoryBarrier2KHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), bufferMemoryBarrierCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); bufferMemoryBarrierCount = value.capacity }
	
	var imageMemoryBarriers: ImageMemoryBarrier2KHR.Buffer
		get()      = ImageMemoryBarrier2KHR.Buffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), imageMemoryBarrierCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); imageMemoryBarrierCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = DependencyInfoKHR(offset(index))
		
		operator fun set(index: Int, value: DependencyInfoKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DependencyInfoKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DependencyInfoKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DependencyInfoKHR[$capacity]"
	
	}
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DependencyInfoKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DependencyInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEPENDENCY_INFO
		}
		
		fun calloc(allocator: Allocator) = DependencyInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.DEPENDENCY_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEPENDENCY_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.DEPENDENCY_INFO }
		}
	
	}


}