package kvb.codegen

import kvb.codegen.vulkan.*
import kvb.codegen.vulkan.scraper.VkScraper
import kvb.codegen.vulkan.scraper.element.VkCommand
import kvb.codegen.vulkan.scraper.element.VkExtension
import kvb.codegen.vulkan.scraper.list.VkElementList
import kvb.codegen.vulkan.scraper.list.VkProviderList
import kvb.codegen.vulkan.scraper.list.VkTypeList
import java.nio.file.Files
import java.nio.file.Paths

object Generation {


	/*
	Scraping
	 */



	val scraper = VkScraper.scrape("vk.xml")

	val providers = VkProviderList()

	val types = VkTypeList()

	val commands = VkElementList<VkCommand>()



	init {
		for(p in scraper.providers) {
			if(p is VkExtension && !VkGenUtils.shouldGenExtension(p))
				continue

			providers.add(p)
			types.addAll(p.types)
			commands.addAll(p.commands)
		}
	}



	/*
	Generation
	 */



	const val genDirectory = "gen"

	const val cDirectory = "$genDirectory/c/common"



	const val rootPackage = "kvb"

	const val primitivePackage = "$rootPackage.core.memory.direct"

	const val vulkanPackage = "$rootPackage.vulkan"

	const val enumPackage = "$vulkanPackage.enumeration"

	const val handlePackage = "$vulkanPackage.handle"

	const val structPackage = "$vulkanPackage.struct"

	const val commandPackage = "$vulkanPackage.command"

	const val allocationPackage = "$vulkanPackage.allocation"



	private val String.toPath get() =
		Paths.get(genDirectory + "/" + replace('.', '/')).also(Files::createDirectories)



	fun genPrimitives() = PrimitiveGenerator.generate(primitivePackage.toPath)

	fun genEnums() = VkEnumGenerator.generate(enumPackage.toPath, types.enums)

	fun genBitmasks() = VkBitmaskGenerator.generate(enumPackage.toPath, types.bitmasks)

	fun genHandles() = VkHandleGenerator.generate(handlePackage.toPath, types.handles)

	fun genStructs() = VkStructGenerator.generate(structPackage.toPath, types.structs)

	fun genCommands() = VkCommandGenerator.generate(commandPackage.toPath, Paths.get(cDirectory), providers)

	fun genAllocations() = VkAllocationGenerator.generate(allocationPackage.toPath, types.structs)

	fun genConstants() = VkConstantGenerator.generate(vulkanPackage.toPath, scraper.constants)



}