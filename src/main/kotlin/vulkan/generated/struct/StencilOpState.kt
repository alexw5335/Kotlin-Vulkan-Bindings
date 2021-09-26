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
 *     struct VkStencilOpState {
 *         VkStencilOp  failOp
 *         VkStencilOp  passOp
 *         VkStencilOp  depthFailOp
 *         VkCompareOp  compareOp
 *         uint32_t     compareMask
 *         uint32_t     writeMask
 *         uint32_t     reference
 *     }
 */
@JvmInline
value class StencilOpState(override val address: Long) : Addressable {
	
	
	var failOp: StencilOp
		get()      = StencilOp(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var passOp: StencilOp
		get()      = StencilOp(Unsafe.getInt(address + LAYOUT.offsets[1]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[1], value.id) }
	
	var depthFailOp: StencilOp
		get()      = StencilOp(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.id) }
	
	var compareOp: CompareOp
		get()      = CompareOp(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.id) }
	
	var compareMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value) }
	
	var writeMask: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	var reference: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = StencilOpState(0)
		
		fun malloc(allocator: Allocator) = StencilOpState(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = StencilOpState(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}