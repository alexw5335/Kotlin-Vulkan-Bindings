package kvb.fontcreator

import kvb.core.Platforms
import kvb.vkwrapper.shader.ShaderCreation
import java.nio.file.Files
import java.nio.file.Paths



/*
TODO: Another wrapper layer that has a global instance and device, which allows for global function calls.
TODO: Simplify JNI bindings to not include vulkan.h, with custom function pointers using only primitives.
 */



fun main() {
	//ShaderCreation.compileAll("res/shader/font_creator", "res/shader/font_creator/out")
	Platforms.init()
	FontCreator.run()
}



val characters = listOf(
	BinaryCharacter('A', 4803839837409567, 0, 0),
	BinaryCharacter('B', 4240889615552783, 0, 0),
	BinaryCharacter('C', 8445353124757790, 0, 0),
	BinaryCharacter('D', 4240889649107215, 0, 0),
	BinaryCharacter('E', 8726828336349471, 0, 0),
	BinaryCharacter('F', 282579035029791, 0, 0),
	BinaryCharacter('G', 3959414805565710, 0, 0),
	BinaryCharacter('H', 4803839837409553, 0, 0),
	BinaryCharacter('I', 8730139571782687, 0, 0),
	BinaryCharacter('J', 1975839642354719, 0, 0),
	BinaryCharacter('K', 4794991734229265, 0, 0),
	BinaryCharacter('L', 8726828101468417, 0, 0),
	BinaryCharacter('M', 5934154803123487, 0, 0),
	BinaryCharacter('N', 4803839602528543, 0, 0),
	BinaryCharacter('O', 3959414672396558, 0, 0),
	BinaryCharacter('P', 282579036082447, 0, 0),
	BinaryCharacter('Q', 6202418393059598, 0, 0),
	BinaryCharacter('R', 4794991936344335, 0, 0),
	BinaryCharacter('S', 4239785791127838, 0, 0),
	BinaryCharacter('T', 1130315200594975, 0, 0),
	BinaryCharacter('U', 8744489276477713, 0, 0),
	BinaryCharacter('V', 1136968323895569, 0, 0),
	BinaryCharacter('W', 8748904570230037, 0, 0),
	BinaryCharacter('X', 4796086967601681, 0, 0),
	BinaryCharacter('Y', 1130315200596497, 0, 0),
	BinaryCharacter('Z', 8726832447229983, 0, 0),
	BinaryCharacter('0', 8744489343586591, 0, 0),
	BinaryCharacter('1', 8730139571848708, 0, 0),
	BinaryCharacter('2', 8726828605771807, 0, 0),
	BinaryCharacter('3', 8743385704697887, 0, 0),
	BinaryCharacter('4', 4521261054103825, 0, 0),
	BinaryCharacter('5', 8743385703711007, 0, 0),
	BinaryCharacter('6', 8744489510306079, 0, 0),
	BinaryCharacter('7', 4521260802379807, 0, 0),
	BinaryCharacter('8', 8744489511358751, 0, 0),
	BinaryCharacter('9', 8743385704763679, 0, 0),
	BinaryCharacter('a', 6220010579951616, 0, 0),
	BinaryCharacter('b', 4240889648972033, 0, 0),
	BinaryCharacter('c', 8445353126658048, 0, 0),
	BinaryCharacter('d', 8463014300618768, 0, 0),
	BinaryCharacter('e', 8445413523587072, 0, 0),
	BinaryCharacter('f', 1130315202364440, 0, 0),
	BinaryCharacter('g', 3959410595533070, 2, 0),
	BinaryCharacter('h', 4803839602393345, 0, 0),
	BinaryCharacter('i', 8730139571912708, 0, 0),
	BinaryCharacter('j', 568464760569860, 0, 0),
	BinaryCharacter('k', 7042384946331905, 0, 0),
	BinaryCharacter('l', 7885714641650695, 0, 0),
	BinaryCharacter('m', 5934154802659328, 0, 0),
	BinaryCharacter('n', 4803839602327552, 0, 0),
	BinaryCharacter('o', 3959414672195584, 0, 0),
	BinaryCharacter('p', 282579036082446, 2, 0),
	BinaryCharacter('q', 4521261037326606, 2, 0),
	BinaryCharacter('r', 282579069435904, 0, 0),
	BinaryCharacter('s', 4239776984989696, 0, 0),
	BinaryCharacter('t', 1130315202364420, 0, 0),
	BinaryCharacter('u', 3959414672392192, 0, 0),
	BinaryCharacter('v', 1136968323891200, 0, 0),
	BinaryCharacter('w', 3963829966143488, 0, 0),
	BinaryCharacter('x', 4796087069114368, 0, 0),
	BinaryCharacter('y', 3959410595533073, 2, 0),
	BinaryCharacter('z', 8727940617404416, 0, 0),
	BinaryCharacter('[', 1971428660412679, 0, 1),
	BinaryCharacter(']', 1974740130726919, 0, 1),
	BinaryCharacter('{', 1691057490362886, 0, 1),
	BinaryCharacter('}', 846632610562563, 0, 1),
	BinaryCharacter('(', 1128103241908740, 0, 1),
	BinaryCharacter(')', 283691247206913, 0, 1),
	BinaryCharacter('<', 103179945496, 0, 0),
	BinaryCharacter('>', 13087280131, 0, 0),
	BinaryCharacter('/', 283682657536016, 0, 0),
	BinaryCharacter('\\', 4512430147371521, 0, 0),
	BinaryCharacter('|', 282578800148737, 0, 2),
	BinaryCharacter('?', 1125917221982478, 0, 0),
	BinaryCharacter(':', 4311744769, 2, 2),
	BinaryCharacter(';', 1108135117314, 2, 1),
	BinaryCharacter('"', 1285, 0, 1),
	BinaryCharacter('\'', 257, 0, 2),
	BinaryCharacter('.', 1, 6, 2),
	BinaryCharacter(',', 66050, 6, 1),
	BinaryCharacter('!', 422768688595201, 0, 2),
	BinaryCharacter('@', 8725853497593871, 0, 0),
	BinaryCharacter('#', 2825878197176842, 0, 0),
	BinaryCharacter('$', 1142478715821572, 0, 0),
	BinaryCharacter('%', 7065470377659155, 0, 0),
	BinaryCharacter('^', 1116676, 0, 0),
	BinaryCharacter('&', 6202435320482054, 0, 0),
	BinaryCharacter('*', 17416785412, 1, 0),
	BinaryCharacter('-', 31, 3, 0),
	BinaryCharacter('_', 31, 6, 0),
	BinaryCharacter('+', 17249010692, 1, 0),
	BinaryCharacter('=', 2031647, 3, 0),
	BinaryCharacter('`', 131329, 0, 2),
	BinaryCharacter('~', 529666, 3, 0)
)