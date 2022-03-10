package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour

object NullBaseModel : BaseModel {

	override var colour = Colour.NULL

	override var hoveredColour = Colour.NULL
	
	override var pressedColour = Colour.NULL

	override fun render(base: Base, x: Float, y: Float) { }

}