package kvb.codegen.vulkan.scraper.element

/**
 * A [VkElement] that can be generated as part of the Kotlin bindings.
 */
interface VkGenElement : VkElement {


	/**
	 * The name used to represent this element when generating bindings. This should be determined just before
	 * generation, not during scraping.
	 */
	var genName: String

	/**
	 * If this element should be generated when generating bindings. True by default.
	 */
	val shouldGen: Boolean get() = true


}