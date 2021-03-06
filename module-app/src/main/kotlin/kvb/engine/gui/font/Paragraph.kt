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



	fun rightCollision(collision: TextCollision) = collisionAtIndex(collision.index + 1)

	fun leftCollision(collision: TextCollision) = collisionAtIndex(collision.index - 1)

	fun upCollision(collision: TextCollision, x: Float) = collisionOnLineOrNull(collision.lineIndex - 1, x)

	fun downCollision(collision: TextCollision, x: Float) = collisionOnLineOrNull(collision.lineIndex + 1, x)



	fun collisionAtIndex(index: Int): TextCollision? {
		if(index < 0) return null

		for(line in lines)
			if(index <= line.charIndex + line.chars.size)
				return TextCollision(index, line.index, line.charX(index - line.charIndex), line.y)

		return null
	}



	private fun collisionOnLineOrNull(lineIndex: Int, collisionX: Float) = if(lineIndex in lines.indices)
		collisionOnLine(lines[lineIndex], collisionX)
	else
		null



	private fun collisionOnLine(line: Line, collisionX: Float): TextCollision {
		var x = line.x

		for((i, c) in line.chars.withIndex()) {
			if(collisionX <= x + (c.advanceWidth - c.width) / 2F)
				return TextCollision(line.charIndex + i, line.index, x - 1, line.y)

			x += c.advanceWidth
		}

		return TextCollision(line.charIndex + line.chars.size, line.index, x, line.y)
	}



	fun collisionAtPos(mouseX: Float, mouseY: Float): TextCollision {
		if(lines.size == 1 && lines[0].chars.isEmpty())
			return TextCollision(0, 0, lines[0].x, lines[0].y)

		val line = lines.firstOrNull {
			mouseY <= it.y + font.size
		} ?: lines.last()

		if(line.chars.isEmpty())
			return TextCollision(line.charIndex, line.index, line.x, line.y)

		return collisionOnLine(line, mouseX)
	}


}