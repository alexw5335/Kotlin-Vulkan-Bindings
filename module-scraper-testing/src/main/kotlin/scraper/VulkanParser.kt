package scraper

import scraper.naming.NamedList
import scraper.properties.Modifier
import scraper.xml.XmlElement
import scraper.xml.XmlParser
import java.nio.file.Path

class VulkanParser(private val registry: XmlElement) {


	constructor(path: Path) : this(XmlParser.parse(path))



	val providerElements = NamedList<ProviderElement>()

	val commandElements = NamedList<CommandElement>()

	val platformElements = NamedList<PlatformElement>()

	val constantElements = NamedList<ConstantElement>()

	val typeElements = NamedList<TypeElement>()



	init {
		parse()
	}



	/*
	Parsing
	 */



	private fun parse() {
		for(child in registry.child("enums"))
			constantElements.add(scrapeConstantElement(child))

		for(element in registry) {
			when (element.type) {
				"platforms" ->
					for(child in element)
						if(child.type == "platform")
							platformElements.add(PlatformElement(child.attrib("name"), child.attrib("protect")))

				"commands" ->
					for(child in element)
						if(child.type == "command")
							commandElements.add(scrapeCommandElement(child))

				"types" ->
					for(child in element)
						if(child.type == "type")
							typeElements.add(scrapeTypeElement(child))

				"extensions" ->
					for(child in element)
						if(child.type == "extension")
							providerElements.add(scrapeExtensionElement(child))
								
				"enums"     -> scrapeEnumsElement(element)

				"feature"   -> providerElements.add(scrapeFeatureElement(element))
			}
		}
	}



	/*
	Type elements
	 */



	private fun scrapeTypeElement(element: XmlElement): TypeElement {
		val name = element["name"] ?: element.child("name").text ?: err(element)

		element["alias"]?.let {
			return TypeAliasElement(name, it)
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
				members = element.children("member").mapIndexed(::scrapeVarElement),
				extends = element["structextends"]?.split(',') ?: emptyList()
			)

			"handle" -> return HandleElement(name)

			"funcpointer" -> return FuncPointerElement(name)

			else -> return MiscTypeElement(name)
		}

		val requires = element["requires"]

		if(requires == "vk_platform" || name == "int")
			return PrimitiveElement(name, name)

		return NativeElement(name)
	}



	/*
	Enum elements
	 */



	private fun scrapeEnumEntryElement(element: XmlElement, extNumber: Int, extension: String?): EnumEntryElement {
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



	private fun scrapeEnumsElement(element: XmlElement) {
		if(element["name"] == "API Constants") return

		val enum = typeElements.fromName(element["name"] ?: err(element)) as EnumElement

		for(child in element)
			if(child.type == "enum")
				enum.entries.add(scrapeEnumEntryElement(child, 0, null))
	}



	private fun scrapeConstantElement(element: XmlElement): ConstantElement {
		val name = element["name"] ?: err(element)

		element["alias"]?.let {
			return ConstantElement(name, "", true)
		}

		val value = element.attrib("value")

		// Int literal
		value.toIntOrNull()?.let {
			return ConstantElement(name, value)
		}

		// Hardcoded, may need to be updated in the future.
		return when(value) {
			"(~0ULL)" 	-> ConstantElement(name, "-1L")
			"(~0U)" 	-> ConstantElement(name, "-1")
			"(~0U-1)" 	-> ConstantElement(name, "-2")
			"(~0U-2)" 	-> ConstantElement(name, "-3")
			"(~1U)"     -> ConstantElement(name, "-2")
			"(~2U)"     -> ConstantElement(name, "-3")
			"1000.0f"	-> ConstantElement(name, "1000.0f")
			"1000.0F"   -> ConstantElement(name, "1000.0f")
			else		-> err("Unrecognised api constant value: $value", element)
		}
	}



	/*
	Feature and extension elements
	 */



	private fun scrapeFeatureElement(element: XmlElement): FeatureElement {
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
						enum.entries.add(scrapeEnumEntryElement(element2, 0, null))
					}
				}
			}
		}

		return FeatureElement(name, types, commands)
	}



	private fun scrapeExtensionElement(element: XmlElement): ExtensionElement {
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
						enum.entries.add(scrapeEnumEntryElement(element2, number, name))
					}
				}
			}
		}

		return ExtensionElement(
			name         = name,
			number       = number,
			platform     = element["platform"]?.let(platformElements::fromName),
			deprecatedBy = element["deprecatedby"],
			promotedTo   = element["promotedTo"],
			disabled     = element["supported"] == "disabled",
			types        = types,
			commands     = commands
		)
	}



	/*
	Command elements
	 */



	private fun scrapeCommandElement(element: XmlElement): CommandElement {
		element["alias"]?.let {
			val aliased = commandElements.fromName(it)
			return CommandElement(element.attrib("name"), aliased.returnType, aliased.params, it)
		}

		val proto      = element.child("proto")
		val name       = proto.child("name").text!!
		val returnType = proto.child("type").text!!.takeUnless { it == "void" }
		val params     = element.children("param").mapIndexed(::scrapeVarElement)

		return CommandElement(name, returnType, params, null)
	}



	/*
	Var elements
	 */



	private fun scrapeVarElement(index: Int, element: XmlElement) = VarElement(
		name     = element.child("name").text ?: err(element),
		type     = element.child("type").text ?: err(element),
		optional = element["optional"]?.equals("true") ?: false,
		modifier = varModifier(element.text),
		index    = index,
		len      = element["len"],
		altLen   = element["altlen"],
		varLen   = variableArrayLength(element["len"]),
		constLen = constArrayLength(element),
		sType    = element["values"],
	)



	/**
	 * Determines the modifier of a C parameter or struct member.
	 */
	private fun varModifier(modifier: String?): Modifier {
		if(modifier == null) return Modifier.NONE

		// Edge case for VkAccelerationStructureInstanceKHR.
		if(modifier.startsWith(':')) return Modifier.NONE

		if(modifier.contains('[')) return Modifier.ARRAY

		// Matching the text with a modifier relies on text being condensed in the XML parser.
		// e.g. 'const <type>void</type>*' becomes 'const*'.
		return Modifier.values().first { it.identifier == modifier }
	}



	/**
	 * Determines the constant array length of a struct member.
	 */
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



	/**
	 * Returns the name of the struct member that determines another member's array length.
	 */
	private fun variableArrayLength(len: String?): String? = when {
		// No variable length
		len == null -> null

		// Of the form "variable,null-terminated". Only 3 instances where this occurs:
		// ppEnabledLayerNames, ppEnabledExtensionNames, ppGeometries.
		// Only the first part of the len string matters for these.
		len.contains(',') 					-> len.split(',')[0]

		// Only 2 cases, too complex to create convenience functions for these.
		len.startsWith("latexmath") 		-> null

		// Handled as a constant array length (=32)
		len == "2*ename:VK_UUID_SIZE"		-> null

		// Only for char*. These are handled separately during generation.
		len == "null-terminated"			-> null

		// Edge-case - refers to a variable of a variable within the struct.
		len == "pBuildInfo-geometryCount" 	-> null

		// By this point, the length should refer to another variable in a struct.
		// Warning: This will not catch new edge-cases.
		else								-> len
	}


}