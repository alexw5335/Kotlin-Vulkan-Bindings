package kvb.engine.gui.font

import kvb.engine.gui.layout.TextAlignment

class Paragraph(
	val font      : BinaryFont,
	val scale     : Float,
	val spacing   : Float,
	val wrapWidth : Float,
	val alignment : TextAlignment,
	val lines     : List<Line>,
	val width     : Float,
	val height    : Float
)