package codegen.vulkan.scrape

import codegen.vulkan.name.NamedList

class ScrapedRegistry(
	val types            : NamedList<VkType>,
	val commands         : NamedList<Command>,
	val constants        : NamedList<Constant>,
	val providers        : NamedList<Provider>,
	val namesToProviders : Map<String, Provider>
) {


	fun getProvider(name: String) = namesToProviders[name] ?: throw NoSuchElementException()


}