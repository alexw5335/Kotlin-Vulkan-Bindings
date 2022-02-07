package kvb.app

import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily

interface VkContext {


	val instance: Instance

	val debugMessenger: DebugUtilsMessenger

	val physicalDevice: PhysicalDevice

	val queueFamily: QueueFamily

	val device: Device

	val queue: Queue

	val descriptorPool: DescriptorPool


}