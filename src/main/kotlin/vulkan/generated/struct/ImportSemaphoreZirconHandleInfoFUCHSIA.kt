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
 *     struct VkImportSemaphoreZirconHandleInfoFUCHSIA {
 *         VkStructureType                        sType
 *         void*                                  pNext (must be null)
 *         VkSemaphore                            semaphore
 *         VkSemaphoreImportFlags                 flags
 *         VkExternalSemaphoreHandleTypeFlagBits  handleType
 *         zx_handle_t                            zirconHandle
 *     }
 */
@JvmInline
value class ImportSemaphoreZirconHandleInfoFUCHSIA(override val address: Long) : Addressable {
	
	
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
	
	var zirconHandle: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	
	
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
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = ImportSemaphoreZirconHandleInfoFUCHSIA(0)
		
		fun malloc(allocator: Allocator) = ImportSemaphoreZirconHandleInfoFUCHSIA(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO
		}
		
		fun calloc(allocator: Allocator) = ImportSemaphoreZirconHandleInfoFUCHSIA(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.IMPORT_SEMAPHORE_ZIRCON_HANDLE_INFO
		}
	
	}


}