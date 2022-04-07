package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.layout.Horizontal
import kvb.engine.gui.layout.Orientation
import kvb.engine.gui.layout.Oriented

class Slider(val orientation: Orientation = Horizontal) : Base(), Oriented by orientation {


	var ratio = 0F
		set(value) {
			if(field == value.coerceIn(0F, 1F)) return
			field = value.coerceIn(0F, 1F)
			createEvent { RatioEvent(it, field) }
			shouldAlign = true
		}

	val track = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlColour
	}

	val key = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlBorderColour
	}



	init {
		length = BaseDefaults.sliderSize.primary
		length2 = BaseDefaults.sliderSize.secondary

		track.border = BaseDefaults.controlBorder
		key.length = BaseDefaults.sliderKeyWidth

		childrenAreActive = false

		addHandler(::onDragUpdate)
	}



	override val draggable = true

	override val dragThreshold = 0F



	private fun onDragUpdate(event: DragUpdateEvent) {
		ratio = (transformUpAbsolute(event) - key.length / 2) / (length - key.length)
	}



	override fun align() {
		track.length = interiorLength
		track.length2 = interiorLength2
		alignCentre(track)
		key.length2 = interiorLength2
		key.pos = ratio * (length - key.length)
	}


}