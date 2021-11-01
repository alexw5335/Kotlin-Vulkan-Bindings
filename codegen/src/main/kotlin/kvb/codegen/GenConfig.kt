package kvb.codegen

@Suppress("MemberVisibilityCanBePrivate", "HasPlatformType")
object GenConfig {


	const val rootPackage = "kvb"

	const val primitivePackage = "$rootPackage.core.memory.direct"

	const val vulkanPackage = "$rootPackage.vulkan"

	const val enumPackage = "$vulkanPackage.enumeration"

	const val handlePackage = "$vulkanPackage.handle"

	const val structPackage = "$vulkanPackage.struct"

	const val commandPackage = "$vulkanPackage.command"

	const val allocationPackage = "$vulkanPackage.allocation"


}