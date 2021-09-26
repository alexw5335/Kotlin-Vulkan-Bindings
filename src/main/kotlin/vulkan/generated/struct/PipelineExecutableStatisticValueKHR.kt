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
 *     union VkPipelineExecutableStatisticValueKHR
 *         VkBool32  b32
 *         int64_t   i64
 *         uint64_t  u64
 *         double    f64
 *     }
 */
@JvmInline
value class PipelineExecutableStatisticValueKHR(override val address: Long) : Addressable {
	
	
	var b32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var i64: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var u64: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	var f64: Double
		get()      = Unsafe.getDouble(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setDouble(address + LAYOUT.offsets[3], value) }
	
	
	
	class Persistent(
		val b32: Int,
		val i64: Long,
		val u64: Long,
		val f64: Double,
	) {
		override fun toString() = "PipelineExecutableStatisticValueKHR(" + 
			"b32=$b32, " +
			"i64=$i64, " +
			"u64=$u64, " +
			"f64=$f64)"
	}
	
	
	
	val asPersistent get() = Persistent(
		b32, 
		i64, 
		u64, 
		f64, 
	)
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(4)
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineExecutableStatisticValueKHR(0)
		
		fun malloc(allocator: Allocator) = PipelineExecutableStatisticValueKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PipelineExecutableStatisticValueKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}