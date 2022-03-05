package kvb.engine.gui.event

import kvb.engine.gui.Base

class MouseEvent(
	source      : Base,
	val cursorX : Float,
	val cursorY : Float
) : BaseEvent(source)