package kvb.app

import kvb.vkwrapper.handle.Device
import kvb.vkwrapper.handle.Instance
import kvb.vkwrapper.handle.PhysicalDevice
import kvb.vkwrapper.handle.Queue

class VkBaseContext(
	val instance: Instance,
	val physicalDevice: PhysicalDevice,
	val device: Device,
	val graphicsQueue: Queue,
	val computeQueue: Queue,
	val transferQueue: Queue,
)