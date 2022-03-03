package kvb.engine.gui

class ColourRectModel : BaseModel {


	var colour = Colour(0)

	override fun render(base: Base, x: Float, y: Float) {
		GuiGraphics.renderRect(x, y, base.width, base.height, colour)
	}


}