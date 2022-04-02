package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.model.ColourRectModel

class RectBase : Base() {


	init {
		this.width = BaseDefaults.rectWidth
		this.height = BaseDefaults.rectHeight

		model = ColourRectModel()
		model.colour = BaseDefaults.controlColour
		model.borderColour = BaseDefaults.controlBorderColour
	}


}