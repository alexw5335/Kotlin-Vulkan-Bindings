package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

class VkEnumEntry(
	override val name : String,
	val valueString   : String,
	val enum          : VkTypeEnum,
	val extension     : VkExtension?,
	val isAliased     : Boolean
) : VkNamed {


	val value = if(valueString.startsWith("0x"))
		valueString.drop(2).toLong(16)
	else
		valueString.toLong()



	val shouldGen = !isAliased && (extension == null || extension.shouldGen)

	val genName = VkGenUtils.enumEntryShortName(name, enum)


}