package kvb.app

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Instance
import kvb.vkwrapper.handle.PhysicalDevice

interface VkContext {


	val instance: Instance

	val physicalDevice: PhysicalDevice

	val device: Device


}