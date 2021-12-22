package kvb.vkwrapper.shader

import kvb.vulkan.*

/**
 * Wrapper for [VertexInputAttributeDescription].
 */
class VertexBinding(
	val binding   : Int,
	val stride    : Int,
	val inputRate : VertexInputRate = VertexInputRate.VERTEX
)