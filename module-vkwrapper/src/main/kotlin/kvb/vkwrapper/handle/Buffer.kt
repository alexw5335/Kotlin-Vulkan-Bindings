package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.memory.VkAllocation
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.persistent.MemoryRequirementsP
import kvb.vulkan.*
import kotlin.math.min

class Buffer(
	address           : Long,
	val device        : Device,
	override val size : Long,
	val usage         : BufferUsageFlags
) : BufferH(address), VkResource {


	val commands get() = device.commands

	fun destroy() = commands.destroyBuffer(this, null)

	override fun toString() = "VkBuffer(address = $address, size = $size, usage = $usage)"



	/*
	Resource implementation
	 */



	/**
	 * Internal backing field for [memory].
	 */
	private var _memory: DeviceMemory? = null

	/**
	 * The [DeviceMemory] that was bound to this buffer using vkBindBufferMemory. Must not be accessed if no memory has
	 * been bound.
	 */
	override val memory get() = _memory!!

	/**
	 * Internal backing field for [offset].
	 */
	private var _offset: Long = 0L

	/**
	 * The offset into the [memory] that represents the start of this buffer's memory.
	 */
	override val offset get() = _offset

	/**
	 * If vkBindBufferMemory has been called for this buffer. Once bound, a buffer cannot be unbound nor rebound.
	 */
	override val isBound get() = _memory != null

	/**
	 * The required memory alignment of this buffer.
	 */
	override val alignment get() = memoryRequirements.alignment

	/**
	 * A bitmask of the indices of the memory types that can be used with this image.
	 */
	override val memoryTypeBits get() = memoryRequirements.memoryTypeBits



	/**
	 * Implementation of vkBindBufferMemory.
	 */
	override fun bindMemory(memory: DeviceMemory, offset: Long) {
		commands.bindBufferMemory(this, memory, offset).check()
		_memory = memory
		_offset = offset
	}



	/**
	 * Persistent implementation of vkGetBufferMemoryRequirements.
	 */
	override val memoryRequirements by stackLazy {
		val requirements = MemoryRequirements { }
		commands.getBufferMemoryRequirements(this@Buffer, requirements)
		MemoryRequirementsP(requirements)
	}


}