package kvb.fontcreator

import kvb.core.Platforms



/*
TODO: Another wrapper layer that has a global instance and device, which allows for global function calls.
TODO: Simplify JNI bindings to not include vulkan.h, with custom function pointers using only primitives.
 */



fun main() {
	//ShaderCreation.compileAll("res/shader/font_creator", "res/shader/font_creator/out")
	Platforms.init()
	FontCreator.run()
}



var globalCharacters = listOf(
	BinaryCharacter('A', 22163384025735, 0, 0, 3, 7),
	BinaryCharacter('B', 13367286776451, 0, 0, 3, 7),
	BinaryCharacter('C', 30820955865223, 0, 0, 3, 7),
	BinaryCharacter('D', 13367290970755, 0, 0, 3, 7),
	BinaryCharacter('E', 30820960059527, 0, 0, 3, 7),
	BinaryCharacter('F', 4432680992903, 0, 0, 3, 7),
	BinaryCharacter('G', 30959476949127, 0, 0, 3, 7),
	BinaryCharacter('H', 22163388187269, 0, 0, 3, 7),
	BinaryCharacter('I', 30855586152711, 0, 0, 3, 7),
	BinaryCharacter('J', 13263400108295, 0, 0, 3, 7),
	BinaryCharacter('K', 22093582320005, 0, 0, 3, 7),
	BinaryCharacter('L', 30820955865217, 0, 0, 3, 7),
	BinaryCharacter('M', 93086212770463, 0, 0, 5, 7),
	BinaryCharacter('N', 22163383992967, 0, 0, 3, 7),
	BinaryCharacter('O', 8969244459650, 0, 0, 3, 7),
	BinaryCharacter('P', 4432676897415, 0, 0, 3, 7),
	BinaryCharacter('Q', 289378439442547330, 0, 0, 3, 9),
	BinaryCharacter('R', 22163379831427, 0, 0, 3, 7),
	BinaryCharacter('S', 30924852969607, 0, 0, 3, 7),
	BinaryCharacter('T', 8865353597191, 0, 0, 3, 7),
	BinaryCharacter('U', 30959477015173, 0, 0, 3, 7),
	BinaryCharacter('V', 8969244459653, 0, 0, 3, 7),
	BinaryCharacter('W', 137066677881493, 0, 0, 5, 7),
	BinaryCharacter('X', 22059493130501, 0, 0, 3, 7),
	BinaryCharacter('Y', 8865353597189, 0, 0, 3, 7),
	BinaryCharacter('Z', 30820958011911, 0, 0, 3, 7),
	BinaryCharacter('0', 30959477015175, 0, 0, 3, 7),
	BinaryCharacter('1', 30855586152834, 0, 0, 3, 7),
	BinaryCharacter('2', 30820968497671, 0, 0, 3, 7),
	BinaryCharacter('3', 30924853019143, 0, 0, 3, 7),
	BinaryCharacter('4', 17730713502341, 0, 0, 3, 7),
	BinaryCharacter('5', 30924852969607, 0, 0, 3, 7),
	BinaryCharacter('6', 30959481143431, 0, 0, 3, 7),
	BinaryCharacter('7', 17730707194375, 0, 0, 3, 7),
	BinaryCharacter('8', 30959481209479, 0, 0, 3, 7),
	BinaryCharacter('9', 17730707243655, 0, 0, 3, 7),
	BinaryCharacter('a', 1889649159, 0, 2, 3, 5),
	BinaryCharacter('b', 30959477047425, 0, 0, 3, 7),
	BinaryCharacter('c', 1881161863, 0, 2, 3, 5),
	BinaryCharacter('d', 30959477047812, 0, 0, 3, 7),
	BinaryCharacter('e', 1881260679, 0, 2, 3, 5),
	BinaryCharacter('f', 8865364082950, 0, 0, 3, 7),
	BinaryCharacter('g', 30925654147719, 0, 2, 3, 7),
	BinaryCharacter('h', 22163384025217, 0, 0, 3, 7),
	BinaryCharacter('i', 4432676798465, 0, 0, 1, 7),
	BinaryCharacter('j', 146947668550205444, 0, 0, 3, 9),
	BinaryCharacter('k', 22094127579265, 0, 0, 3, 7),
	BinaryCharacter('l', 4432676798593, 0, 0, 1, 7),
	BinaryCharacter('m', 5681531551, 0, 2, 5, 5),
	BinaryCharacter('n', 1352745607, 0, 2, 3, 5),
	BinaryCharacter('o', 1889616519, 0, 2, 3, 5),
	BinaryCharacter('p', 4434295865991, 0, 2, 3, 7),
	BinaryCharacter('q', 17731514614407, 0, 2, 3, 7),
	BinaryCharacter('r', 270549127, 0, 2, 3, 5),
	BinaryCharacter('s', 1887551623, 0, 2, 3, 5),
	BinaryCharacter('t', 8865353679106, 0, 0, 3, 7),
	BinaryCharacter('u', 1889616517, 0, 2, 3, 5),
	BinaryCharacter('v', 547439237, 0, 2, 3, 5),
	BinaryCharacter('w', 8365886101, 0, 2, 5, 5),
	BinaryCharacter('x', 1346404613, 0, 2, 3, 5),
	BinaryCharacter('y', 30925654147717, 0, 2, 3, 7),
	BinaryCharacter('z', 1881178631, 0, 2, 3, 5),
	BinaryCharacter('[', 504970540895715463, 0, -1, 3, 9),
	BinaryCharacter(']', 506672688786375175, 0, -1, 3, 9),
	BinaryCharacter('{', 433480329219571974, 0, -1, 3, 9),
	BinaryCharacter('}', 217307547911094531, 0, -1, 3, 9),
	BinaryCharacter('(', 289365106781880580, 0, -1, 3, 9),
	BinaryCharacter(')', 73192428558909697, 0, -1, 3, 9),
	BinaryCharacter('<', 1077952772, 0, 2, 3, 5),
	BinaryCharacter('>', 272695553, 0, 2, 3, 5),
	BinaryCharacter('/', 72625011298468356, 0, -1, 3, 9),
	BinaryCharacter('\\', 290499837411999873, 0, -1, 3, 9),
	BinaryCharacter('|', 72624976668147841, 0, -1, 1, 9),
	BinaryCharacter('?', 8796642542215, 0, 0, 3, 7),
	BinaryCharacter(':', 270532737, 0, 2, 1, 5),
	BinaryCharacter(';', 34900803842, 0, 2, 2, 6),
	BinaryCharacter('"', 645, 0, 0, 3, 2),
	BinaryCharacter('\'', 129, 0, -1, 1, 2),
	BinaryCharacter('.', 1, 0, 6, 1, 1),
	BinaryCharacter(',', 16642, 0, 6, 2, 3),
	BinaryCharacter('!', 4398317060225, 0, 0, 1, 7),
	BinaryCharacter('@', 9152430092158722303, 0, -1, 7, 9),
	BinaryCharacter('#', 44332405474570, 0, 0, 5, 7),
	BinaryCharacter('$', 305770481164832644, 0, -1, 5, 9),
	BinaryCharacter('%', 110845061367187, 0, 0, 5, 7),
	BinaryCharacter('^', 642, 0, 0, 3, 3),
	BinaryCharacter('&', 131979794367622, 0, 0, 5, 7),
	BinaryCharacter('*', 1103611652, 0, 0, 5, 5),
	BinaryCharacter('-', 7, 0, 3, 3, 1),
	BinaryCharacter('_', 31, 0, 6, 5, 1),
	BinaryCharacter('+', 33666, 0, 2, 3, 3),
	BinaryCharacter('=', 114695, 0, 2, 3, 3),
	BinaryCharacter('`', 257, 0, 0, 2, 2),
	BinaryCharacter('~', 133762, 0, 2, 5, 3),
	BinaryCharacter(0.toChar(), 9188194313781141759, 0, -1, 7, 9),
)