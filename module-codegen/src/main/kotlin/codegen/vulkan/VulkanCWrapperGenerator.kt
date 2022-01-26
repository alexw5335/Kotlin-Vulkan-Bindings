package codegen.vulkan

import codegen.vulkan.scrape.BitmaskType
import codegen.vulkan.scrape.EnumType
import codegen.vulkan.scrape.HandleType
import codegen.vulkan.scrape.ScrapedRegistry
import codegen.writer.CWriter
import java.nio.file.Files
import java.nio.file.Path


class VulkanCWrapperGenerator(private val registry: ScrapedRegistry, private val directory: Path) {


	init { Files.createDirectories(directory) }



	val handles = registry.types.filterIsInstance<HandleType>()

	val enums = registry.types.filterIsInstance<EnumType>()

	val bitmasks = registry.types.filterIsInstance<BitmaskType>()



	fun genDef() = CWriter.writeHeader(directory, "vk_def") {
		multilineDeclaration("""
			#pragma clang diagnostic push
			#pragma ide diagnostic ignored "OCUnusedGlobalDeclarationInspection"
			#pragma once
		""")

		group("Handles", 0) {
			for(handle in handles) {
				declaration("typedef struct ${handle.name}_T* ${handle.name}")
			}
		}

		for(enum in enums) {
			declaration(noStyle) {
				write("typedef enum ${enum.name}")
				braced {
					for((index, entry) in enum.entries.withIndex()) {
						if(index != enum.entries.size - 1)
							writeln("${entry.name} = ${entry.value},")
						else
							writeln("${entry.name} = ${entry.value}")
					}
				}
			}
		}
	}


}