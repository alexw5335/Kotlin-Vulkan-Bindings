package kvb.codegen.vulkan.parse

import kvb.codegen.vulkan.name.NamedList
import kvb.codegen.vulkan.xml.XmlElement
import kvb.codegen.vulkan.xml.XmlParser
import java.nio.file.Path

class VulkanParser(private val registry: XmlElement) {


	companion object {
		fun parse(vkxmlPath: Path) = VulkanParser(XmlParser.parse(vkxmlPath)).parse()
	}



	/*
	Errors
	 */



	private class ParseException(message: String) : RuntimeException(message)

	private fun err(message: String): Nothing = throw ParseException(message)

	private fun err(message: String, element: XmlElement): Nothing = err("$message. element=$element")

	private fun err(element: XmlElement): Nothing = err("invalid element: $element")



	/*
	Elements
	 */



	private val providerElements = NamedList<ProviderElement>()

	private val commandElements = NamedList<CommandElement>()

	private val platformElements = NamedList<PlatformElement>()

	private val constantElements = NamedList<ConstantElement>()

	private val typeElements = NamedList<TypeElement>()



	/*
	Parsing
	 */



	fun parse(): ParsedRegistry {
		// The first enums block contains API constants
		for(child in registry.child("enums"))
			constantElements.add(parseConstantElement(child))

		for(element in registry) {
			when (element.type) {
				"platforms" ->
					for(child in element)
						if(child.type == "platform")
							platformElements.add(PlatformElement(child.attrib("name"), child.attrib("protect")))

				"commands" ->
					for(child in element)
						if(child.type == "command")
							commandElements.add(parseCommandElement(child))

				"types" ->
					for(child in element)
						if(child.type == "type")
							typeElements.add(parseTypeElement(child))

				"extensions" ->
					for(child in element)
						if(child.type == "extension")
							providerElements.add(parseExtensionElement(child))

				"enums" -> parseEnumsElement(element)

				"feature" -> providerElements.add(parseFeatureElement(element))
			}
		}

		return ParsedRegistry(providerElements, commandElements, platformElements, constantElements, typeElements)
	}



	/*
	Type elements
	 */



	private fun parseTypeElement(element: XmlElement): TypeElement {
		val name = element["name"] ?: element.child("name").text ?: err(element)

		element["alias"]?.let {
			return AliasedTypeElement(name, it)
		}

		when(val category = element["category"]) {
			null -> { }

			"enum" -> return EnumElement(
				name        = name,
				is64Bit     = name.contains("FlagBits2"),
				isFlagBits  = name.contains("FlagBits")
			)


			"bitmask" -> return BitmaskElement(
				name     = name,
				is64Bit  = element["bitvalues"] != null,
				enumName = element["requires"] ?: element["bitvalues"]
			)

			"basetype" -> {
				element.childOrNull("type")?.text?.let {
					return PrimitiveElement(name, it)
				}

				// Redefined native types (ANativeWindow, CAMetalLayer, AHardwareBuffer)
				return NativeElement(name)
			}

			"struct", "union" -> return StructElement(
				name    = name,
				isUnion = category == "union",
				members = element.children("member").mapIndexed(::parseVarElement),
				extends = element["structextends"]?.split(',') ?: emptyList()
			)

			"handle" -> return HandleElement(name)

			"funcpointer" -> return FuncPointerElement(name)

			else -> return MiscTypeElement(name)
		}

		val requires = element["requires"]

		if(name == "void")
			return VoidTypeElement

		if(requires == "vk_platform" || name == "int")
			return PrimitiveElement(name, name)

		return NativeElement(name)
	}



	/*
	Enum elements
	 */



	private fun parseEnumEntryElement(element: XmlElement, extNumber: Int, extension: String?): EnumEntryElement {
		val name = element["name"] ?: err(element)

		element["alias"]?.let {
			return EnumEntryElement(name, null, it, extension)
		}

		var value =
			element["value"]

				?: element["bitpos"]?.let {
					(1L shl it.toInt()).toString()
				}

				// See scripts/generator.py file in the KhronosGroup/Vulkan-Docs repository for the formula.
				?: element["offset"]?.let {
					(1000000000 + ((element["extnumber"]?.toInt() ?: extNumber) - 1) * 1000 + it.toInt()).toString()
				}

				?: err("Invalid enum value", element)

		if(element["dir"] == "-")
			value = "-$value"

		return EnumEntryElement(name, value, null, extension)
	}



