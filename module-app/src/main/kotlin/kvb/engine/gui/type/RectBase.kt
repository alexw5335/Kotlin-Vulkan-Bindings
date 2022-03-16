package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.model.ColourRectModel

class RectBase : Base() {


	var colour = BaseDefaults.controlColour



	init {
		this.width = BaseDefaults.rectWidth
		this.height = BaseDefaults.rectHeight
		model = ColourRectModel(colour)
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}