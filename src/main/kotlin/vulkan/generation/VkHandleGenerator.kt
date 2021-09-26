package vulkan.generation

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import memory.type.Addressable
import vulkan.scraper.type.VkTypeHandle
import java.nio.file.Path
import kotlin.io.path.div

object VkHandleGenerator {


	fun generate(directory: Path, packageName: String, handles: Iterable<VkTypeHandle>) {
		for(h in handles)
			printHandle(directory, packageName, h)
	}



	private fun printHandle(
		directory: Path,
		packageName: String,
		handle: VkTypeHandle
	) = KWriter(directory/"${handle.genName}.kt").with {

		start {
			autogenComment()
			package_(packageName)
			qualifiedImports(Addressable::class)
		}

		class_("open class ${handle.genName}(override val address: Long) : Addressable") {
			companion_ {
				declaration("val NULL = ${handle.genName}(0L)")
			}
		}
	}


}