package kvb.engine.gui

class SimpleButton : Base() {


	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

	var textBase: SimpleText? = null
		set(value) {
			field = value
			if(value != null) {
				addChildInternal(value)
				value.active = false
			}
		}



	init {
		this.width = BaseDefaults.buttonWidth
		this.height = BaseDefaults.buttonHeight
	}



	override fun align() {
		textBase?.let(::alignCentre)
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