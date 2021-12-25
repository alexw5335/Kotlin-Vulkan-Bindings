package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.Named

/**
 * A list of [Named] types that maps elements to their names. This allows for fast searching of elements by name.
 */
class NamedList<T : Named>(private val map: MutableMap<String, T>) : Collection<T> by map.values {


	constructor() : this(HashMap())



	fun add(value: T) = map.put(value.name, value)

	fun fromName(name: String) = map[name] ?: throw NoSuchElementException("No element of name '$name'")

	fun fromNameOrNull(name: String) = map[name]

	fun containsName(name: String) = map[name] != null


}