package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkFeature
import kvb.codegen.vulkan.scraper.element.VkProvider

class VkProviderList(private val all: VkNamedList<VkProvider> = VkNamedList()) : Iterable<VkProvider> by all {


	val features = VkNamedList<VkFeature>()

	val extensions = VkNamedList<VkExtension>()



	fun add(provider: VkProvider) {
		all.add(provider)

		when(provider) {
			is VkFeature -> features.add(provider)
			is VkExtension -> extensions.add(provider)
		}
	}


}