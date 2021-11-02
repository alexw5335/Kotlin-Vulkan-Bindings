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



fun main() {
	genEnums()
	genBitmasks()
	genHandles()
	genStructs()
	genCommands()
	genAllocations()
	genConstants()
}



/*
Scraping
 */



val scraper = VkScraper.scrape("vk.xml")



val providers = VkProviderList().apply {
	for(provider in scraper.providers)
		if(VkGenUtils.shouldGenProvider(provider))
			add(provider)
}



val types = VkTypeList().apply {
	for(provider in providers)
		addAll(provider.types)
}



val commands = VkElementList<VkCommand>().apply {
	for(provider in providers)
		addAll(provider.commands)
}



/*
Packages
 */



const val genDir = "gen"

const val rootPackage = "kvb"

const val primitivePackage = "$rootPackage.core.memory.direct"

const val vulkanPackage = "$rootPackage.vulkan"

const val enumPackage = "$vulkanPackage.enumeration"

const val handlePackage = "$vulkanPackage.handle"

const val structPackage = "$vulkanPackage.struct"

const val commandPackage = "$vulkanPackage.command"

const val allocationPackage = "$vulkanPackage.allocation"



val primitiveDir get() = primitivePackage.packageToPath

val vulkanDir get() = vulkanPackage.packageToPath

val enumDir get() = enumPackage.packageToPath

val handleDir get() = handlePackage.packageToPath

val structDir get() = structPackage.packageToPath

val commandDir get() = commandPackage.packageToPath

val allocationDir get() = allocationPackage.packageToPath

val cDir get() = "$genDir/c".toPath



private val String.toPath get() =
	Paths.get(this).also(Files::createDirectories)



private val String.packageToPath get() =
	Paths.get(genDir + "/" + replace('.', '/')).also(Files::createDirectories)



/*
Generation
 */



private fun genPrimitives() = PrimitiveGenerator.generate(primitivePackage.packageToPath)

private fun genEnums() = VkEnumGenerator.generate(types.enums)

private fun genBitmasks() = VkBitmaskGenerator.generate(types.bitmasks)

private fun genHandles() = VkHandleGenerator.generate(types.handles)

private fun genStructs() = VkStructGenerator.generate(types.structs)

private fun genCommands() = VkCommandGenerator.generate(providers)

private fun genAllocations() = VkAllocationGenerator.generate(types.structs)

private fun genConstants() = VkConstantGenerator.generate(scraper.constants)