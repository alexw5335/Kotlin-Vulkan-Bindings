package kvb.app

import kvb.vkwrapper.Vulkan
import kvb.window.WindowManager

object Context : VkContext {


	val window = WindowManager.create("Binary Font Creator", 0, 0, 700, 700)

	override val instance = Vulkan.createInstance(
		layers     = listOf("VK_LAYER_KHRONOS_validation"),
		extensions = listOf("VK_EXT_swapchain", WindowManager.vulkanSurfaceExtension)
	)

	override val physicalDevice = instance.physicalDevices.firstOrNull {
		it.isDiscrete
	} ?: instance.physicalDevices.first()

	val surface =



}