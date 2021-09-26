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
 *     struct VkPerformanceCounterKHR {
 *         VkStructureType                 sType
 *         void*                           pNext (must be null)
 *         VkPerformanceCounterUnitKHR     unit
 *         VkPerformanceCounterScopeKHR    scope
 *         VkPerformanceCounterStorageKHR  storage
 *         uint8_t                         uuid[16]
 *     }
 */
@JvmInline
value class PerformanceCounterKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var unit: PerformanceCounterUnit
		get()      = PerformanceCounterUnit(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var scope: PerformanceCounterScope
		get()      = PerformanceCounterScope(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var storage: PerformanceCounterStorage
		get()      = PerformanceCounterStorage(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.id) }
	
	var uuid: DirectByteBuffer
		get()      = DirectByteBuffer(address + LAYOUT.offsets[5], 16)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[5], value.byteSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = PerformanceCounterKHR(offset(index))
		
		operator fun set(index: Int, value: PerformanceCounterKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (PerformanceCounterKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (PerformanceCounterKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "PerformanceCounterKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val unit: PerformanceCounterUnit,
		val scope: PerformanceCounterScope,
		val storage: PerformanceCounterStorage,
		val uuid: ByteArray,
	) {
		override fun toString() = "PerformanceCounterKHR(" + 
			"sType=$sType, " +
			"unit=$unit, " +
			"scope=$scope, " +
			"storage=$storage, " +
			"uuid=$uuid)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		unit, 
		scope, 
		storage, 
		uuid.asArray, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
			array(1, 16)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PerformanceCounterKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = PerformanceCounterKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PERFORMANCE_COUNTER
		}
		
		fun calloc(allocator: Allocator) = PerformanceCounterKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PERFORMANCE_COUNTER
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PERFORMANCE_COUNTER }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.PERFORMANCE_COUNTER }
		}
	
	}


}