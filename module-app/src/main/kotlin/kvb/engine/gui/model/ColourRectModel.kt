package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.GuiGraphics

class ColourRectModel(var colour: Colour) : BaseModel {


	override fun render(base: Base, x: Float, y: Float) {
		GuiGraphics.renderRect(x, y, base.width, base.height, colour)
	}


}