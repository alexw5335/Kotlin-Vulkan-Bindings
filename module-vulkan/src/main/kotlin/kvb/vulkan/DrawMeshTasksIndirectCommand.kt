// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_mesh_shader

 *     struct VkDrawMeshTasksIndirectCommandNV {
 *         uint32_t  taskCount
 *         uint32_t  firstTask
 *     }
 */
@JvmInline
value class DrawMeshTasksIndirectCommand(override val address: Long) : Addressable {
	
	
	var taskCount: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var firstTask: Int
		get()      = Unsafe.getInt(address + 4)
		set(value) = Unsafe.setInt(address + 4, value)


}