package kvb.codegen.vulkan

import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.VkNamingUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter

object VkEnumGenerator {


	fun generate(enums: Iterable<VkTypeEnum>) {
		printEnumConstructors(enums)

		for(e in enums)
			if(e.shouldGen && !e.isFlagBits)
				if(e.isValue)
					printValueEnum(e)
				else
					printPlainEnum(e)
	}



	private fun printEnumConstructors(enums: Iterable<VkTypeEnum>) = KWriter.write(vulkanDir, "_Enums") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			suppressFile("Unused", "FunctionName")
			package_(vulkanPackage)
		}

		styled(style(1, 0)) {
			for(e in enums) {
				if(e.isFlagBits || e.isValue) continue

				declaration {
					write("internal fun _${e.genName}(value: Int) = when(value)")
					braced {
						for(entry in e.entries) {
							if(!entry.shouldGen) continue
							writeln("${entry.valueString} -> ${e.genName}.${entry.genName}")
						}
						writeln("else -> throw RuntimeException(\"Invalid enum: \$value\")")
					}
				}
			}
		}
	}



	private fun printPlainEnum(enum: VkTypeEnum) = KWriter.write(vulkanDir, enum.genName) {
		start {
			autogenComment()
			package_(vulkanPackage)
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



	private fun printValueEnum(enum: VkTypeEnum) = KWriter.write(vulkanDir, enum.genName) {
		start {
			autogenComment()
			package_(vulkanPackage)
		}

		val entries = enum.entries.filter { it.shouldGen }

		doc(enum.docStrings)
		suppress("unused")
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