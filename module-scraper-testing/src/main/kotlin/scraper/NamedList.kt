package scraper

class NamedList<T : Named>(
	private val map: HashMap<String, T>
) : Collection<T> by map.values {


	constructor() : this(HashMap())



	fun add(value : T) = map.put(value.name, value)

	fun fromName(name: String) = map[name] ?: throw NoSuchElementException("No element with name '$name'")

	fun fromNameOrNull(name: String) = map[name]

	fun contains(name: String) = map[name] != null


}