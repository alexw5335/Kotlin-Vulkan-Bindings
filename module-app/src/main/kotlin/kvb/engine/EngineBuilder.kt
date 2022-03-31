package kvb.engine

import kvb.engine.gui.Base
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vulkan.SampleCountFlags
import kvb.vulkan.VK_TRUE
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow

object EngineBuilder {


	fun vulkan(block: VkContextBuilder.() -> Unit) = block(VkContextBuilder)

	var windowTitle = "My Window"

	var windowX: Int? = null

	var windowY: Int? = null

	var windowWidth: Int? = null

	var windowHeight: Int? = null



	lateinit var window: Window

	var initialRoot: () -> Base = { NullBase() }



	fun build() {
		window = WindowManager.create(windowTitle, windowX, windowY, windowWidth, windowHeight)

		VkContextBuilder.let {
			it.debugEnabled = true
			it.windowingEnabled = true
			it.deviceFeatures.geometryShader = VK_TRUE
			it.window = window as WinApiWindow
			it.sampleCount = SampleCountFlags._1
		}

		VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)
	}


}