package kvb.engine.gui

class RectBase(width: Float, height: Float): Base() {


	init {
		this.width = width
		this.height = height
		model = ColourRectModel()
	}


}