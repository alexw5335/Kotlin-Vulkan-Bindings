package kvb.codegen.vulkan

import kvb.codegen.allocationDir
import kvb.codegen.allocationPackage
import kvb.codegen.structPackage
import kvb.codegen.vulkan.scraper.type.VkTypeStruct
import kvb.codegen.writer.KWriter
import kvb.core.memory.Allocator
import java.nio.file.Path

object VkAllocationGenerator {


	fun generate(structs: Iterable<VkTypeStruct>) = KWriter.write(allocationDir, "Allocations") {
		start {
			autogenComment()
			declaration("@file:Suppress(\"unused\", \"FunctionName\")")
			package_(allocationPackage)
			imports(Allocator::class, "$structPackage.*")
		}

		currentStyle = style(decSpacing = 1)

		for(s in structs) {
			if(!s.shouldGen) continue

			val type = s.genName

			if(s.sType != null) {
				declaration("inline fun Allocator.$type(block: ($type) -> Unit) = $type(calloc(${s.size64})).apply(block).also { it.sType = ${s.sType!!.value} }")

				if(s.requiresBuffer)
					declaration("inline fun Allocator.$type(capacity: Int, block: ($type.Buffer) -> Unit) = $type.Buffer(calloc(capacity * ${s.size64}), capacity).apply(block).apply { forEach { it.sType = ${s.sType!!.value} } }")
			} else {
				declaration("inline fun Allocator.$type(block: ($type) -> Unit) = $type(calloc(${s.size64})).apply(block)")

				if(s.requiresBuffer)
					declaration("inline fun Allocator.$type(capacity: Int, block: ($type.Buffer) -> Unit) = $type.Buffer(calloc(capacity * ${s.size64}), capacity).apply(block)")
			}
		}
	}


}