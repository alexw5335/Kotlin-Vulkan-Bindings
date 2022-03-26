package kvb.engine.gui.event

import kvb.engine.gui.Base

class ClickEvent(
	source: Base,
	cursorX: Float,
	cursorY: Float
) : MouseEvent(source, cursorX, cursorY)