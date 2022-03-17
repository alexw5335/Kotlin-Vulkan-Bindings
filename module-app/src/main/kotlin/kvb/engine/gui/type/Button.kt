package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.layout.Alignment

class Button : Base() {


	var border = BaseDefaults.controlBorder

	var borderColour = BaseDefaults.controlBorderColour

	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

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



	override fun renderThis(x: Float, y: Float) {
		val colour = when {
			isPressed -> pressedColour
			isHovered -> hoveredColour
			else      -> this.colour
		}

		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}