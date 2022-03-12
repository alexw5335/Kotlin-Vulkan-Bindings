package kvb.engine.gui

import kvb.engine.gui.event.ClickEvent

class ToggleButton : Base() {


	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

	var toggledColour = BaseDefaults.toggledColour

	var toggledHoveredColour = BaseDefaults.toggledHoveredColour

	var toggledPressedColour = BaseDefaults.toggledPressedColour

	var toggled = false



	init {
		this.width = BaseDefaults.buttonWidth
		this.height = BaseDefaults.buttonHeight
	}



	override fun clickAction(event: ClickEvent) {
		super.clickAction(event)
		toggled = !toggled
	}



	override fun renderThis(x: Float, y: Float) {
		val colour = if(toggled) when {
			isPressed -> toggledPressedColour
			isHovered -> toggledHoveredColour
			else      -> toggledColour
		} else when {
			isPressed -> pressedColour
			isHovered -> hoveredColour
			else      -> colour
		}

		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}