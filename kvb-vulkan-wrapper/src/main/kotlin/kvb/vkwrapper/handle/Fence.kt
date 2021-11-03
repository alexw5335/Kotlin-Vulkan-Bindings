package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.*

class Fence(address: Long, val device: Device) : FenceH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this

	/**
	 * Implementation of vkDestroyFence.
	 */
	fun destroy() = commands.destroyFence(this, null)



	fun wait(
		timeout : Long     = ULong.MAX_VALUE.toLong(),
		stack   : MemStack = default
	) = stack.with {
		commands.waitForFences(
			1,
			wrapPointer(self),
			TRUE,
			timeout,
		).check()
	}



	fun reset(stack: MemStack = default) = stack.with {
		commands.resetFences(1, wrapPointer(self))
	}


}