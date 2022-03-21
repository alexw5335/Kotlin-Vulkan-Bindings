package kvb.engine.gui.font

import kvb.engine.gui.layout.TextAlignment

class ParagraphBuilder(
	val font      : BinaryFont,
	val spacing   : Float,
	val wrapWidth : Float,
	val alignment : TextAlignment
) {


	private class TempLine {
		var index = 0
		val chars = ArrayList<BinaryChar>()
		var width = 0F
		var height = 0F
	}



	private val lines = ArrayList<TempLine>().also { it.add(TempLine()) }

	private val line get() = lines.last()

	private val word = ArrayList<BinaryChar>()

	private var wordWidth = 0F



	private fun newline() {
		val newline = TempLine()
		newline.index = lines.size
		lines.add(newline)
	}



	private fun addChar(char: BinaryChar) {
		if(line.chars.isEmpty()) {
			line.width += char.width * scale
		} else if(line.width + scale + char.width * scale > wrapWidth) {
			newline()
			if(char.char == ' ') return
			line.width += char.width * scale
		} else {
			line.width += char.width * scale + scale
		}

		if(char.height + char.yOffset > line.height)
			line.height = char.height.toFloat() + char.yOffset

		line.chars.add(char)
	}



	private fun addWord() {
		if(line.chars.isNotEmpty() && line.width + scale + wordWidth > wrapWidth)
			newline()

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

		for(l in lines)
			if(l.chars.isNotEmpty() && l.chars.last().char == ' ')
				l.width = l.width - l.chars.last().width * scale - scale

		val width = lines.maxOf { it.width }

		val height = if(lines.size == 1) {
			line.height
		} else {
			(lines.size - 1) * spacing + font.size - (font.size - font.baseline)
		} * scale

		var y = 0F

		val lines = this.lines.map {
			val x = when(alignment) {
				TextAlignment.LEFT -> 0F
				TextAlignment.CENTRE -> (width - it.width) / 2
				TextAlignment.RIGHT -> width - it.width
			}

			val line = Line(x, y, it.width, it.height, it.chars)
			y += (font.size + spacing) * scale
			line
		}

		return Paragraph(font, scale, spacing, wrapWidth, alignment, lines, width, height)
	}


}