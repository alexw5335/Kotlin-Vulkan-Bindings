package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.NamedList
import kvb.codegen.vulkan.scrape.Command
import kvb.codegen.vulkan.scrape.Constant
import kvb.codegen.vulkan.scrape.Provider
import kvb.codegen.vulkan.scrape.VkType

class ScrapedRegistry(
	val types            : NamedList<VkType>,
	val commands         : NamedList<Command>,
	val constants        : NamedList<Constant>,
	val providers        : NamedList<Provider>,
	val namesToProviders : Map<String, Provider>
) {


	fun getProvider(name: String) = namesToProviders[name] ?: throw NoSuchElementException()


}