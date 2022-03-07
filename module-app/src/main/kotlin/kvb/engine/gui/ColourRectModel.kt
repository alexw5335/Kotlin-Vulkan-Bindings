package kvb.engine.gui

class ColourRectModel(var colour: Colour) : BaseModel {


	override fun render(base: Base, x: Float, y: Float) {
		GuiGraphics.renderRect(x, y, base.width, base.height, colour)
	}


}