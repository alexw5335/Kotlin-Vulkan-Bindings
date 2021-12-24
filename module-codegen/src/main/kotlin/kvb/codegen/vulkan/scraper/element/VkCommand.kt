package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.VkGenUtils.dropVkAndPostfix
import kvb.codegen.vulkan.scraper.type.VkType

class VkCommand(
	override val name      : String,
	val type               : Type,
	val returnType         : VkType?,
	val params             : List<VkVar>,
	val isAliased          : Boolean
) : VkNamed {


	enum class Type {
		INSTANCE,
		DEVICE,
		STANDALONE;
	}



	val shouldGen = !isAliased && name != "vkGetInstanceProcAddr"

	val genName = name.dropVkAndPostfix.replaceFirstChar { it.lowercase() }


}