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
 *     struct VkImportSemaphoreFdInfoKHR {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkSemaphore                            semaphore
 *         VkSemaphoreImportFlags                 flags
 *         VkExternalSemaphoreHandleTypeFlagBits  handleType
 *         int                                    fd
 *     }
 */
@JvmInline
value class ImportSemaphoreFdInfoKHR(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var semaphore: SemaphoreH
		get()      = SemaphoreH(Unsafe.getNativePointer(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[2], value.address) }
	
	var flags: SemaphoreImportFlags
		get()      = SemaphoreImportFlags(Unsafe.getInt(address + LAYOUT.offsets[3]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[3], value.bitfield) }
	
	var handleType: ExternalSemaphoreHandleTypeFlags
		get()      = ExternalSemaphoreHandleTypeFlags(Unsafe.getInt(address + LAYOUT.offsets[4]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[4], value.bitfield) }
	
	var fd: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[5], value) }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(4)
			member(4)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImportSemaphoreFdInfoKHR(0)
		
		fun malloc(allocator: Allocator) = ImportSemaphoreFdInfoKHR(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_SEMAPHORE_FD_INFO
		}
		
		fun calloc(allocator: Allocator) = ImportSemaphoreFdInfoKHR(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_SEMAPHORE_FD_INFO
		}
	
	}


}