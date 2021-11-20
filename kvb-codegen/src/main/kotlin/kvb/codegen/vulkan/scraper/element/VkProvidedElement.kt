package kvb.codegen.vulkan.scraper.element

/**
 * An element that has been provided by a [VkProvider].
 */
interface VkProvidedElement : VkElement {


	/**
	 * The [name] of the element without a 'Vk' prefix and without any extension postfix.
	 */
	val shortName: String

	/**
	 * The [VkFeature] or [VkExtension] that provides this element.
	 */
	var provider: VkProvider


}