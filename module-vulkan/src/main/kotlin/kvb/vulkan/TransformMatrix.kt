// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkTransformMatrixKHR {
 *         float  matrix[4]
 *     }
 */
@JvmInline
value class TransformMatrix(override val address: Long) : Addressable {
	
	
	var matrix: DirectFloatBuffer
		get()      = DirectFloatBuffer(address + 0, 4)
		set(value) = Unsafe.copy(value.address, address + 0, value.byteSize)


}