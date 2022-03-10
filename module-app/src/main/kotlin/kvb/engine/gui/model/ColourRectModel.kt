package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.GuiGraphics

class ColourRectModel(
	override var colour: Colour,
	override var hoveredColour: Colour = colour,
	override var pressedColour: Colour = colour
) : BaseModel {


	override fun render(base: Base, x: Float, y: Float) {
		val colour = when {
			base.isHovered -> hoveredColour
			base.isPressed -> pressedColour
			else           -> this.colour
		}

		GuiGraphics.renderRect(x, y, base.width, base.height, colour)
	}


}