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
 *     struct VkDisplayPlanePropertiesKHR {
 *         VkDisplayKHR  currentDisplay
 *         uint32_t      currentStackIndex
 *     }
 */
@JvmInline
value class DisplayPlanePropertiesKHR(override val address: Long) : Addressable {
	
	
	var currentDisplay: DisplayH
		get()      = DisplayH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var currentStackIndex: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = DisplayPlanePropertiesKHR(offset(index))
		
		operator fun set(index: Int, value: DisplayPlanePropertiesKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DisplayPlanePropertiesKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayPlanePropertiesKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DisplayPlanePropertiesKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val currentDisplay: DisplayH,
		val currentStackIndex: Int,
	) {
		override fun toString() = "DisplayPlanePropertiesKHR(" + 
			"currentDisplay=$currentDisplay, " +
			"currentStackIndex=$currentStackIndex)"
	}
	
	
	
	val asPersistent get() = Persistent(
		currentDisplay, 
		currentStackIndex, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayPlanePropertiesKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DisplayPlanePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DisplayPlanePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}