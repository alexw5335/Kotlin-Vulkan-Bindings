package kvb.engine.gui.type

import kvb.engine.gui.BaseEvent
import kvb.engine.gui.ClickEvent
import kvb.engine.gui.ToggleEvent

class ToggleButton : Button() {


	var toggled = false
		set(value) { field = value; createEvent { ToggleEvent(it, value) } }



	override val supplyFinalColour get() = when {
		!toggled  -> super.supplyFinalColour
		isPressed -> model.toggledPressedColour
		isHovered -> model.toggledHoveredColour
		else      -> model.toggledColour
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)
		if(event is ClickEvent) toggled = !toggled
	}


}