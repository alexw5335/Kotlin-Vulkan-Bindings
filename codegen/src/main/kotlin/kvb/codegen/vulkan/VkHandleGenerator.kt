package kvb.codegen.vulkan

import kvb.codegen.GenConfig
import kvb.codegen.vulkan.scraper.type.VkTypeHandle
import kvb.codegen.writer.KWriter
import kvb.core.memory.Addressable
import java.nio.file.Path

object VkHandleGenerator {


	fun generate(directory: Path, handles: Iterable<VkTypeHandle>) {
		for(h in handles)
			printHandle(directory, h)
	}



	private fun printHandle(directory: Path, handle: VkTypeHandle) = KWriter.write(directory, handle.genName) {
		start {
			autogenComment()
			package_(GenConfig.handlePackage)
			import(Addressable::class)
		}

		declaration("open class ${handle.genName}(override val address: Long) : Addressable")
	}


}