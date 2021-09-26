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
 *     struct VkTransformMatrixKHR {
 *         float  matrix[4]
 *     }
 */
@JvmInline
value class TransformMatrixKHR(override val address: Long) : Addressable {
	
	
	var matrix: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + LAYOUT.offsets[0], 4)
		set(value) { Unsafe.copy(value.address, address + LAYOUT.offsets[0], value.byteSize) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			array(4, 4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = TransformMatrixKHR(0)
		
		fun malloc(allocator: Allocator) = TransformMatrixKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = TransformMatrixKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}