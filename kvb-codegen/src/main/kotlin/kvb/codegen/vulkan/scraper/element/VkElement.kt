package kvb.codegen.vulkan.scraper.element

/**
 * Represents anything specified by Vulkan that can be identified by a unique [name].
 */
interface VkElement {


	/**
	 * The name of this element as specified by the Vulkan specification.
	 */
	val name: String



	/**
	 * A short version of this element's [name], typically without any namespacing prefixes nor postfixes. Returns the
	 * [name] by default.
	 */
	val shortName: String get() = name


}