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
 *     struct VkPerformanceValueINTEL {
 *         VkPerformanceValueTypeINTEL  type
 *         VkPerformanceValueDataINTEL  data
 *     }
 */
@JvmInline
value class PerformanceValueINTEL(override val address: Long) : Addressable {
	
	
	var type: PerformanceValueType
		get()      = PerformanceValueType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var data: PerformanceValueDataINTEL
		get()      = PerformanceValueDataINTEL(address + LAYOUT.offsets[1])
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[1], value.structSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(PerformanceValueDataINTEL.LAYOUT)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PerformanceValueINTEL(0)
		
		fun malloc(allocator: Allocator) = PerformanceValueINTEL(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PerformanceValueINTEL(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}