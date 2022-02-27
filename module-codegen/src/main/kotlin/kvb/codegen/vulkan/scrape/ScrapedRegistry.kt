package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.NamedList

class ScrapedRegistry(
	val types            : NamedList<Type>,
	val commands         : NamedList<Command>,
	val constants        : NamedList<Constant>,
	val providers        : NamedList<Provider>,
	val namesToProviders : Map<String, Provider>
) {


	fun getProvider(name: String) = namesToProviders[name] ?: throw NoSuchElementException()


}