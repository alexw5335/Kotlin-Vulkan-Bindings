package kvb.engine.gui

import kvb.engine.vulkan.VkContext
import kvb.vkwrapper.handle.Pipeline
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*

class GuiGraphics {


	private val shaderDirectory = ShaderDirectory("res/shader/gui", VkContext.device)

	private val pipelines = ArrayList<Pipeline>()


	/*
	float windowWidth
	float windowHeight
	float scale
	float offsetX
	float offsetY
	float width
	float height
	float colour

	int size
	int colour

	windowWidth and windowHeight are updated at the start for all pipelines.
	scale is updated for all of them as necessary (if a canvas is used).

	offsetX and offsetY are set for each.

	 */



	val singleColourRectPipeline = VkContext.device.buildGraphicsPipeline {
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 8 + 8 + 4 + 8)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val binaryFontPipeline = VkContext.device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(VkContext.surfaceSystem.renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 8 + 8 + 4)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
	}


}