package kvb.engine

import kvb.engine.gui.Gui

object Engine {


	val window = EngineBuilder.window

	val gui = Gui(EngineBuilder.root)

	val cursorX get() = window.cursorX

	val cursorY get() = window.cursorY



	init {

	}
}