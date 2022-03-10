package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour

interface BaseModel {


	var colour: Colour

	var hoveredColour: Colour

	var pressedColour: Colour

	fun render(base: Base, x: Float, y: Float)


}