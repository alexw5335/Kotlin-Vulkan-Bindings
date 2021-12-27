package scraper.type

import scraper.Primitive

class VkBitmask(
	override val name: String,
	val is64Bit: Boolean
) : VkType {

	
	override val primitive = if(is64Bit)
		Primitive.LONG
	else
		Primitive.INT


}