package vulkan.scraper.list

import vulkan.scraper.element.VkElement

/**
 * Classifies a list of [VkElement]s by their [names][VkElement.name] and [shortNames][VkElement.shortName]. This allows
 * for elements to be efficiency searched for by their name or short name. This is necessary given the large number of
 * types that Vulkan defines that must be retrieved by name when generating the bindings.
 */
interface VkElementListI<T: VkElement> : Collection<T> {


	/*
	Abstract functions
	 */



	val elements: MutableList<T>

	val elementsByName: MutableMap<String, T>

	val elementsByShortName: MutableMap<String, T>



	/*
	Searching
	 */



	fun fromName(name: String) = elementsByName[name] ?: throw IllegalArgumentException("no matching name: $name")

	fun fromShortName(name: String) = elementsByShortName[name] ?: throw IllegalArgumentException("no matching short name: $name")

	fun containsName(name: String) = elementsByName[name] != null

	fun containsShortName(name: String) = elementsByShortName[name] != null



	/*
	Adding
	 */



	fun add(element: T): Boolean {
		if(elementsByName[element.name] != null) return false

		elements.add(element)
		elementsByName[element.name] = element
		elementsByShortName[element.shortName] = element

		return true
	}



	fun addAll(elements: Iterable<T>) {
		elements.forEach(::add)
	}


}