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


	fun collision(index: Int): TextCollision? {
		if(index < 0) return null
		for(l in lines)
			if(index <= l.charIndex + l.chars.size)
				return TextCollision(index, l.charX(index - l.charIndex), l.y)

		return null
	}



	fun collision(mouseX: Float, mouseY: Float): TextCollision? {
		if(lines[0].chars.isEmpty())
			return TextCollision(0, lines[0].x, lines[0].y)

		val line = lines.firstOrNull {
			mouseY <= it.y + font.size
		} ?: return null

		if(line.chars.isEmpty())
			return TextCollision(line.charIndex, line.x, line.y)

		var x = line.x

		for((i, c) in line.chars.withIndex()) {
			if(mouseX <= x + (c.advanceWidth - c.width) / 2F)
				return TextCollision(line.charIndex + i, x - 1, line.y)
			x += c.advanceWidth
		}

		return TextCollision(line.charIndex + line.chars.size, x, line.y)
	}


}