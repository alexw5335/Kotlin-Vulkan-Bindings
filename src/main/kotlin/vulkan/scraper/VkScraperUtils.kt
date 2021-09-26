package vulkan.scraper

import memory.Primitive
import vulkan.scraper.type.VkTypeEnum
import vulkan.scraper.xml.VkXmlElement
import java.util.*
import java.util.regex.Pattern

object VkScraperUtils {


	/*
	Exceptions
	 */



	class VulkanScrapeException(message: String) : RuntimeException(message)



	fun err(message: String): Nothing = throw VulkanScrapeException(message)

	fun err(message: String, element: VkXmlElement): Nothing = err("$message. element=$element")

	fun err(element: VkXmlElement): Nothing = err("invalid element: $element")



	/*
	Naming
	 */



	/**
	 * Names that cannot be used for variables, mainly keywords.
	 */
	private val invalidNames: Set<String> = setOf("object")



	fun makeValid(name: String) = if(invalidNames.contains(name))
		"_$name"
	else
		name



	private val String.withoutVk get() = drop(2)

	private val String.withoutProvider get() = this.dropLast(VkExtensionProvider.postfixLength(this))

	private val String.decapitalised get() = replaceFirstChar { it.lowercase(Locale.getDefault()) }



	private val CAMEL_CASE_REGEX = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

	private fun camelCaseToUpperSnakeCase(s: String) = s.replace(CAMEL_CASE_REGEX, "_").uppercase(Locale.getDefault())



	/*
	Element short names
	 */



	// Don't drop provider due to naming conflicts
	fun commandShortName(name: String)     = name.withoutVk.decapitalised

	// Don't drop provider due to naming conflicts
	// e.g. VkAccelerationStructureCreateInfoKHR and VkAccelerationStructureCreateInfoNV are different structs.
	fun structShortName(name: String)      = name.withoutVk

	fun bitmaskShortName(name: String)     = name.withoutVk.withoutProvider

	fun enumShortName(name: String)        = name.withoutVk.withoutProvider

	fun handleShortName(name: String)      = name.withoutVk.withoutProvider

	// Drop VK_ prefix
	fun apiConstantShortName(name: String) = name.drop(3)



	/*
	Enum naming
	 */



	/**
	 * Determines the common prefix of an enum's entries. This prefix is used to remove the namespacing prefixes in
	 * front of entry names.
	 *
	 *     VkBlendOverlapEXT -> VK_BLEND_OVERLAP_
	 *     VkAccessFlagBits  -> VK_ACCESS_
	 *     VkAccessFlagBits2 -> VK_ACCESS_2_
	 */
	fun enumPrefix(enum: VkTypeEnum) = when {
		!enum.isFlags 	-> camelCaseToUpperSnakeCase(enum.name.withoutProvider) + "_"
		!enum.is64Bit 	-> camelCaseToUpperSnakeCase(enum.name.withoutProvider.dropLast(8)) + "_"
		else 			-> camelCaseToUpperSnakeCase(enum.name.withoutProvider.dropLast(9)) + "_2_"
	}



	/**
	 * Determines an enum entry's short name.
	 */
	fun enumEntryShortName(name: String, enum: VkTypeEnum) : String {
		// There are about 4 exceptional entries in the registry that don't start with their enum's entry prefix.
		// There is also the VkResult enum that is only prefixed by VK_.
		// In these cases, remove the VK_. Otherwise, remove the whole prefix.
		val prefixLength = if(!name.startsWith(enum.prefix)) 3 else enum.prefix.length

		// Extension postfix, e.g. KHR, NV, ANDROID
		val extension = VkExtensionProvider.fromPostfix(name)?.id ?: ""

		// Drop the prefix and postfix
		var shortName = if(extension.isNotEmpty())
			name.drop(prefixLength).dropLast(extension.length + 1) // Drop '_' before extension as well.
		else
			name.drop(prefixLength)

		// Java enums cannot start with digits, prefix with '_'.
		if(shortName[0].isDigit()) shortName = "_$shortName"

		// Remove _BIT at the end of bitmask enums.
		if(shortName.endsWith("_BIT")) shortName = shortName.dropLast(4)

		// Sometimes removing the extension creates naming conflicts, so the extension must be re-added.
		// NOTE: Do not rely on an entry's alias status to determine whether the extension should be removed or not.
		if(enum.entries.elementsByShortName[shortName] != null) shortName += "_$extension"

		return shortName
	}



	/*
	Native map
	 */



	/**
	 * Note: This map is incomplete.
	 */
	private val nativeTypeMap = mapOf(

		/* Windows */


		// Pointer
		"HWND" to Primitive.POINTER,

		// Pointer
		"HINSTANCE" to Primitive.POINTER,

		// Long Pointer to Const Wide-Char String (UTF-16LE).
		"LPCWSTR" to Primitive.POINTER,

		// Pointer
		"HMONITOR" to Primitive.POINTER,

		// Pointer
		"HANDLE" to Primitive.POINTER,

		// Struct of DWORD, LPVOID, and BOOL. Only used as a pointer.
		"SECURITY_ATTRIBUTES" to Primitive.POINTER,

		// 32-bit unsigned int
		"DWORD" to Primitive.INT,


		/* Apple */


		// Opaque type. Only used as a pointer.
		"CAMetalLayer" to Primitive.POINTER,


		/* Android */


		// Opaque type. Only used as a pointer.
		"ANativeWindow" to Primitive.POINTER,

		// Opaque type. Only used as a pointer.
		"AHardwareBuffer" to Primitive.POINTER,
	)



	fun resolveNativeType(name: String) = nativeTypeMap[name] ?: Primitive.POINTER


}