package vulkan.generation

import vulkan.scraper.VkScraper
import java.nio.file.Files
import java.nio.file.Paths

object VkGenerator {


	init { Files.createDirectories(Paths.get("gen2")) } // backup path



	/*
	File utils
	 */



	private val String.createPath get() = Paths.get(this).also(Files::createDirectories)

	private val String.toPackage get() = this.drop(genDir.length + 1).replace('/', '.')



	/*
	Directories
	 */



	private const val genDir            = "gen"

	private const val vulkanDir         = "$genDir/vulkan/generated"

	private const val enumsDir          = "$vulkanDir/enumeration"

	private const val handlesDir        = "$vulkanDir/handle"

	private const val structsDir        = "$vulkanDir/struct"

	private const val commandsDir       = "$vulkanDir/command"

	private const val commandsNativeDir = "$genDir/c/common"

	private const val allocationsDir    = "$vulkanDir/allocation"



	/*
	Scraping
	 */



	private val scraper  = VkScraper.create("vk.xml")



	/*
	Generation
	 */



	fun genEnums() = VkEnumGenerator.generate(
		enumsDir.createPath,
		enumsDir.toPackage,
		scraper.types.enums,
		scraper.types.bitmasks
	)



	fun genHandles() = VkHandleGenerator.generate(
		handlesDir.createPath,
		handlesDir.toPackage,
		scraper.types.handles
	)



	fun genStructs() = VkStructGenerator.generate(
		structsDir.createPath,
		structsDir.toPackage,
		scraper.types.structs
	)



	fun genCommands() = VkCommandGenerator(
		commandsDir.createPath,
		commandsDir.toPackage,
		commandsNativeDir.createPath,
		"Commands",
		scraper.features,
		scraper.extensions
	).generate()



	fun genConstants() = VkConstantsGenerator.generate(
		vulkanDir.createPath,
		vulkanDir.toPackage,
		scraper.apiConstants
	)



	fun genAllocations() = VkAllocationGenerator.generate(
		allocationsDir.createPath,
		allocationsDir.toPackage,
		scraper.types.structs
	)


}