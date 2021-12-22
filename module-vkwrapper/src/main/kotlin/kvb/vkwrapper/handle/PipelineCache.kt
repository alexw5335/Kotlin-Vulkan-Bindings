package kvb.vkwrapper.handle

import kvb.vulkan.PipelineCacheH

class PipelineCache(address: Long, val device: Device) : PipelineCacheH(address) {


	/**
	 * Implementation of vkDestroyPipelineCache.
	 */
	fun destroy() = device.commands.destroyPipelineCache(this, null)


}