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
 *     struct VkDisplayModeParametersKHR {
 *         VkExtent2D  visibleRegion
 *         uint32_t    refreshRate
 *     }
 */
@JvmInline
value class DisplayModeParametersKHR(override val address: Long) : Addressable {
	
	
	var visibleRegion: Extent2D
		get()      = Extent2D(address + LAYOUT.offsets[0])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.structSize) }
	
	var refreshRate: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	class Persistent(
		val visibleRegion: Extent2D.Persistent,
		val refreshRate: Int,
	) {
		override fun toString() = "DisplayModeParametersKHR(" + 
			"visibleRegion=$visibleRegion, " +
			"refreshRate=$refreshRate)"
	}
	
	
	
	val asPersistent get() = Persistent(
		visibleRegion.asPersistent, 
		refreshRate, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(Extent2D.LAYOUT)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DisplayModeParametersKHR(0)
		
		fun malloc(allocator: Allocator) = DisplayModeParametersKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DisplayModeParametersKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}