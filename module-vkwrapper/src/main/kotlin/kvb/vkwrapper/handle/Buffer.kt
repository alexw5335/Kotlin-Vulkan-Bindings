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
	address    : Long,
	val device : Device,
	val size   : Long,
	val usage  : BufferUsageFlags
) : BufferH(address) {


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
	 * If vkBindBufferMemory has been called for this buffer.
	 */
	var isBound = false; private set

	/**
	 * The backing memory that is bound to this buffer. This variable is uninitialised before [bindMemory] is called.
	 */
	lateinit var memory: DeviceMemory; private set

	/**
	 * The offset into the [memory] that represents the start of this buffer's memory.
	 */
	var offset = 0L; private set



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
	fun bindMemory(memory: DeviceMemory, offset: Long) {
		commands.bindBufferMemory(this, memory, offset).check()
		this.memory = memory
		this.offset = offset
		isBound = true
	}



	/**
	 * Convenience implementation of vkBindBufferMemory.
	 */
	fun bindMemory(memory: DeviceMemory) = bindMemory(memory, 0L)



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