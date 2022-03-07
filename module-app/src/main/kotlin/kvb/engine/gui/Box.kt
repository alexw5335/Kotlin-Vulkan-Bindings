package kvb.engine.gui

import kvb.engine.gui.layout.Aligned
import kvb.engine.gui.layout.Alignment
import kvb.engine.gui.layout.Orientation
import kvb.engine.gui.layout.Oriented

class Box(val orientation: Orientation) : Pane(), Oriented by orientation, Aligned {


	var spacing = 0F

	override var hAlignment = Alignment.CENTRE

	override var vAlignment = Alignment.CENTRE



	// Margin and border are not necessary for a simple GUI.
	/*

	Simplest GUI:

	- All sizes are absolute.
	- The root's size is always set to the size of the window.
	- Bases are aligned according to width, height, and padding.
		- No border not margin
		- Any borders are entirely cosmetic and do not interfere with alignment.
	- Parents may change the size of children and children may change the size of parents.
		- E.g. A button's text changes, so it must be resized.
		- E.g. A packed box must conform to the size of its children.
		- E.g. A slider sets the size of its key and track whenever it is resized.
		- E.g. A StackPane always ensures that its children are the same size as it.
	- Alignment must not result in immediately requiring another alignment.
		- I.e. A parent tha sets the size of its children must not in turn be sized by its children.
		- E.g. A button does not size its text, but its text may size it?
	 */
	override fun align() {
		if(children.isEmpty()) return

		var childrenLength = 0F
		for(c in children) childrenLength += c.totalLength1
		childrenLength += (children.size - 1) * spacing

		var startPos = when(alignment1) {
			Alignment.START  -> firstPadding1
			Alignment.END    -> firstPadding1 + length1 - childrenLength
			Alignment.CENTRE -> firstPadding1 + (interiorLength1 - childrenLength) / 2
			Alignment.FILL   -> firstPadding1
		}

		var pos = 0F

		/*for(c in children) {
			c.pos1 = pos

			c.x = when(alignment2) {
				Alignment.START -> firstPadding2
				Alignment.END   -> width - secondPadding2 - c.width - c.secondMargin2 - c.secondBorder2
				Alignment.CENTRE ->
			}
			c.x = (interiorLength1 - c.width) / 2
			pos += c.length1 + spacing
		}*/
	}


}