package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.GenUtils
import kvb.codegen.vulkan.scraper.GenUtils.dropVkAndPostfix
import kvb.codegen.vulkan.scraper.Named
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.list.NamedList
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

	override val shouldGen = name != "VkStructureType" && !GenUtils.emptyEnums.contains(name)

	override val genName = when {
		!shouldGen -> primitive.kName
		isFlagBits -> name.replace("FlagBits", "Flags").dropVkAndPostfix
		else       -> name.dropVkAndPostfix
	}




	/*
	Properties
	 */



	val entries = NamedList<VkEnumEntry>()

	val aliasedEntries = NamedList<AliasedEntry>()

	val prefix = GenUtils.enumPrefix(this)

	val isValue = name == "VkResult" || name == "VkObjectType" || name == "VkFormat"



	class AliasedEntry(override val name: String, val alias: String) : Named


}