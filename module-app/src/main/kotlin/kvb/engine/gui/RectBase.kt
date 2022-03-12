package kvb.engine.gui

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