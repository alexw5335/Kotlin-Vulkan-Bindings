package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.type.VkTypeStruct
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter
import kvb.core.memory.Allocator

object VkAllocationGenerator {


	fun generate(structs: Iterable<VkTypeStruct>) = KWriter.write(vulkanDir, "_Allocations") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			suppressFile("Unused", "FunctionName")
			package_(vulkanPackage)
			imports(Allocator::class)
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