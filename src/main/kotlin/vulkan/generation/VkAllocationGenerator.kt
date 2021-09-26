package vulkan.generation

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import memory.allocation.Allocator
import vulkan.scraper.type.VkTypeStruct
import java.nio.file.Path
import kotlin.io.path.div

object VkAllocationGenerator {


	fun generate(directory: Path, packageName: String, structs: Iterable<VkTypeStruct>) = KWriter(directory/"Allocations.kt").with {
		start {
			autogenComment()
			declaration("@file:Suppress(\"unused\", \"FunctionName\")")
			package_(packageName)
			imports(Allocator::class.qualifiedName, "vulkan.generated.struct.*")
		}

		group(spacing = 1) {
			for(s in structs) {
				if(s.aliased) continue

				val type = s.genName

				declaration("inline fun Allocator.$type(block: ($type) -> Unit) = $type.calloc(this).also(block)")

				if(s.usedInArray)
					declaration("inline fun Allocator.$type(capacity: Int, block: ($type.Buffer) -> Unit) = $type.calloc(this, capacity).also(block)")
			}
		}
	}


}