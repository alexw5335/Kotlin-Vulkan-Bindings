package kvb.codegen.vulkan

import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import kvb.codegen.vulkan.scraper.type.*

object VkGenerator {


	val scraper = VkScraper.scrape("vk.xml")



	val providers = VkProviderList().apply {
		for(p in scraper.providers)
			if(VkGenUtils.shouldGenProvider(p))
				add(p)
	}



	val typesByShortName = HashMap<String, VkType>()

	val postfixedTypes = HashSet<String>()



	val VkType.shouldGen: Boolean get() = when(this) {
		is VkTypeAliased        -> false
		is VkTypeBitmask        -> implemented && enum?.entries?.isNotEmpty() ?: false
		is VkTypeEnum           -> entries.isNotEmpty() && name != "VkStructureType" && (!isFlagBits || bitmask!!.shouldGen)
		is VkTypeFuncPointer    -> false
		is VkTypeHandle         -> true
		is VkTypeNative         -> false
		is VkTypePrimitive      -> false
		is VkTypeStruct         -> true
		is VkTypeUnimplemented  -> false
		is VkTypeVoid           -> false
	}



	val types = VkTypeList().apply {
		for(p in scraper.providers) {
			for(t in p.types) {
				if(t !is VkTypeAliased && t.shouldGen) {
					if(postfixedTypes.contains(t.shortName)) {
						postfixedTypes.add(t.name)
					}
				}
			}
		}
	}


}