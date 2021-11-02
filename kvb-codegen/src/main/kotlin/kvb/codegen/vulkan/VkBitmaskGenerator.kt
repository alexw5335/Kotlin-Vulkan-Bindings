package kvb.codegen.vulkan

import kvb.codegen.enumDir
import kvb.codegen.enumPackage
import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.element.VkEnumEntry
import kvb.codegen.vulkan.scraper.type.VkTypeBitmask
import kvb.codegen.writer.KWriter

object VkBitmaskGenerator {


	fun generate(bitmasks: Iterable<VkTypeBitmask>) {
		for(b in bitmasks)
			if(b.shouldGen)
				printBitmask(b)
	}



	private fun printBitmask(bitmask: VkTypeBitmask) = KWriter.write(enumDir, bitmask.genName) {
		start {
			autogenComment()
			package_(enumPackage)
		}

		val name = bitmask.genName
		val zero = if(bitmask.is64Bit) "0L" else "0"
		val primitive = if(bitmask.is64Bit) "Long" else "Int"
		val entries = bitmask.enum!!.entries.filter { it.shouldGen }

		doc(bitmask.enum!!.docStrings)
		suppress("unused", "propertyName", "MemberVisibilityCanBePrivate")
		annotation("JvmInline")
		class_("value class $name(val value: $primitive)") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = $name(${entry.valueString})")

				declaration("inline fun compose(block: Companion.() -> $name) = block(Companion)")
			}

			group(1) {
				declaration("operator fun plus(mask: $name) = $name(value or mask.value)")
				declaration("operator fun contains(mask: $name) = value and mask.value == mask.value")
			}

			if(bitmask.isExtraGen) {
				function("override fun toString() = buildString") {
					writeln("append(\"{ \")")
					for(entry in entries)
						writeln("if(value and ${entry.valueString} != $zero) append(\"${entry.genName}, \")")
					writeln("if(length == 2) append(\"*EMPTY*\") else setLength(length - 2)")
					writeln("append(\" }\")")
				}
			}
		}
	}


}