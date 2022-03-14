package kvb.vkwrapper.handle

import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.exception.VkException
import kvb.vkwrapper.persistent.MemoryRequirementsP
import kvb.vulkan.MemoryRequirements

sealed interface VkResource {


	val memoryRequirements: MemoryRequirementsP

	val memory: DeviceMemory

	val offset: Long

	val size: Long

	val isBound: Boolean

	fun bindMemory(memory: DeviceMemory, offset: Long)



	/*
	Convenience functions
	 */



	fun bindMemory(memory: DeviceMemory) = bindMemory(memory, 0L)



	fun isMapped(offset: Long = 0L, size: Long = this.size) = memory.isMapped(this.offset + offset, size)



	/**
	 * Gets the [memory] range that backs this buffer. This must only be used if memory has been bound to this buffer.
	 */
	fun data(offset: Long = 0L, size: Long = this.size) = when {
		!isBound -> throw VkException("No memory has been bound to this resource.")

		!isMapped(this.offset + offset, size) -> throw VkException(
			"The requested memory range (offset=${this.offset + offset}, size=$size) " +
			"of this resource has not been mapped.")

		else -> DirectByteBuffer(memory.mappedAddress - memory.mappedOffset + this.offset + offset, size)
	}


}