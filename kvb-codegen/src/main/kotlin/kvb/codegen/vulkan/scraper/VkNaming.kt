package kvb.codegen.vulkan.scraper

import kvb.codegen.vulkan.VkGenUtils
import kvb.codegen.vulkan.scraper.type.VkTypeEnum
import java.util.*
import java.util.regex.Pattern



private val camelCaseRegex = Pattern.compile("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])").toRegex()

private val String.camelToSnakeCase get() = replace(camelCaseRegex, "_").uppercase(Locale.getDefault())

private val String.dropPostfix get() = VkPostfix.drop(this)



fun enumPrefix(enum: VkTypeEnum) = when {
	enum.is64Bit    -> enum.name.dropPostfix.dropLast(9).camelToSnakeCase + "_2_"
	enum.isFlagBits -> enum.name.dropPostfix.dropLast(8).camelToSnakeCase + "_"
	else            -> enum.name.dropPostfix.camelToSnakeCase + "_"
}