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
		colour = BaseDefaults.controlColour
		active = false
	}

	val key = addChildInternal(RectBase()) {
		colour = BaseDefaults.controlBorderColour
		active = false
	}



	init {
		when(orientation) {
			is HOrientation -> {
				width = 100F
				height = 40F
			}

			is VOrientation -> {
				width = 40F
				height = 100F
			}
		}
	}



	override val draggable = true

	override val dragImmediately = true



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is DragUpdateEvent -> {
				ratio = (transformUpAbsolute(event) - key.length / 2) / (length - key.length)
			}
		}
	}



	override fun align() {
		alignCentre(track)
		track.length = interiorLength
		track.length2 = interiorLength2
		key.length = 20F
		key.length2 = interiorLength2
		key.pos = ratio * (length - key.length)
	}


}