package kvb.fontcreator

class BinaryFont(
	val size       : Int,
	val baseline   : Int,
	val characters : List<BinaryCharacter>
) {


	val nullCharacter = characters.first { it.char.code == 0 }

	val maxCodepoint = characters.maxOf { it.char.code }

	val map = characters.associateBy { it.char }

	operator fun get(char: Char) = map[char] ?: nullCharacter


}