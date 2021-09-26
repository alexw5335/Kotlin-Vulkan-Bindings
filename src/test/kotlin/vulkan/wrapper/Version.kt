package vulkan.wrapper

/**
 * An abstraction of the macros VK_VERSION_MAJOR, VK_VERSION_MINOR, and VK_VERSION_PATCH.
 */
@JvmInline
value class Version(val value: Int) {


	constructor(major: Int, minor: Int, patch: Int) : this(major shl 22 or (minor shl 12) or patch)



	val major get() = value shr 22

	val minor get() = value shr 12 and 0x3FF

	val patch get() = value and 0xFFF



	override fun toString() = "VkVersion($major, $minor, $patch)"


}