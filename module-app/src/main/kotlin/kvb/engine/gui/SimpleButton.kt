package kvb.engine.gui

import kvb.engine.Engine
import kvb.engine.gui.event.HoldEvent
import kvb.engine.gui.event.HoverEvent
import kvb.engine.gui.model.ColourRectModel

class SimpleButton(width: Float, height: Float) : Base() {


	init {
		this.width = width
		this.height = height
		model = ColourRectModel(Colour(0F, 0F, 0F))
	}


}