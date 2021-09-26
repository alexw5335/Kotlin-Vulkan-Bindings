package vulkan.scraper.type

import memory.Primitive
import vulkan.scraper.element.VkElement

/**
 * Represents a Vulkan type. These types are mainly referenced in Vulkan's structs and commands. All subclasses should
 * be prefixed with 'VkType' in order to differentiate them from classes that represent instances of those types.
 */
sealed interface VkType : VkElement {


	/**
	 * The primitive that will represent this type when using JNI. Structs cannot be passed directly and must instead be
	 * passed as pointers. Vulkan does not pass any structs by value anyway.
	 */
	val primitive: Primitive

	/**
	 * If this type is a type alias for another type. These types should not be generated for the bindings but must
	 * still be kept track of as other types may reference them.
	 */
	val aliased: Boolean

	/**
	 * The name of this type that is used when generating Kotlin code.
	 */
	val genName: String


}