	private fun parseEnumsElement(element: XmlElement) {
		if(element["name"] == "API Constants") return

		val enum = typeElements.fromName(element["name"] ?: err(element)) as EnumElement

		for(child in element)
			if(child.type == "enum")
				enum.entries.add(parseEnumEntryElement(child, 0, null))
	}



	private fun parseConstantElement(element: XmlElement): ConstantElement {
		val name = element["name"] ?: err(element)

		element["alias"]?.let {
			val alias = constantElements[it] ?: err("No such constant alias: $it", element)
			return ConstantElement(name, alias.cValue, alias.value, it)
		}

		val cValue = element.attrib("value")

		cValue.toIntOrNull()?.let {
			return ConstantElement(name, cValue, cValue)
		}

		cValue.toFloatOrNull()?.let {
			return ConstantElement(name, cValue, cValue)
		}

		val value = when(cValue) {
			"(~0ULL)" -> "-1L"
			"(~0U)"   -> "-1"
			"(~0U-1)" -> "-2"
			"(~0U-2)" -> "-3"
			"(~1U)"   -> "-2"
			"(~2U)"   -> "-3"
			else      -> err("Unrecognised api constant value: $cValue", element)
		}

		return ConstantElement(name, cValue, value)
	}



	/*
	Feature and extension elements
	 */



	private fun parseFeatureElement(element: XmlElement): FeatureElement {
		val name = element["name"] ?: err(element)
		val types = NamedList<TypeElement>()
		val commands = NamedList<CommandElement>()

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> types.add(typeElements.fromName(element2.attrib("name")))
					"command" -> commands.add(commandElements.fromName(element2.attrib("name")))
					"enum"    -> {
						val enum = typeElements.fromName(element2["extends"] ?: continue) as EnumElement
						enum.entries.add(parseEnumEntryElement(element2, 0, null))
					}
				}
			}
		}

		return FeatureElement(name, types, commands)
	}



	private fun parseExtensionElement(element: XmlElement): ExtensionElement {
		val name = element["name"] ?: err(element)
		val number = element["number"]?.toInt() ?: err(element)
		val types = NamedList<TypeElement>()
		val commands = NamedList<CommandElement>()

		for(require in element.children) {
			if(require.type != "require") continue

			for(element2 in require.children) {
				when(element2.type) {
					"type"    -> types.add(typeElements.fromName(element2.attrib("name")))
					"command" -> commands.add(commandElements.fromName(element2.attrib("name")))
					"enum"    -> {
						val enum = typeElements.fromName(element2["extends"] ?: continue) as EnumElement
						enum.entries.add(parseEnumEntryElement(element2, number, name))
					}
				}
			}
		}

		return ExtensionElement(
			name         = name,
			number       = number,
			platform     = element["platform"]?.let(platformElements::fromName),
			deprecatedBy = element["deprecatedby"],
			promotedTo   = element["promotedto"],
			disabled     = element["supported"] == "disabled",
			types        = types,
			commands     = commands
		)
	}



	/*
	Command elements
	 */



	private fun parseCommandElement(element: XmlElement): CommandElement {
		element["alias"]?.let {
			val aliased = commandElements.fromName(it)
			return CommandElement(element.attrib("name"), aliased.returnType, aliased.params, it)
		}

		val proto      = element.child("proto")
		val name       = proto.child("name").text!!
		val returnType = proto.child("type").text!!.takeUnless { it == "void" }
		val params     = element.children("param").mapIndexed(::parseVarElement)

		return CommandElement(name, returnType, params, null)
	}



	/*
	Var elements
	 */



	private fun parseVarElement(index: Int, element: XmlElement) = VarElement(
		name     = element.child("name").text ?: err(element),
		type     = element.child("type").text ?: err(element),
		optional = element["optional"]?.equals("true") ?: false,
		modifier = element.text,
		index    = index,
		len      = element["len"],
		altLen   = element["altlen"],
		constLen = constArrayLength(element),
		sType    = element["values"],
	)



	private fun constArrayLength(element: XmlElement): Int? {
		// Edge case for VkAccelerationStructureVersionInfoKHR.
		if(element["len"] == "2*ename:VK_UUID_SIZE") return 32

		// No const array length.
		if(element.text == null || !element.text.contains('[')) return null

		// If [] with no specified array length, then the array length is given as an attribute named 'enum'.
		// The attribute refers to an API constant.
		return element.text.split('[').last().substringBefore(']').let {
			if(it.isEmpty())
				constantElements.fromName(element.child("enum").text!!).value.toInt()
			else
				it.toInt()
		}
	}


}