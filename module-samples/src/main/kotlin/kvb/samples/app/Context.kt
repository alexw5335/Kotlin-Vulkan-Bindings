package kvb.samples.app

import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamilyPropertiesP

class Context(
	val instance       : Instance,
	val debugMessenger : DebugUtilsMessenger?,
	val physicalDevice : PhysicalDevice,
	val queueFamily    : QueueFamilyPropertiesP,
	val device         : Device,
	val queue          : Queue,
	val surfaceSystem  : SurfaceSystem?,
	val descriptorPool : DescriptorPool
)