// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NVX_binary_import

 *     struct VkCuLaunchInfoNVX {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         VkCuFunctionNVX  function
 *         uint32_t         gridDimX
 *         uint32_t         gridDimY
 *         uint32_t         gridDimZ
 *         uint32_t         blockDimX
 *         uint32_t         blockDimY
 *         uint32_t         blockDimZ
 *         uint32_t         sharedMemBytes
 *         size_t           paramCount
 *         void**           pParams
 *         size_t           extraCount
 *         void**           pExtras
 *     }
 */
@JvmInline
value class CuLaunchInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var function: CuFunctionH
		get()      = CuFunctionH(Unsafe.getLong(address + 16))
		set(value) = Unsafe.setLong(address + 16, value.address)
	
	var gridDimX: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var gridDimY: Int
		get()      = Unsafe.getInt(address + 28)
		set(value) = Unsafe.setInt(address + 28, value)
	
	var gridDimZ: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var blockDimX: Int
		get()      = Unsafe.getInt(address + 36)
		set(value) = Unsafe.setInt(address + 36, value)
	
	var blockDimY: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var blockDimZ: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)
	
	var sharedMemBytes: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var paramCount: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	var pParams: Long
		get()      = Unsafe.getLong(address + 64)
		set(value) = Unsafe.setLong(address + 64, value)
	
	var extraCount: Long
		get()      = Unsafe.getLong(address + 72)
		set(value) = Unsafe.setLong(address + 72, value)
	
	var pExtras: Long
		get()      = Unsafe.getLong(address + 80)
		set(value) = Unsafe.setLong(address + 80, value)
	
	
	
	var params: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 64), paramCount)
		set(value) { pParams = value.address; paramCount = value.capacity.toLong() }
	
	var extras: DirectLongBuffer
		get()      = DirectLongBuffer(Unsafe.getLong(address + 80), extraCount)
		set(value) { pExtras = value.address; extraCount = value.capacity.toLong() }


}