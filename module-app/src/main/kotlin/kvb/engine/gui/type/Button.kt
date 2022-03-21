package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.layout.Alignment

open class Button : Base() {


	var borderColour = BaseDefaults.controlBorderColour

	var colour = BaseDefaults.controlColour

	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour

	open val supplyColour get() = colour

	open val supplyHoveredColour get() = hoveredColour

	open val supplyPressedColour get() = pressedColour

	val textBase = addChildInternal(TextBase()) { active = false }

	var hAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }

	var vAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }



	init {
		width = BaseDefaults.buttonWidth
		height = BaseDefaults.buttonHeight
		padding = BaseDefaults.controlPadding
		border = BaseDefaults.controlBorder
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)
	}



	override fun renderThis(x: Float, y: Float) {
		val colour = when {
			isPressed -> supplyPressedColour
			isHovered -> supplyHoveredColour
			else      -> supplyColour
		}

		GuiGraphics.renderBorder(x, y, width, height, borderColour, border)
		GuiGraphics.renderRect(x, y, width, height, colour)
	}


}