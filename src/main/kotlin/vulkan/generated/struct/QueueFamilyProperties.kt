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
 *     struct VkQueueFamilyProperties {
 *         VkQueueFlags  queueFlags
 *         uint32_t      queueCount
 *         uint32_t      timestampValidBits
 *         VkExtent3D    minImageTransferGranularity
 *     }
 */
@JvmInline
value class QueueFamilyProperties(override val address: Long) : Addressable {
	
	
	var queueFlags: QueueFlags
		get()      = QueueFlags(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.bitfield) }
	
	var queueCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var timestampValidBits: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var minImageTransferGranularity: Extent3D
		get()      = Extent3D(address + LAYOUT.offsets[3])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[3], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = QueueFamilyProperties(offset(index))
		
		operator fun set(index: Int, value: QueueFamilyProperties) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (QueueFamilyProperties) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (QueueFamilyProperties) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "QueueFamilyProperties[$capacity]"
	
	}
	
	
	
	class Persistent(
		val queueFlags: QueueFlags,
		val queueCount: Int,
		val timestampValidBits: Int,
		val minImageTransferGranularity: Extent3D.Persistent,
	) {
		override fun toString() = "QueueFamilyProperties(" + 
			"queueFlags=$queueFlags, " +
			"queueCount=$queueCount, " +
			"timestampValidBits=$timestampValidBits, " +
			"minImageTransferGranularity=$minImageTransferGranularity)"
	}
	
	
	
	val asPersistent get() = Persistent(
		queueFlags, 
		queueCount, 
		timestampValidBits, 
		minImageTransferGranularity.asPersistent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(Extent3D.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = QueueFamilyProperties(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = QueueFamilyProperties(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = QueueFamilyProperties(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}