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
 *     struct VkBindAccelerationStructureMemoryInfoNV {
 *         VkStructureType            sType
 *         void*                      pNext (must be null)
 *         VkAccelerationStructureNV  accelerationStructure
 *         VkDeviceMemory             memory
 *         VkDeviceSize               memoryOffset
 *         uint32_t                   deviceIndexCount
 *         uint32_t**                 pDeviceIndices
 *     }
 */
@JvmInline
value class BindAccelerationStructureMemoryInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var accelerationStructure: AccelerationStructureH
		get()      = AccelerationStructureH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getNativePointer(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address) }
	
	var memoryOffset: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[4], value) }
	
	var deviceIndexCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var pDeviceIndices: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	var deviceIndices: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[6]), deviceIndexCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value.address); deviceIndexCount = value.capacity }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		operator fun get(index: Int) = BindAccelerationStructureMemoryInfoNV(offset(index))
		
		operator fun set(index: Int, value: BindAccelerationStructureMemoryInfoNV) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (BindAccelerationStructureMemoryInfoNV) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (BindAccelerationStructureMemoryInfoNV) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "BindAccelerationStructureMemoryInfoNV[$capacity]"
	
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
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BindAccelerationStructureMemoryInfoNV(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = BindAccelerationStructureMemoryInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_ACCELERATION_STRUCTURE_MEMORY_INFO
		}
		
		fun calloc(allocator: Allocator) = BindAccelerationStructureMemoryInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.BIND_ACCELERATION_STRUCTURE_MEMORY_INFO
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_ACCELERATION_STRUCTURE_MEMORY_INFO }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.BIND_ACCELERATION_STRUCTURE_MEMORY_INFO }
		}
	
	}


}