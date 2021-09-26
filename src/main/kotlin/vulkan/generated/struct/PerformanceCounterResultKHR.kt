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
 *     union VkPerformanceCounterResultKHR
 *         int32_t   int32
 *         int64_t   int64
 *         uint32_t  uint32
 *         uint64_t  uint64
 *         float     float32
 *         double    float64
 *     }
 */
@JvmInline
value class PerformanceCounterResultKHR(override val address: Long) : Addressable {
	
	
	var int32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var int64: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var uint32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var uint64: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[3], value) }
	
	var float32: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[4], value) }
	
	var float64: Double
		get()      = Unsafe.getDouble(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setDouble(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(4)
			member(8)
			member(4)
			member(8)
			member(4)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PerformanceCounterResultKHR(0)
		
		fun malloc(allocator: Allocator) = PerformanceCounterResultKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PerformanceCounterResultKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}