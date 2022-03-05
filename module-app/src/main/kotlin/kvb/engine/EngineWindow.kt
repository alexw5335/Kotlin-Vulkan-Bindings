package kvb.engine

import kvb.engine.gui.Base
import kvb.engine.gui.Gui
import kvb.window.Window

class EngineWindow(val internalWindow: Window, root: Base) : Window by internalWindow {


	val gui = Gui(root)



	init {
		internalWindow.onMousePress = {
		}
	}


}