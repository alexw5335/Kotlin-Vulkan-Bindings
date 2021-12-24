package kvb.codegen.vulkan.scraper.element

/**
 * Represents anything specified by Vulkan that can be identified by a unique [name].
 */
interface VkNamed {


	/**
	 * The name of this element as specified by the Vulkan specification.
	 */
	val name: String


}