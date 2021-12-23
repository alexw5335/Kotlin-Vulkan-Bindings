// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     struct VkPipelineMultisampleStateCreateInfo {
 *         VkStructureType                        sType
 *         void*                                  pNext
 *         VkPipelineMultisampleStateCreateFlags  flags (reserved, must be zero)
 *         VkSampleCountFlagBits                  rasterizationSamples
 *         VkBool32                               sampleShadingEnable
 *         float                                  minSampleShading
 *         VkSampleMask*                          pSampleMask
 *         VkBool32                               alphaToCoverageEnable
 *         VkBool32                               alphaToOneEnable
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineCoverageToColorStateCreateInfoNV
 *         - VkPipelineSampleLocationsStateCreateInfoEXT
 *         - VkPipelineCoverageModulationStateCreateInfoNV
 *         - VkPipelineCoverageReductionStateCreateInfoNV
 */
@JvmInline
value class PipelineMultisampleStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var rasterizationSamples: SampleCountFlags
		get()      = SampleCountFlags(Unsafe.getInt(address + 20))
		set(value) = Unsafe.setInt(address + 20, value.value)
	
	var sampleShadingEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var minSampleShading: Float
		get()      = Unsafe.getFloat(address + 28)
		set(value) = Unsafe.setFloat(address + 28, value)
	
	var pSampleMask: Long
		get()      = Unsafe.getLong(address + 32)
		set(value) = Unsafe.setLong(address + 32, value)
	
	var alphaToCoverageEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var alphaToOneEnable: Int
		get()      = Unsafe.getInt(address + 44)
		set(value) = Unsafe.setInt(address + 44, value)


}