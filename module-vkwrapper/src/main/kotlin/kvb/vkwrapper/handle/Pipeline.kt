package kvb.vkwrapper.handle

import kvb.vulkan.PipelineBindPoint
import kvb.vulkan.PipelineH

class Pipeline(address: Long, val device: Device, val bindPoint: PipelineBindPoint) : PipelineH(address) {


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
		if(!isDestroyed) device.commands.destroyPipeline(this, null)
		isDestroyed = true
	}


}