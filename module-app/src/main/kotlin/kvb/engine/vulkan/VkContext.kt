package kvb.engine.vulkan

object VkContext {


	init { VkContextBuilder.build() }



	val window = VkContextBuilder.window

	val instance = VkContextBuilder.instance

	val debugMessenger = VkContextBuilder.debugMessenger

	val physicalDevice = VkContextBuilder.physicalDevice

	val device = VkContextBuilder.device

	val queue = VkContextBuilder.queue

	val surfaceSystem = VkContextBuilder.surfaceSystem

	val memoryManager = VkContextBuilder.memoryManager


}