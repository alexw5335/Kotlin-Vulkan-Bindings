package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkElement
import kvb.codegen.vulkan.scraper.element.VkGenElement
import kvb.codegen.writer.procedural.Primitive

/**
 * A type specified by the Vulkan specification. Types are represented on the JVM by a [Primitive].
 */
sealed interface VkType : VkGenElement {


	/**
	 * The JVM type used to represent this type when generating bindings.
	 */
	val primitive: Primitive


}