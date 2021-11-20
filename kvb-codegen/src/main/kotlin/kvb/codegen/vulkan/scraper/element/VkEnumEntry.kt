package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

class VkEnumEntry(
	override val name : String,
	val valueString   : String,
	val enum          : VkTypeEnum,
	val isAliased     : Boolean
) : VkElement {


	val value = if(valueString.startsWith("0x"))
		valueString.drop(2).toLong(16)
	else
		valueString.toLong()



	val shortName = VkGenUtils.enumEntryShortName(name, enum)

	lateinit var provider: VkProvider


}