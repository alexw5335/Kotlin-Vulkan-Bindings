package kvb.vkwrapper.handle

import kvb.core.memory.Allocator
import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.core.memory.direct.DirectByteBuffer
import kvb.vkwrapper.allocation.VkAllocation
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


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Implementation of vkDestroyBuffer.
	 */
	fun destroy() = commands.destroyBuffer(this, null)



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



	fun flush(offset: Long = 0L, size: Long = this.size, stack: MemStack = default) {
		memory.flush(this.offset + offset, min(this.size - offset, size), stack)
	}



	inline fun flush(stack: MemStack = default, block: (DirectByteBuffer) -> Unit) {
		block(data())
		memory.flush(offset, size, stack)
	}



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
	fun bindMemory(allocation: VkAllocation) {
		bindMemory(allocation.memory, allocation.offset)
	}



	/*
	Memory requirements
	 */



	/**
	 * Implementation of vkGetBufferMemoryRequirements.
	 */
	fun memoryRequirements(requirements: MemoryRequirements) {
		commands.getBufferMemoryRequirements(this, requirements)
	}



	/**
	 * Allocator implementation of vkGetBufferMemoryRequirements.
	 */
	fun memoryRequirements(allocator: Allocator): MemoryRequirements {
		val requirements = allocator.MemoryRequirements { }
		memoryRequirements(requirements)
		return requirements
	}



	/**
	 * Persistent implementation of vkGetBufferMemoryRequirements.
	 */
	fun memoryRequirementsP(stack: MemStack = default) = stack.get {
		val requirements = MemoryRequirements { }
		memoryRequirements(requirements)
		MemoryRequirementsP(requirements)
	}


}