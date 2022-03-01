package kvb.engine.gui

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.RenderPass
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.Window

class GuiContext(
	val window: Window,
	val device: Device,
	val renderPass: RenderPass
) {


	private val shaderDirectory = ShaderDirectory("res/shader/gui", device)



	val singleColourRectPipeline = device.buildGraphicsPipeline {
		renderPass(renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 8 + 8 + 4 + 8)
		shaders(shaderDirectory["rect"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}



	val binaryFontPipeline = device.buildGraphicsPipeline {
		vertexBinding { vec2(); uvec2() }
		renderPass(renderPass)
		pushConstant(ShaderStageFlags.VERTEX, 0, 8 + 8 + 4)
		shaders(shaderDirectory["font"])
		pointList()
		simpleBlendAttachment()
		dynamicViewportAndScissor()
	}


}