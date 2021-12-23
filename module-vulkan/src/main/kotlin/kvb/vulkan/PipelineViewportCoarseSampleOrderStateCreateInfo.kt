// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineViewportCoarseSampleOrderStateCreateInfoNV {
 *         VkStructureType               sType
 *         void*                         pNext (must be null)
 *         VkCoarseSampleOrderTypeNV     sampleOrderType
 *         uint32_t                      customSampleOrderCount
 *         VkCoarseSampleOrderCustomNV*  pCustomSampleOrders
 *     }
 */
@JvmInline
value class PipelineViewportCoarseSampleOrderStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var sampleOrderType: CoarseSampleOrderType
		get()      = _CoarseSampleOrderType(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var customSampleOrderCount: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var pCustomSampleOrders: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	
	
	var customSampleOrders: CoarseSampleOrderCustom.Buffer
		get()      = CoarseSampleOrderCustom.Buffer(Unsafe.getLong(address + 24), customSampleOrderCount)
		set(value) { Unsafe.setLong(address + 24, value.address); customSampleOrderCount = value.capacity }


}