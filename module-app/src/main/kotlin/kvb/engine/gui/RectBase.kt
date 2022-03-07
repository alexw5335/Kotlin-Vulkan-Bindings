package kvb.engine.gui

import kvb.engine.gui.model.ColourRectModel

class RectBase(width: Float, height: Float, colour: Colour = Colour(0F, 0F, 0F, 1F)): Base() {


	init {
		this.width = width
		this.height = height
		model = ColourRectModel(colour)
	}


}