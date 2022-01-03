package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.Postfix
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.type.VkType
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

object VkMetaGenerator {


	fun printPostfixedNames(types: Iterable<VkType>, providers: Iterable<VkProvider>) {
		val postfixed = HashSet<String>()
		val nameMap = HashMap<String, String>()

		fun addName(name: String) {
			val shortName = Postfix.drop(name)

			nameMap[shortName]?.let {
				postfixed.add(it)
				postfixed.add(name)
			}

			nameMap[shortName] = name
		}

		for(type in types) {
			addName(type.name)

			if(type is VkTypeEnum)
				for(entry in type.entries)
					if(entry.shouldGen)
						addName(entry.name)
		}

		for(provider in providers)
			for(command in provider.commands)
				if(command.shouldGen)
					addName(command.name)

		println("Postfixed Names")

		for(name in postfixed.sorted())
			println("\"$name\",")
	}



	fun printEmptyEnums(enums: Iterable<VkTypeEnum>) {
		println("\nEmpty Types")

		for(e in enums)
			if(e.entries.isEmpty())
				println("\"${e.name}\",")
	}


}