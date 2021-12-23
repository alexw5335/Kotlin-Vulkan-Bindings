// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkAabbPositionsKHR {
 *         float  minX
 *         float  minY
 *         float  minZ
 *         float  maxX
 *         float  maxY
 *         float  maxZ
 *     }
 */
@JvmInline
value class AabbPositions(override val address: Long) : Addressable {
	
	
	var minX: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var minY: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	var minZ: Float
		get()      = Unsafe.getFloat(address + 8)
		set(value) = Unsafe.setFloat(address + 8, value)
	
	var maxX: Float
		get()      = Unsafe.getFloat(address + 12)
		set(value) = Unsafe.setFloat(address + 12, value)
	
	var maxY: Float
		get()      = Unsafe.getFloat(address + 16)
		set(value) = Unsafe.setFloat(address + 16, value)
	
	var maxZ: Float
		get()      = Unsafe.getFloat(address + 20)
		set(value) = Unsafe.setFloat(address + 20, value)


}