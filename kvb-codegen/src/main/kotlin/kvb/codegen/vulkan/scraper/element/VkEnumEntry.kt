package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

class VkEnumEntry(
	override val name : String,
	val valueString   : String,
	val enum          : VkTypeEnum,
	val isAliased     : Boolean
) : VkProvidedElement {


	val value = if(valueString.startsWith("0x"))
		valueString.drop(2).toLong(16)
	else
		valueString.toLong()



	/*
	Generation implementation
	 */



	override val genName = VkGenUtils.enumEntryShortName(name, enum)

	override val shouldGen get() = VkGenUtils.shouldGenEnumEntry(this)



	/*
	Lateinit
	 */



	var provider: VkProvider? = null


}