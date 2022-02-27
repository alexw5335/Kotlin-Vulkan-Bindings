package kvb.vkwrapper.handle

import kvb.core.memory.*
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



	fun waitFor(timeout: Long = 0L) = stack {
		commands.waitForFences(
			fenceCount = 1,
			pFences    = wrapPointer(self),
			waitAll    = VK_TRUE,
			timeout    = timeout,
		).check()
	}



	fun reset() = stack {
		commands.resetFences(1, wrapPointer(self))
	}


}