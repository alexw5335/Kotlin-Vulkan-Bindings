package kvb.fontcreator

import kvb.core.Platforms
import java.nio.file.Files
import java.nio.file.Paths



/*
TODO: Another wrapper layer that has a global instance and device, which allows for global function calls.
TODO: Simplify JNI bindings to not include vulkan.h, with custom function pointers using only primitives.
 */



fun main() {
	Platforms.init()
	FontCreator.run()
}



private val textureWidth = 64F
private val textureHeight = 64F

private fun character(char: Char, x: Int, y: Int, width: Int, height: Int, yOffset: Int) = BinaryCharacter(
	char, x, y, width, height, yOffset, x / textureWidth, y / textureHeight, width / textureWidth, height / textureHeight
)

private val characters = listOf(
	character('A', 0, 0, 5, 7, 0),
	character('B', 6, 0, 5, 7, 0),
	character('C', 12, 0, 5, 7, 0),
	character('D', 18, 0, 5, 7, 0),
	character('E', 24, 0, 5, 7, 0),
	character('F', 30, 0, 5, 7, 0),
	character('G', 36, 0, 5, 7, 0),
	character('H', 42, 0, 5, 7, 0),
	character('I', 48, 0, 5, 7, 0),
	character('J', 56, 0, 5, 7, 0),
	character('K', 0, 8, 5, 7, 0),
	character('L', 6, 8, 5, 7, 0),
	character('M', 12, 8, 5, 7, 0),
	character('N', 18, 8, 5, 7, 0),
	character('O', 24, 8, 5, 7, 0),
	character('P', 30, 8, 5, 7, 0),
	character('Q', 36, 8, 5, 7, 0),
	character('R', 42, 8, 5, 7, 0),
	character('S', 48, 8, 5, 7, 0),
	character('T', 56, 8, 5, 7, 0),
	character('U', 0, 16, 5, 7, 0),
	character('V', 6, 16, 5, 7, 0),
	character('W', 12, 16, 5, 7, 0),
	character('X', 18, 16, 5, 7, 0),
	character('Y', 24, 16, 5, 7, 0),
	character('Z', 30, 16, 5, 7, 0),

	character('1', 12, 30, 5, 7, 0),
	character('2', 18, 30, 5, 7, 0),
	character('3', 24, 30, 5, 7, 0),
	character('4', 30, 30, 5, 7, 0),
	character('5', 36, 30, 5, 7, 0),
	character('6', 42, 30, 5, 7, 0),
	character('7', 48, 30, 5, 7, 0),
	character('8', 56, 30, 5, 7, 0),
	character('9', 0, 38, 5, 7, 0),
	character('0', 8, 38, 5, 7, 0),
)



private val fontData = Files.readAllBytes(Paths.get("res/binary_font_data.bff"))



val font = BinaryFont(64, 64, characters, fontData)