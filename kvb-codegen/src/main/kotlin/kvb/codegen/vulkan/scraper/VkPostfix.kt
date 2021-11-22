package kvb.codegen.vulkan.scraper

enum class VkPostfix(val id: String) {


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

		fun fromPostfix(string: String) = values().firstOrNull { string.endsWith(it.id) }

		fun postfixLength(string: String) = fromPostfix(string)?.id?.length ?: 0

		fun postfixUnderscoreLength(string: String) = fromPostfix(string).let { if(it == null) 0 else it.id.length + 1 }

		fun drop(string: String) = string.dropLast(postfixLength(string))

	}


}