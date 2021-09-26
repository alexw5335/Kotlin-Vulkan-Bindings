package vulkan.scraper.element

/**
 * Represents any type specified by Vulkan that has a [name]. The type's [shortName] should be a version of [name]
 * without any namespacing prefixes nor extension postfixes. The [shortName] returns the [name] by default.
 */
interface VkElement {

	val name: String

	val shortName: String get() = name

}