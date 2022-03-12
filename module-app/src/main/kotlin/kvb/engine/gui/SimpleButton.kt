package kvb.engine.gui

class SimpleButton : Base() {


	var border = BaseDefaults.controlBorder

	var borderColour = BaseDefaults.controlBorderColour

	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

	val textBase = addChildInternal(SimpleText()) { active = false }



	init {
		this.width = BaseDefaults.buttonWidth
		this.height = BaseDefaults.buttonHeight
	}



	override fun align() {
		alignCentre(textBase)
	}



	override fun renderThis(x: Float, y: Float) {
		val colour = when {
			isPressed -> pressedColour
			isHovered -> hoveredColour
			else      -> this.colour
		}

		GuiGraphics.renderRect(x - border.left, y - border.top, width + border.horizontal, height + border.vertical, borderColour)
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}