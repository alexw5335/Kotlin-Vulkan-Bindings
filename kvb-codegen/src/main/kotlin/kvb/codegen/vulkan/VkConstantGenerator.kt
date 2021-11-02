package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.element.VkConstant
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter

object VkConstantGenerator {


	fun generate(constants: Iterable<VkConstant>) = KWriter.write(vulkanDir, "_Constants") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			suppressFile("Unused")
			package_(vulkanPackage)
		}

		styled(style(1, 0)) {
			for(constant in constants) {
				declaration("const val ${constant.genName} = ${constant.value}")
			}
		}
	}


}