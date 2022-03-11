package kvb.engine.vulkan

object VkContext {


	init { VulkanBuilder.build() }



	val window = VulkanBuilder.window

	val instance = VulkanBuilder.instance

	val debugMessenger = VulkanBuilder.debugMessenger

	val physicalDevice = VulkanBuilder.physicalDevice

	val device = VulkanBuilder.device

	val queue = VulkanBuilder.queue

	val surfaceSystem = VulkanBuilder.surfaceSystem


}