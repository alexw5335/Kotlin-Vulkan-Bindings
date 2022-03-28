package kvb.engine

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.GuiGraphics
import kvb.engine.gui.BaseEvent
import kvb.engine.gui.HoverEvent
import kvb.window.input.InputButton

class PixelBase : Base() {


	var toggled = false



	init {
		width = 50F
		height = 50F
	}



	override fun renderThis(x: Float, y: Float) {
		GuiGraphics.renderRect(x, y, width, height, Colour.rgb(100))
		GuiGraphics.renderRect(x + 1, y + 1, width - 2, height - 2, if(toggled) Colour.WHITE else Colour.BLACK)
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		if(event is HoverEvent) {
			if(InputButton.LEFT_MOUSE.isPressed)
				toggled = true
			else if(InputButton.RIGHT_MOUSE.isPressed)
				toggled = false
		}
	}


}