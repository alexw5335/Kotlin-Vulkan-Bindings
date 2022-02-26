package kvb.vkwrapper.handle

import kvb.core.memory.*
import kvb.vkwrapper.persistent.QueueFamily
import kvb.vulkan.*

class Queue(
	address    : Long,
	val device : Device,
	val family : QueueFamily
) : QueueH(address) {


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
	fun submit(
		submits     : SubmitInfo.Buffer,
		submitCount : Int    = submits.capacity,
		fence       : Fence? = null
	) = commands.queueSubmit(
		queue 		= this,
		submitCount = submitCount,
		pSubmits 	= submits,
		fence 		= fence
	).check()



	/**
	 * Convenience implementation of vkQueueSubmit, uses a single submit info.
	 */
	fun submit(
		waitSemaphore    : Semaphore,
		waitDstStageMask : PipelineStageFlags,
		commandBuffer    : CommandBuffer,
		signalSemaphore  : Semaphore,
		fence            : Fence? = null
	) = stack {
		commands.queueSubmit(self, 1, SubmitInfo {
			it.waitSemaphoreCount   = 1
			it.pWaitSemaphores      = wrapPointer(waitSemaphore).address
			it.pWaitDstStageMask    = wrapInt(waitDstStageMask.value).address
			it.commandBufferCount   = 1
			it.pCommandBuffers      = wrapPointer(commandBuffer).address
			it.signalSemaphoreCount = 1
			it.pSignalSemaphores    = wrapPointer(signalSemaphore).address
		}.asBuffer, fence).check()
	}



	/**
	 * Convenience implementation of vkQueueSubmit, uses a single submit info with no semaphores.
	 */
	fun submit(commandBuffer: CommandBuffer, fence: Fence? = null) = stack {
		commands.queueSubmit(self, 1, SubmitInfo {
			it.waitSemaphoreCount = 0
			it.commandBuffers = wrapPointer(commandBuffer)
		}.asBuffer, fence).check()
	}



	/*
	Present
	 */



	/**
	 * Implementation of vkPresentQueueKHR.
	 */
	fun present(info: PresentInfo) = commands.queuePresent(this, info)



	/**
	 * Convenience implementation of vkPresentQueueKHR. Single present info and wait semaphore. Returns true if the
	 * command returned VK_SUCCESS. Returns false if the command returned VK_ERROR_OUT_OF_DATE, which signals that a
	 * resize has occurred. Any other returned result will cause an exception.
	 */
	fun present(
		waitSemaphore : Semaphore,
		swapchain     : Swapchain,
		imageIndex    : Int
	) = stackGet {
		val resultValue = mallocInt()

		commands.queuePresent(self, PresentInfo {
			it.waitSemaphoreCount = 1
			it.pWaitSemaphores    = wrapPointer(waitSemaphore).address
			it.swapchainCount     = 1
			it.pSwapchains        = wrapPointer(swapchain).address
			it.pImageIndices      = wrapInt(imageIndex).address
			it.pResults           = resultValue.address
		})

		val result = Result(resultValue.value)

		if(result == Result.ERROR_OUT_OF_DATE) {
			false
		} else {
			result.check()
			true
		}
	}



	/*
	Misc
	 */



	/**
	 * Implementation of vkQueueWaitIdle.
	 */
	fun waitIdle() = commands.queueWaitIdle(this)


}