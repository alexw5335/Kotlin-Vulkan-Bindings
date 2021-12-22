package kvb.vkwrapper.handle

import kvb.core.memory.MemStacks
import kvb.vulkan.*

class CommandPool(address: Long, val device: Device) : CommandPoolH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyCommandPool. frees any allocated command buffers.
	 */
	fun destroy() = commands.destroyCommandPool(this, null)



	/*
	CommandBuffer allocation
	 */



	/**
	 * Implementation of vkAllocateCommandBuffers.
	 */
	fun allocateCommandBuffers(level: CommandBufferLevel, count: Int) = MemStacks.get {
		val info = CommandBufferAllocateInfo {
			it.commandPool = self
			it.level = level
			it.commandBufferCount = count
		}

		val buffers = mallocPointer(count)
		commands.allocateCommandBuffers(info, buffers)
		buffers.map { CommandBuffer(it, self) }
	}



	/**
	 * Version of vkAllocateCommandBuffers with [CommandBufferLevel.PRIMARY].
	 */
	fun allocatePrimaryCommandBuffers(count: Int) = allocateCommandBuffers(CommandBufferLevel.PRIMARY, count)



	/**
	 * Version of vkAllocateCommandBuffers with [CommandBufferLevel.SECONDARY].
	 */
	fun allocateSecondaryCommandBuffers(count: Int) = allocateCommandBuffers(CommandBufferLevel.SECONDARY, count)



	/**
	 * Single version of [allocatePrimaryCommandBuffers].
	 */
	fun allocatePrimaryCommandBuffer() = allocatePrimaryCommandBuffers(1)[0]



	/**
	 * Single version of [allocateSecondaryCommandBuffers].
	 */
	fun allocateSecondaryCommandBuffer() = allocateSecondaryCommandBuffers(1)[0]



	/*
	Other functions
	 */



	fun reset(flags: CommandPoolResetFlags = CommandPoolResetFlags(0)) = commands.resetCommandPool(this, flags)



	fun freeBuffers(buffers: List<CommandBuffer>) = MemStacks.with {
		commands.freeCommandBuffers(self, buffers.size, wrapPointers(buffers))
	}



	fun freeBuffer(buffer: CommandBuffer) = MemStacks.with {
		commands.freeCommandBuffers(self, 1, wrapPointer(buffer))
	}


}