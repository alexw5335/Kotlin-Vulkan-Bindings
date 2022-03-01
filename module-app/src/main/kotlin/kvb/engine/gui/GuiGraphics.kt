package kvb.engine.gui

import kvb.core.memory.LinearAllocator
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLong
import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.CommandBuffer
import kvb.vkwrapper.handle.Pipeline
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*

object GuiGraphics {


	private val shaderDirectory = ShaderDirectory("res/shader/gui", VkContext.device)

	private val pipelines = ArrayList<Pipeline>()

	val allocator = LinearAllocator(Unsafe, 1 shl 20)



	fun renderRect(
		commandBuffer : CommandBuffer,
		offsetX       : Float,
		offsetY       : Float,
		width         : Float,
		height        : Float,
		colour        : Colour
	) {
		val data = allocator.mallocByte(12)
		data.setFloat(0, offsetX)
		data.setFloat(4, offsetY)
		data.setFloat(8, width)
		data.setFloat(12, height)
		data.setInt(16, colour.value)

		commandBuffer.bindPipeline(singleColourRectPipeline)
		commandBuffer.pushConstants(singleColourRectPipeline.layout, ShaderStageFlags.VERTEX, 0, 20, DirectLong(data.address))
		commandBuffer.draw(4)
	}



	val singleColourRectPipeline = VkContext.device.buildGraphicsPipeline {
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 20)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



/*	val binaryFontPipeline = VkContext.device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 20)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
	}*/


}