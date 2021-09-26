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
 *     struct VkQueueFamilyProperties2 {
 *         VkStructureType          sType
 *         void*                    pNext
 *         VkQueueFamilyProperties  queueFamilyProperties
 *     }
 */
@JvmInline
value class QueueFamilyProperties2(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var queueFamilyProperties: QueueFamilyProperties
		get()      = QueueFamilyProperties(address + LAYOUT.offsets[2])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[2], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = QueueFamilyProperties2(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties2) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (QueueFamilyProperties2) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties2) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "QueueFamilyProperties2[$capacity]"
	
	}
	
	
	
	class Persistent(
		val sType: StructureType,
		val queueFamilyProperties: QueueFamilyProperties.Persistent,
	) {
		override fun toString() = "QueueFamilyProperties2(" + 
			"sType=$sType, " +
			"queueFamilyProperties=$queueFamilyProperties)"
	}
	
	
	
	val asPersistent get() = Persistent(
		sType, 
		queueFamilyProperties.asPersistent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(QueueFamilyProperties.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = QueueFamilyProperties2(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = QueueFamilyProperties2(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUEUE_FAMILY_PROPERTIES_2
		}
		
		fun calloc(allocator: Allocator) = QueueFamilyProperties2(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.QUEUE_FAMILY_PROPERTIES_2
		}
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.QUEUE_FAMILY_PROPERTIES_2 }
		}
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity).apply {
			forEach { it.sType = StructureType.QUEUE_FAMILY_PROPERTIES_2 }
		}
	
	}


}