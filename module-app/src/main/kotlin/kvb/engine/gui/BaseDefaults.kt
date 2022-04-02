package kvb.engine.gui

import kvb.engine.gui.layout.OrientedDimension
import kvb.engine.gui.layout.Padding
import kvb.engine.gui.model.ColourRectModel

/**
 * Default styles for bases.
 */
object BaseDefaults {


	var buttonWidth = 120F

	var buttonHeight = 40F

	var rectWidth = 100F

	var rectHeight = 100F

	var textBoxWidth = 300F

	var textBoxHeight = 200F

	var textBoxPadding = Padding(15F)

	var controlBorder = Padding(2F)

	var controlPadding = Padding(5F)

	var caretWidth = 1F

	var sliderSize = OrientedDimension(150F, 40F)

	var sliderKeyWidth = 15F



	var caretColour = Colour.WHITE

	var textColour = Colour.WHITE

	var controlColour = Colour.BLACK

	var controlBorderColour = Colour.WHITE

	var controlHoveredColour = Colour.rgb(30)

	var controlPressedColour = Colour.rgb(10)

	var toggledColour = Colour(0, 100, 100)

	var toggledHoveredColour = Colour(0, 150, 150)

	var toggledPressedColour = Colour(0, 75, 75)



	fun setControlDefaults(base: Base) {
		base.padding = controlPadding
		base.border  = controlBorder

		base.model   = ColourRectModel().also { model ->
			model.colour               = controlColour
			model.hoveredColour        = controlHoveredColour
			model.pressedColour        = controlPressedColour
			model.toggledColour        = toggledColour
			model.toggledHoveredColour = toggledHoveredColour
			model.toggledPressedColour = toggledPressedColour
			model.borderColour         = controlBorderColour
		}
	}


}