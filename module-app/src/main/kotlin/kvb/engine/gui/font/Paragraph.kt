package kvb.engine.gui.font

import kvb.engine.gui.layout.TextAlignment

class Paragraph(
	val font      : BinaryFont,
	val spacing   : Float,
	val wrapWidth : Float,
	val alignment : TextAlignment,
	val lines     : List<Line>,
	val width     : Float,
	val height    : Float
) {


	fun incrementedCollision(collision: TextCollision): TextCollision {
		if(collision.atEndOfLine) {
			if(collision.line.index == lines.lastIndex)
				return collision

			val line = lines[collision.line.index + 1]

			return TextCollision(this, line, 0, line.x, line.y)
		}

		return TextCollision(
			this,
			collision.line,
			collision.charIndex + 1,
			collision.line.charX(collision.charIndex + 1),
			collision.y
		)
	}



	fun collision(mouseX: Float, mouseY: Float): TextCollision? {
		if(lines.first().chars.isEmpty())
			return TextCollision(this, lines.first(), 0, lines.first().x, lines.first().y)

		val line = lines.firstOrNull {
			mouseY <= it.y + font.size
		} ?: return null

		if(line.chars.isEmpty())
			return TextCollision(this, line, 0, line.x, line.y)

		var x = line.x

		for(c in line.chars) {
			if(mouseX <= x + (c.advanceWidth - c.width) / 2F)
				return TextCollision(this, line, 0, x - 1, line.y)
			x += c.advanceWidth
		}

		return TextCollision(this, line, line.chars.size, x, line.y)
	}


}