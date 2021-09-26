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
 *     struct VkPerformanceCounterDescriptionKHR {
 *         VkStructureType                          sType
 *         void*                                    pNext (must be null)
 *         VkPerformanceCounterDescriptionFlagsKHR  flags
 *         char                                     name[256]
 *         char                                     category[256]
 *         char                                     description[256]
 *     }
 */
@JvmInline
value class PerformanceCounterDescriptionKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PerformanceCounterDescriptionFlags
		get()      = PerformanceCounterDescriptionFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var name: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[3], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.byteSize) }
	
	var category: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[4], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[4], value.byteSize) }
	
	var description: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[5], 256)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PerformanceCounterDescriptionKHR(offset(index))
		
		operator fun set(index: Int, value: PerformanceCounterDescriptionKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PerformanceCounterDescriptionKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PerformanceCounterDescriptionKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PerformanceCounterDescriptionKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val flags: PerformanceCounterDescriptionFlags,
		val name: String,
		val category: String,
		val description: String,
	) {
		override fun toString() = "PerformanceCounterDescriptionKHR(" + 
			"sType=$sType, " +
			"flags=$flags, " +
			"name=$name, " +
			"category=$category, " +
			"description=$description)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		flags, 
		Unsafe.decodeUtf8(name), 
		Unsafe.decodeUtf8(category), 
		Unsafe.decodeUtf8(description), 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			array(1, 256)
			array(1, 256)
			array(1, 256)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PerformanceCounterDescriptionKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PerformanceCounterDescriptionKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PERFORMANCE_COUNTER_DESCRIPTION
		}
		
		fun calloc(allocator: Allocator) = PerformanceCounterDescriptionKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PERFORMANCE_COUNTER_DESCRIPTION
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PERFORMANCE_COUNTER_DESCRIPTION }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PERFORMANCE_COUNTER_DESCRIPTION }
		}
	
	}


}