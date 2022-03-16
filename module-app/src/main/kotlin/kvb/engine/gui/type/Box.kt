package kvb.engine.gui.type

import kvb.engine.gui.layout.*

class Box(val orientation: Orientation) : Pane(), Oriented by orientation, Aligned {


	var spacing = 0F
		set(value) { field = value; shouldAlign = true }

	override var hAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }

	override var vAlignment = Alignment.CENTRE
		set(value) { field = value; shouldAlign = true }

	var pack = false
		set(value) { field = value; shouldAlign = true }



	private fun childrenLength(): Float {
		var value = (externalChildren.size - 1) * spacing
		for(c in externalChildren) value += c.length
		return value
	}



	override fun align() {
		if(children.isEmpty()) {
			if(pack) {
				width = 0F
				height = 0F
			}

			return
		}

		if(pack) {
			length = childrenLength() + startPadding + endPadding
			length2 = externalChildren.maxOf { it.length2 } + startPadding2 + endPadding2
		}

		var pos = when(alignment) {
			Alignment.START  -> startPadding
			Alignment.END    -> length - childrenLength() - endPadding
			Alignment.CENTRE -> (length - childrenLength()) / 2
		}

		for(child in externalChildren) {
			child.pos = pos
			align2(child)
			pos += child.length + spacing
		}
	}


}