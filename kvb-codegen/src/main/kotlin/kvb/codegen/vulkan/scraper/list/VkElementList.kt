package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.element.VkElement

/**
 * A list of [VkElement] types that maps elements to their names. This allows for fast searching of elements by name.
 */
class VkElementList<T : VkElement>(val elements: MutableList<T> = ArrayList()) : List<T> by elements {


	/**
	 * Maps each [element][elements]'s name to itself.
	 */
	val elementsByName: MutableMap<String, T> = HashMap()



	/**
	 * Adds the [element] to the list and adds its name to the map of element names. Will not add an element if its name
	 * is already present in the [elementsByName] map.
	 */
	fun add(element: T) {
		if(elementsByName[element.name] != null) return
		elements.add(element)
		elementsByName[element.name] = element
	}



	/**
	 * Calls [add] for all of the [elements].
	 */
	fun addAll(elements: Iterable<T>) = elements.forEach(::add)



	/**
	 * Gets the element in the list that has the specified [name] or throws a [NoSuchElementException].
	 */
	fun fromName(name: String) = elementsByName[name] ?: throw NoSuchElementException("No element of name '$name'")



	/**
	 * If there is an element in this list that has the specified [name].
	 */
	fun containsName(name: String) = elementsByName[name] != null


}