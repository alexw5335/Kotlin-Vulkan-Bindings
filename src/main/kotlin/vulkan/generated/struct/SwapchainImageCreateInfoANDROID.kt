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
 *     struct VkSwapchainImageCreateInfoANDROID {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkSwapchainImageUsageFlagsANDROID  usage
 *     }
 */
@JvmInline
value class SwapchainImageCreateInfoANDROID(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var usage: SwapchainImageUsageFlags
		get()      = SwapchainImageUsageFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = SwapchainImageCreateInfoANDROID(0)
		
		fun malloc(allocator: Allocator) = SwapchainImageCreateInfoANDROID(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = SwapchainImageCreateInfoANDROID(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}