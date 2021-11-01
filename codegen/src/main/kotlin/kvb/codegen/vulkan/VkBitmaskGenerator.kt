package kvb.codegen.vulkan

import kvb.codegen.GenConfig
import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.type.VkTypeBitmask
import kvb.codegen.writer.KWriter
import java.nio.file.Path

object VkBitmaskGenerator {


	fun generate(directory: Path, bitmasks: Iterable<VkTypeBitmask>) {
		for(b in bitmasks)
			if(b.shouldGen)
				printBitmask(directory, b)
	}



	/**
	 * Some entries are already prefixed with '_' because they start with a digit.
	 */
	private val VkEnumEntry.getterString get() = if(genName.startsWith('_'))
		"is$genName"
	else
		"is_$genName"



	private fun printBitmask(directory: Path, bitmask: VkTypeBitmask) = KWriter.write(directory, bitmask.genName) {
		start {
			autogenComment()
			package_(GenConfig.enumPackage)
		}

		val name = bitmask.genName
		val primitive = if(bitmask.is64Bit) "Long" else "Int"
		val zero = if(bitmask.is64Bit) "0L" else "0"
		val entries = bitmask.enum!!.entries.filter { it.shouldGen }
		//val extraGen = VkGenUtils.extraGenBitmasks.contains(bitmask.name)

		doc(bitmask.enum!!.docStrings)
		suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
		annotation("JvmInline")
		class_("value class $name(val value: $primitive)") {
			group(1) {
				declaration("operator fun plus(mask: $name) = $name(value or mask.value)")
				declaration("fun contains(mask: $name) = value and mask.value == mask.value")
			}

			function("override fun toString() = buildString") {
				writeln("append(\"{ \")")
				for(entry in entries)
					writeln("if(value and ${entry.valueString} != $zero) append(\"${entry.genName}, \")")
				writeln("if(length == 2) append(\"*EMPTY*\") else setLength(length - 2)")
				writeln("append(\" }\")")
			}

			companion_(noStyle) {
				if(!entries.any { it.genName == "NONE" })
					declaration("val NONE = $name($zero)")

				for(entry in entries)
					declaration("val ${entry.genName} = $name(${entry.valueString})")

				declaration("inline fun compose(block: Companion.() -> $name) = block(Companion)")
			}
		}
	}



}