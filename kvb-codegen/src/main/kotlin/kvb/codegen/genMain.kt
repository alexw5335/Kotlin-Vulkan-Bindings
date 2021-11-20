@file:Suppress("HasPlatformType")

package kvb.codegen

import kvb.codegen.memory.PrimitiveGenerator
import kvb.codegen.vulkan.*
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.list.VkElementList
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
		if(VkGenUtils.shouldGenProvider(provider))
			add(provider)
}



val types = VkTypeList().apply {
	for(provider in providers)
		for(type in provider.types)
			if(type.shouldGen)
				add(type)
}



private fun genPrimitives() = PrimitiveGenerator.generate()

private fun genEnums() = VkEnumGenerator.generate(types.enums)

private fun genBitmasks() = VkBitmaskGenerator.generate(types.bitmasks)

private fun genHandles() = VkHandleGenerator.generate(types.handles)

private fun genStructs() = VkStructGenerator.generate(types.structs)

private fun genCommands() = VkCommandGenerator.generate(providers)

private fun genAllocations() = VkAllocationGenerator.generate(types.structs)

private fun genConstants() = VkConstantGenerator.generate(scraper.constants)

private fun genUtils() = VkUtilsGenerator.generate()



fun main() {
	for(e in scraper.providers.extensions) {
		if(e.promotedTo != null) {
			println("promoted: ${e.name} ${e.promotedTo} ${e.types.enums.size} ${e.types.bitmasks.size} ${e.types.structs.size} ${e.commands.size} ${e.types.aliased.size}")
		}

		if(e.deprecatedBy != null) {
			println("deprecated: ${e.name} ${e.deprecatedBy} ${e.types.enums.size} ${e.types.bitmasks.size} ${e.types.structs.size} ${e.commands.size} ${e.types.aliased.size}")
		}
	}
	//genEnums()
	//genBitmasks()
	//genHandles()
	//genStructs()
	//genCommands()
	//genAllocations()
	//genConstants()
	//genUtils()
}



/*
Packages
 */



const val primitivePackage = "kvb.core.memory.direct"

const val vulkanPackage = "kvb.vulkan"



val primitiveDir = "gen/kvb/core/memory/direct".toPath

val vulkanDir = "gen/kvb/vulkan".toPath

val cDir = "gen/c".toPath



private val String.toPath get() = Paths.get(this).also(Files::createDirectories)