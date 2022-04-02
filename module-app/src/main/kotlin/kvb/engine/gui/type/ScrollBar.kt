package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.layout.*

class ScrollBar(val orientation: Orientation, val scrollable: Scrollable) : Base(), Oriented by orientation {


	var ratio = 0F
		set(value) {
			if(field == value.coerceIn(0F, 1F)) return
			field = value.coerceIn(0F, 1F)
			scrollable.onScroll(orientation, field)
		}

	private val track = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlColour
		model.borderColour = BaseDefaults.controlBorderColour
		border = BaseDefaults.controlBorder
	}

	private val key = addChildInternal(RectBase()) {
		model.colour = BaseDefaults.controlBorderColour
	}



	init {
		childrenAreActive = false
	}



	override val draggable = true

	override val dragThreshold = 0F



	override fun align() {
		track.width = width
		track.height = height

		val lengthRatio = when(orientation) {
			HOrientation -> scrollable.scrollableWidthRatio
			VOrientation -> scrollable.scrollableHeightRatio
		}

		key.length = lengthRatio * length
		key.length2 = length2

		key.pos = ratio * (length - key.length)
		key.pos2 = 0F
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is DragStartEvent -> {
				val pos = transformUpAbsolute(event.mouseX)
			}
		}
	}



	private fun onScroll(event: DragUpdateEvent) {

	}


}