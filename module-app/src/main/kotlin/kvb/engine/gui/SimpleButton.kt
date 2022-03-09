package kvb.engine.gui

import kvb.engine.Engine
import kvb.engine.gui.event.HoldEvent
import kvb.engine.gui.event.HoverEvent
import kvb.engine.gui.model.ColourRectModel

class SimpleButton(width: Float, height: Float) : Base() {


	var hoveredColour = Colour(0.4F, 0.4F, 0.4F)

	var pressedColour = Colour(0.2F, 0.2F, 0.2F)

	var backgroundColour = Colour(0F, 0F, 0F)



	init {
		this.width = width
		this.height = height
		model = ColourRectModel(Colour(0F, 0F, 0F))
	}



	override fun update() {
		if(Engine.gui.hovered != this && Engine.gui.pressed != this)
			(model as ColourRectModel).colour = backgroundColour
	}



	override fun holdAction(event: HoldEvent) {
		super.holdAction(event)
		(model as ColourRectModel).colour = pressedColour
	}



	override fun hoverAction(event: HoverEvent) {
		super.hoverAction(event)
		(model as ColourRectModel).colour = hoveredColour
	}


}