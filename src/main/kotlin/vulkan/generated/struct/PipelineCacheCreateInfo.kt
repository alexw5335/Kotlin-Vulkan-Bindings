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
 *     struct VkPipelineCacheCreateInfo {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkPipelineCacheCreateFlags  flags
 *         size_t                      initialDataSize
 *         void**                      pInitialData
 *     }
 */
@JvmInline
value class PipelineCacheCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var flags: PipelineCacheCreateFlags
		get()      = PipelineCacheCreateFlags(Unsafe.getInt(address + LAYOUT.offsets[2]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value.bitfield) }
	
	var initialDataSize: Long
		get()      = Unsafe.getNativeSizeT(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativeSizeT(address + LAYOUT.offsets[3], value) }
	
	var pInitialData: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	
	
	var initialData: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), initialDataSize.toInt())
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); initialDataSize = value.capacity.toLong() }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.SIZE_T)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = PipelineCacheCreateInfo(0)
		
		fun malloc(allocator: Allocator) = PipelineCacheCreateInfo(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_CACHE_CREATE_INFO
		}
		
		fun calloc(allocator: Allocator) = PipelineCacheCreateInfo(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.PIPELINE_CACHE_CREATE_INFO
		}
	
	}


}