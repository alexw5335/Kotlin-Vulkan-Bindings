@file:Suppress("HasPlatformType", "unused")

package kvb.codegen

import kvb.codegen.core.PrimitiveGenerator
import kvb.codegen.vulkan.*
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import java.nio.file.Files
import java.nio.file.Paths



/*
Scraping
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



/*
Generation
 */



fun genEnums() = VkEnumGenerator.generate(types.enums)

fun genBitmasks() = VkBitmaskGenerator.generate(types.bitmasks)

fun genHandles() = VkHandleGenerator.generate(types.handles)

fun genStructs() = VkStructGenerator.generate(types.structs)

fun genAllocation() = VkAllocationGenerator.generate(types.structs)

fun genCommands() = VkCommandGenerator.generate(providers)

fun genUtils() = VkUtilsGenerator.generate()

fun genConstants() = VkConstantGenerator.generate(scraper.constants)

fun genPrimitives() = PrimitiveGenerator.generate()



fun genCore() {
	genPrimitives()
}



fun genVulkan() {
	genEnums()
	genBitmasks()
	genHandles()
	genStructs()
	genAllocation()
	genCommands()
	genUtils()
	genConstants()
}



fun printMeta() {
	VkMetaGenerator.printEmptyEnums(types.enums)
	VkMetaGenerator.printPostfixedNames(types, providers)
}



fun main() {
	genVulkan()
}



/*
Packages
 */



const val primitivePackage = "kvb.core.memory.direct"

const val vulkanPackage = "kvb.vulkan"



val vulkanDir = "gen/kvb/vulkan".toPath

val cDir = "gen/c".toPath

val primitiveDir = "gen/kvb/core/memory/direct".toPath



private val String.toPath get() = Paths.get(this).also(Files::createDirectories)