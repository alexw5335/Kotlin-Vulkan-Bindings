package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.layout.DualAlignment

open class Button : Base() {


	val textBase = addChildInternal(TextBase()) { active = false }

	var alignment = DualAlignment.CENTRE_CENTRE
		set(value) { field = value; shouldAlign = true }



	init {
		width = BaseDefaults.buttonWidth
		height = BaseDefaults.buttonHeight
		BaseDefaults.setControlDefaults(this)
	}



	override fun align() {
		//textBase.wrapWidth = interiorWidth
		textBase.wrapWidth = 1000F
		align(alignment, textBase)
	}



	override val supplyFinalColour get() = when {
		isPressed -> model.pressedColour
		isHovered -> model.hoveredColour
		else      -> model.colour
	}


}