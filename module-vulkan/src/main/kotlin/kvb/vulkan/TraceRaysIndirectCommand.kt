// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_KHR_ray_tracing_pipeline

 *     struct VkTraceRaysIndirectCommandKHR {
 *         uint32_t  width
 *         uint32_t  height
 *         uint32_t  depth
 *     }
 */
@JvmInline
value class TraceRaysIndirectCommand(override val address: Long) : Addressable {
	
	
	var width: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var height: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)
	
	var depth: Int
		get()      = Unsafe.getInt(address + 8)
		set(value) = Unsafe.setInt(address + 8, value)


}