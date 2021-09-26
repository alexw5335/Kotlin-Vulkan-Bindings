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
 *     struct VkStridedDeviceAddressRegionKHR {
 *         VkDeviceAddress  deviceAddress
 *         VkDeviceSize     stride
 *         VkDeviceSize     size
 *     }
 */
@JvmInline
value class StridedDeviceAddressRegionKHR(override val address: Long) : Addressable {
	
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var stride: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[1], value) }
	
	var size: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[2], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(8)
			member(8)
			member(8)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = StridedDeviceAddressRegionKHR(0)
		
		fun malloc(allocator: Allocator) = StridedDeviceAddressRegionKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = StridedDeviceAddressRegionKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}