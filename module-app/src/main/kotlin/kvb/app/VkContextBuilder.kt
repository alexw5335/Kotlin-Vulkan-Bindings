package kvb.app

import kvb.vkwrapper.DebugUtils
import kvb.vkwrapper.handle.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.Version
import kvb.window.Window

/**
 * Builds all basic Vulkan objects necessary for a simple Vulkan application.
 */
class VkContextBuilder {


	val instanceLayers = HashSet<String>()

	val instanceExtensions = HashSet<String>()

	val deviceExtensions = HashSet<String>()



	var window: Window? = null

	var debugEnabled = false

	var apiVersion = Version(1, 2, 0)



	lateinit var instance: Instance

	lateinit var debugMessenger: DebugUtilsMessenger

	lateinit var physicalDevice: PhysicalDevice

	lateinit var surface: Surface

	lateinit var graphicsQueueFamily: QueueFamily

	lateinit var computeQueueFamily: QueueFamily

	lateinit var presentQueueFamily: QueueFamily

	lateinit var device: Device



	fun build() {
		if(window != null) {
			
		}
	}


}