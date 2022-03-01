package kvb.engine

import kvb.core.Platforms
import kvb.core.memory.Unsafe
import kvb.core.memory.direct.DirectLong
import kvb.engine.gui.Colour
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vkwrapper.shader.ShaderCreation
import kvb.vkwrapper.shader.ShaderDirectory
import kvb.vulkan.*
import kvb.window.WindowManager
import kvb.window.winapi.WinApiWindow







object Test {


	val window = WindowManager.create("My window", 0, 0, 600, 600)

	const val targetFps = 200

	const val frameTime = 1F / targetFps



	init {
		Platforms.init()

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


	fun render() {
		VkContext.surfaceSystem.record {
			GuiGraphics.renderRect(it, 0F, 0F, 0.5F, 0.5F, Colour(50, 0, 0, 0))
		}

		VkContext.surfaceSystem.present()
	}



	fun run() {
		while(true) {
			val frameStart = System.nanoTime()

			WindowManager.pollEvents()

			if(WindowManager.windows.isEmpty()) break

			render()

			GuiGraphics.allocator.reset()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime.toLong() - elapsedMicroseconds) / 1000)
			}
		}
	}


}



fun main() {
	Test.run()
}