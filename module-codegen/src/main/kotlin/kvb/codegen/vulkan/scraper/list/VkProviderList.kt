package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkFeature
import kvb.codegen.vulkan.scraper.element.VkProvider

class VkProviderList(private val all: VkElementList<VkProvider> = VkElementList()) : List<VkProvider> by all {


	val features = VkElementList<VkFeature>()

	val extensions = VkElementList<VkExtension>()



	fun add(provider: VkProvider) {
		all.add(provider)

		when(provider) {
			is VkFeature -> features.add(provider)
			is VkExtension -> extensions.add(provider)
		}
	}


}