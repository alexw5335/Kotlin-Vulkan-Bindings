// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Addressable
import kvb.core.memory.Unsafe

/**
 *     struct VkPipelineRasterizationLineStateCreateInfoEXT {
 *         VkStructureType             sType
 *         void*                       pNext (must be null)
 *         VkLineRasterizationModeEXT  lineRasterizationMode
 *         VkBool32                    stippledLineEnable
 *         uint32_t                    lineStippleFactor
 *         uint16_t                    lineStipplePattern
 *     }
 */
@JvmInline
value class PipelineRasterizationLineStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var lineRasterizationMode: LineRasterizationMode
		get()      = _LineRasterizationMode(Unsafe.getInt(address + 16))
		set(value) = Unsafe.setInt(address + 16, value.value)
	
	var stippledLineEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var lineStippleFactor: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var lineStipplePattern: Short
		get()      = Unsafe.getShort(address + 28)
		set(value) = Unsafe.setShort(address + 28, value)


}