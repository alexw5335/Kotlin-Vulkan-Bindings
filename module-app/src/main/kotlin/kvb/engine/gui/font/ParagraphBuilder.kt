package kvb.engine.gui.font

class ParagraphBuilder(
	val font      : BinaryFont,
	val scale     : Float,
	val spacing   : Float,
	val wrapWidth : Float
) {



	private val lines = ArrayList<Line>().also { it.add(Line()) }

	private val line get() = lines.last()

	private val word = ArrayList<BinaryChar>()

	private var wordWidth = 0F

	private var width = 0F

	private var height = font.size.toFloat() * scale



	private fun newLine() {
		if(line.width > width)
			width = line.width

		val newLine = Line()
		newLine.y = height + spacing * scale
		height = newLine.y + font.size * scale
		lines.add(newLine)
	}



	private fun addChar(char: BinaryChar) {
		if(line.chars.isEmpty()) {
			line.width += char.width * scale
		} else if(line.width + scale + char.width * scale > wrapWidth) {
			newLine()
			line.width += char.width * scale
		} else {
			line.width += char.width * scale + scale
		}

		line.chars.add(char)
	}



	private fun addWord() {
		if(line.chars.isNotEmpty() && line.width + scale + wordWidth > wrapWidth)
			newLine()

		word.forEach(::addChar)
		word.clear()
		wordWidth = 0F
	}



	fun build(text: String): Paragraph {
		for(char in text) {
			val binaryChar = font[char]

			if(char != ' ') {
				word.add(binaryChar)

				wordWidth += if(word.isEmpty())
					binaryChar.width * scale
				else
					binaryChar.width * scale + scale
			} else {
				if(word.isNotEmpty())
					addWord()

				addChar(binaryChar)
			}
		}

		if(word.isNotEmpty())
			addWord()

		return Paragraph(font, scale, spacing, wrapWidth, lines, lines.maxOf { it.width }, height)
	}


}