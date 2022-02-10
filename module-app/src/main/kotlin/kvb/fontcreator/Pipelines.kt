package kvb.fontcreator

import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.pipeline.PipelineWrapper
import kvb.vulkan.*



val context = FontCreatorContext



interface FCPipeline : PipelineWrapper {


	override val device get() = context.device

	fun GraphicsPipelineBuilder.shaders(name: String) = shaders(context.shaderDirectory[name])


}



val windowUbo = context.memManager.uniformBuffer(4 * 5)

val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)

val image = context.memManager.image(32, 32, ImageUsageFlags.COLOR_ATTACHMENT, Format.R8_SRGB)

val imageView = context.device.createImageView(image)



val windowUboDescriptor = context.descriptorPool.buildSet {
	binding(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.VERTEX)
	bufferWrite(windowUbo)
}

val samplerDescriptor = context.descriptorPool.buildSet {
	binding(DescriptorType.SAMPLER, ShaderStageFlags.FRAGMENT)
	
}

val textureDescriptor = context.descriptorPool.buildSet {
	binding(DescriptorType.COMBINED_IMAGE_SAMPLER, ShaderStageFlags.FRAGMENT)
	imageWrite(sampler, imageView, ImageLayout.COLOR_ATTACHMENT_OPTIMAL)
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