package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.layout.Padding

class ColourRectModel : BaseModel {


	override var colour = Colour.NULL

	override var hoveredColour = Colour.NULL

	override var pressedColour = Colour.NULL

	override var toggledColour = Colour.NULL

	override var toggledHoveredColour = Colour.NULL

	override var toggledPressedColour = Colour.NULL

	override var borderColour = Colour.NULL



	override fun render(base: Base, x: Float, y: Float) {
		if(base.border.valid)
			GuiGraphics.renderBorder(x, y, base.width, base.height, base.supplyFinalBorderColour, base.border)
		GuiGraphics.renderRect(x, y, base.width, base.height, base.supplyFinalColour)
	}


}