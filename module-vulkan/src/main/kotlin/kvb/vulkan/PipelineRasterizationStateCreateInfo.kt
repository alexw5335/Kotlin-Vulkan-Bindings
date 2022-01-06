// This file has been automatically generated.

package kvb.vulkan

import kvb.core.memory.Unsafe
import kvb.core.memory.Addressable
import kvb.core.memory.direct.*

/**
 *     // provided by VK_VERSION_1_0

 *     struct VkPipelineRasterizationStateCreateInfo {
 *         VkStructureType                          sType
 *         void*                                    pNext
 *         VkPipelineRasterizationStateCreateFlags  flags (reserved, must be zero)
 *         VkBool32                                 depthClampEnable
 *         VkBool32                                 rasterizerDiscardEnable
 *         VkPolygonMode                            polygonMode
 *         VkCullModeFlags                          cullMode
 *         VkFrontFace                              frontFace
 *         VkBool32                                 depthBiasEnable
 *         float                                    depthBiasConstantFactor
 *         float                                    depthBiasClamp
 *         float                                    depthBiasSlopeFactor
 *         float                                    lineWidth
 *     }
 * 
 *     Valid pNext types:
 *         - VkPipelineRasterizationStateRasterizationOrderAMD
 *         - VkPipelineRasterizationConservativeStateCreateInfoEXT
 *         - VkPipelineRasterizationStateStreamCreateInfoEXT
 *         - VkPipelineRasterizationDepthClipStateCreateInfoEXT
 *         - VkPipelineRasterizationLineStateCreateInfoEXT
 *         - VkPipelineRasterizationProvokingVertexStateCreateInfoEXT
 */
@JvmInline
value class PipelineRasterizationStateCreateInfo(override val address: Long) : Addressable {
	
	
	var sType: Int
		get()      = Unsafe.getInt(address + 0)
		set(value) = Unsafe.setInt(address + 0, value)
	
	var pNext: Long
		get()      = Unsafe.getLong(address + 8)
		set(value) = Unsafe.setLong(address + 8, value)
	
	var flags: Int
		get() = Unsafe.getInt(address + 16)
		set(value) = Unsafe.setInt(address + 16, value)
	
	var depthClampEnable: Int
		get()      = Unsafe.getInt(address + 20)
		set(value) = Unsafe.setInt(address + 20, value)
	
	var rasterizerDiscardEnable: Int
		get()      = Unsafe.getInt(address + 24)
		set(value) = Unsafe.setInt(address + 24, value)
	
	var polygonMode: PolygonMode
		get()      = _PolygonMode(Unsafe.getInt(address + 28))
		set(value) = Unsafe.setInt(address + 28, value.value)
	
	var cullMode: CullModeFlags
		get()      = CullModeFlags(Unsafe.getInt(address + 32))
		set(value) = Unsafe.setInt(address + 32, value.value)
	
	var frontFace: FrontFace
		get()      = _FrontFace(Unsafe.getInt(address + 36))
		set(value) = Unsafe.setInt(address + 36, value.value)
	
	var depthBiasEnable: Int
		get()      = Unsafe.getInt(address + 40)
		set(value) = Unsafe.setInt(address + 40, value)
	
	var depthBiasConstantFactor: Float
		get()      = Unsafe.getFloat(address + 44)
		set(value) = Unsafe.setFloat(address + 44, value)
	
	var depthBiasClamp: Float
		get()      = Unsafe.getFloat(address + 48)
		set(value) = Unsafe.setFloat(address + 48, value)
	
	var depthBiasSlopeFactor: Float
		get()      = Unsafe.getFloat(address + 52)
		set(value) = Unsafe.setFloat(address + 52, value)
	
	var lineWidth: Float
		get()      = Unsafe.getFloat(address + 56)
		set(value) = Unsafe.setFloat(address + 56, value)


}