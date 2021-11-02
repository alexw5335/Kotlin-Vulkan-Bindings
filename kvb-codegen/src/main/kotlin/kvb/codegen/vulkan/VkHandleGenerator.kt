package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.type.VkTypeHandle
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter
import kvb.core.memory.Addressable

object VkHandleGenerator {


	fun generate(handles: Iterable<VkTypeHandle>) = KWriter.write(vulkanDir, "_Handles") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			package_(vulkanPackage)
			imports(Addressable::class)
		}

		for(handle in handles) {
			doc("implementation of ${handle.name}")
			declaration("open class ${handle.genName}(override val address: Long) : Addressable")
		}
	}


}