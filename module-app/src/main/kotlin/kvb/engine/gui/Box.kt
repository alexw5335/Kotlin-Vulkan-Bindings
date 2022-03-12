package kvb.engine.gui

import kvb.engine.gui.layout.Aligned
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Orientation
import kvb.engine.gui.layout.Oriented

class Box(val orientation: Orientation) : Pane(), Oriented by orientation, Aligned {


	var spacing = 0F

	override var hAlignment = Alignment.CENTRE

	override var vAlignment = Alignment.CENTRE



	var pack = false



	fun childrenLength(): Float {
		var value = (children.size - 1) * spacing
		for(c in children) value += c.length
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
			length2 = children.maxOf { it.length2 } + startPadding2 + endPadding2
		}

		var pos = when(alignment) {
			Alignment.START  -> startPadding
			Alignment.END    -> length - childrenLength() - endPadding
			Alignment.CENTRE -> (interiorLength - childrenLength()) / 2
		}

		for(child in children) {
			child.pos = pos
			align2(child)
			pos += child.length + spacing
		}
	}


}