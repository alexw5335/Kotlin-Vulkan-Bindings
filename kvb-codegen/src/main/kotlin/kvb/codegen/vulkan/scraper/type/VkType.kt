package kvb.codegen.vulkan.scraper.type

import kvb.codegen.writer.procedural.Primitive
import kvb.codegen.vulkan.scraper.element.VkProvidedElement

/**
 * A type specified by the Vulkan specification. Types are represented on the JVM by a [Primitive].
 */
sealed interface VkType : VkProvidedElement {


	val primitive: Primitive


}