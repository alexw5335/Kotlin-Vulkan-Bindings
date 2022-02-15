package kvb.fontcreator

import kvb.core.Platforms

fun main() {
	Platforms.init()
	FontCreator.run()
}


val characters = listOf(
	BinaryCharacter('A', 0, 0, 5, 7, 0),
	BinaryCharacter('B', 6, 0, 5, 7, 0),
	BinaryCharacter('C', 12, 0, 5, 7, 0),
	BinaryCharacter('D', 18, 0, 5, 7, 0),
	BinaryCharacter('E', 24, 0, 5, 7, 0),
	BinaryCharacter('F', 30, 0, 5, 7, 0),
	BinaryCharacter('G', 36, 0, 5, 7, 0),
	BinaryCharacter('H', 42, 0, 5, 7, 0),
	BinaryCharacter('I', 48, 0, 5, 7, 0),
	BinaryCharacter('J', 56, 0, 5, 7, 0),
	BinaryCharacter('K', 0, 8, 5, 7, 0),
	BinaryCharacter('L', 6, 8, 5, 7, 0),
	BinaryCharacter('M', 12, 8, 5, 7, 0),
	BinaryCharacter('N', 18, 8, 5, 7, 0),
	BinaryCharacter('O', 24, 8, 5, 7, 0),
	BinaryCharacter('P', 30, 8, 5, 7, 0),
	BinaryCharacter('Q', 36, 8, 5, 7, 0),
	BinaryCharacter('R', 42, 8, 5, 7, 0),
	BinaryCharacter('S', 48, 8, 5, 7, 0),
	BinaryCharacter('T', 56, 8, 5, 7, 0),
	BinaryCharacter('U', 0, 16, 5, 7, 0),
	BinaryCharacter('V', 6, 16, 5, 7, 0),
	BinaryCharacter('W', 12, 16, 5, 7, 0),
	BinaryCharacter('X', 18, 16, 5, 7, 0),
	BinaryCharacter('Y', 24, 16, 5, 7, 0),
	BinaryCharacter('Z', 30, 16, 5, 7, 0),

	BinaryCharacter('1', 12, 30, 5, 7, 0),
	BinaryCharacter('2', 18, 30, 5, 7, 0),
	BinaryCharacter('3', 24, 30, 5, 7, 0),
	BinaryCharacter('4', 30, 30, 5, 7, 0),
	BinaryCharacter('5', 36, 30, 5, 7, 0),
	BinaryCharacter('6', 42, 30, 5, 7, 0),
	BinaryCharacter('7', 48, 30, 5, 7, 0),
	BinaryCharacter('8', 56, 30, 5, 7, 0),
	BinaryCharacter('9', 0, 38, 5, 7, 0),
	BinaryCharacter('0', 8, 38, 5, 7, 0),
)