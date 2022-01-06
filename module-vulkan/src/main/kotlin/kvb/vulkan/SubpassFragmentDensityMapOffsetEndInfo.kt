// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_QCOM_fragment_density_map_offset

 *     struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         fragmentDensityOffsetCount
 *         VkOffset2D*      pFragmentDensityOffsets
 *     }
 */
@JvmInline
value class SubpassFragmentDensityMapOffsetEndInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var fragmentDensityOffsetCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pFragmentDensityOffsets: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var fragmentDensityOffsets: Offset2D.Buffer
		get()      = Offset2D.Buffer(Unsafe.getLong(address + 24), fragmentDensityOffsetCount)
		set(value) { Unsafe.setLong(address + 24, value.address); fragmentDensityOffsetCount = value.capacity }


}