package kvb.engine

import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext
import kvb.window.WindowManager

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)



	/*

	- A GUI is final and is permanently connected to a window.
	- The GUI's root can be changed. This will reset any state.
	- How to handle window callbacks for both a GUI and a game?

	- Window (represents a plain platform-specific window, with minimal callbacks).
	- EngineWindow (wraps a Window and provides a GUI and many callbacks).
		- EngineWindow can contain the GUI contents and the GUI class can be removed?

	 */



	fun update() {
		WindowManager.pollEvents()
		gui.handleCursorPos(window.cursorX, window.cursorY)
	}



	init {
		window.onResize = { _, _ ->
			gui.onWindowSizeChanged(window)
		}

		window.onMouseRelease
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