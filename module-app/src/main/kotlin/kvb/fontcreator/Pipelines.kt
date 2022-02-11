package kvb.fontcreator

import kvb.vkwrapper.builder.GraphicsPipelineBuilder
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.Descriptor
import kvb.vkwrapper.pipeline.PipelineWrapper
import kvb.vulkan.*



val context = FontCreatorContext



val windowUbo = context.memManager.uniformBuffer(4 * 5)

val sampler = context.device.createSampler(Filter.NEAREST, Filter.NEAREST)

val image = context.memManager.image(32, 32, ImageUsageFlags.COLOR_ATTACHMENT, Format.R8_SRGB)

val imageView = context.device.createImageView(image)



val windowUboDescriptor = context.descriptorPool.createSet(DescriptorType.UNIFORM_BUFFER, ShaderStageFlags.VERTEX)

val textureDescriptor = context.descriptorPool.createSet(DescriptorType.COMBINED_IMAGE_SAMPLER, ShaderStageFlags.FRAGMENT)



fun update() {
	windowUboDescriptor.bufferWrite(0, windowUbo)
	textureDescriptor.imageWrite(0, sampler, imageView, ImageLayout.SHADER_READ_ONLY_OPTIMAL)
}


fun setTexture(sampler: Sampler, imageView: ImageView) {
	textureDescriptor.imageWrite(0, sampler, imageView, ImageLayout.SHADER_READ_ONLY_OPTIMAL)
}



val SimplePipeline = PipelineWrapper(
	pipeline = context.device.buildGraphicsPipeline {
		renderPass(context.renderPass)
		emptyLayout()
		shaders(context.shaderDirectory["simple"])
		triangleStrip()
		noBlendAttachment()
		dynamicViewportAndScissor()
	},
	emptyMap()
)