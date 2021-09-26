package vulkan.generation

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import vulkan.scraper.element.VkApiConstant
import java.nio.file.Path
import kotlin.io.path.div

object VkConstantsGenerator {


	fun generate(directory: Path, packageName: String, constants: Iterable<VkApiConstant>) {
		writeConstants(directory, packageName, constants)
	}



	private fun writeConstants(
		directory: Path,
		packageName: String,
		constants: Iterable<VkApiConstant>
	) = KWriter(directory/"VkConstants.kt").with {
		start {
			autogenComment()
			package_(packageName)
		}

		class_("object VkConstants", style(1, 2)) {
			for(c in constants) {
				when {
					c.intValue   != null -> declaration("const val ${c.shortName} = ${c.intValue}")
					c.longValue  != null -> declaration("const val ${c.shortName} = ${c.longValue}L")
					c.floatValue != null -> declaration("const val ${c.shortName} = ${c.floatValue}F")
				}
			}

		}
	}


}