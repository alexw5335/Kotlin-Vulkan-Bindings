package kvb.fontcreator

import kvb.vulkan.DescriptorType
import kvb.window.WindowManager

object Context {


	/*
	Variables
	 */



	val window = WindowManager.create("Binary Font Creator", 0, 0, 700, 700)



	/*
	Vulkan Context
	 */



	private val contextBuilder = ContextBuilder.build {
		it.window = window
		it.debugEnabled = true
	}

	val instance = contextBuilder.instance

	val physicalDevice = contextBuilder.physicalDevice

	val device = contextBuilder.device

	val queue = contextBuilder.queue

	val descriptorPool = device.createDescriptorPool(mapOf(
		DescriptorType.UNIFORM_BUFFER to 20,
		DescriptorType.COMBINED_IMAGE_SAMPLER to 20
	))

	val renderPass = device.buildRenderPass {
		it.attachment()
	}


}