package kvb.codegen.vulkan

import kvb.codegen.GenConfig
import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.writer.KWriter
import java.nio.file.Path

object VkEnumGenerator {


	fun generate(directory: Path, enums: Iterable<VkTypeEnum>) {
		for(e in enums)
			if(e.shouldGen && !e.isFlagBits)
				if(VkGenUtils.extraGenEnums.contains(e.name))
					printValueEnum(directory, e)
				else
					printPlainEnum(directory, e)
	}



	private fun printPlainEnum(directory: Path, enum: VkTypeEnum) = KWriter.write(directory, enum.genName) {
		start {
			autogenComment()
			package_(GenConfig.enumPackage)
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



	private fun printValueEnum(directory: Path, enum: VkTypeEnum) = KWriter.write(directory, enum.genName) {
		start {
			autogenComment()
			package_(GenConfig.enumPackage)
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused", "propertyName")
		annotation("JvmInline")
		class_("value class ${enum.genName}(val value: Int)") {
			function("override fun toString() = when(value)") {
				for(entry in entries)
					writeln("${entry.valueString} -> \"${entry.genName}\"")
				writeln("else -> \"*INVALID*\"")
			}

			companion_(noStyle) {
				for(entry in entries)
					writeln("val ${entry.genName} = ${enum.genName}(${entry.valueString})")
			}
		}
	}


}