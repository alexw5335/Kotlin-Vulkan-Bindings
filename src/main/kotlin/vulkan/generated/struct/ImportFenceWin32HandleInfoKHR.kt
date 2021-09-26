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
 *     struct VkImportFenceWin32HandleInfoKHR {
 *         VkStructureType                    sType
 *         void*                              pNext (must be null)
 *         VkFence                            fence
 *         VkFenceImportFlags                 flags
 *         VkExternalFenceHandleTypeFlagBits  handleType
 *         HANDLE                             handle
 *         LPCWSTR                            name
 *     }
 */
@JvmInline
value class ImportFenceWin32HandleInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var fence: FenceH
		get()      = FenceH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var flags: FenceImportFlags
		get()      = FenceImportFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var handleType: ExternalFenceHandleTypeFlags
		get()      = ExternalFenceHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var handle: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var name: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[6], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImportFenceWin32HandleInfoKHR(0)
		
		fun malloc(allocator: Allocator) = ImportFenceWin32HandleInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_FENCE_WIN32_HANDLE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImportFenceWin32HandleInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_FENCE_WIN32_HANDLE_INFO
		}
	
	}


}