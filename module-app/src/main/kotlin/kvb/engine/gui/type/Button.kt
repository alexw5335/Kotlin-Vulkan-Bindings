package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.model.ColourRectModel

open class Button : Base() {


	var hoveredColour = BaseDefaults.controlHoveredColour

	var pressedColour = BaseDefaults.controlPressedColour



	open val supplyColour get() = model.colour

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
		model = ColourRectModel()
		model.colour = BaseDefaults.controlColour
		model.borderColour = BaseDefaults.controlBorderColour
	}



	override fun align() {
		textBase.wrapWidth = interiorWidth
		hAlign(hAlignment, textBase)
		vAlign(vAlignment, textBase)
	}



	override fun renderThis(x: Float, y: Float) {
		model.colour = when {
			isPressed -> supplyPressedColour
			isHovered -> supplyHoveredColour
			else      -> supplyColour
		}

		model.render(this, x, y)
	}


}