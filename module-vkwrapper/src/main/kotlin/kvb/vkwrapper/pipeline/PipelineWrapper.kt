package kvb.vkwrapper.pipeline

import kvb.vkwrapper.handle.*

class PipelineWrapper(
	val pipeline    : Pipeline,
	val descriptors : Map<Int, DescriptorSet>
) {


	fun bind(commandBuffer: CommandBuffer) {
		commandBuffer.bindPipeline(pipeline)

		for((binding, set) in descriptors)
			commandBuffer.bindDescriptorSet(pipeline.bindPoint, pipeline.layout, binding, set)
	}


}