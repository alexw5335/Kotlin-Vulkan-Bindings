package kvb.engine

import kvb.core.Platforms
import kvb.engine.gui.*
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.layout.VOrientation
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vulkan.VK_TRUE
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow



fun main() {
	Platforms.init()
	//ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

	val window = WindowManager.create("My Window", 0, 0, 900, 600)

	VkContextBuilder.let {
		it.debugEnabled = true
		it.windowingEnabled = true
		it.deviceFeatures.geometryShader = VK_TRUE
		it.window = window as WinApiWindow
	}

	VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)

	EngineBuilder.let {
		it.window = window

		it.root = Box(VOrientation).apply {
			spacing = 50F
			hAlignment = Alignment.CENTRE
			vAlignment = Alignment.START
			padding = Padding(50F)
			addChild(RectBase(100F, 100F, Colour(0F, 1F, 0F)))
			addChild(RectBase(100F, 100F, Colour(0F, 0F, 1F)))
			addChild(SimpleButton(100F, 50F, Colour(0F, 0F, 0F), Colour(100, 100, 100), Colour(50, 50, 50)))
			addChild(SimpleText("public static void main(String[] args) { System.out.println(\"Hello World\"); }", 2F, 2F, 200F))
		}
	}

	Engine.run()
}