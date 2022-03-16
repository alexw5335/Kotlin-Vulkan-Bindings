package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.vkwrapper.memory.VkAllocation
import kvb.vkwrapper.persistent.MemoryRequirementsP
import kvb.vulkan.*

class Image(
	address         : Long,
	val device      : Device,
	val type        : ImageType,
	val format      : Format,
	val width       : Int,
	val height      : Int,
	val depth       : Int,
	val mipLevels   : Int,
	val arrayLayers : Int,
	val tiling      : ImageTiling,
) : ImageH(address), VkResource {


	val commands get() = device.commands

	fun destroy() = commands.destroyImage(this, null)



	/*
	Resource implementation
	 */



	/**
	 * Internal backing field for [memory].
	 */
	private var _memory: DeviceMemory? = null

	/**
	 * The [DeviceMemory] that was bound to this image using vkBindImageMemory. Must not be accessed if no memory has
	 * been bound.
	 */
	override val memory get() = _memory!!

	/**
	 * Internal backing field for [offset].
	 */
	private var _offset: Long = 0L

	/**
	 * The offset into the [memory] that represents the start of this image's memory.
	 */
	override val offset get() = _offset

	/**
	 * If vkBindImageMemory has been called for this image. Once bound, an image cannot be unbound nor rebound.
	 */
	override val isBound get() = _memory != null

	/**
	 * The size in bytes that this image takes up in the bound device [memory].
	 */
	override val size get() = memoryRequirements.size

	/**
	 * The required memory alignment of this image.
	 */
	override val alignment get() = memoryRequirements.alignment

	/**
	 * A bitmask of the indices of the memory types that can be used with this image.
	 */
	override val memoryTypeBits get() = memoryRequirements.memoryTypeBits



	/**
	 * Implementation of vkBindImageMemory.
	 */
	override fun bindMemory(memory: DeviceMemory, offset: Long) {
		commands.bindImageMemory(this, memory, offset).check()
		_memory = memory
		_offset = offset
	}



	/**
	 * Persistent implementation of vkGetImageMemoryRequirements.
	 */
	override val memoryRequirements by stackLazy {
		val requirements = MemoryRequirements { }
		commands.getImageMemoryRequirements(this@Image, requirements)
		MemoryRequirementsP(requirements)
	}



}