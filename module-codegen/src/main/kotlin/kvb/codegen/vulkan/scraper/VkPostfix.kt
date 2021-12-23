package kvb.codegen.vulkan.scraper

/**
 * Extension provider postfixes. This enum is used to remove postfixes from type and command names where possible.
 */
enum class VkPostfix {


	VALVE,

	QNX,

	QCOM,

	NVX,

	NV,

	NN,

	MVK,

	INTEL,

	IMG,

	HUAWEI,

	GOOGLE,

	GGP,

	FUCHSIA,

	ARM,

	ANDROID,

	AMD,

	EXT,

	KHR;



	companion object {

		fun fromPostfix(string: String) = values().firstOrNull { string.endsWith(it.name) }

		fun postfixLength(string: String) = fromPostfix(string)?.name?.length ?: 0

		fun postfixUnderscoreLength(string: String) = fromPostfix(string).let { if(it == null) 0 else it.name.length + 1 }

		fun drop(string: String) = string.dropLast(postfixLength(string))

	}


}