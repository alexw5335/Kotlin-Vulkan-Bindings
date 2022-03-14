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
) : ImageH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyImage.
	 */
	fun destroy() = commands.destroyImage(this, null)



	/*
	Memory
	 */



	/**
	 * If vkBindImageMemory has been called for this image.
	 */
	var isBound = false; private set

	/**
	 * The backing memory that is bound to this image. This variable is uninitialised before [bindMemory] is called.
	 */
	lateinit var memory: DeviceMemory

	/**
	 * The offset into the [memory] that represents the start of this image's memory.
	 */
	var offset = 0L



	/**
	 * Implementation of vkBindImageMemory.
	 */
	fun bindMemory(memory: DeviceMemory, offset: Long = 0L) {
		commands.bindImageMemory(self, memory, offset).check()
		this.memory = memory
		this.offset = offset
		isBound = true
	}



	/**
	 * Convenience implementation of vkBindImageMemory.
	 */
	fun bindMemory(allocation: VkAllocation) {
		bindMemory(allocation.memory, allocation.offset)
	}



	/**
	 * Persistent implementation of vkGetImageMemoryRequirements.
	 */
	fun memoryRequirements() = stackGet {
		val requirements = MemoryRequirements { }
		commands.getImageMemoryRequirements(self, requirements)
		MemoryRequirementsP(requirements)
	}


}