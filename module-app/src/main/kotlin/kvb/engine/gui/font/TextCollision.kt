package kvb.engine.gui.font

class TextCollision(
	val paragraph : Paragraph,
	val line      : Line,
	val charIndex : Int,
	val x         : Float,
	val y         : Float
) {


	val atEndOfLine get() = charIndex == line.chars.size

	val atStartOfLine get() = charIndex == 0



	fun totalCharIndex(): Int {
		var count = charIndex

		for(i in 0 until line.index)
			count += paragraph.lines[i].chars.size

		return count
	}


}