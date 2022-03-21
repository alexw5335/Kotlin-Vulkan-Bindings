package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.event.ClickEvent
import kvb.engine.gui.layout.Alignment

class ToggleButton : Button() {


	var toggled = false
		set(value) { field = value; toggleEvent(value) }

	var toggledColour = BaseDefaults.toggledColour

	var toggledHoveredColour = BaseDefaults.toggledHoveredColour

	var toggledPressedColour = BaseDefaults.toggledPressedColour

	override val supplyColour get() = if(toggled) toggledColour else colour

	override val supplyHoveredColour get() = if(toggled) toggledHoveredColour else hoveredColour

	override val supplyPressedColour get() = if(toggled) toggledPressedColour else pressedColour



	override fun clickAction(event: ClickEvent) {
		super.clickAction(event)
		toggled = !toggled
	}


}