@file:Suppress("HasPlatformType")

package kvb.codegen

import kvb.codegen.vulkan.*
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import java.nio.file.Files
import java.nio.file.Paths



/*
Generation
 */



val scraper = VkScraper.scrape("vk.xml")



val providers = VkProviderList().apply {
	for(provider in scraper.providers)
		if(provider.shouldGen)
			add(provider)
}



val types = VkTypeList().apply {
	for(provider in providers)
		for(type in provider.types)
			if(type.shouldGen)
				add(type)
}



fun main() {
	for(p in providers)
		for(t in p.types.bitmasks)
			if(t.enumName != null && t.enum == null)
				println(t)
}



/*
Packages
 */



const val primitivePackage = "kvb.core.memory.direct"

const val vulkanPackage = "kvb.vulkan"



val primitiveDir = "gen/kvb/core/memory/direct".toPath

val vulkanDir = "gen/kvb/vulkan".toPath

val cDir = "gen/c".toPath

val metaDir = "gen".toPath



private val String.toPath get() = Paths.get(this).also(Files::createDirectories)