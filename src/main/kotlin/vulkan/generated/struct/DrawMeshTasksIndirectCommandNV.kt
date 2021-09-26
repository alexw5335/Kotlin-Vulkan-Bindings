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
 *     struct VkDrawMeshTasksIndirectCommandNV {
 *         uint32_t  taskCount
 *         uint32_t  firstTask
 *     }
 */
@JvmInline
value class DrawMeshTasksIndirectCommandNV(override val address: Long) : Addressable {
	
	
	var taskCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value) }
	
	var firstTask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DrawMeshTasksIndirectCommandNV(0)
		
		fun malloc(allocator: Allocator) = DrawMeshTasksIndirectCommandNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DrawMeshTasksIndirectCommandNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}