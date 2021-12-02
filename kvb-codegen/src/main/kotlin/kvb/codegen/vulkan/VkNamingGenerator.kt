package kvb.codegen.vulkan

import kvb.codegen.metaDir
import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.element.VkElement
import kvb.codegen.vulkan.scraper.element.VkProvider
import kvb.codegen.vulkan.scraper.type.VkType
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.vulkanDir
import kvb.codegen.writer.KWriter

object VkNamingGenerator {


	fun generate(types: Iterable<VkType>, providers: Iterable<VkProvider>) {
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

		writeNames(postfixed)
	}



	private fun writeNames(names: Iterable<String>) = KWriter.write(metaDir, "VkPostfixed") {
		start {
			autogenComment()
			package_("kvb.codegen.vulkan.scraper")
		}

		declaration {
			writeln("val postfixed = hashSetOf(")
			indented {
				for(name in names)
					writeln("\"$name\",")
			}
			writeln(')')
		}
	}


}