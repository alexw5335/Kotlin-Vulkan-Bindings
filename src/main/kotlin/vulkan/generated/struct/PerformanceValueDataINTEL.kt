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
 *     union VkPerformanceValueDataINTEL
 *         uint32_t  value32
 *         uint64_t  value64
 *         float     valueFloat
 *         VkBool32  valueBool
 *         char**    valueString
 *     }
 */
@JvmInline
value class PerformanceValueDataINTEL(override val address: Long) : Addressable {
	
	
	var value32: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var value64: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var valueFloat: Float
		get()      = Unsafe.getFloat(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setFloat(address + LAYOUT.offsets[2], value) }
	
	var valueBool: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var valueString: DirectByteBuffer
		get()      = Unsafe.getBytesNT(Unsafe.getNativePointer(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(4)
			member(8)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PerformanceValueDataINTEL(0)
		
		fun malloc(allocator: Allocator) = PerformanceValueDataINTEL(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = PerformanceValueDataINTEL(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}