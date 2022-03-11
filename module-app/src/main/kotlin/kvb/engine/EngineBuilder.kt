package kvb.engine

import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VulkanBuilder
import kvb.vulkan.VK_TRUE
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow

object EngineBuilder {


	var windowTitle = "My Window"

	var windowX: Int? = null

	var windowY: Int? = null

	var windowWidth: Int? = null

	var windowHeight: Int? = null



	lateinit var window: Window



	fun build() {
		window = WindowManager.create(windowTitle, windowX, windowY, windowWidth, windowHeight)

		VulkanBuilder.let {
			it.debugEnabled = true
			it.windowingEnabled = true
			it.deviceFeatures.geometryShader = VK_TRUE
			it.window = window as WinApiWindow
		}

		VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)
	}


}