package kvb.codegen.vulkan

import kvb.codegen.enumDir
import kvb.codegen.enumPackage
import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.writer.KWriter

object VkEnumGenerator {


	fun generate(enums: Iterable<VkTypeEnum>) {
		for(e in enums)
			if(e.shouldGen && !e.isFlagBits)
				if(VkGenUtils.extraGenEnums.contains(e.name))
					printValueEnum(e)
				else
					printPlainEnum(e)
	}



	private fun printPlainEnum(enum: VkTypeEnum) = KWriter.write(enumDir, enum.genName) {
		start {
			autogenComment()
			package_(enumPackage)
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused")
		class_("enum class ${enum.genName}(val value: Int)") {
			enums(entries.map {
				"${it.genName}(${it.valueString})"
			})
		}
	}



	private fun printValueEnum(enum: VkTypeEnum) = KWriter.write(enumDir, enum.genName) {
		start {
			autogenComment()
			package_(enumPackage)
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused", "propertyName")
		annotation("JvmInline")
		class_("value class ${enum.genName}(val value: Int)") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = ${enum.genName}(${entry.valueString})")
			}

			function("override fun toString() = when(value)") {
				for(entry in entries)
					writeln("${entry.valueString} -> \"${entry.genName}\"")
				writeln("else -> \"*INVALID*\"")
			}
		}
	}


}