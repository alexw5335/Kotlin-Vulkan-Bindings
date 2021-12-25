package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.Named
import kvb.codegen.vulkan.scraper.GenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

class VkEnumEntry(
	override val name : String,
	val valueString   : String,
	val enum          : VkTypeEnum,
	val extension     : VkExtension?,
) : Named {


	val value = if(valueString.startsWith("0x"))
		valueString.drop(2).toLong(16)
	else
		valueString.toLong()



	val shouldGen = extension == null || extension.shouldGen

	val genName = GenUtils.enumEntryShortName(name, enum)


}