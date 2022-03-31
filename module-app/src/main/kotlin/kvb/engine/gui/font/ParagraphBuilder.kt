package kvb.engine.gui.font

import kvb.engine.gui.layout.TextAlignment

class ParagraphBuilder(
	val text      : String,
	val font      : BinaryFont,
	val spacing   : Float,
	val wrapWidth : Float,
	val alignment : TextAlignment
) {


	private class TempLine {
		var index = 0
		var charIndex = 0
		val chars = ArrayList<BinaryChar>()
		var width = 0F
		var advanceWidth = 0F
		var height = 0F
	}



	private val lines = ArrayList<TempLine>().also { it.add(TempLine()) }

	private val line get() = lines.last()

	private val word = ArrayList<BinaryChar>()

	private var wordWidth = 0F

	private var wordAdvanceWidth = 0F



	private fun newline() {
		val newline = TempLine()
		newline.index = lines.size
		newline.charIndex = line.charIndex + line.chars.size
		lines.add(newline)
	}



	private fun addChar(char: BinaryChar) {
		if(char.char == '\n') {
			line.chars.add(char)
			newline()
			return
		}

		if(line.advanceWidth + char.width > wrapWidth) {
			if(char.char != ' ')
				newline()
			line.width += char.width
		} else {
			line.width = line.advanceWidth + char.width
			line.advanceWidth += char.advanceWidth
		}

		line.chars.add(char)
	}



	private fun addWord() {
		if(line.chars.isNotEmpty() && line.advanceWidth + wordWidth > wrapWidth)
			newline()

		word.forEach(::addChar)
		word.clear()
		wordWidth = 0F
		wordAdvanceWidth = 0F
	}



	fun build(): Paragraph {
		for(char in text) {
			val binaryChar = font[char]

			if(char != ' ') {
				word.add(binaryChar)

				wordWidth = wordAdvanceWidth + binaryChar.width
				wordAdvanceWidth += binaryChar.advanceWidth
			} else {
				if(word.isNotEmpty())
					addWord()

				addChar(binaryChar)
			}
		}

		if(word.isNotEmpty())
			addWord()

		val width = lines.maxOf { it.width }

		val height = lines.size * font.size + (lines.size - 1) * spacing

		var y = 0F

		val lines = this.lines.map {
			val x = when(alignment) {
				TextAlignment.LEFT   -> 0F
				TextAlignment.CENTRE -> (width - it.width) / 2
				TextAlignment.RIGHT  -> width - it.width
			}

			val line = Line(it.index, it.charIndex, x, y, it.width, it.height, it.chars)
			y += font.size + spacing
			line
		}

		return Paragraph(font, spacing, wrapWidth, alignment, lines, width, height)
	}


}