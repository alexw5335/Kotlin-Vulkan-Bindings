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
 *     struct VkRefreshCycleDurationGOOGLE {
 *         uint64_t  refreshDuration
 *     }
 */
@JvmInline
value class RefreshCycleDurationGOOGLE(override val address: Long) : Addressable {
	
	
	var refreshDuration: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	
	
	class Persistent(
		val refreshDuration: Long,
	) {
		override fun toString() = "RefreshCycleDurationGOOGLE(" + 
			"refreshDuration=$refreshDuration)"
	}
	
	
	
	val asPersistent get() = Persistent(
		refreshDuration, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = RefreshCycleDurationGOOGLE(0)
		
		fun malloc(allocator: Allocator) = RefreshCycleDurationGOOGLE(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = RefreshCycleDurationGOOGLE(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}