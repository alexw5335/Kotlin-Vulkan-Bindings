package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.BaseEvent
import kvb.engine.gui.ClickEvent
import kvb.engine.gui.ToggleEvent
import kvb.window.input.InputButton

class ToggleButton : Button() {


	var toggled = false
		set(value) { field = value; createEvent { ToggleEvent(it, value) } }

	var toggledColour = BaseDefaults.toggledColour

	var toggledHoveredColour = BaseDefaults.toggledHoveredColour

	var toggledPressedColour = BaseDefaults.toggledPressedColour

	override val supplyColour get() = if(toggled) toggledColour else colour

	override val supplyHoveredColour get() = if(toggled) toggledHoveredColour else hoveredColour

	override val supplyPressedColour get() = if(toggled) toggledPressedColour else pressedColour



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is ClickEvent -> toggled = !toggled
		}
	}


}