package kvb.codegen.vulkan

import kvb.codegen.vulkan.VkGenerator.shortName
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
	Element short names
	 */



	private val typeShortNames = ShortNameList()

	private val commandShortNames = ShortNameList()



	private val VkType.shortName get() = typeShortNames.shortName(name).drop(2)

	private val VkCommand.shortName get() = commandShortNames.shortName(name).drop(2).replaceFirstChar { it.lowercase() }

	private val VkEnumEntry.shortName get() = VkGenUtils.enumEntryShortName(name, enum)
	

	// TODO: Make genName and shouldGen top-level functions in VkGenerator?

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
				typeShortNames.add(t.name)
				types.add(t)
			}

			for(c in p.commands) {
				commandShortNames.add(c.name)
				commands.add(c)
			}
		}

		for(t in types) t.genName = t.genName(t.shortName)
		for(c in commands) c.genName = c.genName(c.shortName)
	}


}