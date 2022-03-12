package kvb.engine.gui.font

class Paragraph(
	val font        : BinaryFont,
	val scale       : Float,
	val spacing     : Float,
	val wrapWidth   : Float,
	val lines       : List<Line>,
	val width       : Float,
	val height      : Float
)