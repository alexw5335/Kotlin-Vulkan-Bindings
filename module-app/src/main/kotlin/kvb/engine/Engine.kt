package kvb.engine

import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.window.WindowManager
import kvb.window.input.Button

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)



	init {
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



	fun update() {
		WindowManager.pollEvents()
		gui.handleMousePos(window.cursorX, window.cursorY)
		if(Button.LEFT_MOUSE.isPressed) gui.onHold(window.cursorX, window.cursorY)
		gui.root.alignCycle()
		gui.root.updateCycle()
	}



	fun shouldFinish() = WindowManager.windows.isEmpty()



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