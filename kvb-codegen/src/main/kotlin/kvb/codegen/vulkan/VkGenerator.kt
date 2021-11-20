package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.element.*
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import kvb.codegen.vulkan.scraper.type.*

object VkGenerator {


	val VkType.shouldGen: Boolean get() = when(this) {
		is VkTypeBitmask  -> implemented && enum?.entries?.isNotEmpty() ?: false
		is VkTypeEnum     -> entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)
		is VkTypeStruct   -> true
		is VkTypeHandle   -> true
		else              -> false
	}



	val VkProvider.shouldGen   get() = this !is VkExtension || (deprecatedBy == null && !disabled)

	val VkCommand.shouldGen    get() = !isAliased && name != "vkGetInstanceProcAddr"

	val VkEnumEntry.shouldGen  get() = !isAliased && provider.shouldGen

	val VkConstant.shouldGen   get() = !isAliased

	val String.trimVkAndPostfix get() = if(postfixedElements.contains(this))
		drop(2)
	else
		substring(2, length - VkPostfix.postfixLength(this))

	val VkType.shortName: String get() = when(this) {
		is VkTypeBitmask -> name.trimVkAndPostfix
		is VkTypeEnum    -> name.trimVkAndPostfix
		is VkTypeHandle  -> name.trimVkAndPostfix
		is VkTypeStruct  -> name.trimVkAndPostfix
		else             -> name
	}




	val scraper = VkScraper.scrape("vk.xml")

	val providers = VkProviderList()

	val elementsByShortName = HashMap<String, String>()

	val postfixedElements = HashSet<String>()

	val commands = VkElementList<VkCommand>()

	val types = VkTypeList()



	private fun addCommand(command: VkCommand) {
		elementsByShortName[command.shortName]?.let {
			postfixedElements.add(it)
			postfixedElements.add(command.name)
		}

		elementsByShortName[command.shortName] = command.name

		commands.add(command)
	}



	private fun addType(type: VkType) {
		elementsByShortName[type.shortName]?.let {
			postfixedElements.add(it)
			postfixedElements.add(type.name)
		}

		elementsByShortName[type.shortName] = type.name

		types.add(type)
	}



	init {
		for(p in scraper.providers)
			if(p.shouldGen)
				providers.add(p)

		for(p in providers)
			for(c in p.commands)
				if(c.shouldGen)
					addCommand(c)

		for(p in providers)
			for(t in p.types)
				if(t.shouldGen)
					addType(t)
	}


}