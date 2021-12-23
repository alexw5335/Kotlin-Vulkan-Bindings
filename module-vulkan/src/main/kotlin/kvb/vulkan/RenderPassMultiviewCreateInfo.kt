// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkRenderPassMultiviewCreateInfo {
 *         VkStructureType  sType
 *         void*            pNext (must be null)
 *         uint32_t         subpassCount
 *         uint32_t*        pViewMasks
 *         uint32_t         dependencyCount
 *         int32_t*         pViewOffsets
 *         uint32_t         correlationMaskCount
 *         uint32_t*        pCorrelationMasks
 *     }
 */
@JvmInline
value class RenderPassMultiviewCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var subpassCount: Int
		get()      = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var pViewMasks: Long
		get()      = Unsafe.getLong(address + 24)
		set(value) = Unsafe.setLong(address + 24, value)
	
	var dependencyCount: Int
		get()      = Unsafe.getInt(address + 32)
		set(value) = Unsafe.setInt(address + 32, value)
	
	var pViewOffsets: Long
		get()      = Unsafe.getLong(address + 40)
		set(value) = Unsafe.setLong(address + 40, value)
	
	var correlationMaskCount: Int
		get()      = Unsafe.getInt(address + 48)
		set(value) = Unsafe.setInt(address + 48, value)
	
	var pCorrelationMasks: Long
		get()      = Unsafe.getLong(address + 56)
		set(value) = Unsafe.setLong(address + 56, value)
	
	
	
	var viewMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 24), subpassCount)
		set(value) { Unsafe.setLong(address + 24, value.address); subpassCount = value.capacity }
	
	var viewOffsets: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 40), dependencyCount)
		set(value) { Unsafe.setLong(address + 40, value.address); dependencyCount = value.capacity }
	
	var correlationMasks: DirectIntBuffer
		get()      = DirectIntBuffer(Unsafe.getLong(address + 56), correlationMaskCount)
		set(value) { Unsafe.setLong(address + 56, value.address); correlationMaskCount = value.capacity }


}