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
) {


	fun collision(mouseX: Float, mouseY: Float): TextCollision? {
		if(lines.first().chars.isEmpty())
			return TextCollision(this, lines.first(), 0, lines.first().x, lines.first().y)

		val line = lines.firstOrNull {
			mouseY <= it.y + font.size * scale
		} ?: return null

		if(line.chars.isEmpty())
			return TextCollision(this, line, 0, line.x, line.y)

		var x = line.x

		for(c in line.chars) {
			if(mouseX <= x + scale / 2F)
				return TextCollision(this, line, 0, x, line.y)
			x += c.width * scale
		}

		return TextCollision(this, line, line.chars.size, x - scale, line.y)
	}


}