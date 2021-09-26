package vulkan.generation

import codegen.CodeWriter.Companion.with
import codegen.KWriter
import vulkan.generation.VkDocUtils.docStrings
import vulkan.scraper.element.VkEnumEntry
import vulkan.scraper.type.VkTypeBitmask
import vulkan.scraper.type.VkTypeEnum
import java.nio.file.Path
import kotlin.io.path.div

object VkEnumGenerator {


	fun generate(directory: Path, packageName: String, enums: Iterable<VkTypeEnum>, bitmasks: Iterable<VkTypeBitmask>) {
		for(e in enums)
			if(!e.isFlags)
				printEnum(directory, packageName, e)

		for(b in bitmasks)
			if(b.implemented && b.enum.entries.isNotEmpty())
				printBitmask(directory, packageName, b)
			else
				printEmptyBitmask(directory, packageName, b)
	}



	/*
	Bitmask conversions
	 */



	/**
	 * Form of [toInt] that also handles hexadecimal strings.
	 */
	private fun String.bitmaskToInt() = if(startsWith("0x"))
		drop(2).toInt(16)
	else
		toInt()



	/**
	 * Form of [toLong] that also handles hexadecimal strings.
	 */
	private fun String.bitmaskToLong() = if(startsWith("0x"))
		drop(2).toLong(16)
	else
		toLong()



	/**
	 * Determines the bitfield that contains all possible bitmask values.
	 */
	private fun VkTypeBitmask.allIntValues() = enum.entries.sumOf { it.enumValue.bitmaskToInt() }



	/**
	 * Determines the bitfield that contains all possible bitmask values
	 */
	private fun VkTypeBitmask.allLongValues() = enum.entries.sumOf { it.enumValue.bitmaskToLong() }



	/*
	Generation
	 */



	/**
	 * Some entries are already prefixed with '_' because they start with a digit.
	 */
	private val VkEnumEntry.getterString get() = if(shortName.startsWith('_'))
		"is$shortName"
	else
		"is_$shortName"



	private fun printEnum(
		directory: Path,
		packageName: String,
		enum: VkTypeEnum
	) = KWriter(directory/"${enum.shortName}.kt").with {
		start {
			autogenComment()
			package_(packageName)
		}

		doc(enum.docStrings)
		suppress("unused", "propertyName")
		annotation("JvmInline")
		class_("value class ${enum.shortName}(val id: Int)") {
			group(0) {
				for(entry in enum.entries)
					declaration("val ${entry.getterString} get() = id == ${entry.enumValue}")
			}

			function("override fun toString() = when(id)") {
				for(entry in enum.entries)
					writeln("${entry.shortName}.id -> \"${entry.shortName}\"")
				writeln("else -> \"*INVALID*\"")
			}

			companion_ {
				group(0) {
					for(entry in enum.entries)
						declaration("val ${entry.shortName} get() = ${enum.shortName}(${entry.enumValue})")
				}
			}
		}
	}



	private fun printBitmask(
		directory: Path,
		packageName: String,
		bitmask: VkTypeBitmask
	) = KWriter(directory/"${bitmask.genName}.kt").with {

		val name = bitmask.genName

		// NONE and ALL entries are additionally generated for all enums. Already-existing entries of the same name are
		// not generated.
		val entries = bitmask.enum.entries.filter { it.shortName != "NONE" && it.shortName != "ALL" }

		val type     = if(bitmask.is64Bit) "Long" else "Int"
		val allValue = if(bitmask.is64Bit) bitmask.allLongValues() else bitmask.allIntValues()
		val zero     = if(bitmask.is64Bit) "0L" else "0"

		start {
			autogenComment()
			package_(packageName)
		}

		doc(bitmask.enum.docStrings)
		suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
		annotation("JvmInline")
		class_("value class $name(val bitfield: $type)") {

			group(0) {
				for(entry in entries)
					declaration("val ${entry.getterString} get() = bitfield and ${entry.enumValue} != $zero")
			}

			group(1) {
				declaration("infix operator fun plus(other: $name) = $name(bitfield or other.bitfield)")
				declaration("infix operator fun plus(other: $type) = $name(bitfield or other)")
				declaration("infix fun containsAll(mask: $name) = bitfield and mask.bitfield == mask.bitfield")
				declaration("infix fun containsAll(mask: $type) = bitfield and mask == mask")
				declaration("infix fun containsSome(mask: $name) = bitfield and mask.bitfield != $zero")
				declaration("infix fun containsSome(mask: $type) = bitfield and mask != $zero")
			}

			function("override fun toString() = buildString") {
				writeln("append(\"{ \")")
				for(entry in entries)
					writeln("if(${entry.getterString}) append(\"${entry.shortName}, \")")
				writeln("if(length == 2) append(\"*EMPTY*\") else setLength(length - 2)")
				writeln("append(\" }\")")
			}

			companion_ {
				group(0) {
					declaration("val NONE get() = $name($zero)")
					declaration("val ALL get() = $name($allValue)")

					for(entry in entries)
						declaration("val ${entry.shortName} get() = $name(${entry.enumValue})")
				}

				declaration("inline fun compose(block: Companion.() -> $name) = block(Companion)")
			}
		}
	}



	private fun printEmptyBitmask(
		directory: Path,
		packageName: String,
		bitmask: VkTypeBitmask
	) = KWriter(directory/"${bitmask.shortName}.kt").with {

		start {
			autogenComment()
			package_(packageName)
		}

		doc("These flags are empty and are reserved for future use.")
		annotation("JvmInline")
		declaration("value class ${bitmask.shortName}(val bitfield: ${if(bitmask.is64Bit) "Long" else "Int"})")
	}


}