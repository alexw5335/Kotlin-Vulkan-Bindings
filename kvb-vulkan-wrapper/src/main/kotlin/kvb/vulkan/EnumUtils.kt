package kvb.vulkan

import kvb.vkwrapper.exception.VkCommandException


/**
 * Throws a [VkCommandException] with this [Result].
 */
fun Result.err(): Nothing = throw VkCommandException(this)



/**
 * Checks the return [Result] of a Vulkan command and throws a [VkCommandException] if the result is not
 * [Result.SUCCESS]. Note that for some commands, a result other than SUCCESS does not necessarily indicate an
 * error. The [VkCommandException] keeps track of the [Result] so that these situations can be handled. It may be
 * more appropriate to only throw an exception when the result's code is below zero, which necessarily indicates an
 * error.
 */
fun Result.check() {
	if(this != Result.SUCCESS)
		throw VkCommandException(this)
}



/**
 * Transforms this [ImageType] into its corresponding [ImageViewType].
 */
val ImageType.asImageViewType get() = when(this) {
	ImageType._1D -> ImageViewType._1D
	ImageType._2D -> ImageViewType._2D
	ImageType._3D -> ImageViewType._3D
}