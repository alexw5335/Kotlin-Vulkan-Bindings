package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.GenUtils
import kvb.codegen.vulkan.scraper.GenUtils.dropVkAndPostfix
import kvb.codegen.writer.procedural.Primitive

class VkTypeBitmask(
	override val name: String,
	val is64Bit: Boolean,
	val enumName: String?
): VkType {


	/*
	Type implementation
	 */



	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	override val shouldGen = enumName != null && !GenUtils.emptyEnums.contains(enumName)

	override val genName = if(shouldGen) name.dropVkAndPostfix else primitive.kName



	/*
	Properties
	 */



	val implemented = enumName != null

	var enum: VkTypeEnum? = null


}