package kvb.codegen.vulkan

import kvb.codegen.metaDir
import kvb.codegen.vulkan.scraper.VkPostfix
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.element.VkElement
import kvb.codegen.vulkan.scraper.type.VkType
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.vulkanDir
import kvb.codegen.writer.KWriter

object VkNamingGenerator {


	fun generate(elements: Iterable<VkElement>) {
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

		for(element in elements) {
			addName(element.name)

			if(element is VkTypeEnum)
				for(entry in element.entries)
					if(entry.shouldGen)
						addName(entry.name)
		}

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