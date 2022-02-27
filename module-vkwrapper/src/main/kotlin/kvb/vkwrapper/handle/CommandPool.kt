package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*

class CommandPool(
	address                : Long,
	val device             : Device,
	val queueFamily        : QueueFamily
) : CommandPoolH(address) {


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
	fun allocate(level: CommandBufferLevel, count: Int) = stackGet {
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
	 * Single implementation of vkAllocateCommandBuffers.
	 */
	fun allocate(level: CommandBufferLevel) = stackGet {
		val info = CommandBufferAllocateInfo {
			it.commandPool = self
			it.level = level
			it.commandBufferCount = 1
		}

		val buffers = mallocPointer(1)
		commands.allocateCommandBuffers(info, buffers)
		CommandBuffer(buffers[0], self)
	}



	/**
	 * Version of vkAllocateCommandBuffers with [CommandBufferLevel.PRIMARY].
	 */
	fun allocatePrimary(count: Int) = allocate(CommandBufferLevel.PRIMARY, count)



	/**
	 * Version of vkAllocateCommandBuffers with [CommandBufferLevel.SECONDARY].
	 */
	fun allocateSecondary(count: Int) = allocate(CommandBufferLevel.SECONDARY, count)



	/**
	 * Single version of [allocatePrimary].
	 */
	fun allocatePrimary() = allocate(CommandBufferLevel.PRIMARY)



	/**
	 * Single version of [allocateSecondary].
	 */
	fun allocateSecondary() = allocate(CommandBufferLevel.SECONDARY)



	/*
	Functions
	 */



	fun reset() = commands.resetCommandPool(this, CommandPoolResetFlags(0))


}