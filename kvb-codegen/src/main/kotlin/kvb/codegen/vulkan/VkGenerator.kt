package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.element.*
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import kvb.codegen.vulkan.scraper.type.*
import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

object VkGenerator {


	/*
	Should generate elements
	 */



	val VkType.shouldGen: Boolean get() = when(this) {
		is VkTypeBitmask  -> implemented && (enum?.entries?.isNotEmpty() ?: false)
		is VkTypeEnum     -> entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)
		is VkTypeStruct   -> true
		is VkTypeHandle   -> true
		else              -> false
	}



	val VkProvider.shouldGen   get() = this !is VkExtension || (deprecatedBy == null && !disabled)

	val VkCommand.shouldGen    get() = !isAliased && name != "vkGetInstanceProcAddr"

	val VkEnumEntry.shouldGen  get() = !isAliased && provider.shouldGen

	val VkConstant.shouldGen   get() = !isAliased



	/*
	Element short names
	 */


	/**
	 * A map of element short names to their full names. Used to identify elements that share the same short name so
	 * that they are generated with their unique full names.
	 */
	private val elementsByShortName = HashMap<String, String>()

	/**
	 * Elements that should keep their extension postfix when being generated.
	 */
	private val postfixedElements = HashSet<String>()

	/**
	 * Trims the starting 'Vk' or 'vk' prefix and the trailing extension postfix. If removing the postfix would cause
	 * naming clashes with another element's short name, then the postfix is not removed.
	 */
	val String.trimVkAndPostfix get() = if(postfixedElements.contains(this))
		drop(2)
	else
		substring(2, length - VkPostfix.postfixLength(this))



	val VkType.shortName get() = when(this) {
		is VkTypeBitmask,
		is VkTypeEnum,
		is VkTypeHandle,
		is VkTypeStruct  -> name.trimVkAndPostfix
		else             -> name
	}



	val VkCommand.shortName get() = name.trimVkAndPostfix.replaceFirstChar { it.lowercase() }

	val VkConstant.shortName get() = name.drop(3)

	val VkEnumEntry.shortName get() = VkGenUtils.enumEntryShortName(name, enum)
	


	/*
	Scraping
	 */



	val scraper = VkScraper.scrape("vk.xml")

	val providers = VkProviderList()

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