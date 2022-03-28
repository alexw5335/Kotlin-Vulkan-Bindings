package kvb.engine

import kvb.engine.gui.type.AnchorPane
import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.window.Window
import kvb.window.WindowManager
import kvb.window.input.InputAction
import kvb.window.input.InputButton

object Engine {


	init { EngineBuilder.build() }



	val window = EngineBuilder.window

	var gui: Gui = Gui(AnchorPane())
		set(value) {
			field = value
			value.onWindowResize(window.width, window.height)
		}

	var targetFps = 200

	val frameTime get() = 1F / targetFps



	init {
		initWindowCallbacks(window)
		window.show()
	}



	private fun initWindowCallbacks(window: Window) {
		window.onResize = {
			gui.onWindowResize(window.width, window.height)
		}

		window.onMouseMove = {
			gui.onMouseMove(window.cursorX, window.cursorY)
		}

		window.onButtonInput = { button, action ->
			when {
				button != InputButton.LEFT_MOUSE -> Unit
				action == InputAction.PRESS      -> gui.onPress(window.cursorX, window.cursorY)
				action == InputAction.RELEASE    -> gui.onRelease(window.cursorX, window.cursorY)
			}

			gui.onButtonInput(button, action, window.cursorX, window.cursorY)
		}

		window.onChar = {
			gui.onCharInput(it)
		}
	}



	/*
	Run cycle
	 */



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



	private fun update() {
		WindowManager.pollEvents()
		gui.update(window)
		VkContext.memoryManager.executeCommands()
	}



	private fun renderGui() {
		GuiGraphics.resetAllocator()

		VkContext.surfaceSystem.record {
			GuiGraphics.commandBuffer = it
			GuiGraphics.preRender(window)
			gui.render()
		}

		VkContext.surfaceSystem.present()
	}


}