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
 *     struct VkDisplayModePropertiesKHR {
 *         VkDisplayModeKHR            displayMode
 *         VkDisplayModeParametersKHR  parameters
 *     }
 */
@JvmInline
value class DisplayModePropertiesKHR(override val address: Long) : Addressable {
	
	
	var displayMode: DisplayModeH
		get()      = DisplayModeH(Unsafe.getNativePointer(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[0], value.address) }
	
	var parameters: DisplayModeParametersKHR
		get()      = DisplayModeParametersKHR(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	
	
	class Buffer(override val address: Long, override val capacity: Int) : DirectBuffer {
		
		constructor(address: Long, capacity: Long) : this(address, capacity.toInt())
		
		override val elementSize get() = SIZE
		
		val asPersistentList get() = List(capacity) { get(it).asPersistent }
		
		operator fun get(index: Int) = DisplayModePropertiesKHR(offset(index))
		
		operator fun set(index: Int, value: DisplayModePropertiesKHR) = Unsafe.copy(value.address, offset(index), SIZE)
		
		inline fun forEach(block: (DisplayModePropertiesKHR) -> Unit) = repeat(capacity) { block(get(it)) }
		
		inline fun<R> map(block: (DisplayModePropertiesKHR) -> R) = List(capacity) { block(get(it)) }
		
		override fun toString() = "DisplayModePropertiesKHR[$capacity]"
	
	}
	
	
	
	class Persistent(
		val displayMode: DisplayModeH,
		val parameters: DisplayModeParametersKHR.Persistent,
	) {
		override fun toString() = "DisplayModePropertiesKHR(" + 
			"displayMode=$displayMode, " +
			"parameters=$parameters)"
	}
	
	
	
	val asPersistent get() = Persistent(
		displayMode, 
		parameters.asPersistent, 
	)
	
	
	
	val asBuffer get() = Buffer(address, 1)
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(NativeSizes.POINTER)
			member(DisplayModeParametersKHR.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayModePropertiesKHR(0)
		
		val EMPTY = Buffer(0, 0)
		
		fun malloc(allocator: Allocator) = DisplayModePropertiesKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DisplayModePropertiesKHR(allocator.calloc(SIZE, ALIGNMENT))
		
		fun malloc(allocator: Allocator, capacity: Int) = Buffer(allocator.malloc(SIZE*capacity, ALIGNMENT), capacity)
		
		fun calloc(allocator: Allocator, capacity: Int) = Buffer(allocator.calloc(SIZE*capacity, ALIGNMENT), capacity)
	
	}


}