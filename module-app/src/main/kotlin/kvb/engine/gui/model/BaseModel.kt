package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.layout.Padding

interface BaseModel {


	var colour get() = Colour.NULL; set(_) = Unit

	var borderColour get() = Colour.NULL; set(_) = Unit

	var hoveredColour get() = Colour.NULL; set(_) = Unit

	var pressedColour get() = Colour.NULL; set(_) = Unit

	var toggledColour get() = Colour.NULL; set(_) = Unit

	var toggledHoveredColour get() = Colour.NULL; set(_) = Unit

	var toggledPressedColour get() = Colour.NULL; set(_) = Unit



	fun render(base: Base, x: Float, y: Float)



	object NULL : BaseModel {
		override fun render(base: Base, x: Float, y: Float) { }
	}


}