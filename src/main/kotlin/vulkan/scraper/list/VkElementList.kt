package vulkan.scraper.list

import vulkan.scraper.element.VkElement

/**
 * A default implementation of [VkElementListI].
 */
class VkElementList<T : VkElement>(
	override val elements				: ArrayList<T> 			= ArrayList(),
	override val elementsByName			: HashMap<String, T> 	= HashMap(),
	override val elementsByShortName	: HashMap<String, T> 	= HashMap()
) : VkElementListI<T>, Collection<T> by elements