package kvb.fontcreator

import kvb.vkwrapper.Vulkan

object Context2 {


	val instance = Vulkan.createInstance(
		layers = listOf("VK_LAYER_KHRONOS_validation"),
		extensions = listOf("VK_EXT_debug_utils", "VK_KHR_surface", "VK_KHR_win32_surface")
	)


}