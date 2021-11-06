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
	//genEnums()
	//genBitmasks()
	//genHandles()
	//genStructs()
	genCommands()
	//genAllocations()
	//genConstants()
	//genUtils()
}



/*
Packages
 */



const val genDir = "gen"



const val rootPackage = "kvb"

const val primitivePackage = "$rootPackage.core.memory.direct"

const val vulkanPackage = "$rootPackage.vulkan"



val primitiveDir get() = primitivePackage.packageToPath

val vulkanDir get() = vulkanPackage.packageToPath

val cDir get() = "$genDir/c".toPath



private val String.toPath get() =
	Paths.get(this).also(Files::createDirectories)

private val String.packageToPath get() =
	Paths.get(genDir + "/" + replace('.', '/')).also(Files::createDirectories)