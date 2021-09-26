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
 *     union VkDeviceOrHostAddressConstKHR
 *         VkDeviceAddress  deviceAddress
 *         void*            hostAddress
 *     }
 */
@JvmInline
value class DeviceOrHostAddressConstKHR(override val address: Long) : Addressable {
	
	
	var deviceAddress: Long
		get()      = Unsafe.getLong(address + LAYOUT.offsets[0])
		set(value) { Unsafe.setLong(address + LAYOUT.offsets[0], value) }
	
	var hostAddress: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildUnion {
			member(8)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = DeviceOrHostAddressConstKHR(0)
		
		fun malloc(allocator: Allocator) = DeviceOrHostAddressConstKHR(allocator.malloc(SIZE, ALIGNMENT))
		
		fun calloc(allocator: Allocator) = DeviceOrHostAddressConstKHR(allocator.calloc(SIZE, ALIGNMENT))
	
	}


}