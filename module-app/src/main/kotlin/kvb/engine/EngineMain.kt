package kvb.engine

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.ColourRectModel
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.event.BaseEventHandler
import kvb.engine.gui.event.MouseEvent
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vulkan.VK_TRUE
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow

object Test {


	private val window = WindowManager.create("My window", 0, 0, 600, 600)

	private const val targetFps = 200

	private const val frameTime = 1F / targetFps



	init {
		ShaderCreation.compileAll("res/shader/gui", "res/shader/gui/out")

		VkContextBuilder.let {
			it.debugEnabled = true
			it.windowingEnabled = true
			it.deviceFeatures.geometryShader = VK_TRUE
			it.window = window as WinApiWindow
		}

		VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)

		GuiGraphics

		EngineBuilder.let {
			it.window = window
			it.root = Base().also {
				it.model = ColourRectModel().also {
					it.colour = Colour(1F, 0F, 0F, 1F)
				}
			}
		}

		Engine

		window.show()
	}



	fun run() {
		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()

			if(WindowManager.windows.isEmpty()) break

			Engine.renderGui()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime.toLong() - elapsedMicroseconds) / 1000)
			}
		}
	}


}



fun main() {
	val base = Base()
	val event = MouseEvent(base, 0F, 0F)
	val handler = BaseEventHandler<MouseEvent> { println(it) }
	event.tryHandler(handler)
	//Platforms.init()
	//Test.run()
}