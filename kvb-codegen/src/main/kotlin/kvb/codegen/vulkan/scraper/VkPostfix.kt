package kvb.codegen.vulkan.scraper

/**
 * Extension provider postfixes. This class is used to remove opstfixes from type and command names where
 * possible.
 */
enum class VkPostfix(val value: String) {


	KHRONOS("KHR"),

	MULTIVENDOR("EXT"),

	AMD("AMD"),

	ANDROID("ANDROID"),

	FUCHSIA("FUCHSIA"),

	GGP("GGP"),

	GOOGLE("GOOGLE"),

	IMG("IMG"),

	INTEL("INTEL"),

	MVK("MVK"),

	NINTENDO("NN"),

	NVIDIA("NV"),

	NVX("NVX"),

	QUALCOMM("QCOM"),

	NX("NX"),

	VALVE("VALVE");



	companion object {

		fun fromPostfix(string: String) = values().firstOrNull { string.endsWith(it.value) }

		fun postfixLength(string: String) = fromPostfix(string)?.value?.length ?: 0

		fun postfixUnderscoreLength(string: String) = fromPostfix(string).let { if(it == null) 0 else it.value.length + 1 }

		fun drop(string: String) = string.dropLast(postfixLength(string))

	}


}