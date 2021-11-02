package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.element.VkGenElement

sealed interface VkType : VkGenElement {


	val primitive: Primitive


}