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
 *     struct VkMemoryGetWin32HandleInfoKHR {
 *         VkStructureType                     sType
 *         void*                               pNext (must be null)
 *         VkDeviceMemory                      memory
 *         VkExternalMemoryHandleTypeFlagBits  handleType
 *     }
 */
@JvmInline
value class MemoryGetWin32HandleInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var memory: DeviceMemoryH
		get()      = DeviceMemoryH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var handleType: ExternalMemoryHandleTypeFlags
		get()      = ExternalMemoryHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = MemoryGetWin32HandleInfoKHR(0)
		
		fun malloc(allocator: Allocator) = MemoryGetWin32HandleInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_GET_WIN32_HANDLE_INFO
		}
		
		fun calloc(allocator: Allocator) = MemoryGetWin32HandleInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.MEMORY_GET_WIN32_HANDLE_INFO
		}
	
	}


}