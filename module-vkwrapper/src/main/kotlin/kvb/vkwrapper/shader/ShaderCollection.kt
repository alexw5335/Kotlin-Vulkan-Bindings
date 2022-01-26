package kvb.vkwrapper.shader

import kvb.vkwrapper.handle.*

interface ShaderCollection {


	val shaders: List<Shader>

	val device: Device

	val pipeline: Pipeline

	val descriptors: Map<Int, DescriptorSet> get() = emptyMap()



	fun bind(commandBuffer: CommandBuffer) {
		commandBuffer.bindPipeline(pipeline)

		for((binding, set) in descriptors)
			commandBuffer.bindDescriptorSet(pipeline.bindPoint, pipeline.layout, binding, set)
	}



	fun destroy() {
		shaders.forEach { it.module.destroy() }
		pipeline.destroy()
	}


}