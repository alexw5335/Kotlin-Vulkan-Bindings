package kvb.engine.gui.type

import kvb.engine.gui.*
import kvb.engine.gui.layout.*

class ScrollBar(val orientation: Orientation, val scrollable: Scrollable) : Base(), Oriented by orientation {


	var ratio = 0F
		set(value) {
			if(field == value.coerceIn(0F, 1F)) return
			field = value.coerceIn(0F, 1F)
			shouldAlign = true
			scrollable.onScroll(orientation, field)
		}

	private val key = addChildInternal(RectBase()) {
		model.colour = Colour.RED
	}



	init {
		childrenAreActive = false
	}



	override val draggable = true

	override val dragThreshold = 0F

	var dragOffset = 0F



	override fun align() {
		val lengthRatio = when(orientation) {
			HOrientation -> scrollable.scrollableWidthRatio
			VOrientation -> scrollable.scrollableHeightRatio
		}

		key.length = lengthRatio * length
		key.length2 = length2

		key.pos = ratio * (length - key.length)
		key.pos2 = 0F
	}



	private fun onDragStart(event: DragStartEvent) {
		val cursor = transformUpAbsolute(event)
		val offset = cursor - key.pos

		if(offset in 0F..key.length) {
			dragOffset = offset
			return
		}

		val middle = key.length / 2F

		ratio = (cursor - middle) / (length - key.length)

		dragOffset = when {
			cursor < middle              -> cursor
			cursor > length - middle -> key.length - length + cursor
			else                         -> middle
		}
	}



	private fun onDragUpdate(event: DragUpdateEvent) {
		ratio = (transformUpAbsolute(event) - dragOffset) / (length - key.length)
	}



	override fun eventAction(event: BaseEvent) {
		super.eventAction(event)

		when(event) {
			is DragStartEvent -> onDragStart(event)
			is DragUpdateEvent -> onDragUpdate(event)
		}
	}


}