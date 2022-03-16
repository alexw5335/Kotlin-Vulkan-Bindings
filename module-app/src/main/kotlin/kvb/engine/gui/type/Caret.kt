package kvb.engine.gui.type

import kvb.engine.gui.Base
import kvb.engine.gui.BaseDefaults
import kvb.engine.gui.GuiGraphics

class Caret : Base() {


	var colour = BaseDefaults.caretColour

	var lastBlinkTime = 0L

	var blinkMillis = 500

	var blinkState = false

	var isBlinking = false



	init {
		width = BaseDefaults.caretWidth
		active = false
	}



	override fun renderThis(x: Float, y: Float) {
		if(System.currentTimeMillis() - lastBlinkTime >= blinkMillis) {
			lastBlinkTime = System.currentTimeMillis()
			blinkState = !blinkState
		}

		if(!blinkState)
			GuiGraphics.renderRect(x, y, width, height, colour)
	}


}