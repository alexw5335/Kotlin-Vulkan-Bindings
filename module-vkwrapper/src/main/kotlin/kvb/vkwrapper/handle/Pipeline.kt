package kvb.vkwrapper.handle

import kvb.vulkan.PipelineBindPoint
import kvb.vulkan.PipelineH

class Pipeline(
	address            : Long,
	val device         : Device,
	val bindPoint      : PipelineBindPoint,
	val layout         : PipelineLayout,
	val descriptorSets : List<Pair<Int, DescriptorSet>>
) : PipelineH(address) {


	/*
	Handle implementation
	 */



	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false; private set

	/**
	 * Implementation of vkDestroyPipeline. Calls after the first will have no effect.
	 */
	fun destroy() {
		if(isDestroyed) return
		device.commands.destroyPipeline(this, null)
		layout.destroy()
		isDestroyed = true
	}


}