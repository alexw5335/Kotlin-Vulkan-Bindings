package kvb.vkwrapper.handle

import kvb.vkwrapper.persistent.PushConstant
import kvb.vulkan.PipelineLayoutH

class PipelineLayout(
	address           : Long,
	val device        : Device,
	val setLayouts    : List<DescriptorSetLayout>,
	val pushConstants : List<PushConstant>
) : PipelineLayoutH(address) {


	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false
		private set

	/**
	 * Implementation of vkDestroyPipelineLayout.
	 */
	fun destroy() {
		if(isDestroyed) return
		device.commands.destroyPipelineLayout(this, null)
		isDestroyed = true
	}


}