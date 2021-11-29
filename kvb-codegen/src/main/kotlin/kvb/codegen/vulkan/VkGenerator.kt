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


	/**
	 * Used to identify conflicting short names.
	 */
	private class ShortNameList {


		/**
		 * A set of full names that should keep their postfixes.
		 */
		private val postfixed = HashSet<String>()

		/**
		 * A map of short names to full names.
		 */
		private val nameMap = HashMap<String, String>()




		/**
		 * Adds a full [name] to the [nameMap], checking if the name's short version is already present. If it is, then
		 * [name] is added to the [postfixed] set to signify that it should keep its postfix.
		 */
		fun add(name: String) {
			val shortName = VkPostfix.drop(name)

			nameMap[shortName]?.let {
				postfixed.add(it)
				postfixed.add(name)
			}

			nameMap[shortName] = name
		}



		/**
		 * Returns the [name] without an extension postfix if the postfix-less version of the name has been determined
		 * to not conflict with that of any other name in this list. Otherwise, returns the [name].
		 */
		fun shortName(name: String) = if(postfixed.contains(name)) name else VkPostfix.drop(name)


	}



	private val typeShortNames = ShortNameList()

	private val commandShortNames = ShortNameList()



	/*
	Should gen
	 */



	val VkProvider.shouldGen get() = this !is VkExtension || (!disabled && deprecatedBy == null)

	val VkCommand.shouldGen get() = !isAliased && name != "vkGetInstanceProcAddr"

	val VkType.shouldGen: Boolean get() = when(this) {
		is VkTypeBitmask -> implemented && enum != null && enum!!.entries.isNotEmpty()
		is VkTypeEnum    -> entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)
		is VkTypeStruct  -> true
		is VkTypeHandle  -> true
		else             -> false
	}

	val VkEnumEntry.shouldGen get() = !isAliased && provider.shouldGen



	/*
	Gen names
	 */



	/**
	 * The generated name of this command. Example: vkPresentQueueKHR -> presentQueue.
	 */
	val VkCommand.genName get() = commandShortNames
		.shortName(name)
		.drop(2)
		.replaceFirstChar { it.lowercase() }



	/**
	 * The generated name of this enum entry. Example:  VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_NV -> PREPROCESS_WRITE.
	 */
	val VkEnumEntry.genName: String get() {
		// There are about 4 exceptional entries in the registry that don't start with their enum's entry prefix.
		// There is also the VkResult enum that is only prefixed by VK_.
		// In these cases, remove the VK_. Otherwise, remove the whole prefix.
		val prefixLength = if(!name.startsWith(enum.prefix)) 3 else enum.prefix.length

		// Some types should not have their extensions removed due to naming conflicts.
		var shortName = if(VkGenUtils.postfixedTypes.contains(name))
			name.drop(prefixLength)
		else
			name.drop(prefixLength).dropLast(VkPostfix.postfixUnderscoreLength(name))

		// Java enums cannot start with digits, prefix with '_'.
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums.
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		return shortName
	}



	/**
	 * The generated name of this type. Example: VkPresentInfoKHR -> PresentInfo.
	 */
	val VkType.genName: String get() {
		val shortName = typeShortNames.shortName(name).drop(2)

		return when(this) {
			is VkTypeStruct  -> shortName
			is VkTypeHandle  -> shortName + 'H'

			is VkTypeEnum    -> when {
				isFlagBits   -> bitmask!!.genName
				!shouldGen   -> primitive.kName
				else         -> shortName
			}

			is VkTypeBitmask -> when {
				!shouldGen   -> primitive.kName
				else         -> shortName
			}

			else             -> name
		}
	}



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
	}


}