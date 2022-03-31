package kvb.engine.gui.model

import kvb.engine.gui.Base
import kvb.engine.gui.Colour
import kvb.engine.gui.layout.Padding

interface BaseModel {


	var colour: Colour
		get()  = Colour.NULL
		set(_) = Unit

	var borderColour: Colour
		get()  = Colour.NULL
		set(_) = Unit



	fun render(base: Base, x: Float, y: Float)



	object NULL : BaseModel {
		override fun render(base: Base, x: Float, y: Float) { }
	}


}