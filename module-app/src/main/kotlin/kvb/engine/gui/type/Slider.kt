package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.layout.HOrientation
import kvb.engine.gui.layout.Orientation
import kvb.engine.gui.layout.Oriented
import kvb.engine.gui.layout.VOrientation

class Slider(val orientation: Orientation = HOrientation) : Base(), Oriented by orientation {


	var ratio = 0F
		set(value) {
			if(field == value.coerceIn(0F, 1F)) return
			field = value.coerceIn(0F, 1F)
			createEvent { RatioEvent(it, field) }
			shouldAlign = true
		}

	val track = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlColour
		active = false
	}

	val key = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlBorderColour
		active = false
	}



	init {
		length = BaseDefaults.sliderSize.primary
		length2 = BaseDefaults.sliderSize.secondary

		track.border = BaseDefaults.controlBorder
		key.length = BaseDefaults.sliderKeyWidth

		addHandler<DragUpdateEvent> {
			ratio = (transformUpAbsolute(it) - key.length / 2) / (length - key.length)
		}
	}



	override val draggable = true

	override val dragThreshold = 0F



	override fun align() {
		track.length = interiorLength
		track.length2 = interiorLength2
		alignCentre(track)
		key.length2 = interiorLength2
		key.pos = ratio * (length - key.length)
	}


}