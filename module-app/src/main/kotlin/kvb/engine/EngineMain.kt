package kvb.engine

import kvb.core.Platforms
import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.ColourRectModel
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vulkan.VK_TRUE
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow
import kotlin.random.Random

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

		window.show()
	}



	val root = Base()

	val child0 = Base()



	init {
		root.x = 100F
		root.y = 100F
		root.width = 400F
		root.height = 400F
		root.model = ColourRectModel().also { it.colour = Colour(1F, 0F, 0F) }

		child0.x = 100F
		child0.y = 100F
		child0.width = 200F
		child0.height = 200F
		child0.model = ColourRectModel().also { it.colour = Colour(0F, 1F, 0F) }

		root.children.add(child0)
	}



	private fun render() {
		GuiGraphics.resetAllocator()

		VkContext.surfaceSystem.record {
			GuiGraphics.commandBuffer = it
			GuiGraphics.preRender(window)
			root.render(0F, 0F)
		}

		VkContext.surfaceSystem.present()

		println(root.checkCollision(window.cursorX.toFloat(), window.cursorY.toFloat()))
	}



	fun run() {
		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()

			if(WindowManager.windows.isEmpty()) break

			render()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime.toLong() - elapsedMicroseconds) / 1000)
			}
		}
	}


}



fun main() {
	Platforms.init()
	Test.run()
}