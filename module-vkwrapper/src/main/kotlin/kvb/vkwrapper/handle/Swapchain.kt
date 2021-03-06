package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.core.memory.direct.DirectInt
import kvb.core.memory.direct.DirectLongBuffer
import kvb.vulkan.*

class Swapchain(
	address                : Long,
	val device             : Device,
	val minImageCount      : Int,
	val format             : Format,
	val colourSpace        : ColorSpace,
	val width              : Int,
	val height             : Int,
	val arrayLayers        : Int,
	val usage              : ImageUsageFlags,
	val preTransform       : SurfaceTransformFlags,
	val compositeAlpha     : CompositeAlphaFlags,
	val presentMode        : PresentMode,
	val clipped            : Boolean,
) : SwapchainH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * If [destroy] has been called.
	 */
	var isDestroyed = false; private set

	/**
	 * Implementation of vkDestroySwapchainKHR. Calls after the first will have no effect.
	 */
	fun destroy() = commands.destroySwapchain(this, null)



	/*
	vkGetSwapchainImagesKHR
	 */



	/**
	 * Implementation of vkGetSwapchainImagesKHR.
	 */
	fun getImages(count: DirectInt, images: DirectLongBuffer?) {
		commands.getSwapchainImages(this, count, images).check()
	}



	/**
	 * MemStack implementation of vkGetSwapchainImagesKHR.
	 */
	fun getImages() = stackGet {
		val count = mallocInt()
		getImages(count, null)
		val images = mallocPointer(count.value)
		getImages(count, images)
		images.map { Image(it, device, ImageType._2D, format, width, height, 1, 1, 1, ImageTiling.OPTIMAL) }
	}



	/*
	vkAcquireNextImageKHR
	 */



	/**
	 * Implementation of vkAcquireNextImageKHR. Returns -1 if the command fails with [Result.ERROR_OUT_OF_DATE].
	 */
	fun acquireNextImage(
		timeout   : Long        = ULong.MAX_VALUE.toLong(),
		semaphore : Semaphore?  = null,
		fence     : Fence?      = null,
	): Int = stackGet {
		val index = mallocInt()

		when(val result = commands.acquireNextImage(self, timeout, semaphore, fence, index)) {
			Result.ERROR_OUT_OF_DATE -> -1
			Result.SUCCESS           -> index.value
			else                     -> result.err()
		}
	}


}