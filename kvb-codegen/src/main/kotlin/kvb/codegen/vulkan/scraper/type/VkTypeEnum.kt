package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.VkGenUtils.dropVkAndPostfix
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.writer.procedural.Primitive

class VkTypeEnum(
	override val name: String,
	val isFlagBits: Boolean,
	val is64Bit: Boolean
) : VkType {


	/*
	Type implementation
	 */



	override val primitive = if(is64Bit) Primitive.LONG else Primitive.INT

	override val shouldGen = name != "VkStructureType"

	override val genName = when {
		!shouldGen -> primitive.kName
		isFlagBits -> name.replace("FlagBits", "Flags").dropVkAndPostfix
		else       -> name.dropVkAndPostfix
	}



	/*
	Properties
	 */



	val entries = VkElementList<VkEnumEntry>()

	var bitmask: VkTypeBitmask? = null


}