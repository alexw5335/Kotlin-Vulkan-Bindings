package kvb.codegen.vulkan.scraper.type

import kvb.codegen.vulkan.scraper.element.VkElement
import kvb.codegen.writer.procedural.Primitive

/**
 * A type specified by the Vulkan specification. Types are represented on the JVM by a [Primitive].
 */
sealed interface VkType : VkElement {


	/**
	 * The JVM type used to represent this type when generating bindings. Defaults to [Primitive.LONG].
	 */
	val primitive: Primitive get() = Primitive.LONG


	/**
	 * If this type should be generated when generating bindings. If false, then the type (if used) will be represented
	 * by a primitive.
	 */
	val shouldGen: Boolean get() = false


}