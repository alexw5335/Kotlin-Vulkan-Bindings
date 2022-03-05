package kvb.engine

import kvb.engine.gui.Gui
import kvb.engine.gui.GuiGraphics
import kvb.engine.vulkan.VkContext

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)

	val cursorX get() = window.cursorX

	val cursorY get() = window.cursorY



	/*

	- A GUI is final and is permanently connected to a window.
	- The GUI's root can be changed. This will reset any state.
	- How to handle window callbacks for both a GUI and a game?

	- Window (represents a plain platform-specific window, with minimal callbacks).
	- EngineWindow (wraps a Window and provides a GUI and many callbacks).
		- EngineWindow can contain the GUI contents and the GUI class can be removed?
	 */



	init {
		window.onClientSizeChanged = { _, _ ->
			gui.onWindowSizeChanged(window)
		}
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