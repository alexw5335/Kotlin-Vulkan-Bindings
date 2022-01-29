package kvb.vkwrapper.pipeline

import kvb.vkwrapper.handle.*

/**
 * Wraps a complete graphics pipeline, including shaders and descriptors.
 */
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
		for(s in shaders)
			s.module.destroy()

		pipeline.destroy()
	}


}