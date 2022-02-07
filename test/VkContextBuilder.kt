package kvb.app

import kvb.core.Platform
import kvb.core.Platforms
import kvb.vkwrapper.Vulkan
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.handle.PhysicalDevice
import kvb.vulkan.PhysicalDeviceType
import kvb.vulkan.Version

class VkContextBuilder {


	/*
	- Context
		- Instance
		- DebugMessenger
		- PhysicalDevice
		- Device
		- DescriptorPool
	- SurfaceSystem
		- Surface
		- Swapchain
		- Swapchain images/imageViews/framebuffers
		- CommandBuffers for each frame
		- Compatible render pass
	- MemoryManager
		- Lists of allocators by memory type
		- A single, wholly mapped memory type
		- Handles lazy/immediate writing
		- Allocation of images/buffers based on size and update frequency.

	- A Demo will have a standalone context that extends VkContext.
	- QueueFamilies must be chosen before a device is created.

	 */



	val instanceExtensions = HashSet<String>()

	val instanceLayers = HashSet<String>()

	val deviceExtensions = HashSet<String>()



	var enableDebugging = true

	var enableWindowing = true

	var apiVersion = Version(1, 2, 0)



	fun build(): VkContext {
		if(enableDebugging) {
			instanceExtensions.add("VK_EXT_debug_utils")
			instanceLayers.add("VK_LAYER_KHRONOS_validation")
		}

		if(enableWindowing) {
			instanceExtensions.add("VK_KHR_swapchain")
			instanceExtensions.add("VK_KHR_surface")

			when(Platforms.current) {
				Platform.WINDOWS  -> instanceExtensions.add("VK_KHR_win32_surface")
				else              -> throw VkException("Windowing only supported on Windows")
			}
		}

		val instance = Vulkan.createInstance(
			appName       = "My App",
			appVersion    = Version(1, 0, 0),
			engineName    = "My Engine",
			engineVersion = Version(1, 0, 0),
			apiVersion    = apiVersion,
			layers        = instanceLayers,
			extensions    = instanceExtensions
		)

		val physicalDevice = instance.physicalDevices.first {
			it.isDiscrete
		}

	}


}