package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.type.VkType
import kvb.codegen.vulkan.scraper.type.VkTypeEnum

object VkPostfixedGenerator {


	fun printPostfixedNames(types: Iterable<VkType>, providers: Iterable<VkProvider>) {
		val postfixed = HashSet<String>()
		val nameMap = HashMap<String, String>()

		fun addName(name: String) {
			val shortName = VkPostfix.drop(name)

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
				if(!command.shouldGen)
					addName(command.name)

		for(name in postfixed.sorted())
			println("\"$name\",")
	}


}