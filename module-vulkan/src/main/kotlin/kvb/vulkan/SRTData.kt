// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_NV_ray_tracing_motion_blur

 *     struct VkSRTDataNV {
 *         float  sx
 *         float  a
 *         float  b
 *         float  pvx
 *         float  sy
 *         float  c
 *         float  pvy
 *         float  sz
 *         float  pvz
 *         float  qx
 *         float  qy
 *         float  qz
 *         float  qw
 *         float  tx
 *         float  ty
 *         float  tz
 *     }
 */
@JvmInline
value class SRTData(override val address: Long) : Addressable {
	
	
	var sx: Float
		get()      = Unsafe.getFloat(address + 0)
		set(value) = Unsafe.setFloat(address + 0, value)
	
	var a: Float
		get()      = Unsafe.getFloat(address + 4)
		set(value) = Unsafe.setFloat(address + 4, value)
	
	var b: Float
		get()      = Unsafe.getFloat(address + 8)
		set(value) = Unsafe.setFloat(address + 8, value)
	
	var pvx: Float
		get()      = Unsafe.getFloat(address + 12)
		set(value) = Unsafe.setFloat(address + 12, value)
	
	var sy: Float
		get()      = Unsafe.getFloat(address + 16)
		set(value) = Unsafe.setFloat(address + 16, value)
	
	var c: Float
		get()      = Unsafe.getFloat(address + 20)
		set(value) = Unsafe.setFloat(address + 20, value)
	
	var pvy: Float
		get()      = Unsafe.getFloat(address + 24)
		set(value) = Unsafe.setFloat(address + 24, value)
	
	var sz: Float
		get()      = Unsafe.getFloat(address + 28)
		set(value) = Unsafe.setFloat(address + 28, value)
	
	var pvz: Float
		get()      = Unsafe.getFloat(address + 32)
		set(value) = Unsafe.setFloat(address + 32, value)
	
	var qx: Float
		get()      = Unsafe.getFloat(address + 36)
		set(value) = Unsafe.setFloat(address + 36, value)
	
	var qy: Float
		get()      = Unsafe.getFloat(address + 40)
		set(value) = Unsafe.setFloat(address + 40, value)
	
	var qz: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var qw: Float
		get()      = Unsafe.getFloat(address + 48)
		set(value) = Unsafe.setFloat(address + 48, value)
	
	var tx: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var ty: Float
		get()      = Unsafe.getFloat(address + 56)
		set(value) = Unsafe.setFloat(address + 56, value)
	
	var tz: Float
		get()      = Unsafe.getFloat(address + 60)
		set(value) = Unsafe.setFloat(address + 60, value)


}