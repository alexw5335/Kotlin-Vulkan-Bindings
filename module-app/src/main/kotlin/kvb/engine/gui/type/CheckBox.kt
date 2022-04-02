package kvb.engine.gui.type

import kvb.engine.gui.*

class CheckBox : Base() {


	var toggled = false
		set(value) { field = value; createEvent { ToggleEvent(it, value) }; check.visible = value }

	var check = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlBorderColour
		active = false
		visible = false
	}



	init {
		width = 30F
		height = 30F
		BaseDefaults.setControlDefaults(this)
	}



	override fun align() {
		check.width = width / 2F
		check.height = height / 2F
		alignCentre(check)
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)
		if(event is ClickEvent) toggled = !toggled
	}


}