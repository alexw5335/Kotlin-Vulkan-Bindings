package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.event.ClickEvent
import kvb.engine.gui.layout.Alignment

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

	val textBase = addChildInternal(TextBase()) { active = false }

	var hAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }

	var vAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }



	init {
		this.width = BaseDefaults.buttonWidth
		this.height = BaseDefaults.buttonHeight
		this.padding = BaseDefaults.controlPadding
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)
	}



	override fun clickAction(event: ClickEvent) {
		super.clickAction(event)
		toggled = !toggled
		toggleEvent(toggled)
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

		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}