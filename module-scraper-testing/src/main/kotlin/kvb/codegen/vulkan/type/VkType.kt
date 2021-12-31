package scraper.kvb.codegen.vulkan.type

import scraper.kvb.codegen.vulkan.naming.Named
import scraper.writer.procedural.Primitive

sealed interface VkType : Named {


	val genName: String

	val shouldGen: Boolean

	val primitive: Primitive


}