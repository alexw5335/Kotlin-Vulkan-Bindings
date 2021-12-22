package kvb.codegen.vulkan

import kvb.codegen.vulkan.VkDocUtils.docStrings
import kvb.codegen.vulkan.scraper.type.VkTypeBitmask
import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter

object VkBitmaskGenerator {


	fun generate(bitmasks: Iterable<VkTypeBitmask>) {
		for(b in bitmasks)
			if(b.shouldGen)
				printBitmask(b)

		printBitmaskBlocks(bitmasks)
	}



	private fun printBitmaskBlocks(bitmasks: Iterable<VkTypeBitmask>) = KWriter.write(vulkanDir, "_Bitmasks") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			suppressFile("Unused", "FunctionName")
			package_(vulkanPackage)
		}

		styled(style(1, 0)) {
			for(b in bitmasks) {
				if(!b.shouldGen) continue
				declaration("inline fun ${b.genName}(block: ${b.genName}.Companion.() -> ${b.genName}) = block(${b.genName})")
			}
		}
	}



	private fun printBitmask(bitmask: VkTypeBitmask) = KWriter.write(vulkanDir, bitmask.genName) {
		start {
			autogenComment()
			package_(vulkanPackage)
		}

		val name = bitmask.genName

		val primitive = if(bitmask.is64Bit) "Long" else "Int"
		val entries = bitmask.enum!!.entries.filter { it.shouldGen }

		doc(bitmask.enum!!.docStrings)
		suppress("unused")
		annotation("JvmInline")
		class_("value class $name(val value: $primitive)") {
			companion_ {
				for(entry in entries)
					declaration("val ${entry.genName} = $name(${entry.valueString})")
			}

			group(1) {
				declaration("operator fun plus(mask: $name) = $name(value or mask.value)")
				declaration("operator fun contains(mask: $name) = value and mask.value == mask.value")
			}
		}
	}


}