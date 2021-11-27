package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.type.VkType

class VkCommand(
	override val name      : String,
	val type               : Type,
	val returnType         : VkType?,
	val params             : List<VkVar>,
	val isAliased          : Boolean
) : VkGenElement {


	enum class Type {
		INSTANCE,
		DEVICE,
		STANDALONE;
	}



	override lateinit var genName: String

	override val shouldGen = !isAliased


}