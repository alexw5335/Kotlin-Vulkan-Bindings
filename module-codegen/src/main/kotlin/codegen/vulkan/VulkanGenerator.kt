package codegen.vulkan

import codegen.vulkan.scrape.ScrapedRegistry
import codegen.writer.KWriter
import java.nio.file.Path

class VulkanGenerator(
	private val registry: ScrapedRegistry,
	private val directory: Path,
	private val packageName: String,
) {


	private val underscoredFileComment =
		"This file's name has been prefixed with '_' so that it appears at the top of the package."

	private inline fun write(name: String, block: KWriter.() -> Unit) = KWriter.write(directory, name, block)



	fun genConstants() = write("_Constants") {
		start {
			autogenComment()
			comment(underscoredFileComment)
			suppressFile("Unused")
			package_(packageName)
		}

		styled(style(1, 0)) {
			for(constant in registry.constants)
				if(constant.shouldGen)
					declaration("const val ${constant.genName} = ${constant.value}")
		}
	}



	fun genEnumConstructors() = write("_Enums") {
		start {
			autogenComment()
			comment(underscoredFileComment)
			suppressFile("Unused", "FunctionName")
			package_(packageName)
		}

		styled(style(1, 0)) {
			for() {

			}
		}
	}



}