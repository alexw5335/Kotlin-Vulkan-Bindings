package kvb.engine.gui

import kvb.engine.gui.model.ColourRectModel

class SimpleButton(
	width             : Float,
	height            : Float,
	var colour        : Colour,
	var hoveredColour : Colour,
	var pressedColour : Colour
) : Base() {


	init {
		this.width = width
		this.height = height
		model = ColourRectModel(Colour(0F, 0F, 0F))
	}



	override fun renderThis(x: Float, y: Float) {
		val colour = when {
			isPressed -> pressedColour
			isHovered -> hoveredColour
			else      -> this.colour
		}

		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}