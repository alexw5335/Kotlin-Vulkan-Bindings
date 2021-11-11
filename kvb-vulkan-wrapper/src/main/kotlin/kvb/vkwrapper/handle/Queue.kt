package kvb.vkwrapper.handle

import kvb.core.memory.MemStack
import kvb.core.memory.MemStacks.default
import kvb.vulkan.*

class Queue(address: Long, val device: Device) : QueueH(address) {


	/**
	 * Convenience variable.
	 */
	val commands get() = device.commands

	/**
	 * Convenience variable for 'this' due to MemStack extension functions.
	 */
	private val self get() = this



	/*
	Submit
	 */



	/**
	 * Implementation of vkQueueSubmit.
	 */
	fun submit(submits: SubmitInfo.Buffer, submitCount: Int = submits.capacity, fence: Fence? = null) = commands.queueSubmit(
		queue 		= this,
		submitCount = submitCount,
		pSubmits 	= submits,
		fence 		= fence
	)



	/**
	 * Convenience implementation of vkQueueSubmit, uses a single submit info.
	 */
	fun submit(
		waitSemaphore    : Semaphore,
		waitDstStageMask : PipelineStageFlags,
		commandBuffer    : CommandBuffer,
		signalSemaphore  : Semaphore,
		fence            : Fence?              = null,
		stack            : MemStack            = default
	) = stack.with {
		commands.queueSubmit(self, 1, SubmitInfo {
			it.waitSemaphoreCount   = 1
			it.pWaitSemaphores      = wrapPointer(waitSemaphore).address
			it.pWaitDstStageMask    = wrapInt(waitDstStageMask.value).address
			it.commandBufferCount   = 1
			it.pCommandBuffers      = wrapPointer(commandBuffer).address
			it.signalSemaphoreCount = 1
			it.pSignalSemaphores    = wrapPointer(signalSemaphore).address
		}.asBuffer, fence)
	}



	/*
	Present
	 */



	/**
	 * Implementation of vkPresentQueueKHR.
	 */
	fun present(info: PresentInfo) = commands.queuePresent(this, info)



	/**
	 * Convenience implementation of vkPresentQueueKHR. Single present info and wait semaphore. Returns its result,
	 * which may be [Result.ERROR_OUT_OF_DATE] if a surface has been resized.
	 */
	fun present(
		waitSemaphore : Semaphore,
		swapchain     : Swapchain,
		imageIndex    : Int,
		stack         : MemStack = default
	) = stack.get {
		val result = mallocInt()
		commands.queuePresent(self, PresentInfo {
			it.waitSemaphoreCount = 1
			it.pWaitSemaphores    = wrapPointer(waitSemaphore).address
			it.swapchainCount     = 1
			it.pSwapchains        = wrapPointer(swapchain).address
			it.pImageIndices      = wrapInt(imageIndex).address
			it.pResults           = result.address
		})
		Result(result.value)
	}



	/*
	Misc
	 */



	/**
	 * Implementation of vkQueueWaitIdle.
	 */
	fun waitIdle() = commands.queueWaitIdle(this)


}