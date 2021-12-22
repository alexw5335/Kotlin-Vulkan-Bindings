package kvb.vkwrapper.shader

import kvb.vulkan.*

/**
 * Wrapper for [VertexInputAttributeDescription]. The binding is the index of the buffer (pBuffers given to
 * vkCmdBindVertexBuffers) from which the vertex data is read. The location is the unique identifier specified within
 * the shader.
 */
class VertexAttribute(
	val location : Int,
	val binding  : Int,
	val format   : Format,
	val offset   : Int
)