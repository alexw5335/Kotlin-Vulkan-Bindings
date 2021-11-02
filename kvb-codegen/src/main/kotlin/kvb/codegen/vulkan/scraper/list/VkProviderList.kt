package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkFeature
import kvb.codegen.vulkan.scraper.element.VkProvider

class VkProviderList(val providers: VkElementList<VkProvider> = VkElementList()) : List<VkProvider> by providers {



	val features = VkElementList<VkFeature>()

	val extensions = VkElementList<VkExtension>()



	fun add(provider: VkProvider) {
		providers.add(provider)

		when(provider) {
			is VkFeature -> features.add(provider)
			is VkExtension -> extensions.add(provider)
		}
	}



	fun addAll(providers: Iterable<VkProvider>) = providers.forEach(::add)


}