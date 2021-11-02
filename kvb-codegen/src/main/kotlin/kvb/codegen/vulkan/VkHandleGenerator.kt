package kvb.codegen.vulkan

import kvb.codegen.handleDir
import kvb.codegen.handlePackage
import kvb.codegen.vulkan.scraper.type.VkTypeHandle
import kvb.codegen.writer.KWriter
import kvb.core.memory.Addressable

object VkHandleGenerator {


	fun generate(handles: Iterable<VkTypeHandle>) {
		for(h in handles)
			printHandle(h)
	}



	private fun printHandle(handle: VkTypeHandle) = KWriter.write(handleDir, handle.genName) {
		start {
			autogenComment()
			package_(handlePackage)
			imports(Addressable::class)
		}

		declaration("open class ${handle.genName}(override val address: Long) : Addressable")
	}


}