package kvb.engine.gui

class VBox : Pane() {


	var spacing = 0F

	override fun align() {
		val interiorWidth = width - padding.horizontal
		var y = 0F

		for(c in children) {
			c.y = y
			c.x = (interiorWidth - c.width) / 2
			y += c.height + spacing
		}
	}


}