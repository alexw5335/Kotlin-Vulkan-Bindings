package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.Named
import kvb.codegen.vulkan.name.NamedList

class ScrapedRegistry(
	val types            : NamedList<Type>,
	val commands         : NamedList<Command>,
	val constants        : NamedList<Constant>,
	val providers        : NamedList<Provider>
) {


	private val namesToProviders = HashMap<String, Provider>()



	init {
		for(provider in providers) {
			for(type in provider.types)
				namesToProviders[type.name] = provider

			for(command in provider.commands)
				namesToProviders[command.name] = provider
		}
	}


	fun getProvider(name: String) = namesToProviders[name] ?: throw NoSuchElementException()
	fun getProvider(named: Named) = namesToProviders[named.name] ?: throw NoSuchElementException()

}