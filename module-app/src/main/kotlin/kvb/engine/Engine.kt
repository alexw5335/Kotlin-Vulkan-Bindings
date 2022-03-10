package kvb.engine

import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.engine.vulkan.VkContextBuilder
import kvb.vulkan.VK_TRUE
import kvb.window.WindowManager
import kvb.window.input.Button
import kvb.window.winapi.WinApiWindow

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)

	var targetFps = 200

	val frameTime get() = 1F / targetFps



	init {
		initWindowCallbacks()
		window.show()
	}



	/*
	Init
	 */



	private fun initVulkan() {
		VkContextBuilder.let {
			it.debugEnabled = true
			it.windowingEnabled = true
			it.deviceFeatures.geometryShader = VK_TRUE
			it.window = EngineBuilder.window as WinApiWindow
		}

		VkContext.surfaceSystem.backgroundColour(0.1F, 0.7F, 0.3F, 1.0F)
	}



	private fun initWindowCallbacks() {
		window.onResize = { gui.onWindowResize(window.width, window.height) }
		window.onMouseMove = { gui.onMouseMove(window.cursorX, window.cursorY) }
		window.onMousePress = {
			if(it == Button.LEFT_MOUSE)
				gui.onPress(window.cursorX, window.cursorY)
		}

		window.onMouseRelease = {
			if(it == Button.LEFT_MOUSE)
				gui.onRelease(window.cursorX, window.cursorY)
		}
	}



	fun run() {
		while(true) {
			val frameStart = System.nanoTime()

			update()
			if(WindowManager.windows.isEmpty()) break
			renderGui()

			val elapsedMicroseconds = (System.nanoTime() - frameStart) / 1_000

			if(elapsedMicroseconds < frameTime) {
				Thread.sleep((frameTime.toLong() - elapsedMicroseconds) / 1000)
			}
		}
	}



	fun update() {
		WindowManager.pollEvents()
		gui.handleMousePos(window.cursorX, window.cursorY)
		if(Button.LEFT_MOUSE.isPressed) gui.onHold(window.cursorX, window.cursorY)
		gui.root.alignCycle()
		gui.root.updateCycle()
	}



	fun renderGui() {
		GuiGraphics.resetAllocator()

		VkContext.surfaceSystem.record {
			GuiGraphics.commandBuffer = it
			GuiGraphics.preRender(window)
			gui.root.render(0F, 0F)
		}

		VkContext.surfaceSystem.present()
	}


}