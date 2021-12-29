package scraper.naming

class NamedList<T : Named>(
	private val map: MutableMap<String, T>
) : Collection<T> by map.values {


	constructor() : this(LinkedHashMap())



	fun add(value : T) = map.put(value.name, value)

	fun fromName(name: String) = map[name] ?: throw NoSuchElementException("No element with name '$name'")

	fun contains(name: String) = map[name] != null


}