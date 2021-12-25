package scraper.type

import scraper.Primitive

class VkEnum(
	override val name : String,
	val is64Bit       : Boolean,
	val isFlagBits    : Boolean
) : VkType {


	override val primitive = if(is64Bit)
		Primitive.LONG
	else
		Primitive.INT


}