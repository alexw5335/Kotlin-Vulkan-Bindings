package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.type.VkType

class VkCommand(
	override val name      : String,
	override val shortName : String,
	val type               : Type,
	val returnType         : VkType?,
	val params             : VkElementList<VkVar>,
	val isAliased          : Boolean
) : VkElement {


	enum class Type {
		INSTANCE,
		DEVICE,
		STANDALONE;
	}


}