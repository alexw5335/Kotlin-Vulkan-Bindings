package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.element.VkConstant
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter

object VkConstantGenerator {


	fun generate(constants: Iterable<VkConstant>) = KWriter.write(vulkanDir, "VkConstants") {
		start {
			autogenComment()
			package_(vulkanPackage)
		}

		class_("object VkConstants", style(1, 2)) {
			for(c in constants)
				declaration("const val ${c.genName} = ${c.value}")
		}
	}


}