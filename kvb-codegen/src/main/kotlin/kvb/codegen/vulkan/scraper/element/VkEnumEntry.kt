package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

class VkEnumEntry(
	override val name : String,
	val valueString   : String,
	val enum          : VkTypeEnum,
	val isAliased     : Boolean
) : VkGenElement {


	val value = if(valueString.startsWith("0x"))
		valueString.drop(2).toLong(16)
	else
		valueString.toLong()



	lateinit var provider: VkProvider

	override lateinit var genName: String

	override val shouldGen get() = !isAliased && provider.shouldGen


}