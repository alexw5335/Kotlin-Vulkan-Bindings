package kvb.codegen.vulkan.scraper

/**
 * Represents anything specified by Vulkan that can be identified by a unique [name].
 */
interface Named {


	/**
	 * The name of this element as specified by the Vulkan specification.
	 */
	val name: String


}