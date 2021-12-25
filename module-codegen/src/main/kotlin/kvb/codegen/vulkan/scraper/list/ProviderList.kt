package kvb.codegen.vulkan.scraper.list

import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.element.VkFeature
import kvb.codegen.vulkan.scraper.element.VkProvider

class ProviderList(private val all: NamedList<VkProvider> = NamedList()) : Collection<VkProvider> by all {


	val features = NamedList<VkFeature>()

	val extensions = NamedList<VkExtension>()



	/*
	Delegate
	 */



	fun add(provider: VkProvider) {
		all.add(provider)

		when(provider) {
			is VkFeature -> features.add(provider)
			is VkExtension -> extensions.add(provider)
		}
	}

	fun fromName(name: String) = all.fromName(name)

	fun fromNameOrNull(name: String) = all.fromNameOrNull(name)

	fun containsName(name: String) = all.containsName(name)


}