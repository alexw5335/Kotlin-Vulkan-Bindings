package kvb.engine.gui

class StackPane : Pane() {


	init {
		transparent = true
	}



	override fun align() {
		for(c in children) {
			c.x = 0F
			c.y = 0F
			c.width = width
			c.height = height
		}
	}


}