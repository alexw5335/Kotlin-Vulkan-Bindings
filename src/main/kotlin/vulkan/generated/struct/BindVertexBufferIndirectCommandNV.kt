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
 *     struct VkBindVertexBufferIndirectCommandNV {
 *         VkDeviceAddress  bufferAddress
 *         uint32_t         size
 *         uint32_t         stride
 *     }
 */
@JvmInline
value class BindVertexBufferIndirectCommandNV(override val address: Long) : Addressable {
	
	
	var bufferAddress: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var size: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value) }
	
	var stride: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = BindVertexBufferIndirectCommandNV(0)
		
		fun malloc(allocator: Allocator) = BindVertexBufferIndirectCommandNV(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = BindVertexBufferIndirectCommandNV(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}