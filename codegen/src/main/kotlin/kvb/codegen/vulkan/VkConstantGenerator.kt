package kvb.codegen.vulkan

import kvb.codegen.GenConfig
import kvb.codegen.vulkan.scraper.element.VkConstant
import kvb.codegen.writer.KWriter
import java.nio.file.Path

object VkConstantGenerator {


	fun generate(directory: Path, constants: Iterable<VkConstant>) = KWriter.write(directory, "VkConstants") {
		start {
			autogenComment()
			package_(GenConfig.vulkanPackage)
		}

		class_("object VkConstants", style(1, 2)) {
			for(c in constants)
				declaration("const val ${c.genName} = ${c.value}")
		}
	}


}