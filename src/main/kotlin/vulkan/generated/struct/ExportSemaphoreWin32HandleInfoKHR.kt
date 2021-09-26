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
 *     struct VkExportSemaphoreWin32HandleInfoKHR {
 *         VkStructureType       sType
 *         void*                 pNext (must be null)
 *         SECURITY_ATTRIBUTES*  pAttributes
 *         DWORD                 dwAccess
 *         LPCWSTR               name
 *     }
 */
@JvmInline
value class ExportSemaphoreWin32HandleInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var pAttributes: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value) }
	
	var dwAccess: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value) }
	
	var name: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ExportSemaphoreWin32HandleInfoKHR(0)
		
		fun malloc(allocator: Allocator) = ExportSemaphoreWin32HandleInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXPORT_SEMAPHORE_WIN32_HANDLE_INFO
		}
		
		fun calloc(allocator: Allocator) = ExportSemaphoreWin32HandleInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.EXPORT_SEMAPHORE_WIN32_HANDLE_INFO
		}
	
	}


}