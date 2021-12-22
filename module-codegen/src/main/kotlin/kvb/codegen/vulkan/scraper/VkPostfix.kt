package kvb.codegen.vulkan.scraper

/**
 * Extension provider postfixes. This enum is used to remove postfixes from type and command names where possible.
 */
enum class VkPostfix {

	IMG,
	AMD,
	AMDX,
	ARM,
	FSL,
	BRCM,
	NXP,
	NV,
	NVX,
	VIV,
	VSI,
	KDAB,
	ANDROID,
	CHROMIUM,
	FUCHSIA,
	GGP,
	GOOGLE,
	QCOM,
	LUNARG,
	SAMSUNG,
	SEC,
	TIZEN,
	RENDERDOC,
	NN,
	MVK,
	KHR,
	KHX,
	EXT,
	MESA,
	INTEL,
	HUAWEI,
	VALVE,
	QNX;



	companion object {

		fun fromPostfix(string: String) = values().firstOrNull { string.endsWith(it.name) }

		fun postfixLength(string: String) = fromPostfix(string)?.name?.length ?: 0

		fun postfixUnderscoreLength(string: String) = fromPostfix(string).let { if(it == null) 0 else it.name.length + 1 }

		fun drop(string: String) = string.dropLast(postfixLength(string))

	}


}