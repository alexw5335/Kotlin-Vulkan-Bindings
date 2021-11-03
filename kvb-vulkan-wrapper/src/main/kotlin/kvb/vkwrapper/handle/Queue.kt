package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.PresentInfo
import kvb.vulkan.QueueH
import kvb.vulkan.SubmitInfo

class Queue(address: Long, val device: Device) : QueueH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this



	fun submit(
		infos: SubmitInfo.Buffer,
		fence: Fence? = null
	) = commands.queueSubmit(
		queue 		= this,
		submitCount = infos.capacity,
		pSubmits 	= infos,
		fence 		= fence
	)



	fun submit(
		commandBuffer: CommandBuffer,
		fence: Fence? = null,
		stack: MemStack = default
	) = stack.with {
		commands.queueSubmit(
			queue = self,
			submitCount = 1,
			pSubmits = SubmitInfo {
				it.commandBuffers = wrapPointer(commandBuffer)
			}.asBuffer,
			fence
		)
	}



	fun present(info: PresentInfo) = commands.queuePresent(this, info)



	fun waitIdle() = commands.queueWaitIdle(this)


}