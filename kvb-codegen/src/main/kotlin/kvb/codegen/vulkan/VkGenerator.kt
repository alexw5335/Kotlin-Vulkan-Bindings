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


	private class ShortNameList {

		/**
		 * A set of full names that should keep their postfixes.
		 */
		private val postfixed = HashSet<String>()

		/**
		 * A map of short names to full names.
		 */
		private val nameMap = HashMap<String, String>()

		fun add(name: String) {
			val shortName = VkPostfix.drop(name)

			nameMap[shortName]?.let {
				postfixed.add(it)
				postfixed.add(name)
			}

			nameMap[shortName] = name
		}

		fun contains(name: String) = postfixed.contains(name)

		fun shortName(name: String) = if(postfixed.contains(name)) name else VkPostfix.drop(name)

	}



	/*
	If elements should be generated
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



	private val typeShortNames = ShortNameList()

	private val commandShortNames = ShortNameList()



	val VkType.shortName get() = when(this) {
		is VkTypeBitmask,
		is VkTypeEnum,
		is VkTypeHandle,
		is VkTypeStruct  -> if(typeShortNames.contains(name))
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



	init {
		for(p in scraper.providers) {
			if(!p.shouldGen) continue

			providers.add(p)

			for(t in p.types) {
				typeShortNames.add(VkPostfix.drop(t.name))
				types.add(t)
			}

			for(c in p.commands) {
				commandShortNames.add(VkPostfix.drop(c.name))
				commands.add(c)
			}
		}
	}


}