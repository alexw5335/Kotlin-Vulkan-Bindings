// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkDrawIndexedIndirectCommand {
 *         uint32_t  indexCount
 *         uint32_t  instanceCount
 *         uint32_t  firstIndex
 *         int32_t   vertexOffset
 *         uint32_t  firstInstance
 *     }
 */
@JvmInline
value class DrawIndexedIndirectCommand(override val address: Long) : Addressable {
	
	
	var indexCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var instanceCount: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var firstIndex: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)
	
	var vertexOffset: Int
		get()      = Unsafe.getInt(address + 12)
		set(value) = Unsafe.setInt(address + 12, value)
	
	var firstInstance: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)


}