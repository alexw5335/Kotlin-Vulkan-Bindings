package kvb.engine.gui.font

class BinaryFont(
	val size: Int,
	val baseline: Int,
	val characters: List<BinaryChar>
) {


	val nullCharacter = characters.first { it.char.code == 0 }

	val map = characters.associateBy { it.char }

	operator fun contains(char: Char) = map.containsKey(char)

	operator fun get(char: Char) = map[char] ?: nullCharacter


}