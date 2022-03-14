package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.memory.VkAllocation
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.persistent.MemoryRequirementsP
import kvb.vulkan.*
import kotlin.math.min

/**
 * Note: size is user-defined size of the buffer, not the aligned size given by
 * [VkMemoryRequirements][MemoryRequirements], which is the actual size.
 */
class Buffer(
	address           : Long,
	val device        : Device,
	override val size : Long,
	val usage         : BufferUsageFlags
) : BufferH(address), VkResource {


	val commands get() = device.commands

	private val self = this

	fun destroy() = commands.destroyBuffer(this, null)

	override fun hashCode() = (address / 2).toInt()

	override fun equals(other: Any?) = other is Buffer && other.address == address

	override fun toString() = "VkBuffer(address = $address, size = $size, usage = $usage)"



	/*
	Memory
	 */



	/**
	 * Internal backing field for [memory].
	 */
	private var _memory: DeviceMemory? = null

	/**
	 * Internal backing field for [offset].
	 */
	private var _offset: Long = 0L

	/**
	 * The [DeviceMemory] that was bound to this buffer using vkBindBufferMemory. If this buffer has not been bound,
	 * then this variable should not be accessed. Use [isBound] to check if memory has been bound to this buffer.
	 */
	override val memory get() = _memory!!

	/**
	 * If vkBindBufferMemory has been called for this buffer. Once bound, a buffer cannot be unbound nor rebound to a
	 * different [DeviceMemory].
	 */
	override val isBound get() = _memory != null

	/**
	 * The offset into the [memory] that represents the start of this buffer's memory.
	 */
	override val offset get() = _offset



	/**
	 * Gets the [memory] range that backs this buffer. This must only be used if memory has been bound to this buffer.
	 */
	fun data(offset: Long = 0L, size: Long = this.size) = when {
		!isBound ->
			throw VkException("No memory has been bound to this buffer.")
		!memory.isMapped(this.offset + offset, size) ->
			throw VkException("The memory range of this buffer has not been mapped.")
		else ->
			DirectByteBuffer(memory.mappedAddress - memory.mappedOffset + this.offset + offset, size)
	}



	fun flush(offset: Long = 0L, size: Long = this.size) = stack {
		memory.flush(self.offset + offset, min(this.size - offset, size))
	}



	inline fun flush(offset: Long = 0L, size: Long = this.size, block: (DirectByteBuffer) -> Unit) {
		block(data())
		memory.flush(offset, size)
	}



	fun isMapped(offset: Long, size: Long) = memory.isMapped(this.offset + offset, size)



	/*
	Memory binding
	 */



	/**
	 * Implementation of vkBindBufferMemory.
	 */
	override fun bindMemory(memory: DeviceMemory, offset: Long) {
		commands.bindBufferMemory(this, memory, offset).check()
		_memory = memory
		_offset = offset
	}



	/**
	 * Convenience implementation of vkBindBufferMemory.
	 */
	fun bindMemory(allocation: VkAllocation) = bindMemory(allocation.memory, allocation.offset)



	/**
	 * Persistent implementation of vkGetBufferMemoryRequirements.
	 */
	fun memoryRequirements() = stackGet {
		val requirements = MemoryRequirements { }
		commands.getBufferMemoryRequirements(self, requirements)
		MemoryRequirementsP(requirements)
	}


}