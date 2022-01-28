package kvb.vkwrapper.handle

import kvb.core.memory.Allocator
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vkwrapper.allocation.VkAllocation
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
	fun bindMemory(memory: DeviceMemory, offset: Long) {
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



	/*
	Memory requirements
	 */



	/**
	 * Implementation of vkGetImageMemoryRequirements.
	 */
	fun memoryRequirements(requirements: MemoryRequirements) {
		commands.getImageMemoryRequirements(this, requirements)
	}



	/**
	 * Allocator implementation of vkGetImageMemoryRequirements.
	 */
	fun memoryRequirements(allocator: Allocator) : MemoryRequirements {
		val requirements = allocator.MemoryRequirements { }
		commands.getImageMemoryRequirements(this, requirements)
		return requirements
	}



	/**
	 * Persistent implementation of vkGetImageMemoryRequirements.
	 */
	fun memoryRequirementsP(stack: MemStack = default) = stack.get {
		val requirements = MemoryRequirements { }
		commands.getImageMemoryRequirements(self, requirements)
		MemoryRequirementsP(requirements)
	}


}