package kvb.engine

import kvb.engine.gui.Base
import kvb.engine.gui.type.pane.PlaceholderPane
import kvb.engine.vulkan.SurfaceSystem
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vulkan.VK_TRUE
import kvb.window.Window
import kvb.window.WindowManager

object EngineBuilder {


	fun vulkan(block: VkContextBuilder.() -> Unit) = block(VkContextBuilder)

	var windowTitle = "My Window"

	var windowX: Int? = null

	var windowY: Int? = null

	var root: Base = PlaceholderPane



	lateinit var window: Window

	lateinit var surfaceSystem: SurfaceSystem



	fun build() {
		root.alignUntilConstant()
		window = WindowManager.create(windowTitle, windowX, windowY, root.width.toInt(), root.height.toInt())

		VkContextBuilder.let {
			it.debugEnabled = true
			it.windowingEnabled = true
			it.deviceFeatures.geometryShader = VK_TRUE
			it.deviceExtensions.add("VK_KHR_dynamic_rendering")
		}

		VkContextBuilder.build()

		surfaceSystem = VkContext.createSurfaceSystem(window)
		surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)
	}


}