package kvb.codegen.vulkan

import kvb.codegen.vulkanDir
import kvb.codegen.vulkanPackage
import kvb.codegen.writer.KWriter

object VkUtilsGenerator {


	fun generate() = KWriter.write(vulkanDir, "_Utils") {
		start {
			autogenComment()
			comment("This file's name has been prefixed with '_' so that it appears at the top of the package.")
			package_(vulkanPackage)
		}

		doc("An abstraction of the macros VK_VERSION_MAJOR, VK_VERSION_MINOR, and VK_VERSION_PATCH.")
		annotation("JvmInline")
		class_("value class VkVersion(val value: Int") {
			declaration("constructor(major: Int, minor: Int, patch: Int) : this((major shl 22) or (minor shl 12) or patch")
			declaration("val major get() = value shr 22")
			declaration("val minor get() = value shr 12 and 0x3FF")
			declaration("val patch get() = value and 0xFFF")
			declaration("fun toString() = \"Version(\$major, \$minor, \$patch)\"")
		}
	}


}