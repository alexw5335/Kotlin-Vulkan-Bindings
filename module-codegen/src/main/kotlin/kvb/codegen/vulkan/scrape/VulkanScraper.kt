package kvb.codegen.vulkan.scrape

import kvb.codegen.vulkan.name.*
import kvb.codegen.vulkan.parse.*
import kvb.codegen.vulkan.scrape.ScraperUtils.camelToSnakeCase
import kvb.codegen.writer.Primitive

class VulkanScraper(private val registry: ParsedRegistry) {


	companion object {
		//fun scrape()
	}



	private val shortNames = ShortNameList()

	private val types = NamedList<Type>()

	private val commands = NamedList<Command>()

	private val constants = NamedList<Constant>()

	private val providers = NamedList<Provider>()



	/*
	Conditions
	 */



	private val ProviderElement.shouldGen get() =
		this !is ExtensionElement || (deprecatedBy == null && !disabled && promotedTo == null)

	private val CommandElement.shouldgen get() =
		alias == null

	private val EnumEntryElement.shouldGen get() =
		alias == null && (extension == null || registry.providerElements.fromName(extension).shouldGen)

	private val TypeElement.shouldGen get() = when(this) {
		is BitmaskElement -> enumName != null
		is EnumElement    -> name != "VkStructureType"
		is StructElement  -> true
		is HandleElement  -> true
		else              -> false
	}



	/*
	Naming
	 */



	private val StructElement.genName get() = shortNames.get(name)

	private val HandleElement.genName get() = shortNames.get(name) + "H"

	private val PrimitiveElement.genName get() = ScraperUtils.resolvePrimitive(name).kName

	private val BitmaskElement.genName get() = when {
		shouldGen -> shortNames.get(name)
		is64Bit   -> "Long"
		else      -> "Int"
	}

	private val EnumElement.genName get() = when {
		!shouldGen -> if(is64Bit) "Long" else "Int"
		isFlagBits -> shortNames.get(name.replace("FlagBits", "Flags"))
		else       -> shortNames.get(name)
	}

	private val EnumElement.prefix get() = when {
		!isFlagBits -> Postfix.drop(name).camelToSnakeCase + "_"
		!is64Bit    -> Postfix.drop(name).dropLast(8).camelToSnakeCase + "_"
		else        -> Postfix.drop(name).dropLast(9).camelToSnakeCase + "_2_"
	}

	private fun enumEntryGenName(name: String, prefix: String): String {
		// There are about 4 exceptional entries in the registry that don't start with their enum's entry prefix.
		// There is also the VkResult enum that is only prefixed by VK_
		// In these cases, remove the VK_. Otherwise, remove the whole prefix
		val prefixLength = if(!name.startsWith(prefix)) 3 else prefix.length

		// Drop underscore
		var shortName = shortNames.get(name).drop(prefixLength)

		// Enum names cannot start with digits, prefix with underscore
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums (occurs before extension postfix)
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		return shortName
	}



	private fun String.drop(start: Int, end: Int) = substring(start, length - end)

	private val TypeElement.shortName get() = name.drop(2, Postfix.length(name))

	private val CommandElement.shortName get() = name.drop(2, Postfix.length(name)).replaceFirstChar { it.lowercase() }

	private val EnumEntryElement.shortName get() = name.dropLast(Postfix.underscoredLength(name))



	private fun BitmaskElement.convert() = BitmaskType(
		name, genName, shouldGen, Primitive.integer(is64Bit), is64Bit, enumName
	)

	private fun StructElement.convert() = StructType(
		name, genName, shouldGen, Primitive.LONG, isUnion
	)

	private fun HandleElement.convert() = HandleType(
		name, genName, shouldGen, Primitive.LONG
	)

	private fun PrimitiveElement.convert() = PrimitiveType(
		name, genName, shouldGen, ScraperUtils.resolvePrimitive(name)
	)

	private fun NativeElement.convert() = NativeType(
		name, ScraperUtils.
	)
}