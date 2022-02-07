package kvb.app

import kvb.vkwrapper.handle.Device
import kvb.vulkan.*

class MemManager(val device: Device) {


	private val mappedMemoryType = device.physicalDevice.chooseMemoryType(
		requiredFlags = MemoryPropertyFlags.HOST_VISIBLE,
		preferredFlags = MemoryPropertyFlags { DEVICE_LOCAL + HOST_COHERENT }
	)


}