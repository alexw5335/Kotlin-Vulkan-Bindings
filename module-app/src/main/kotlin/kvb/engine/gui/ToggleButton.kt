package kvb.engine.gui

import kvb.engine.gui.event.ClickEvent
import kvb.engine.gui.layout.Padding

class ToggleButton : Base() {


	var border = BaseDefaults.controlBorder

	var borderColour = BaseDefaults.controlBorderColour

	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

	var toggledColour = BaseDefaults.toggledColour

	var toggledHoveredColour = BaseDefaults.toggledHoveredColour

	var toggledPressedColour = BaseDefaults.toggledPressedColour

	var toggled = false

	val textBase = addChildInternal(SimpleText()) { active = false }



	init {
		this.width = BaseDefaults.buttonWidth
		this.height = BaseDefaults.buttonHeight
	}



	override fun align() {
		alignCentre(textBase)
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

		GuiGraphics.renderRect(x - border.left, y - border.top, width + border.horizontal, height + border.vertical, borderColour)
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}