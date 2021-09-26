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
 *     struct VkWin32KeyedMutexAcquireReleaseInfoNV {
 *         VkStructureType   sType
 *         void*             pNext (must be null)
 *         uint32_t          acquireCount
 *         VkDeviceMemory**  pAcquireSyncs
 *         uint64_t**        pAcquireKeys
 *         uint32_t**        pAcquireTimeoutMilliseconds
 *         uint32_t          releaseCount
 *         VkDeviceMemory**  pReleaseSyncs
 *         uint64_t**        pReleaseKeys
 *     }
 */
@JvmInline
value class Win32KeyedMutexAcquireReleaseInfoNV(override val address: Long) : Addressable {
	
	
	var sType: StructureType
		get()      = StructureType(Unsafe.getInt(address + LAYOUT.offsets[0]))
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[0], value.id) }
	
	var pNext: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[1])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[1], value) }
	
	var acquireCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[2])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[2], value) }
	
	var pAcquireSyncs: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[3])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value) }
	
	var pAcquireKeys: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[4])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value) }
	
	var pAcquireTimeoutMilliseconds: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[5])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value) }
	
	var releaseCount: Int
		get()      = Unsafe.getInt(address + LAYOUT.offsets[6])
		set(value) { Unsafe.setInt(address + LAYOUT.offsets[6], value) }
	
	var pReleaseSyncs: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[7])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value) }
	
	var pReleaseKeys: Long
		get()      = Unsafe.getNativePointer(address + LAYOUT.offsets[8])
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value) }
	
	
	
	var acquireSyncs: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[3]), acquireCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[3], value.address); acquireCount = value.capacity }
	
	var acquireKeys: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[4]), acquireCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[4], value.address); acquireCount = value.capacity }
	
	var acquireTimeoutMilliseconds: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[5]), acquireCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[5], value.address); acquireCount = value.capacity }
	
	var releaseSyncs: NativePointerBuffer
		get()      = NativePointerBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[7]), releaseCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[7], value.address); releaseCount = value.capacity }
	
	var releaseKeys: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getNativePointer(address + LAYOUT.offsets[8]), releaseCount)
		set(value) { Unsafe.setNativePointer(address + LAYOUT.offsets[8], value.address); releaseCount = value.capacity }
	
	
	
	val structSize get() = SIZE
	
	val structAlignment get() = ALIGNMENT
	
	
	
	companion object {
		
		val LAYOUT = LayoutBuilder.buildStruct {
			member(4)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
			member(4)
			member(NativeSizes.POINTER)
			member(NativeSizes.POINTER)
		}
		
		val SIZE = LAYOUT.size
		
		val ALIGNMENT = LAYOUT.alignment
		
		val NULL = Win32KeyedMutexAcquireReleaseInfoNV(0)
		
		fun malloc(allocator: Allocator) = Win32KeyedMutexAcquireReleaseInfoNV(allocator.malloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO
		}
		
		fun calloc(allocator: Allocator) = Win32KeyedMutexAcquireReleaseInfoNV(allocator.calloc(SIZE, ALIGNMENT)).also {
			it.sType = StructureType.WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO
		}
	
	}


}