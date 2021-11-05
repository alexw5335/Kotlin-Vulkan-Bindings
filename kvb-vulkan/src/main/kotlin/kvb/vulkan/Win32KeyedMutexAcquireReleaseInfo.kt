// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectIntBuffer
import kvb.core.memory.direct.DirectLongBuffer

/**
 *     struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         acquireCount
 *         VkDeviceMemory*  pAcquireSyncs
 *         uint64_t*        pAcquireKeys
 *         uint32_t*        pAcquireTimeouts
 *         uint32_t         releaseCount
 *         VkDeviceMemory*  pReleaseSyncs
 *         uint64_t*        pReleaseKeys
 *     }
 */
@JvmInline
value class Win32KeyedMutexAcquireReleaseInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var acquireCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pAcquireSyncs: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var pAcquireKeys: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var pAcquireTimeouts: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var releaseCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pReleaseSyncs: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pReleaseKeys: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	
	
	var acquireSyncs: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 24), acquireCount)
		set(value) { Unsafe.setLong(address + 24, value.address); acquireCount = value.capacity }
	
	var acquireKeys: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 32), acquireCount)
		set(value) { Unsafe.setLong(address + 32, value.address); acquireCount = value.capacity }
	
	var acquireTimeouts: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), acquireCount)
		set(value) { Unsafe.setLong(address + 40, value.address); acquireCount = value.capacity }
	
	var releaseSyncs: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 56), releaseCount)
		set(value) { Unsafe.setLong(address + 56, value.address); releaseCount = value.capacity }
	
	var releaseKeys: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 64), releaseCount)
		set(value) { Unsafe.setLong(address + 64, value.address); releaseCount = value.capacity }


}