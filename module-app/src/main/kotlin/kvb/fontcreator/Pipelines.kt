package kvb.fontcreator

import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.pipeline.PipelineWrapper

interface FCPipeline : PipelineWrapper {


	val context get() = FontCreatorContext

	override val device get() = context.device

	fun GraphicsPipelineBuilder.shaders(name: String) = shaders(context.shaderDirectory[name])


}



object SimplePipeline : FCPipeline {


	override val pipeline = device.buildGraphicsPipeline {
		renderPass(context.renderPass)
		emptyLayout()
		shaders("simple")
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	}


}