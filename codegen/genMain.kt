@file:Suppress("HasPlatformType", "unused")

package kvb.codegen

import kvb.codegen.core.PrimitiveGenerator
import kvb.codegen.vulkan.*
import kvb.codegen.vulkan.scraper.Scraper
import kvb.codegen.vulkan.scraper.element.VkFeature
import kvb.codegen.vulkan.scraper.list.ProviderList
import kvb.codegen.vulkan.scraper.list.TypeList
import java.nio.file.Files
import java.nio.file.Paths



/*
Scraping
 */



val scraper = Scraper.scrape("vk.xml")



val providers = ProviderList().apply {
	for(provider in scraper.providers)
		if(provider.shouldGen)
			add(provider)
}



val types = TypeList().apply {
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
	//printMeta()
	genVulkan()
}



/*
Packages
 */



const val primitivePackage = "kvb.core.memory.direct"

const val vulkanPackage = "kvb.vulkan"



val vulkanDir     by lazy { "gen/kvb/vulkan".toPath }

val cDir          by lazy { "gen/c".toPath }

val primitiveDir  by lazy { "gen/kvb/core/memory/direct".toPath }


private val String.toPath get() = Paths.get(this).also(Files::createDirectories)