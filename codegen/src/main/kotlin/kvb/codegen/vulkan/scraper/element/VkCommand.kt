package kvb.codegen.vulkan.scraper.element

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.type.VkType

class VkCommand(
	override val name : String,
	val type          : Type,
	val returnType    : VkType?,
	val params        : VkElementList<VkVar>,
	val isAliased     : Boolean
) : VkGenElement {


	/*
	Gen implementation
	 */



	override val shouldGen = VkGenUtils.shouldGenCommand(this)

	override val genName = VkGenUtils.commandShortName(name)



	enum class Type {
		INSTANCE,
		DEVICE,
		STANDALONE;
	}


}